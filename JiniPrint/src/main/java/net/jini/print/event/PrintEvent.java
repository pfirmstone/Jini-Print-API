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
package net.jini.print.event;

import net.jini.print.service.PrintService;
import net.jini.core.event.RemoteEvent;
import net.jini.io.MarshalledInstance;

/**
 * <P>
 * Class PrintEvent is an abstract base class for all printing events. It
 * encapsulates the event source, namely the Jini Print Service instance that
 * reported the event. Subclasses encapsulate additional information for various
 * kinds of printing events.
 * </P><P>
 * The Jini Print Service is <I>not</I> required to guarantee that print events
 * are delivered reliably in sequence. In other words, print events may be lost
 * or delivered out of order due to processor or network failures.
 * </P><P>
 * The information returned by the methods inherited from class
 * net.jini.core.event.RemoteEvent is as follows:
 * </P>
 * <UL>
 * <LI>
 * <CODE>getID()</CODE> -- The event identifier is unique among all the event
 * registrations for a particular Jini Print Service instance.
 *
 * <LI>
 * <CODE>getSequenceNumber()</CODE> -- Jini Print Service event sequence numbers
 * are "fully ordered." For a given print service and event identifier, sequence
 * numbers start at 1, successive events' sequence numbers are strictly
 * increasing, and no sequence numbers are skipped.
 *
 * <LI>
 * <CODE>getRegistrationObject()</CODE> -- This is the handback object the
 * client provided when registering for this event notification.
 * </UL>
 */
public class PrintEvent extends RemoteEvent {
    
    private static PrintService nullCheck(PrintService source){
	if (source == null) throw new NullPointerException("print service cannot be null");
	return source;
    }

    /**
     * Constructs a new print event object.
     *
     * @param source Event source, namely the print service that reported this
     * event.
     * @param eventID Event identifier for this event.
     * @param seqNum Sequence number for this event.
     * @param handback Handback object for this event, or null if there is no
     * handback object.
     * @throws NullPointerException - (unchecked exception) Thrown if theSource
     * is null.
     */
    public PrintEvent(PrintService source, long eventID, long seqNum, MarshalledInstance handback) {
	super(nullCheck(source), eventID, seqNum, handback);
    }

    /**
     * Determine the Print Service that reported this print event (i.e., the
     * event source).
     *
     * @return Print Service object.
     */
    public PrintService getPrintService() {
	return (PrintService) getSource();
    }

}
