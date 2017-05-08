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
import javax.print.attribute.PrintJobAttributeSet;
import net.jini.io.MarshalledInstance;
import net.jini.print.event.PrintEvent;
import net.jini.print.PrintService;

/**
 * <P>
 * Class PrintJobEvent encapsulates an event a Jini Print Service instance
 * reports to let the client know that one or more printing attributes in a
 * Print Job's attribute set have changed, thus indicating a change in the job's
 * status.
 * <P>
 * When a client registers to receive a print job event notification, the client
 * specifies an array of zero or more attribute categories (<A
 * HREF="file:///C:/jdk1.2.2/docs/api/java/lang/Class.html"><CODE>Class</CODE></A>
 * objects) denoting the attributes the client wants to monitor. These are
 * referred to as the <B>monitored attribute categories</B>
 * for the print job event registration. If the attribute category array is
 * zero-length, the client wants to monitor all the attributes. Thereafter,
 * whenever an attribute in one of the monitored attribute categories
 * experiences a change, a print job event is sent to the event listener for
 * that event registration. A "change" in a monitored attribute may be any of
 * the following:
 * <UL>
 * <LI>
 * The attribute was added to the Print Job's attribute set.
 * <LI>
 * The attribute was replaced with a different value in the Print Job's
 * attribute set.
 * <LI>
 * The attribute was removed from the Print Job's attribute set.
 * </UL>
 * <P>
 * When a client registers to receive a print job event notification, the client
 * also specifies an array of zero or more attribute values (<A
 * HREF="../../../../javax/print/attribute/PrintJobAttribute.html"><CODE>PrintJobAttribute</CODE></A>
 * objects) denoting the attribute values the client wants to monitor. These are
 * referred to as the <B>monitored attribute values</B> for the print job event
 * registration. Thereafter, whenever an attribute achieves a value equal to one
 * of the monitored attribute values, a print job event is sent to the event
 * listener for that event registration.
 * <P>
 * A print job event includes a <A
 * HREF="../../../../javax/print/attribute/PrintJobAttributeSet.html"><CODE>PrintJobAttributeSet</CODE></A>
 * containing the new value or values for the attribute or attributes that
 * changed from among the monitored attribute categories plus the attribute
 * value or values that were achieved from among the monitored attribute values.
 * In the case where an attribute was removed from the Print Job's attribute
 * set, that attribute will be missing from the print job event's attribute set
 * as well.
 * <P>
 * There is no requirement on the timeliness of print job event notifications.
 * After the instant an attribute changes, a Jini Print Service implementation
 * may choose to delay before reporting the change. However, it is expected that
 * a well-behaved Jini Print Service implementation will report print job events
 * in a timely manner.
 * <P>
 * There is no requirement on the frequency with which print job event
 * notifications are reported. A Jini Print Service implementation may choose to
 * detect and report attribute changes at a certain frequency for some or all
 * attribute categories, including possibly different frequencies for different
 * categories. Thus, for certain attribute categories the Print Service may not
 * report every successive value of the attribute as it changes, but only some
 * of the values in the sequence. Permitting this behavior is important for
 * "counter" attributes with rapidly-changing values, like <A
 * HREF="../../../../javax/print/attribute/standard/JobImpressionsCompleted.html"><CODE>JobImpressionsCompleted</CODE></A>,
 * <A
 * HREF="../../../../javax/print/attribute/standard/JobKOctetsProcessed.html"><CODE>JobKOctetsProcessed</CODE></A>,
 * and
 * <A
 * HREF="../../../../javax/print/attribute/standard/JobMediaSheetsCompleted.html"><CODE>JobMediaSheetsCompleted</CODE></A>;
 * requiring the Print Service to report every value change for such attributes
 * might impose too much of a processing load on the Jini Print Service
 * implementation and might result in consuming too much network bandwidth for
 * all the event notifications. However, it is expected that a well-behaved Jini
 * Print Service implementation will report all attribute value changes if the
 * attributes are not experiencing an episode of rapid fluctuation.
 * <P>
 * The Jini Print Service is allowed to report more than one attribute with a
 * single print job event. Thus, one possible implementation strategy might be
 * as follows: When a Print Job's attribute changes, wait a little while in case
 * some other attributes change. Once the attributes all finish changing, report
 * all the changes (for monitored attribute categories) and/or achieved values
 * (for monitored attribute values) in a single print job event. This may reduce
 * the number of print job events reported when a Print Job experiences a state
 * transition in which many individual attributes change.
 * <P>
 * The Jini Print Service is <I>not</I> required to guarantee that print job
 * events are delivered reliably in sequence. In other words, print job events
 * may be lost or delivered out of order due to processor or network failures.
 * <H4>Design</H4>
 * A print job event object contains an attribute set object and a Print Job
 * object. These objects are stored inside the print job event object in
 * marshalled form. This allows the print job event object to flow through
 * intermediate event listeners without requiring those event listeners to
 * download the attribute set or Print Job objects' codebases. When the print
 * job event object arrives at its ultimate destination, the <A
 * HREF="../../../../net/jini/print/job/PrintJobEvent.html#getAttributes()"><CODE><CODE>getAttributes()</CODE></CODE></A>
 * and <A
 * HREF="../../../../net/jini/print/job/PrintJobEvent.html#getPrintJob()"><CODE><CODE>getPrintJob()</CODE></CODE></A>
 * methods unmarshal their respective objects, downloading the codebases if
 * necessary at that time.
 * <P>
 */
public class PrintJobEvent extends PrintEvent {
    
    private static final long serialVersionUID = 1L;
    
    private static Object nullCheck(Object obj, String mes){
	if (obj == null) throw new NullPointerException(mes);
	return obj;
    }

    /**
     * @serialField Set of printing attributes (in marshalled form) containing
     * the new values for the attributes that changed in the monitored attribute
     * categories and/or the attribute values achieved in the monitored
     * attribute values.
     */
    MarshalledInstance attributes;
    
    /**
     * Print Job object (in marshalled form) to which this event pertains.
     */
    MarshalledInstance printJob;

    /**
     * Constructs a new print job event object.
     *
     * @param theSource Event source, namely the print service that reported
     * this event.
     * @param theEventID Event identifier for this event.
     * @param theSequenceNumber Sequence number for this event.
     * @param theHandbackObject Handback object for this event, or null if there
     * is no handback object.
     * @param thePrintJob Print Job to which this print job event pertains.
     * @param theAttributes Set of print job attributes containing the new
     * values for the attributes that changed in the monitored attribute
     * categories and/or the attribute values achieved in the monitored
     * attribute values.
     * @throws IOException Thrown if there was an I/O error while marshalling
     * thePrintJob or theAttributes, such as if they are not serializable.
     * @throws NullPointerException (unchecked exception) Thrown if theSource is
     * null, thePrintJob is null, or theAttributes is null.
     */
    public PrintJobEvent(PrintService theSource,
	    long theEventID,
	    long theSequenceNumber,
	    MarshalledInstance theHandbackObject,
	    PrintJob thePrintJob,
	    PrintJobAttributeSet theAttributes)
	    throws IOException 
    {
	this(theSource, theEventID, theSequenceNumber, theHandbackObject,
	    new MarshalledInstance(nullCheck(thePrintJob, "PrintJob was null")),
	    new MarshalledInstance(nullCheck(theAttributes, "theAttributes were null"))
	);
    }
    
    private PrintJobEvent(PrintService theSource,
	    long theEventID,
	    long theSequenceNumber,
	    MarshalledInstance theHandbackObject,
	    MarshalledInstance thePrintJob,
	    MarshalledInstance theAttributes)
	    throws IOException 
    {
	super(theSource, theEventID, theSequenceNumber, theHandbackObject);
	printJob = thePrintJob;
	attributes = theAttributes;
    }
    
    /**
     * Determine the Print Job to which this print job event pertains
     * @return Print Job object.
     * @throws IOException Thrown if there was an I/O error while unmarshalling the Print Job object.
     * @throws ClassNotFoundException Thrown if a class needed to unmarshal the Print Job object could not be found.
     */
    public PrintJob getPrintJob()
                     throws IOException,
                            ClassNotFoundException {
	return (PrintJob) printJob.get(false);
    }
   
    /**
     * Determine the print job attributes that changed and/or achieved values.
     * @return Set of print job attributes containing the new values for the attributes that changed in the monitored attribute categories and/or the attribute values achieved in the monitored attribute values.
     * @throws IOException Thrown if there was an I/O error while unmarshalling the attribute set object.
     * @throws ClassNotFoundException Thrown if a class needed to unmarshal the attribute set object could not be found.
     */
    public PrintJobAttributeSet getAttributes()
                                   throws IOException,
                                          ClassNotFoundException {
	return (PrintJobAttributeSet) attributes.get(false);
    }
}