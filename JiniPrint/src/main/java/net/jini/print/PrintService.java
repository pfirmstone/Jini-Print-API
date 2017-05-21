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
package net.jini.print;

import java.io.IOException;
import java.io.NotSerializableException;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.attribute.Attribute;
import javax.print.attribute.AttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.PrintServiceAttribute;
import javax.print.attribute.PrintServiceAttributeSet;
import net.jini.core.event.EventRegistration;
import net.jini.io.MarshalledInstance;
import net.jini.print.job.DocPrintRequest;

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
 * To print a doc, the client calls {@link PrintService#createDocPrintRequest() }.
 * ("Doc" is a short, easy-to-pronounce term that means "a piece of print
 * data.") Such a Print Request is termed a "doc print request." The returned
 * Print Request object implements both interface {@link net.jini.print.job.PrintRequest}
 * and the subinterface {@link DocPrintRequest}.
 * The client can supply the doc to be printed and a set of printing attributes
 * for the job as arguments of the {@link PrintService#createDocPrintRequest() }
 * method call. Alternatively, the client can supply the doc and the attribute
 * set by calling methods on the Print Request object. When it's all set up, a
 * doc print request consists of a set of job-level printing attributes and a
 * doc to be printed; the doc consists of a doc flavor, print data
 * representation object, and a set of document-level printing attributes, as
 * shown in this UML class diagram:
 * <P>
 * <CENTER>
 * <IMG SRC="doc-files/PrintRequestFig1.gif" WIDTH=532 HEIGHT=218>
 * </CENTER>
 * <P>
 * To print multiple pieces of print data, see interface {@link MultiDocPrintService } .
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
 * are represented by class {@link net.jini.print.PrintServiceEvent};
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
 * values. However, these methods also take a {@link Settings}
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
 * Interface PrintService's methods all throw @{link java.rmi.RemotException} 
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
     * Create a Print Request object, bound to this Print Service object, that
     * is able to print a single doc. The returned Print Request object
     * implements interfaces PrintRequest and DocPrintRequest, and it may
     * implement additional interfaces in package net.jini.print.job depending
     * on the Print Service implementation. The returned Print Request object
     * has neither a doc nor a set of job-level printing attributes; these must
     * be populated by calling methods on the Print Request object.
     *
     * @return Print Request object.
     * @throws PrintServiceException Thrown if this Print Service could not
     * create a Print Request object. The detail message may provide further
     * information about the error. The exception object may be an instance of a
     * PrintServiceException subclass that implements one or more of the mixin
     * interfaces, such as NestedException, to provide further information about
     * the error.
     * @throws IOException Thrown if a remote error occurred.
     */
    public DocPrintRequest createDocPrintRequest()
	    throws PrintServiceException,
	    IOException;

    /**
     * Create a Print Request object, bound to this Print Service object, to
     * print the given doc with the given set of printing attributes. The
     * returned Print Request object implements interfaces PrintRequest and
     * DocPrintRequest, and it may implement additional interfaces in package
     * net.jini.print.job depending on the Print Service implementation. The
     * returned Print Request object is populated with the given doc and set of
     * job-level printing attributes.
     *
     * @param theDoc Doc to be printed, or null to specify no doc (in which case
     * the doc must be specified later by calling a method on the returned Print
     * Request object).
     * @param theAttributes Attribute set, or null to specify no attributes.
     * @return Print Request object.
     * @throws PrintServiceException Thrown if this Print Service could not
     * create a Print Request object. The detail message may provide further
     * information about the error. The exception object may be an instance of a
     * PrintServiceException subclass that implements one or more of the mixin
     * interfaces, such as NestedException, to provide further information about
     * the error.
     * @throws IOException Thrown if a remote error occurred.
     * @throws NotSerializableException may be thrown if Doc is not Serializable.
     */
    public DocPrintRequest createDocPrintRequest(Doc theDoc,
	    PrintRequestAttributeSet theAttributes)
	    throws PrintServiceException,
	    IOException, NotSerializableException;

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

    /**
     * Obtain a snapshot of this Print Service's attribute set. The returned
     * attribute set object is unmodifiable.
     * <P>
     * This Print Service's attribute set is a <A
     * HREF="../../../../javax/print/attribute/PrintServiceAttributeSet.html"><CODE>PrintServiceAttributeSet</CODE></A>
     * object containing a number of <A
     * HREF="../../../../javax/print/attribute/PrintServiceAttribute.html"><CODE>PrintServiceAttribute</CODE></A>
     * objects. There are two kinds of attributes in the attribute set:
     * <UL>
     * <LI>
     * Attributes reporting this Print Service's status -- printer state, number
     * of queued jobs, etc. These attributes change values in the attribute set
     * dynamically as the printer operates.
     * <LI>
     * Attributes describing this Print Service's general features -- name,
     * location, etc. These attributes rarely or never change values. (If an
     * administrator reconfigures the printer, these attributes might change.)
     * </UL>
     * <P>
     * The returned attribute set object is a "snapshot" of this Print Service's
     * attribute set at the time of the <CODE>getAttributes()</CODE> method
     * call; that is, the returned attribute set object's contents will
     * <I>not</I> be updated if this Print Service's attribute set's contents
     * change in the future. To detect changes in attribute values, call
     * <CODE>getAttributes()</CODE> again and compare the new attribute set to
     * the previous attribute set; alternatively, register a listener for print
     * service events.
     * <P>
     * @return Unmodifiable snapshot of this Print Service's attribute set.
     * @throws IOException Thrown if a remote error occurred.
     */
    public PrintServiceAttributeSet getAttributes()
	    throws IOException;

    /**
     * Determine the print data formats a client can specify when setting up a
     * job for this Print Service. A print data format is designated by a "doc
     * flavor" (class <A
     * HREF="../../../../javax/print/data/DocFlavor.html"><CODE>DocFlavor</CODE></A>)
     * consisting of a MIME type plus a print data representation class.
     * <P>
     * The settings argument gives the context for deciding which doc flavors
     * are supported:
     * <UL>
     * <LI>
     * If <CODE>theSettings</CODE> is null, this method returns all the print
     * data formats this Print Service supports for any possible job.
     * <LI>
     * If <CODE>theSettings</CODE> is not null, its <CODE>attributes</CODE>
     * field contains both job-level and document-level attributes for a
     * supposed print job. This method returns just the print data formats that
     * are compatible with the given attributes. (The <CODE>flavor</CODE> field
     * of <CODE>theSettings</CODE> is ignored.)
     * </UL>
     *
     * @param theSettings Settings for a supposed print job, or null.
     * @return Array of supported doc flavors.
     * @throws IOException Thrown if a remote error occurred.
     */
    public DocFlavor[] getSupportedDocFlavors(Settings theSettings)
	    throws IOException;

    /**
     * Determine whether a client can specify the given print data format when
     * setting up a job for this Print Service. A print data format is
     * designated by a "doc flavor" (class <A
     * HREF="../../../../javax/print/data/DocFlavor.html"><CODE>DocFlavor</CODE></A>)
     * consisting of a MIME type plus a print data representation class.
     * <P>
     * The settings argument gives the context for deciding whether the given
     * doc flavor is supported:
     * <UL>
     * <LI>
     * If <CODE>theSettings</CODE> is null, this method tells whether this Print
     * Service supports <CODE>theFlavor</CODE> for some possible combination of
     * attributes.
     * <LI>
     * If <CODE>theSettings</CODE> is not null, its <CODE>attributes</CODE>
     * field contains both job-level and document-level attributes for a
     * supposed print job. This method tells whether this Print Service supports
     * <CODE>theFlavor</CODE> in combination with the given attributes. (The
     * <CODE>flavor</CODE> field of <CODE>theSettings</CODE> is ignored.)
     * </UL>
     *
     * @param theFlavor Doc flavor to test.
     * @param theSettings Settings for a supposed print job, or null.
     * @return True if this Print Service supports theFlavor, false if it
     * doesn't.
     * @throws IOException Thrown if a remote error occurred.
     */
    public boolean isDocFlavorSupported(DocFlavor theFlavor,
	    Settings theSettings)
	    throws IOException;

    /**
     * Determine the printing attribute categories a client can specify when
     * setting up a job for this Print Service. A printing attribute category is
     * designated by a <A
     * HREF="file:///C:/jdk1.2.2/docs/api/java/lang/Class.html"><CODE>Class</CODE></A>
     * that implements interface
     * <A
     * HREF="../../../../javax/print/attribute/Attribute.html"><CODE>Attribute</CODE></A>.
     * This method returns just the attribute <I>categories</I> that are
     * supported; it does not return the particular attribute <I>values</I> that
     * are supported.
     * <P>
     * The settings argument gives the context for deciding which attribute
     * categories are supported:
     * <UL>
     * <LI>
     * If <CODE>theSettings</CODE> is null, this method returns all the printing
     * attribute categories this Print Service supports for any possible job.
     * <LI>
     * If <CODE>theSettings</CODE> is not null, its <CODE>flavor</CODE> field
     * contains the print data format for a supposed print job, and its
     * <CODE>attributes</CODE> field contains both job-level and document-level
     * attributes for a supposed print job. This method returns just the
     * printing attribute categories that are compatible with the given doc
     * flavor and/or attributes.
     * </UL>
     *
     * @param theSettings Settings for a supposed print job, or null.
     * @return Array of printing attribute categories which the client can
     * specify as a doc-level or job-level attribute in a Print Request. Each
     * element in the array is a Class that implements interface Attribute.
     * @throws IOException Thrown if a remote error occurred.
     */
    public Class<? extends Attribute>[] getSupportedAttributeCategories(Settings theSettings)
	    throws IOException;

    /**
     * Determine whether a client can specify the given printing attribute
     * category when setting up a job for this Print Service. A printing
     * attribute category is designated by a <A
     * HREF="file:///C:/jdk1.2.2/docs/api/java/lang/Class.html"><CODE>Class</CODE></A>
     * that implements interface <A
     * HREF="../../../../javax/print/attribute/Attribute.html"><CODE>Attribute</CODE></A>.
     * This method tells whether the attribute <I>category</I> is supported; it
     * does not tell whether a particular attribute <I>value</I>
     * is supported.
     * <P>
     * The settings argument gives the context for deciding whether the given
     * attribute category is supported:
     * <UL>
     * <LI>
     * If <CODE>theSettings</CODE> is null, this method tells whether this Print
     * Service supports <CODE>theCategory</CODE> for some possible combination
     * of doc flavor and attributes.
     * <LI>
     * If <CODE>theSettings</CODE> is not null, its <CODE>flavor</CODE> field
     * contains the print data format for a supposed print job, and its
     * <CODE>attributes</CODE> field contains both job-level and document-level
     * attributes for a supposed print job. This method tells whether this Print
     * Service supports <CODE>theCategory</CODE> in combination with the given
     * doc flavor and/or attributes.
     * </UL>
     *
     * @param theCategory Printing attribute category to test. It must be a
     * Class that implements interface Attribute.
     * @param theSettings Settings for a supposed print job, or null.
     * @return True if this Print Service supports specifying a doc-level or
     * job-level attribute in theCategory in a Print Request, false if it
     * doesn't.
     * @throws IOException Thrown if a remote error occurred.
     * @throws IllegalArgumentException (unchecked exception) Thrown if
     * theCategory is not a Class that implements interface Attribute.
     * @throws NullPointerException (unchecked exception) Thrown if theCategory
     * is null.
     */
    public boolean isAttributeCategorySupported(Class<? extends Attribute> theCategory,
	    Settings theSettings)
	    throws IOException;

    /**
     * Determine this Print Service's default printing attribute value in the
     * given category. A printing attribute value is an instance of a class that
     * implements interface <A
     * HREF="../../../../javax/print/attribute/Attribute.html"><CODE>Attribute</CODE></A>.
     * If a client sets up a print job and does not specify any attribute value
     * in the given category, this Print Service will use the default attribute
     * value instead.
     * <P>
     * The settings argument gives the context for determining the default
     * attribute value:
     * <UL>
     * <LI>
     * If <CODE>theSettings</CODE> is null, this method returns the default
     * attribute value for <CODE>theCategory</CODE>, assuming all the other
     * settings are defaulted.
     * <LI>
     * If <CODE>theSettings</CODE> is not null, its <CODE>flavor</CODE> field
     * contains the print data format for a supposed print job, and its
     * <CODE>attributes</CODE> field contains both job-level and document-level
     * attributes for a supposed print job. This method returns the default
     * attribute value for <CODE>theCategory</CODE> that will be used in
     * combination with the given doc flavor and/or attributes, assuming any
     * unspecified settings are defaulted.
     * </UL>
     * <P>
     * This method will return null in two cases:
     * <OL TYPE=a>
     * <LI>
     * This Print Service either does not support <CODE>theCategory</CODE> at
     * all or does not support <CODE>theCategory</CODE> in combination with the
     * given doc flavor and/or attributes.
     * <LI>
     * There is no fixed default value this Print Service will use if no
     * attribute in <CODE>theCategory</CODE> is specified. (For example, if the
     * job name is not specified, the printer may generate a unique job name for
     * each job rather than use a fixed default job name.)
     * </OL>
     * These two cases may be distinguished by calling the <A
     * HREF="../../../../net/jini/print/PrintService.html#isAttributeCategorySupported(java.lang.Class,
     * net.jini.print.service.Settings)"><CODE><CODE>isAttributeCategorySupported()</CODE></CODE></A>
     * method, which returns false in case (a) and true in case (b).
     * <P>
     *
     * @param theCategory Printing attribute category for which the default
     * attribute value is requested. It must be a Class that implements
     * interface Attribute.
     * @param theSettings Settings for a supposed print job, or null.
     * @return Default attribute value for theCategory, an instance of the
     * attribute class designated by theCategory. If the attribute category is
     * not supported, if there is no fixed default attribute value in that
     * category, or if the default value depends on the print job settings but
     * no settings were specified, null is returned.
     * @throws IOException Thrown if a remote error occurred.
     * @throws NullPointerException (unchecked exception) Thrown if theCategory
     * is null.
     * @throws IllegalArgumentException (unchecked exception) Thrown if
     * theCategory is not a Class that implements interface Attribute.
     */
    public Attribute getDefaultAttributeValue(Class<? extends Attribute> theCategory,
	    Settings theSettings)
	    throws IOException;

    /**
     * Determine all of this Print Service's default printing attribute values.
     * The returned object is an attribute set containing the attribute objects
     * that would have been returned by calling <A
     * HREF="../../../../net/jini/print/PrintService.html#getDefaultAttributeValue(java.lang.Class,
     * net.jini.print.service.Settings)"><CODE><CODE>getDefaultAttributeValue(<I>C</I>,theSettings)</CODE></CODE></A>
     * for every attribute category <I>C</I> this Print Service supports.
     *
     * @param theSettings Settings for a supposed print job, or null.
     * @return Set of all default attribute values.
     * @throws IOException Thrown if a remote error occurred.
     */
    public AttributeSet getDefaultAttributeValues(Settings theSettings)
	    throws IOException;

    /**
     * Determine the printing attribute values a client can specify in the given
     * category when setting up a job for this Print Service. A printing
     * attribute value is an instance of a class that implements interface
     * <A
     * HREF="../../../../javax/print/attribute/Attribute.html"><CODE>Attribute</CODE></A>.
     * <P>
     * The settings argument gives the context for deciding which attribute
     * values are supported:
     * <UL>
     * <LI>
     * If <CODE>theSettings</CODE> is null, this method returns all the printing
     * attribute values in <CODE>theCategory</CODE> this Print Service supports
     * for any possible job.
     * <LI>
     * If <CODE>theSettings</CODE> is not null, its <CODE>flavor</CODE> field
     * contains the print data format for a supposed print job, and its
     * <CODE>attributes</CODE> field contains both job-level and document-level
     * attributes for a supposed print job. This method returns just the
     * printing attribute values in <CODE>theCategory</CODE> that are compatible
     * with the given doc flavor and/or attributes.
     * </UL>
     * <P>
     * This method returns an Object because different printing attribute
     * categories indicate the supported attribute values in different ways. The
     * documentation for each printing attribute in package <A
     * HREF="../../../../javax/print/attribute/standard/package-summary.html">javax.print.attribute.standard</A>
     * describes how each attribute indicates its supported values. Possible
     * ways of indicating support include:
     * <UL>
     * <LI>
     * Return a single instance of the attribute category to indicate that any
     * value is legal -- used, for example, by an attribute whose value is an
     * arbitrary text string. (The value of the returned attribute object is
     * irrelevant.)
     * <LI>
     * Return an array of one or more instances of the attribute category,
     * containing the legal values -- used, for example, by an attribute with a
     * list of enumerated values.
     * <LI>
     * Return a single object (of some class other than the attribute category)
     * that indicates bounds on the legal values -- used, for example, by an
     * integer-valued attribute that must lie within a certain range.
     * <LI>
     * Return null to indicate <CODE>theCategory</CODE> is not supported at all
     * or is not supported in combination with <CODE>theSettings</CODE>.
     * </UL>
     *
     *
     * @param theCategory Printing attribute category to test. It must be a
     * Class that implements interface Attribute.
     * @param theSettings Settings for a supposed print job, or null.
     * @return Object indicating supported values for theCategory, or null if
     * there are none.
     * @throws IOException Thrown if a remote error occurred.
     * @throws NullPointerException (unchecked exception) Thrown if theCategory
     * is null.
     * @throws IllegalArgumentException (unchecked exception) Thrown if
     * theCategory is not a Class that implements interface Attribute.
     */
    public Object getSupportedAttributeValues(Class<? extends Attribute> theCategory,
	    Settings theSettings)
	    throws IOException;

    /**
     * Determine whether a client can specify the given printing attribute value
     * when setting up a job for this Print Service. A printing attribute value
     * is an instance of a class that implements interface <A
     * HREF="../../../../javax/print/attribute/Attribute.html"><CODE>Attribute</CODE></A>.
     * <P>
     * The settings argument gives the context for deciding whether the given
     * attribute value is supported:
     * <UL>
     * <LI>
     * If <CODE>theSettings</CODE> is null, this method tells whether this Print
     * Service supports <CODE>theValue</CODE> for some possible combination of
     * doc flavor and set of attributes.
     * <LI>
     * If <CODE>theSettings</CODE> is not null, its <CODE>flavor</CODE> field
     * contains the print data format for a supposed print job, and its
     * <CODE>attributes</CODE> field contains both job-level and document-level
     * attributes for a supposed print job. This method tells whether this Print
     * Service supports <CODE>theValue</CODE> in combination with the given doc
     * flavor and/or attributes.
     * </UL>
     *
     * @param theValue Printing attribute value to test.
     * @param theSettings Settings for a supposed print job, or null.
     * @return True if this Print Service supports specifying theValue as a
     * doc-level or job-level attribute in a Print Request, false if it doesn't.
     * @throws IOException Thrown if a remote error occurred.
     * @throws NullPointerException (unchecked exception) Thrown if theValue is
     * null.
     */
    public boolean isAttributeValueSupported(Attribute theValue,
	    Settings theSettings)
	    throws IOException;

    /**
     * Determine the settings for a supposed print job that this Print Service
     * does not support, if any. The <CODE>flavor</CODE> field of
     * <CODE>theSettings</CODE> contains the print data format for a supposed
     * print job, and the <CODE>attributes</CODE> field of
     * <CODE>theSettings</CODE> contains both job-level and document-level
     * attributes for a supposed print job.
     * <P>
     * If this Print Service can print a job with all the given settings
     * (including the case where <CODE>theSettings</CODE> is null), this method
     * returns null indicating there are no unsupported settings.
     * <P>
     * If this Print Service cannot print a job with all the given settings,
     * because some settings are not supported either individually or in
     * combination, this method returns another settings object containing just
     * the settings that are not supported. Specifically, the returned settings
     * object's <CODE>flavor</CODE> field will be the same as the
     * <CODE>flavor</CODE> field of <CODE>theSettings</CODE> if that doc flavor
     * is not supported, or the returned settings object's <CODE>flavor</CODE>
     * field will be null if that doc flavor is supported. The returned settings
     * object's <CODE>attributes</CODE> field will be an attribute set
     * containing just the unsupported attributes from the
     * <CODE>attributes</CODE> field of <CODE>theSettings</CODE>, or the
     * returned settings object's <CODE>attributes</CODE> field will be null if
     * all the attributes are supported.
     * <P>
     * This method lets a client "validate" the settings for a supposed print
     * job without actually submitting the job. A null return means the settings
     * are okay. A non-null return means the settings are not okay, and the
     * returned object tells precisely what's wrong.
     *
     * @param theSettings Settings for a supposed print job, or null.
     * @return If this Print Service supports all of theSettings, null is
     * returned, otherwise a settings object containing the unsupported settings
     * is returned.
     * @throws IOException Thrown if a remote error occurred.
     */
    public Settings getUnsupportedSettings(Settings theSettings)
	    throws IOException;
    
    
}
