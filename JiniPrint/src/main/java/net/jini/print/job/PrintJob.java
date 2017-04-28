/*
 * Copyright 2017 peter.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.jini.print.job;

import java.io.IOException;
import javax.print.attribute.PrintJobAttribute;
import javax.print.attribute.PrintJobAttributeSet;
import net.jini.core.event.EventRegistration;
import net.jini.io.MarshalledInstance;
import net.jini.print.service.PrintService;

/**
 * <P>
 * Interface PrintJob specifies the interface for an object for tracking and
 * controlling a job being printed by a Jini Print Service instance. A Print Job
 * represents an actual print job that has been submitted to be printed.
 * <P>
 * A Print Job object is returned when a Print Request object is submitted to be
 * printed. For further information about Print Request setup and submission,
 * see interface <A
 * HREF="../../../../net/jini/print/job/PrintRequest.html"><CODE>PrintRequest</CODE></A>.
 * <P>
 * Once a Print Request is submitted, the Jini Print Service instance performs a
 * sequence of steps called <B>print job processing</B> to actually print the
 * job. Print job processing is described in detail below. The client can track
 * the Print Job's state during print job processing by examining attributes in
 * the Print Job's attribute set. The Print Job's attribute set includes
 * attributes the client specified in the original Print Request as well as job
 * description attributes added by the Print Job that tell the job state, the
 * number of sheets printed, and so on. The job description attributes change
 * their values dynamically as the job progresses; the attributes that came from
 * the Print Request generally do not change. The client either can receive
 * event notifications when selected attribute values change or can poll the
 * Print Job's attribute set periodically.
 * <P>
 * A Print Job is leased resource. When the client submits a Print Request, the
 * Jini Print Service instance creates a Print Job and returns both the Print
 * Job object and a lease object for the Print Job. If the client wants to keep
 * using the Print Job object beyond the lease's duration, the client must renew
 * the lease. When the client no longer needs to use the Print Job object, the
 * client can cancel the lease or simply let it expire. This signals the Jini
 * Print Service instance to clean up resources allocated to the client, if any.
 * However, cancelation or expiration of the Print Job object's lease does not
 * cancel the actual print job, it merely signals that the client will no longer
 * use the Print Job object. The actual print job will continue processing until
 * it has finished printing (barring errors), even if the lease expires or is
 * canceled earlier. Conversely, if the client maintains the lease on the Print
 * Job object beyond the point when the actual print job has finished printing,
 * the client will still be able to use the Print Job object -- for example, to
 * poll its final state.
 * <P>
 * The client can register a remote event listener to receive event
 * notifications pertaining to a Print Job object. To ensure that the client
 * receives event notifications starting from the point of submission, the
 * client must register for event notifications with the Print Request object
 * before submitting the Print Request; see interface <A
 * HREF="../../../../net/jini/print/job/PrintRequest.html"><CODE>PrintRequest</CODE></A>
 * for further information. The client can also register for event notifications
 * with the Print Job object after the request has been submitted, although the
 * client may miss some events that occurred between when the job was submitted
 * and when the event registration took effect. The events that can be reported
 * are represented by classes <A
 * HREF="../../../../net/jini/print/job/PrintDataEvent.html"><CODE>PrintDataEvent</CODE></A>,
 * <A
 * HREF="../../../../net/jini/print/job/PrintJobEvent.html"><CODE>PrintJobEvent</CODE></A>,
 * and <A
 * HREF="../../../../net/jini/print/job/PrintJobFinishedEvent.html"><CODE>PrintJobFinishedEvent</CODE></A>;
 * see those classes for further information about the events' meanings and the
 * circumstances under which they are reported.
 * <P>
 * Registering for event notifications and examining the Print Job's attribute
 * set are mandatory capabilities that all Jini Print Service instances must
 * provide. Hence, all Jini Print Service instances return Print Job objects
 * that implement the mandatory interface PrintJob. Additional, optional Print
 * Job capabilities are represented as subinterfaces of interface PrintJob. If a
 * Jini Print Service instance supports an optional Print Job capability, the
 * print service will return Print Job objects that implement the corresponding
 * subinterface.
 * <P>
 * There is no restriction on the number of client threads that may be
 * simultaneously accessing the same Print Job. Therefore, all implementations
 * of interface PrintJob and its subinterfaces must be designed to be multiple
 * thread safe.
 * <P>
 * Interface PrintJob's methods all throw <A
 * HREF="file:///C:/jdk1.2.2/docs/api/java/rmi/RemoteException.html"><CODE>RemoteException</CODE></A>
 * to provide for the possibility that the Print Job's implementation performs
 * remote method calls. The PrintJob object's implementation in fact may or may
 * not perform remote method calls.
 * <P>
 * <HR>
 * <H3>Print Job Processing</H3>
 * <H4>Print Request</H4>
 * A Print Request object submitted for printing is either a doc print request
 * or a multidoc print request. All Jini Print Service instances support doc
 * print requests. Supporting multidoc print requests is optional.
 * <P>
 * A doc print request consists of a set of job-level printing attributes and a
 * doc to be printed; the doc consists of a doc flavor, print data
 * representation object, and a set of document-level printing attributes, as
 * shown in this UML class diagram:
 * <P>
 * <CENTER>
 * <IMG SRC="../doc-files/PrintRequestFig1.gif" WIDTH=532 HEIGHT=218>
 * </CENTER>
 * <P>
 * A multidoc print request consists of a set of job-level printing attributes
 * and a multidoc to be printed; the multidoc consists of one or more docs; each
 * doc consists of a doc flavor, print data representation object, and a set of
 * document-level printing attributes, as shown in this UML class diagram:
 * <P>
 * <CENTER>
 * <IMG SRC="../doc-files/PrintRequestFig2.gif" WIDTH=676 HEIGHT=218>
 * </CENTER>
 * <H4>Phases of Print Job Processing</H4>
 * Print job processing is divided into two phases: <B>job assembly</B> and
 * <B>job output.</B>
 * <P>
 * During job assembly, the print service verifies that it supports the
 * combination of doc flavors, doc-level printing attributes, and job-level
 * printing attributes in the Print Request, and the print service collects all
 * the print data from the sources specified in the doc or docs in the Print
 * Request. The print service reports <A
 * HREF="../../../../net/jini/print/job/PrintDataEvent.html"><CODE>PrintDataEvent</CODE></A>s
 * to inform any registered event listeners of the progress and outcome of job
 * assembly. (Of course, if no event listeners are registered, no such events
 * are actually sent.)
 * <P>
 * During job output, the print service prints the job. Depending on the print
 * service implementation, the print job may sit in a queue for a while.
 * Eventually the print service puts marks on media sheets for the job. During
 * job output, the print service dynamically updates the attribute values in the
 * Print Job's attribute set to indicate the job's status. The print service
 * also reports <A
 * HREF="../../../../net/jini/print/job/PrintJobEvent.html"><CODE>PrintJobEvent</CODE></A>s
 * and <A
 * HREF="../../../../net/jini/print/job/PrintJobFinishedEvent.html"><CODE>PrintJobFinishedEvent</CODE></A>s
 * to inform any registered event listeners of the progress and outcome of job
 * output. (Of course, if no event listeners are registered, no such events are
 * actually sent.)
 * <P>
 * Although the job assembly phase and job output phase are described separately
 * for clarity, there is no requirement that the two phases have to be done
 * sequentially. The two phases may, at the Print Service implementation's
 * choice, be performed sequentially or in an overlapped fashion. For example,
 * the printer may start marking media sheets as soon as it has accumulated
 * enough print data without waiting to receive all the print data.
 * <P>
 * Print job processing is initiated when the client calls the Print Request
 * object's <CODE>print()</CODE> method. However, the only things the
 * <CODE>print()</CODE> method itself has to do are these:
 * <UL>
 * <LI>
 * Create the Print Job object.
 * <LI>
 * If the client specified a lease duration argument, create the Print Job's
 * lease object and return the Print Job and lease objects to the client.
 * </UL>
 * Any or all other steps of print job processing may, at the Print Service
 * implementation's choice, be performed either before or after the
 * <CODE>print()</CODE> method returns. In addition, any or all other steps of
 * print job processing may, at the Print Service implementation's choice, be
 * performed either in the client's thread that called the <CODE>print()</CODE>
 * method or in a separate thread executing concurrently with the client's
 * thread. Thus, the client must be prepared possibly to start receiving event
 * notifications and to start receiving invocations of the doc object's methods
 * from a separate thread before <CODE>print()</CODE> returns. Since the client
 * program doesn't know how the Jini Print Service instance is implemented, the
 * client must "assume the worst" and design its event listeners and doc objects
 * to work properly in a multi-threaded environment.
 * <H4>Job Assembly Phase -- Doc Print Requests</H4>
 * Consider first a doc print request. Multidoc print requests will be described
 * later.
 * <P>
 * The print service checks whether the doc object implements interface <A
 * HREF="../../../../net/jini/print/data/LeasedDoc.html"><CODE>LeasedDoc</CODE></A>.
 * If it does, the print service gets the lease object by calling the <A
 * HREF="../../../../net/jini/print/data/LeasedDoc.html#getLease()"><CODE><CODE>LeasedDoc.getLease()</CODE></CODE></A>
 * method on the doc object. The print service renews the lease as necessary to
 * ensure the lease does not expire until after the print service has finished
 * obtaining all of the doc's print data (or until the print service encounters
 * a nonrecoverable error while obtaining the print data), and then the print
 * service will cancel the lease. It is expected that the print service will
 * obtain and start renewing the lease as soon as possible after the job is
 * submitted, otherwise the print service risks the lease expiring and the print
 * data source abandoning the job and discarding the print data.
 * <P>
 * The print service gets the doc flavor by calling the <A
 * HREF="../../../../net/jini/print/data/Doc.html#getDocFlavor()"><CODE><CODE>Doc.getDocFlavor()</CODE></CODE></A>
 * method on the Print Request's doc object. The print service gets the set of
 * document-level attributes by calling the <A
 * HREF="../../../../net/jini/print/data/Doc.html#getAttributes()"><CODE><CODE>Doc.getAttributes()</CODE></CODE></A>
 * method on the Print Request's doc object. The print service gets the set of
 * job-level attributes from the Print Request itself. If any doc method call
 * throws an exception, the print service reports a <A
 * HREF="../../../../net/jini/print/job/PrintDataEvent.html"><CODE>PrintDataEvent</CODE></A>
 * with that exception, and print job processing terminates.
 * <P>
 * The print service verifies the doc flavor and printing attributes for the job
 * as follows. For each possible printing attribute, the print service gets the
 * attribute value from the set of document-level attributes; if not found
 * there, the print service gets the attribute value from the set of job-level
 * attributes; if not found there, the print service uses an
 * implementation-dependent default value. The print service checks whether it
 * can support the specified combination of doc flavor and attribute values. If
 * the print service cannot support this combination, it reports a <A
 * HREF="../../../../net/jini/print/job/PrintDataEvent.html"><CODE>PrintDataEvent</CODE></A>
 * with a <A
 * HREF="../../../../net/jini/print/job/PrintJobException.html"><CODE>PrintJobException</CODE></A>
 * indicating the error, and print job processing terminates. The exception
 * object may optionally implement interfaces <A
 * HREF="../../../../javax/print/exception/AttributeException.html"><CODE>AttributeException</CODE></A>
 * or <A
 * HREF="../../../../javax/print/exception/FlavorException.html"><CODE>FlavorException</CODE></A>
 * to provide further information about the error.
 * <P>
 * (To determine whether the print service supports the combination of doc
 * flavor and printing attributes without actually submitting the print request,
 * the client can use the capability methods in interface <A
 * HREF="../../../../net/jini/print/service/PrintService.html"><CODE>PrintService</CODE></A>.)
 * <P>
 * The print service gets the print data representation object by calling the
 * <A
 * HREF="../../../../net/jini/print/data/Doc.html#getPrintData()"><CODE><CODE>Doc.getPrintData()</CODE></CODE></A>
 * method on the Print Request's doc object. If that method call throws an
 * exception, the print service reports a <A
 * HREF="../../../../net/jini/print/job/PrintDataEvent.html"><CODE>PrintDataEvent</CODE></A>
 * with that exception, and print job processing terminates. If the returned
 * print data representation object is null, the print service reports a <A
 * HREF="../../../../net/jini/print/job/PrintDataEvent.html"><CODE>PrintDataEvent</CODE></A>
 * with a NullPointerException, and print job processing terminates.
 * <P>
 * The print service calls methods on the print data representation object to
 * get the actual print data for the job. The doc flavor's MIME type tells the
 * print service how to interpret the data. Depending on the class of the
 * representation object, which is specified by the doc flavor, the print
 * service obtains the print data as follows:
 * <P>
 * <TABLE BORDER=1 CELLPADDING=2 CELLSPACING=1 WIDTH=100%>
 * <TR>
 * <TH BGCOLOR="#E5E5E5">
 * Rep. Class
 * </TH>
 * <TH BGCOLOR="#E5E5E5">
 * Processing
 * </TH>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top">
 * byte[]
 * </TD>
 * <TD ALIGN="left" VALIGN="top">
 * The print service extracts all the bytes out of the byte array and reports a
 * <A
 * HREF="../../../../net/jini/print/job/PrintDataEvent.html"><CODE>PrintDataEvent</CODE></A>
 * indicating success. If the byte array is zero-length, a blank job gets
 * printed.
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top">
 * char[]
 * </TD>
 * <TD ALIGN="left" VALIGN="top">
 * The print service extracts all the characters out of the character array and
 * reports a <A
 * HREF="../../../../net/jini/print/job/PrintDataEvent.html"><CODE>PrintDataEvent</CODE></A>
 * indicating success. If the character array is zero-length, a blank job gets
 * printed.
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top">
 * <A
 * HREF="file:///C:/jdk1.2.2/docs/api/java/lang/String.html"><CODE>String</CODE></A>
 * </TD>
 * <TD ALIGN="left" VALIGN="top">
 * The print service extracts all the characters out of the string and reports a
 * <A
 * HREF="../../../../net/jini/print/job/PrintDataEvent.html"><CODE>PrintDataEvent</CODE></A>
 * indicating success. If the string is zero-length, a blank job gets printed.
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top">
 * <A
 * HREF="file:///C:/jdk1.2.2/docs/api/java/io/InputStream.html"><CODE>InputStream</CODE></A>
 * </TD>
 * <TD ALIGN="left" VALIGN="top">
 * The print service reads all the bytes from the input stream until the
 * end-of-stream, then closes the input stream. If no I/O errors are
 * encountered, the print service reports a <A
 * HREF="../../../../net/jini/print/job/PrintDataEvent.html"><CODE>PrintDataEvent</CODE></A>
 * indicating success. If an I/O error is encountered, the print service reports
 * a <A
 * HREF="../../../../net/jini/print/job/PrintDataEvent.html"><CODE>PrintDataEvent</CODE></A>
 * with the <A
 * HREF="file:///C:/jdk1.2.2/docs/api/java/io/IOException.html"><CODE>IOException</CODE></A>
 * indicating the error. If it wishes, the print service can test whether the
 * input stream is an instance of class
 * <A
 * HREF="../../../../net/jini/print/data/RemoteInputStream.html"><CODE>RemoteInputStream</CODE></A>
 * and, if so, attempt to recover from remote errors as described in the
 * documentation for class <A
 * HREF="../../../../net/jini/print/data/RemoteInputStream.html"><CODE>RemoteInputStream</CODE></A>.
 * If end-of-stream is encountered before any bytes are read, a blank job gets
 * printed.
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top">
 * <A
 * HREF="file:///C:/jdk1.2.2/docs/api/java/io/Reader.html"><CODE>Reader</CODE></A>
 * </TD>
 * <TD ALIGN="left" VALIGN="top">
 * The print service reads all the characters from the reader until the
 * end-of-stream, then closes the reader. If no I/O errors are encountered, the
 * print service reports a <A
 * HREF="../../../../net/jini/print/job/PrintDataEvent.html"><CODE>PrintDataEvent</CODE></A>
 * indicating success. If an I/O error is encountered, the print service reports
 * a <A
 * HREF="../../../../net/jini/print/job/PrintDataEvent.html"><CODE>PrintDataEvent</CODE></A>
 * with the <A
 * HREF="file:///C:/jdk1.2.2/docs/api/java/io/IOException.html"><CODE>IOException</CODE></A>
 * indicating the error. If it wishes, the print service can test whether the
 * reader is an instance of class <A
 * HREF="../../../../net/jini/print/data/RemoteReader.html"><CODE>RemoteReader</CODE></A>
 * and, if so, attempt to recover from remote errors as described in the
 * documentation for class <A
 * HREF="../../../../net/jini/print/data/RemoteReader.html"><CODE>RemoteReader</CODE></A>.
 * If end-of-stream is encountered before any characters are read, a blank job
 * gets printed.
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top">
 * <A HREF="file:///C:/jdk1.2.2/docs/api/java/net/URL.html"><CODE>URL</CODE></A>
 * </TD>
 * <TD ALIGN="left" VALIGN="top">
 * The print service accesses the URL directly without involving the client. If
 * the print service obtains the print data from the URL without encountering
 * any errors, the print service reports a <A
 * HREF="../../../../net/jini/print/job/PrintDataEvent.html"><CODE>PrintDataEvent</CODE></A>
 * indicating success. If the print service encounters any error obtaining the
 * print data from the URL, the print service reports a <A
 * HREF="../../../../net/jini/print/job/PrintDataEvent.html"><CODE>PrintDataEvent</CODE></A>
 * with an exception indicating the error. The exception object may be a <A
 * HREF="../../../../net/jini/print/job/PrintJobException.html"><CODE>PrintJobException</CODE></A>
 * originating from the print service itself and possibly implementing interface
 * <A
 * HREF="../../../../javax/print/exception/URLException.html"><CODE>URLException</CODE></A>,
 * or the exception object may be of some other exception class such as an <A
 * HREF="file:///C:/jdk1.2.2/docs/api/java/io/IOException.html"><CODE>IOException</CODE></A>.
 * If the URL contains no data, a blank job gets printed.
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top">
 * <CODE>RenderableImage</CODE>
 * </TD>
 * <TD ALIGN="left" VALIGN="top">
 * The print service invokes methods on the renderable image object to produce
 * an image rendered for the printer. If no errors are encountered while
 * rendering the image, the print service reports a <A
 * HREF="../../../../net/jini/print/job/PrintDataEvent.html"><CODE>PrintDataEvent</CODE></A>
 * indicating success. If any error is encountered while rendering the image,
 * the print service reports a <A
 * HREF="../../../../net/jini/print/job/PrintDataEvent.html"><CODE>PrintDataEvent</CODE></A>
 * with an exception indicating the error. The exception object may be a <A
 * HREF="../../../../net/jini/print/job/PrintJobException.html"><CODE>PrintJobException</CODE></A>
 * originating from the print service itself, or the exception object may be of
 * some other exception class. See interface <CODE>RenderableImage</CODE> for
 * further information.
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top">
 * <CODE>Printable</CODE>
 * </TD>
 * <TD ALIGN="left" VALIGN="top">
 * The print service invokes the printable object's
 * <CODE><CODE>print()</CODE></CODE> method repeatedly to obtain each page of
 * the job. For each page, the print service passes in a graphics context object
 * into which the printable object can draw, a page format object telling the
 * page characteristics such as size and orientation (which generally depend on
 * the Print Job's printing attributes), and the page number. The printable
 * object invokes graphics method calls on the graphics context object, and
 * whatever is drawn gets printed on that page. The printable object's
 * <CODE>print()</CODE> method's return value indicates whether there are any
 * further pages. If no errors are encountered while obtaining the pages, the
 * print service reports a
 * <A
 * HREF="../../../../net/jini/print/job/PrintDataEvent.html"><CODE>PrintDataEvent</CODE></A>
 * indicating success. If any error is encountered while obtaining a page, the
 * print service reports a <A
 * HREF="../../../../net/jini/print/job/PrintDataEvent.html"><CODE>PrintDataEvent</CODE></A>
 * with an exception indicating the error. The exception object may be a <A
 * HREF="../../../../net/jini/print/job/PrintJobException.html"><CODE>PrintJobException</CODE></A>
 * originating from the print service itself, or the exception object may be of
 * some other exception class. See interface <CODE>Printable</CODE> for further
 * information.
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top">
 * <CODE>Pageable</CODE>
 * </TD>
 * <TD ALIGN="left" VALIGN="top">
 * The print service invokes the pageable object's
 * <CODE><CODE>getNumberOfPages()</CODE></CODE> method to determine the number
 * of pages to print. For each page, the print service invokes the pageable
 * object's <CODE><CODE>getPageFormat()</CODE></CODE> and
 * <CODE><CODE>getPrintable()</CODE></CODE> methods to get the page's page
 * format object and printable object. The print service uses the settings in
 * the page format object to override the corresponding attributes in the Print
 * Job for that page only. If the print service cannot support those settings,
 * the print service reports a <A
 * HREF="../../../../net/jini/print/job/PrintDataEvent.html"><CODE>PrintDataEvent</CODE></A>
 * with an exception indicating the error. If the print service supports the
 * page settings, the print service uses the page's printable object to get the
 * print data as described above for a representation class of
 * <CODE>Printable</CODE>. The print service does the same for each page in the
 * pageable object. If no errors are encountered while obtaining the pages, the
 * print service reports a <A
 * HREF="../../../../net/jini/print/job/PrintDataEvent.html"><CODE>PrintDataEvent</CODE></A>
 * indicating success; only one success event is reported after all the pages
 * have been processed, not a separate success event for each page. If any error
 * is encountered while obtaining a page, the print service reports a <A
 * HREF="../../../../net/jini/print/job/PrintDataEvent.html"><CODE>PrintDataEvent</CODE></A>
 * with an exception indicating the error. The exception object may be a <A
 * HREF="../../../../net/jini/print/job/PrintJobException.html"><CODE>PrintJobException</CODE></A>
 * originating from the print service itself, or the exception object may be of
 * some other exception class. If the pageable object has no pages, a blank job
 * gets printed. See interface <CODE>Pageable</CODE> for further information.
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top">
 * Other
 * </TD>
 * <TD ALIGN="left" VALIGN="top">
 * If a vendor's Jini Print Service implementation supports any of the above
 * print data representation classes, the implementation must obtain the print
 * data as specified above. A vendor's Jini Print Service implementation may
 * support additional print data representation classes; if it does, for each
 * additional representation class the vendor must document how the print
 * service obtains the print data. Success or failure to obtain the print data
 * must always, however, be reported with a <A
 * HREF="../../../../net/jini/print/job/PrintDataEvent.html"><CODE>PrintDataEvent</CODE></A>.
 * </TD>
 * </TR>
 * </TABLE>
 * <P>
 * At this point the print service has reported a <A
 * HREF="../../../../net/jini/print/job/PrintDataEvent.html"><CODE>PrintDataEvent</CODE></A>
 * indicating either it successfully obtained the print data or it failed to
 * obtain (all or part of) the print data. Either way, if the doc has a lease,
 * at this point the print service (which has been renewing the lease as
 * necessary) cancels the doc's lease. If the print service successfully
 * obtained the print data, the print service proceeds to the job output phase.
 * If the print service failed to obtain the print data, the effect on the job
 * is implementation dependent. Some implementations will not print the job, and
 * print job processing will terminate at this point. Other implementations will
 * print the job with partial data, and the print service will proceed to the
 * job output phase at this point.
 * <P>
 * If print job processing terminates at this point, the print service reports a
 * <A
 * HREF="../../../../net/jini/print/job/PrintJobFinishedEvent.html"><CODE>PrintJobFinishedEvent</CODE></A>
 * with a final job state indicating that an error occurred. The <A
 * HREF="../../../../javax/print/attribute/standard/JobState.html"><CODE>JobState</CODE></A>
 * attribute in the Print Job's attribute set will also indicate the final job
 * state, and the <A
 * HREF="../../../../javax/print/attribute/standard/JobStateReasons.html"><CODE>JobStateReasons</CODE></A>
 * attribute in the Print Job's attribute set may have further information about
 * the error.
 * <H4>Job Assembly Phase -- Multidoc Print Requests</H4>
 * For a multidoc print request, the print service's first step is to iterate
 * through all the docs in the multidoc, looking for docs with leases. The print
 * service gets the current doc object by calling the <A
 * HREF="../../../../net/jini/print/data/MultiDoc.html#getDoc()"><CODE><CODE>MultiDoc.getDoc()</CODE></CODE></A>
 * method, and the print service steps to the next multidoc object by calling
 * the <A
 * HREF="../../../../net/jini/print/data/MultiDoc.html#next()"><CODE><CODE>MultiDoc.next()</CODE></CODE></A>
 * method. For each leased doc it finds, the print service obtains and starts
 * renewing the lease as described above. It is expected that the print service
 * will obtain and start renewing all the leases as soon as possible after the
 * job is submitted, otherwise the print service risks the leases expiring and
 * the print data sources abandoning the job and discarding the print data.
 * <P>
 * After obtaining all the leases, the print service iterates through the
 * multidoc again and repeats all the steps described above -- verifying support
 * for the doc flavor and printing attributes, getting the print data
 * representation object, obtaining the print data, and canceling the lease if
 * any -- for each doc in the multidoc. The print service makes sure to finish
 * obtaining all the print data from one doc before going on to another doc.
 * (This is to accommodate the needs of low-end clients which may lack the
 * resources to provide print data for more than one doc at a time.)
 * <P>
 * Note that as the print service steps from doc to doc, different sets of
 * document-level attributes come into effect. The print service verifies that
 * it supports each doc's individual doc flavor and document-level attributes in
 * combination with the common job-level attributes as the print service
 * processes each doc.
 * <P>
 * The print service also verifies that it supports each doc's doc flavor and
 * document-level attributes in combination with the doc flavors and
 * document-level attributes for the other docs in the job. For example, a print
 * service may support, say, both "portrait" and "landscape" values for the
 * "orientation" attribute, but the print service may require all the docs in
 * the job to specify the same orientation. If all the docs specified portrait
 * orientation or all the docs specified landscape orientation (whether via the
 * individual document-level attributes, via the common job-level attributes, or
 * via the printer's default orientation attribute), the print service would
 * accept the job; but if some docs specified portrait orientation and other
 * docs specified landscape orientation, the print service would report an
 * error. Another print service may support different docs having different
 * orientations in the same job.
 * <P>
 * (To determine whether the print service supports the combination of doc
 * flavors, document-level attributes, and job-level attributes without actually
 * submitting the multidoc print request, the client can use the capability
 * methods in interface <A
 * HREF="../../../../net/jini/print/service/MultiDocPrintService.html"><CODE>MultiDocPrintService</CODE></A>.)
 * <P>
 * The print service reports a separate <A
 * HREF="../../../../net/jini/print/job/PrintDataEvent.html"><CODE>PrintDataEvent</CODE></A>
 * for each doc. If a particular doc succeeds, the print service goes on to the
 * next doc, and if all the docs succeed, the print service goes on to the job
 * output phase. If a particular doc fails, the effect on the job is
 * implementation dependent. Some implementations may terminate job processing
 * altogether. Some implementations may print the job with the print data
 * already obtained but not go on to any further docs. Some implementations may
 * print partial data for the current doc and proceed to the next doc.
 * <P>
 * As for a single-doc print job, if job processing terminates before going on
 * to the job output phase, the print service reports a <A
 * HREF="../../../../net/jini/print/job/PrintJobFinishedEvent.html"><CODE>PrintJobFinishedEvent</CODE></A>
 * with the job's final state. The
 * <A
 * HREF="../../../../javax/print/attribute/standard/JobState.html"><CODE>JobState</CODE></A>
 * attribute in the Print Job's attribute set will also indicate the final job
 * state, and the
 * <A
 * HREF="../../../../javax/print/attribute/standard/JobStateReasons.html"><CODE>JobStateReasons</CODE></A>
 * attribute in the Print Job's attribute set may have further information about
 * the error.
 * <H4>Job Output Phase</H4>
 * What the print service does with a Print Job during the job output phase is
 * highly implementation dependent. The job will generally move from state to
 * state, such as "pending," "printing," and "completed." The print service may
 * also report job progress with Print Job attributes at a finer level, such as
 * the number of media sheets printed.
 * <P>
 * The only generally applicable requirements on the print service are these.
 * During the job output phase, the print service dynamically updates the
 * attribute values in the Print Job's attribute set to reflect the state of the
 * job as it progresses. In addition, the print service reports <A
 * HREF="../../../../net/jini/print/job/PrintJobEvent.html"><CODE>PrintJobEvent</CODE></A>s
 * as the attribute values change in the Print Job's attribute set. Finally,
 * when the Print Job is fully processed, the print service reports a <A
 * HREF="../../../../net/jini/print/job/PrintJobFinishedEvent.html"><CODE>PrintJobFinishedEvent</CODE></A>
 * with the job's final state. The <A
 * HREF="../../../../javax/print/attribute/standard/JobState.html"><CODE>JobState</CODE></A>
 * attribute in the Print Job's attribute set will also indicate the final job
 * state, and the <A
 * HREF="../../../../javax/print/attribute/standard/JobStateReasons.html"><CODE>JobStateReasons</CODE></A>
 * attribute in the Print Job's attribute set may have further information.
 * <P>
 * <B>DRAFT STANDARD VERSION 1.0 (23-MAY-2000)</B>
 */
public interface PrintJob {

    /**
     * Add an event listener to this Print Job object. Henceforth, the Jini
     * Print Service instance will report, to <CODE>theListener</CODE>, events
     * of class <A
     * HREF="../../../../net/jini/print/job/PrintDataEvent.html"><CODE>PrintDataEvent</CODE></A>,
     * <A
     * HREF="../../../../net/jini/print/job/PrintJobEvent.html"><CODE>PrintJobEvent</CODE></A>,
     * and/or <A
     * HREF="../../../../net/jini/print/job/PrintJobFinishedEvent.html"><CODE>PrintJobFinishedEvent</CODE></A>
     * pertaining to this Print Job. These events indicate success or failure of
     * obtaining the job's print data and changes in the job's state as it is
     * processed. For further information on the circumstances under which these
     * events are reported, see classes <A
     * HREF="../../../../net/jini/print/job/PrintDataEvent.html"><CODE>PrintDataEvent</CODE></A>,
     * <A
     * HREF="../../../../net/jini/print/job/PrintJobEvent.html"><CODE>PrintJobEvent</CODE></A>,
     * and
     * <A
     * HREF="../../../../net/jini/print/job/PrintJobFinishedEvent.html"><CODE>PrintJobFinishedEvent</CODE></A>.
     * To stop receiving these event notifications, cancel the event
     * registration's lease or let it expire.
     * <P>
     * The event registration is leased. However, once this Print Job has
     * finished processing, the Jini Print Service instance is allowed to deny
     * subsequent requests to renew event registration leases for this Print Job
     * (since no further events will ever be reported, there's no point in
     * letting the event registrations continue).
     * <P>
     * The items obtained by calling methods on the returned EventRegistration
     * object are as follows:
     * <UL>
     * <P>
     * <LI>
     * <CODE>getID()</CODE> -- The event identifier is unique among all the
     * event registrations for this Jini Print Service instance. Event
     * identifiers are not necessarily unique across different Jini Print
     * Service instances.
     * <P>
     * <LI>
     * <CODE>getSource()</CODE> -- The event source is this Jini Print Service
     * instance (i.e., the PrintService object processing this Print Job).
     * <P>
     * <LI>
     * <CODE>getLease()</CODE> -- Lease for this event registration. The lease
     * will be set to expire no later than the requested duration from now; it
     * may be set to expire earlier depending on the Jini Print Service
     * implementation.
     * <P>
     * <LI>
     * <CODE>getSequenceNumber()</CODE> -- Jini Print Service event sequence
     * numbers are "fully ordered." For a given Jini Print Service instance and
     * event identifier, sequence numbers start at 1, successive events'
     * sequence numbers are strictly increasing, and no sequence numbers are
     * skipped. Thus, the event registration's <CODE>getSequenceNumber()</CODE>
     * method always returns 1.
     * </UL>
     * <P>
     * @param reportPrintDataSuccess If true, for this event registration the
     * Jini Print Service instance will report a PrintDataEvent when print data
     * is successfully obtained for this Print Job. If false, such events will
     * not be reported for this event registration.
     * @param reportPrintDataFailure If true, for this event registration the
     * Jini Print Service instance will report a PrintDataEvent when print data
     * fails to be obtained for this Print Job. If false, such events will not
     * be reported for this event registration.
     * @param theCategories Array of printing attribute categories. Each element
     * of the array is a Class object denoting a monitored attribute category.
     * For this event registration, the Jini Print Service instance will report
     * a PrintJobEvent when there is a change in the value of any of the
     * monitored attribute categories in this Print Job's attribute set. If
     * theCategories is null, there are no monitored attribute categories. If
     * theCategories is zero-length, the monitored attribute categories include
     * all printing attributes for this Print Job. Null elements in
     * theCategories are ignored.
     * @param theValues Array of printing attribute values. Each element of the
     * array is a PrintJobAttribute object denoting a monitored attribute value.
     * For this event registration, the Jini Print Service instance will report
     * a PrintJobEvent when an attribute in this Print Job's attribute set
     * achieves one of the monitored attribute values. If theValues is null or
     * zero-length, there are no monitored attribute values. Null elements in
     * theValues are ignored.
     * @param reportPrintJobFinished If true, for this event registration the
     * Jini Print Service instance will report a PrintJobFinishedEvent when the
     * Print Job finishes processing. If false, such events will not be reported
     * for this event registration.
     * @param theListener Remote event listener object to which this Jini Print
     * Service instance should report print events for this event registration.
     * @param theHandbackObject Handback object this Jini Print Service instance
     * should return in every print event reported for this event registration,
     * or null if there is no handback object.
     * @param theRequestedLeaseDuration Requested lease duration (milliseconds),
     * or one of the constants Lease.ANY or Lease.FOREVER.
     * @return Event registration object.
     * @throws IOException Thrown if a remote error occurred.
     * @throws NullPointerException (unchecked exception) Thrown if theListener
     * is null.
     */
    public EventRegistration addEventListener(
	    boolean reportPrintDataSuccess,
	    boolean reportPrintDataFailure,
	    Class[] theCategories,
	    PrintJobAttribute[] theValues,
	    boolean reportPrintJobFinished,
	    net.jini.core.event.RemoteEventListener theListener,
	    MarshalledInstance theHandbackObject,
	    long theRequestedLeaseDuration) throws IOException;

    /**
     * Obtain a snapshot of this Print Job's attribute set. The returned
     * attribute set object is unmodifiable.
     * <P>
     * This Print Job's attribute set is a <A
     * HREF="../../../../javax/print/attribute/PrintJobAttributeSet.html"><CODE>PrintJobAttributeSet</CODE></A>
     * object containing a number of <A
     * HREF="../../../../javax/print/attribute/PrintJobAttribute.html"><CODE>PrintJobAttribute</CODE></A>
     * objects. There are two kinds of attributes in the attribute set:
     * <UL>
     * <LI>
     * Attributes the client specified in the Print Request that resulted in
     * this Print Job -- namely, the attributes specified when the Print Request
     * was created, or the attributes specified by calling <A
     * HREF="../../../../net/jini/print/job/PrintRequest.html#setAttributes(javax.print.attribute.PrintRequestAttributeSet)"><CODE><CODE>PrintRequest.setAttributes()</CODE></CODE></A>.
     * These attributes implement interface <A
     * HREF="../../../../javax/print/attribute/PrintRequestAttribute.html"><CODE>PrintRequestAttribute</CODE></A>
     * as well as interface <A
     * HREF="../../../../javax/print/attribute/PrintJobAttribute.html"><CODE>PrintJobAttribute</CODE></A>
     * and denote the job settings the client wants for this Print Job.
     * <LI>
     * Attributes reporting this Print Job's status -- job state, number of
     * media sheets printed, etc. These attributes change values in the
     * attribute set dynamically as this Print Job is processed. These
     * attributes implement interface <A
     * HREF="../../../../javax/print/attribute/PrintJobAttribute.html"><CODE>PrintJobAttribute</CODE></A>
     * but not interface <A
     * HREF="../../../../javax/print/attribute/PrintRequestAttribute.html"><CODE>PrintRequestAttribute</CODE></A>.
     * </UL>
     * <P>
     * The Jini Print Service instance combines the client-specified Print
     * Request attributes with the printer-determined job status attributes to
     * form the Print Job's attribute set.
     * <P>
     * The returned attribute set object is a "snapshot" of this Print Job's
     * attribute set at the time of the <CODE>getAttributes()</CODE> method
     * call; that is, the returned attribute set object's contents will
     * <I>not</I> be updated if this Print Job's attribute set's contents change
     * in the future. To detect changes in attribute values, call
     * <CODE>getAttributes()</CODE> again and compare the new attribute set to
     * the previous attribute set; alternatively, register a listener for print
     * job events.
     * <P>
     * @return Unmodifiable snapshot of this Print Job's attribute set.
     * @throws IOException Thrown if a remote error occurred.
     */
    public PrintJobAttributeSet getAttributes()
	    throws IOException;
    
    
    /**
     * Determine the Print Service object to which this Print Job object is bound.
     * 
     * @return Print Service object.
     * @throws IOException Thrown if a remote error occurred.
     */
    public PrintService getPrintService()
                             throws IOException;
}
