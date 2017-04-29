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
import javax.print.attribute.PrintRequestAttributeSet;
import net.jini.io.MarshalledInstance;
import net.jini.print.service.PrintService;

/**
 * <P>
 * Interface PrintRequest specifies the interface for an object that conveys a
 * request to print a job to a Jini Print Service instance. A Print Request
 * represents a nascent print job being set up before being submitted to be
 * printed.
 * <P>
 * A Print Request object is created by calling a print request creation method
 * on a Print Service (see package <A
 * HREF="../../../../net/jini/print/service/package-summary.html">net.jini.print.service</A>).
 * A Print Request can be created to print a single piece of print data or
 * multiple pieces of print data.
 * <P>
 * To print a doc, the client calls <A
 * HREF="../../../../net/jini/print/service/PrintService.html#createDocPrintRequest()"><CODE><CODE>PrintService.createDocPrintRequest()</CODE></CODE></A>.
 * ("Doc" is a short, easy-to-pronounce term that means "a piece of print
 * data.") Such a Print Request is termed a "doc print request." The returned
 * Print Request object implements both interface PrintRequest and the
 * subinterface <A
 * HREF="../../../../net/jini/print/job/DocPrintRequest.html"><CODE>DocPrintRequest</CODE></A>.
 * The client can supply the doc to be printed and a set of printing attributes
 * for the job as arguments of the <A
 * HREF="../../../../net/jini/print/service/PrintService.html#createDocPrintRequest()"><CODE><CODE>PrintService.createDocPrintRequest()</CODE></CODE></A>
 * method call. Alternatively, the client can supply the doc and the attribute
 * set by calling methods on the Print Request object. When it's all set up, a
 * doc print request consists of a set of job-level printing attributes and a
 * doc to be printed; the doc consists of a doc flavor, print data
 * representation object, and a set of document-level printing attributes, as
 * shown in this UML class diagram:
 * <P>
 * <CENTER>
 * <IMG SRC="../doc-files/PrintRequestFig1.gif" WIDTH=532 HEIGHT=218>
 * </CENTER>
 * <P>
 * To print a multidoc, the client calls <A
 * HREF="../../../../net/jini/print/service/MultiDocPrintService.html#createMultiDocPrintRequest()"><CODE><CODE>MultiDocPrintService.createMultiDocPrintRequest()</CODE></CODE></A>.
 * (A "multidoc" is a group of one or more docs.) Such a Print Request is termed
 * a "multidoc print request." The returned Print Request object implements both
 * interface PrintRequest and the subinterface <A
 * HREF="../../../../net/jini/print/job/MultiDocPrintRequest.html"><CODE>MultiDocPrintRequest</CODE></A>.
 * The client can supply the multidoc to be printed and a set of printing
 * attributes for the job as arguments of the <A
 * HREF="../../../../net/jini/print/service/MultiDocPrintService.html#createMultiDocPrintRequest()"><CODE><CODE>MultiDocPrintService.createMultiDocPrintRequest()</CODE></CODE></A>
 * method call. Alternatively, the client can supply the multidoc and the
 * attribute set by calling methods on the Print Request object. When it's all
 * set up, a multidoc print request consists of a set of job-level printing
 * attributes and a multidoc to be printed; the multidoc consists of one or more
 * docs; each doc consists of a doc flavor, print data representation object,
 * and a set of document-level printing attributes, as shown in this UML class
 * diagram:
 * <P>
 * <CENTER>
 * <IMG SRC="../doc-files/PrintRequestFig2.gif" WIDTH=676 HEIGHT=218>
 * </CENTER>
 * <P>
 * Once the client has finished setting up the doc or multidoc Print Request,
 * the client calls the <A
 * HREF="../../../../net/jini/print/job/PrintRequest.html#print(long)"><CODE><CODE>PrintRequest.print()</CODE></CODE></A>
 * method, which returns a Print Job object (interface <A
 * HREF="../../../../net/jini/print/job/PrintJob.html"><CODE>PrintJob</CODE></A>)
 * representing the submitted print job. The client can then use the Print Job
 * object to track the job's progress and control the job. If the client doesn't
 * need to track or control the submitted job, the client can simply disregard
 * the returned Print Job object.
 * <P>
 * Print job processing, consisting of several steps described in interface
 * <A
 * HREF="../../../../net/jini/print/job/PrintJob.html"><CODE>PrintJob</CODE></A>,
 * is initiated when the client calls the Print Request object's
 * <CODE>print()</CODE> method. However, the only things the
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
 * <P>
 * Creating doc print requests is a mandatory capability that all Jini Print
 * Service instances must provide. Creating multidoc print requests is an
 * optional capability that a Jini Print Service instance need not provide. If
 * this capability is provided, the Jini Print Service proxy object will
 * implement interface <A
 * HREF="../../../../net/jini/print/service/MultiDocPrintService.html"><CODE>MultiDocPrintService</CODE></A>.
 * <P>
 * The Print Request is "bound" to the Print Service that created it, in the
 * sense that the job will print on the printer associated with that Print
 * Service.
 * <P>
 * A Print Request object is not a leased resource; it is merely a container for
 * conveying a job request to a Jini Print Service instance. When a Print
 * Service creates a Print Request object for a client, the Print Service does
 * not allocate any resources that have to be cleaned up if there is a
 * distributed failure of the client. A Print Job object, on the other hand,
 * <I>is</I> a leased resource. When the client submits a Print Request by
 * calling the <A
 * HREF="../../../../net/jini/print/job/PrintRequest.html#print(long)"><CODE><CODE>print()</CODE></CODE></A>
 * method, the client specifies a requested duration for the Print Job's lease.
 * The <A
 * HREF="../../../../net/jini/print/job/PrintRequest.html#print(long)"><CODE><CODE>print()</CODE></CODE></A>
 * method returns both a Print Job object and a Lease object for the print job.
 * For further information, see interface
 * <A
 * HREF="../../../../net/jini/print/job/PrintJob.html"><CODE>PrintJob</CODE></A>.
 * <P>
 * By calling methods on a Print Request object, the client can register a
 * remote event listener to receive event notifications pertaining to the Print
 * Job object that results from submitting the Print Request. To ensure that the
 * client receives event notifications starting from the point of submission,
 * the client must register for event notifications with the Print Request
 * object before calling the <A
 * HREF="../../../../net/jini/print/job/PrintRequest.html#print(long)"><CODE><CODE>print()</CODE></CODE></A>
 * method. The events that can be reported are represented by classes <A
 * HREF="../../../../net/jini/print/job/PrintDataEvent.html"><CODE>PrintDataEvent</CODE></A>,
 * <A
 * HREF="../../../../net/jini/print/job/PrintJobEvent.html"><CODE>PrintJobEvent</CODE></A>,
 * and
 * <A
 * HREF="../../../../net/jini/print/job/PrintJobFinishedEvent.html"><CODE>PrintJobFinishedEvent</CODE></A>;
 * see those classes for further information about the events' meanings and the
 * circumstances under which they are reported.
 * <P>
 * There is no restriction on the number of client threads that may be
 * simultaneously accessing the same Print Request object. Therefore, all
 * implementations of interface PrintRequest and its subinterfaces must be
 * designed to be multiple thread safe.
 * <P>
 * Certain methods in interface PrintRequest throw <A
 * HREF="file:///C:/jdk1.2.2/docs/api/java/rmi/RemoteException.html"><CODE>RemoteException</CODE></A>
 * to provide for the possibility that the Print Request object's
 * implementations of those methods perform remote method calls. The Print
 * Request object's implementations of those methods in fact may or may not
 * perform remote method calls. Other methods in interface PrintRequest do not
 * throw <A
 * HREF="file:///C:/jdk1.2.2/docs/api/java/rmi/RemoteException.html"><CODE>RemoteException</CODE></A>;
 * these methods are not intended to make remote method calls and must be
 * implemented locally.
 * <P>
 */
public interface PrintRequest {

    /**
     * Determine the Print Service object to which this Print Request object is
     * bound.
     *
     * @return Print Service object.
     */
    public PrintService getPrintService();

    /**
     * Specify the set of printing attributes for this Print Request. The
     * previous attribute set is completely replaced with the given attribute
     * set.
     *
     * The setAttributes() method does not verify whether this Jini Print
     * Service instance supports the attributes and attribute values in the
     * given attribute set. This verification is done during Print Job
     * processing after this Print Request has been submitted. (To determine
     * whether the print service supports the combination of doc flavor and
     * printing attributes without actually submitting the Print Request, the
     * client can use the capability methods in interfaces PrintService and
     * MultiDocPrintService.)
     *
     * @param theAttributes Attribute set, or null to specify no attributes.
     */
    public void setAttributes(PrintRequestAttributeSet theAttributes);

    /**
     * Add an event listener to this Print Request object. Once this Print
     * Request has been submitted, the Jini Print Service instance will report,
     * to <CODE>theListener</CODE>, events of class <A
     * HREF="../../../../net/jini/print/job/PrintDataEvent.html"><CODE>PrintDataEvent</CODE></A>,
     * <A
     * HREF="../../../../net/jini/print/job/PrintJobEvent.html"><CODE>PrintJobEvent</CODE></A>,
     * and/or <A
     * HREF="../../../../net/jini/print/job/PrintJobFinishedEvent.html"><CODE>PrintJobFinishedEvent</CODE></A>
     * pertaining to the resulting Print Job. These events indicate success or
     * failure of obtaining the job's print data and changes in the job's state
     * as it is processed. For further information on the circumstances under
     * which these events are reported, see classes <A
     * HREF="../../../../net/jini/print/job/PrintDataEvent.html"><CODE>PrintDataEvent</CODE></A>,
     * <A
     * HREF="../../../../net/jini/print/job/PrintJobEvent.html"><CODE>PrintJobEvent</CODE></A>,
     * and <A
     * HREF="../../../../net/jini/print/job/PrintJobFinishedEvent.html"><CODE>PrintJobFinishedEvent</CODE></A>.
     * To stop receiving these event notifications, cancel the event
     * registration's lease or let it expire.
     * <P>
     * The event registration is leased. However, once the Print Job has
     * finished processing, the Jini Print Service instance is allowed to deny
     * subsequent requests to renew event registration leases for the Print Job
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
     * instance (i.e., the PrintService object that created this Print Request).
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
     *
     * @param reportPrintDataSuccess If true, for this event registration the
     * Jini Print Service instance will report a PrintDataEvent when print data
     * is successfully obtained for the Print Job. If false, such events will
     * not be reported for this event registration.
     * @param reportPrintDataFailure If true, for this event registration the
     * Jini Print Service instance will report a PrintDataEvent when print data
     * fails to be obtained for the Print Job. If false, such events will not be
     * reported for this event registration.
     * @param theCategories Array of printing attribute categories. Each element
     * of the array is a Class object denoting a monitored attribute category.
     * For this event registration, the Jini Print Service instance will report
     * a PrintJobEvent when there is a change in the value of any of the
     * monitored attribute categories in the Print Job's attribute set. If
     * theCategories is null, there are no monitored attribute categories. If
     * theCategories is zero-length, the monitored attribute categories include
     * all printing attributes for the Print Job. Null elements in theCategories
     * are ignored.
     * @param theValues Array of printing attribute values. Each element of the
     * array is a PrintJobAttribute object denoting a monitored attribute value.
     * For this event registration, the Jini Print Service instance will report
     * a PrintJobEvent when an attribute in the Print Job's attribute set
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
    public net.jini.core.event.EventRegistration addEventListener(boolean reportPrintDataSuccess,
	    boolean reportPrintDataFailure,
	    Class[] theCategories,
	    PrintJobAttribute[] theValues,
	    boolean reportPrintJobFinished,
	    net.jini.core.event.RemoteEventListener theListener,
	    MarshalledInstance theHandbackObject,
	    long theRequestedLeaseDuration)
	    throws IOException;

    /**
     * Submit this Print Request to be printed. The Jini Print Service instance
     * responds by creating a Print Job object to process the job. See interface
     * <A
     * HREF="../../../../net/jini/print/job/PrintJob.html"><CODE>PrintJob</CODE></A>
     * for further information about Print Job processing. However, the Print
     * Job object is not returned. Thus, the client has no way to manipulate the
     * Print Job directly. The client will receive event notifications from the
     * Print Job, if the client registered for them with this Print Request.
     * <P>
     * It is possible for a Print Service to fail or become inaccessible between
     * the time the client calls a Print Service method to create the Print
     * Request and the time the client calls the Print Request's
     * <CODE>print()</CODE> method, in which case <CODE>print()</CODE> may throw
     * a RemoteException.
     * <P>
     * If <CODE>print()</CODE> is called again on an already-submitted Print
     * Request, it does <I>not</I> create a new Print Job. In other words, the
     * <CODE>print()</CODE> method is idempotent. In a distributed system, this
     * lets the client attempt to recover from a RemoteException by calling
     * <CODE>print()</CODE> again.
     *
     * @throws PrintRequestException Thrown if this Print Request was not
     * successfully submitted. Possible errors include, but are not limited to,
     * the following:
     * <UL>
     * <LI>
     * This Print Request does not have any print data (no doc or multidoc was
     * specified).
     * <LI>
     * A new Print Job could not be created.
     * </UL>
     * @throws IOException Thrown if a remote error occurred.
     */
    public void print()
	    throws PrintRequestException,
	    IOException;

    /**
     * Submit this Print Request to be printed. The Jini Print Service instance
     * responds by creating a Print Job object to process the job. See interface
     * PrintJob for further information about Print Job processing. The
     * resulting Print Job object is returned along with a lease for it. The
     * client will also receive event notifications from the Print Job, if the
     * client registered for them with this Print Request.
     *
     * It is possible for a Print Service to fail or become inaccessible between
     * the time the client calls a Print Service method to create the Print
     * Request and the time the client calls the Print Request's print() method,
     * in which case print() may throw a RemoteException.
     *
     * If print() is called again on an already-submitted Print Request, it does
     * not create a new Print Job, it merely returns the same already-existing
     * Print Job and its lease. In other words, the print() method is
     * idempotent. In a distributed system, this lets the client attempt to
     * recover from a RemoteException by calling print() again.
     *
     * @param theRequestedLeaseDuration Requested lease duration (milliseconds),
     * or one of the constants Lease.ANY or Lease.FOREVER.
     * @return Print Job object and its lease.
     * @throws PrintRequestException Thrown if this Print Request was not
     * successfully submitted. Possible errors include, but are not limited to,
     * the following:
     * <UL>
     * <LI>
     * This Print Request does not have any print data (no doc or multidoc was
     * specified).
     * <LI>
     * A new Print Job could not be created.
     * <LI>
     * A lease for the new Print Job could not be created.
     * </UL>
     * @throws IOException Thrown if a remote error ocurred.
     */
    public PrintJobAndLease print(long theRequestedLeaseDuration)
	    throws PrintRequestException,
	    IOException;

}
