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
package net.jini.print.service;

import java.io.IOException;
import javax.print.attribute.PrintServiceAttribute;
import net.jini.core.event.EventRegistration;
import net.jini.io.MarshalledInstance;

/**
 * <P>
 * Interface PrintService is the base interface that a Jini Print Service
 * instance's service proxy object implements. Interface PrintService specifies
 * the capability to discover basic information about a Jini Print Service
 * instance, including the print data formats supported and printing attributes
 * supported. To actually print something, the client must create a Print
 * Request object by calling a print request creation method on a Jini Print
 * Service proxy object. A Print Request can be created to print a single piece
 * of print data or multiple pieces of print data.
 * <P>
 * To print a doc, the client calls <A
 * HREF="../../../../net/jini/print/service/PrintService.html#createDocPrintRequest()"><CODE><CODE>createDocPrintRequest()</CODE></CODE></A>.
 * ("Doc" is a short, easy-to-pronounce term that means "a piece of print
 * data.") Such a Print Request is termed a "doc print request." The returned
 * Print Request object implements both interface <A
 * HREF="../../../../net/jini/print/job/PrintRequest.html"><CODE>PrintRequest</CODE></A>
 * and the subinterface <A
 * HREF="../../../../net/jini/print/job/DocPrintRequest.html"><CODE>DocPrintRequest</CODE></A>.
 * The client can supply the doc to be printed and a set of printing attributes
 * for the job as arguments of the <A
 * HREF="../../../../net/jini/print/service/PrintService.html#createDocPrintRequest()"><CODE><CODE>createDocPrintRequest()</CODE></CODE></A>
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
 * To print multiple pieces of print data, see interface <A
 * HREF="../../../../net/jini/print/service/MultiDocPrintService.html"><CODE>MultiDocPrintService</CODE></A>.
 * <P>
 * Interface PrintService has a method to let the client examine the Print
 * Service's attribute set, which includes printer description attributes that
 * tell the printer's state, the number of jobs in the queue, whether there's a
 * paper jam, and so on. The printer description attributes change their values
 * dynamically as the printer operates. The client either can receive event
 * notifications when selected attribute values change or can poll the Print
 * Service's attribute set periodically.
 * <P>
 * The client can register a remote event listener to receive event
 * notifications pertaining to a Print Service. The events that can be reported
 * are represented by class <A
 * HREF="../../../../net/jini/print/service/PrintServiceEvent.html"><CODE>PrintServiceEvent</CODE></A>;
 * see that class for further information about the events' meanings and the
 * circumstances under which they are reported.
 * <P>
 * Interface PrintService has <B>capability methods</B> to determine the
 * possible settings the client can specify for a print job, either in the Print
 * Request's attribute set or in a doc's attribute set -- namely, which print
 * data formats (doc flavors), which printing attribute categories, and which
 * printing attribute values the Jini Print Service instance supports. These
 * methods can be used in two different ways. When called without specifying the
 * settings for a supposed job, these methods return information about
 * <I>all</I> the supported doc flavors, attribute categories, and attribute
 * values. However, these methods also take a <A
 * HREF="../../../../net/jini/print/service/Settings.html"><CODE>Settings</CODE></A>
 * argument which is the settings for a supposed job (the job's doc flavor and
 * attribute set, which may be a partially-filled-out attribute set, including
 * both job-level and doc-level attributes), in which case these methods return
 * information about <I>only</I> the doc flavors, attribute categories, and
 * attribute values that are supported <I>in combination</I> with the supposed
 * job settings.
 * <P>
 * For example, a Jini Print Service instance may support the "orientation"
 * attribute (portrait, landscape). But the Jini Print Service instance may only
 * let you specify an orientation attribute for certain doc flavors (such as
 * plain text) and not other doc flavors (such as PostScript, because the
 * orientation is inherent in the PostScript program); in other words, certain
 * combinations of doc flavor and orientation attribute value are not supported.
 * If you call the <CODE>isAttributeCategorySupported()</CODE> method to ask
 * whether the orientation attribute is supported without reference to the
 * settings for any particular job (i.e. a null settings argument), the method
 * will return true, because this printer supports the orientation attribute for
 * some doc flavors. If you call the <CODE>isAttributeCategorySupported()</CODE>
 * method to ask whether the orientation attribute is supported for a plain text
 * job (i.e. a settings argument containing a plain text doc flavor), the method
 * will again return true, because this printer supports the orientation
 * attribute for plain text. But if you call the
 * <CODE>isAttributeCategorySupported()</CODE> method to ask whether the
 * orientation attribute is supported for a PostScript job (i.e. a settings
 * argument containing a PostScript doc flavor), the method will return false,
 * because this printer does not support the orientation attribute for
 * PostScript.
 * <P>
 * Creating doc print requests, registering for event notifications, examining
 * the Print Service's attribute set, and determining the Print Service's
 * supported doc flavors and attributes are mandatory capabilities that all Jini
 * Print Service instances must provide. Hence, all Jini Print Service proxies
 * implement the mandatory interface PrintService. Additional, optional Print
 * Service capabilities are represented as subinterfaces of interface
 * PrintService. If a Jini Print Service instance supports an optional Print
 * Service capability, the service proxy will implement the corresponding
 * subinterface.
 * <P>
 * There is no restriction on the number of client threads that may be
 * simultaneously accessing the same Print Service. Therefore, all
 * implementations of interface PrintService and its subinterfaces must be
 * designed to be multiple thread safe.
 * <P>
 * Interface PrintService's methods all throw <A
 * HREF="file:///C:/jdk1.2.2/docs/api/java/rmi/RemoteException.html"><CODE>RemoteException</CODE></A>
 * to provide for the possibility that the Print Service object's implementation
 * performs remote method calls. The Print Service object's implementation in
 * fact may or may not perform remote method calls.
 * <P>
 * <B>DRAFT STANDARD VERSION 1.0 (23-MAY-2000)</B>
 *
 * @author peter
 */
public interface PrintService {

    /**
     * <p>
     * Add an event listener to this Print Service. Henceforth, the Jini Print
     * Service instance will report, to theListener, events of class
     * PrintServiceEvent pertaining to this Print Service. These events indicate
     * changes in the Print Service's state as it operates. For further
     * information on the circumstances under which print service events are
     * reported, see class PrintServiceEvent. To stop receiving these event
     * notifications, cancel the event registration's lease or let it expire.
     * </p><p>
     * The items obtained by calling methods on the returned EventRegistration
     * object are as follows:
     * </p><p>
     * getID() -- The event identifier is unique among all the event
     * registrations for this Jini Print Service instance. Event identifiers are
     * not necessarily unique across different Jini Print Service instances.
     * </p><p>
     * getSource() -- The event source is this Jini Print Service instance
     * (i.e., this PrintService object).
     * </p><p>
     * getLease() -- Lease for this event registration. The lease will be set to
     * expire no later than the requested duration from now; it may be set to
     * expire earlier depending on the Jini Print Service implementation.
     * </p><p>
     * getSequenceNumber() -- Jini Print Service event sequence numbers are
     * "fully ordered." For a given Jini Print Service instance and event
     * identifier, sequence numbers start at 1, successive events' sequence
     * numbers are strictly increasing, and no sequence numbers are skipped.
     * Thus, the event registration's getSequenceNumber() method always returns
     * 1.
     * </p>
     *
     * @param theCategories Array of printing attribute categories. Each element
     * of the array is a Class object denoting a monitored attribute category.
     * For this event registration, this Print Service will report a
     * PrintServiceEvent when there is a change in the value of any of the
     * monitored attribute categories in this Print Service's attribute set. If
     * theCategories is null, there are no monitored attribute categories. If
     * theCategories is zero-length, the monitored attribute categories include
     * all printing attributes for this Print Service. Null elements in
     * theCategories are ignored.
     * @param theValues Array of printing attribute values. Each element of the
     * array is a PrintServiceAttribute object denoting a monitored attribute
     * value. For this event registration, this Print Service will report a
     * PrintServiceEvent when an attribute in this Print Service's attribute set
     * achieves one of the monitored attribute values. If theValues is null or
     * zero-length, there are no monitored attribute values. Null elements in
     * theValues are ignored.
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
    public EventRegistration addEventListener(Class[] theCategories,
	    PrintServiceAttribute[] theValues,
	    net.jini.core.event.RemoteEventListener theListener,
	    MarshalledInstance theHandbackObject,
	    long theRequestedLeaseDuration) throws IOException;
}
