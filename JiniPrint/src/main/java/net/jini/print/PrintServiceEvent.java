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
import javax.print.attribute.PrintServiceAttributeSet;
import net.jini.io.MarshalledInstance;
import net.jini.print.event.PrintEvent;

/**
 * <P>
 * Class PrintServiceEvent encapsulates an event a Jini Print Service instance
 * reports to let the client know that one or more printing attributes in a
 * Print Service's attribute set have changed, thus indicating a change in the
 * printer's status.
 * </P><P>
 * When a client registers to receive a print service event notification, the
 * client specifies an array of zero or more attribute categories
 * ({@link java.lang.Class} objects) denoting the attributes the client wants to
 * monitor. These are referred to as the <B>monitored attribute categories</B>
 * for the print service event registration. If the attribute category array is
 * zero-length, the client wants to monitor all the attributes. Thereafter,
 * whenever an attribute in one of the monitored attribute categories
 * experiences a change, a print service event is sent to the event listener for
 * that event registration. A "change" in a monitored attribute may be any of
 * the following:
 * </P>
 * <UL>
 * <LI>
 * The attribute was added to the Print Service's attribute set.
 * <LI>
 * The attribute was replaced with a different value in the Print Service's
 * attribute set.
 * <LI>
 * The attribute was removed from the Print Service's attribute set.
 * </UL>
 * <P>
 * When a client registers to receive a print service event notification, the
 * client also specifies an array of zero or more attribute values
 * ({@link javax.print.attribute.PrintServiceAttribute} objects) denoting the
 * attribute values the client wants to monitor. These are referred to as the
 * <B>monitored attribute values</B> for the print service event registration.
 * Thereafter, whenever an attribute achieves a value equal to one of the
 * monitored attribute values, a print service event is sent to the event
 * listener for that event registration.
 * </P><P>
 * A print service event includes a
 * {@link javax.print.attribute.PrintServiceAttributeSet} containing the new
 * value or values for the attribute or attributes that changed from among the
 * monitored attribute categories plus the attribute value or values that were
 * achieved from among the monitored attribute values. In the case where an
 * attribute was removed from the Print Service's attribute set, that attribute
 * will be missing from the print service attribute event's attribute set as
 * well.
 * </P><P>
 * There is no requirement on the timeliness of print service event
 * notifications. After the instant an attribute changes, a Jini Print Service
 * implementation may choose to delay before reporting the change. However, it
 * is expected that a well-behaved Jini Print Service implementation will report
 * print service events in a timely manner.
 * </P><P>
 * There is no requirement on the frequency with which print service event
 * notifications are reported. A Jini Print Service implementation may choose to
 * detect and report attribute changes at a certain frequency for some or all
 * attribute categories, including possibly different frequencies for different
 * categories. Thus, for certain attribute categories the Print Service may not
 * report every successive value of the attribute as it changes, but only some
 * of the values in the sequence. Permitting this behavior is important for
 * "counter" attributes with rapidly-changing values, like null, null {@link javax.print.attribute.standard.JobImpressionsCompleted},
 * {@link javax.print.attribute.standard.JobKOctetsProcessed}, and
 * {@link javax.print.attribute.standard.JobMediaSheetsCompleted};
 *
 * requiring the Print Service to report every value change for such attributes
 * might impose too much of a processing load on the Jini Print Service
 * implementation and might result in consuming too much network bandwidth for
 * all the event notifications. However, it is expected that a well-behaved Jini
 * Print Service implementation will report all attribute value changes if the
 * attributes are not experiencing an episode of rapid fluctuation.
 * </P><P>
 * The Jini Print Service is allowed to report more than one attribute with a
 * single print service event. Thus, one possible implementation strategy might
 * be as follows: When a Print Service's attribute changes, wait a little while
 * in case some other attributes change. Once the attributes all finish
 * changing, report all the changes (for monitored attribute categories) and/or
 * achieved values (for monitored attribute values) in a single print service
 * event. This may reduce the number of print service events reported when a
 * Print Service experiences a state transition in which many individual
 * attributes change.
 * </P><P>
 * The Jini Print Service is <I>not</I> required to guarantee that print service
 * events are delivered reliably in sequence. In other words, print service
 * events may be lost or delivered out of order due to processor or network
 * failures.
 * </P>
 * <H4>Design</H4>
 * <P>
 * A print service event object contains an attribute set object. The attribute
 * set object is stored inside the print service event object in marshalled
 * form. This allows the print service event object to flow through intermediate
 * event listeners without requiring those event listeners to download the
 * attribute set object's codebase. When the print service event object arrives
 * at its ultimate destination, the {@link PrintServiceEvent#getAttributes()}
 * method unmarshals the attribute set object, downloading the codebase if
 * necessary at that time.
 * </P>
 */
public class PrintServiceEvent extends PrintEvent {

    private static final long serialVersionUID = 1L;

    /**
     * @serial Set of printing attributes (in marshalled form) containing the
     * new values for the attributes that changed in the monitored attribute
     * categories and/or the attribute values achieved in the monitored
     * attribute values.
     */
    private final MarshalledInstance attributes;

    /**
     * Constructs a new print service event object.
     *
     * @param source Event source, namely the print service that reported this
     * event.
     * @param eventID Event identifier for this event.
     * @param seqNum Sequence number for this event.
     * @param handback Handback object for this event, or null if there is no
     * handback object.
     * @param theAttributes Set of print service attributes containing the new
     * values for the attributes that changed in the monitored attribute
     * categories and/or the attribute values achieved in the monitored
     * attribute values.
     * @throws NullPointerException (unchecked exception) Thrown if theSource is
     * null or theAttributes is null.
     * @throws java.io.IOException Thrown if there was an I/O error while
     * marshalling theAttributes, such as if it is not serializable.
     */
    public PrintServiceEvent(
	    PrintService source,
	    long eventID,
	    long seqNum,
	    MarshalledInstance handback,
	    PrintServiceAttributeSet theAttributes) throws IOException {
	this(source, eventID, seqNum, handback, marshalAttributes(theAttributes));
    }

    private static MarshalledInstance marshalAttributes(
	    PrintServiceAttributeSet theAttributes) throws IOException {
	if (theAttributes == null) {
	    throw new NullPointerException("PrintServiceAttributeSet cannot be null");
	}
	return new MarshalledInstance(theAttributes);
    }

    PrintServiceEvent(
	    PrintService source,
	    long eventID,
	    long seqNum,
	    MarshalledInstance handback,
	    MarshalledInstance theAttributes
    ) {
	super(source, eventID, seqNum, handback);
	this.attributes = theAttributes;
    }

    /**
     * Determine the print service attributes that changed and/or achieved
     * values.
     *
     * @return Set of print service attributes containing the new values for the
     * attributes that changed in the monitored attribute categories and/or the
     * attribute values achieved in the monitored attribute values.
     * @throws IOException Thrown if there was an I/O error while unmarshalling
     * the attribute set object.
     * @throws ClassNotFoundException Thrown if a class needed to unmarshal the
     * attribute set object could not be found.
     */
    public PrintServiceAttributeSet getAttributes()
	    throws IOException,
	    ClassNotFoundException {
	return (PrintServiceAttributeSet) attributes.get(false);
    }

}
