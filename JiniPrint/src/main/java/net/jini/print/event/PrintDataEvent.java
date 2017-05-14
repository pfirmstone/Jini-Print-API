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

import java.io.IOException;
import net.jini.io.MarshalledInstance;
import net.jini.print.event.PrintEvent;
import net.jini.print.PrintService;
import net.jini.print.job.PrintJob;

/**
 * <P>
 * Class PrintDataEvent encapsulates an event a Jini Print Service instance
 * reports to let the client know that a Print Job has finished obtaining a
 * piece of print data. The event reports whether the Print Job succeeded or
 * failed to obtain the print data. In the case of failure, the event includes
 * an exception object telling what went wrong. See the description of print job
 * processing in interface <A
 * HREF="../../../../net/jini/print/job/PrintJob.html"><CODE>PrintJob</CODE></A>
 * for further information on when print data events are reported.
 * <P>
 * The Jini Print Service is <I>not</I> required to guarantee that print data
 * events are delivered reliably in sequence. In other words, print data events
 * may be lost or delivered out of order due to processor or network failures.
 * <H4>Design</H4>
 * A print data event object contains a Print Job object and possibly an
 * exception object. These objects are stored inside the print data event object
 * in marshalled form. This allows the print data event object to flow through
 * intermediate event listeners without requiring those event listeners to
 * download the Print Job object's or exception object's codebases. When the
 * print data event object arrives at its ultimate destination, the <A
 * HREF="../../../../net/jini/print/job/PrintDataEvent.html#getPrintJob()"><CODE><CODE>getPrintJob()</CODE></CODE></A>
 * and <A
 * HREF="../../../../net/jini/print/job/PrintDataEvent.html#getException()"><CODE><CODE>getException()</CODE></CODE></A>
 * methods unmarshal their respective objects, downloading the codebases if
 * necessary at that time.
 * <P>
 */
public class PrintDataEvent extends PrintEvent {

    private static final long serialVersionUID = 1L;
    
    private static Object nullCheck(PrintJob job){
	if (job == null) throw new NullPointerException("print job cannot be null");
	return job;
    }
    /**
     * @serialField Exception object (in marshalled form) telling what went
     * wrong if the Jini Print Service instance failed to obtain the print data,
     * or null if the print service successfully obtained the print data.
     */
    MarshalledInstance exception;
    /**
     * @serialField Print Job object (in marshalled form) to which this event
     * pertains.
     */
    MarshalledInstance printJob;

    /**
     * Constructs a new print data event object.
     * 
     * @param source Event source, namely the print service that reported this event.
     * @param eventID Event identifier for this event.
     * @param seqNum Sequence number for this event.
     * @param handback Handback object for this event, or null if there is no handback object.
     * @param thePrintJob Print Job object to which this event pertains.
     * @param theException An exception object telling what went wrong if the print service failed to obtain the print data, or null if the print service successfully obtained the print data.
     * @throws IOException Thrown if there was an I/O error while marshalling thePrintJob or theException, such as if one or both is not serializable.
     * @throws NullPointerException (unchecked exception) Thrown if theSource is null or thePrintJob is null.
     */
    public PrintDataEvent(
	    PrintService source,
	    long eventID,
	    long seqNum,
	    MarshalledInstance handback,
	    PrintJob thePrintJob,
	    Throwable theException) throws IOException {
	this(source, eventID, seqNum, handback,
		new MarshalledInstance(nullCheck(thePrintJob)),
		theException == null ? null : new MarshalledInstance(theException)
	);
    }

    /**
     * REMIND: Investigate how to allow the user to define the
     * MarshalledInstance.  Eg MarshalledInstance<? extends PrintJob>,
     * thePrintJob.isNull()  Note that the remote end will rely on other
     * methods to determine or set type, such as using a pre-determined ClassLoader.
     *
     * @param source
     * @param eventID
     * @param seqNum
     * @param handback
     * @param thePrintJob
     * @param theException
     */
    private PrintDataEvent(
	    PrintService source,
	    long eventID,
	    long seqNum,
	    MarshalledInstance handback,
	    MarshalledInstance thePrintJob,
	    MarshalledInstance theException) {
	super(source, eventID, seqNum, handback);
	exception = theException;
	printJob = thePrintJob;
    }

    /**
     * Determine the Print Job to which this print data event pertains.
     *
     * @return Print Job object.
     * @throws IOException Thrown if there was an I/O error while unmarshalling
     * the Print Job object.
     * @throws ClassNotFoundException Thrown if a class needed to unmarshal the
     * Print Job object could not be found.
     */
    public PrintJob getPrintJob()
	    throws IOException,
	    ClassNotFoundException {
	return (PrintJob) printJob.get(false);
    }

    /**
     * Determine whether the print service successfully obtained the print data.
     *
     * @return If this event is reporting that the print service successfully
     * obtained the print data, true is returned. If this event is reporting
     * that the print service failed to obtain the print data, false is
     * returned.
     */
    public boolean succeeded() {
	return exception == null;
    }

    /**
     * Determine what went wrong if the print service failed to obtain the print
     * data.
     *
     * @return If this event is reporting that the print service successfully
     * obtained the print data, null is returned. If this event is reporting
     * that the print service failed to obtain the print data, an exception
     * object telling what went wrong is returned.
     * @throws IOException Thrown if there was an I/O error while unmarshalling
     * the exception object.
     * @throws ClassNotFoundException Thrown if a class needed to unmarshal the
     * exception object could not be found.
     */
    public Throwable getException()
	    throws IOException,
	    ClassNotFoundException {
	return exception == null ? null : (Throwable) exception.get(false);
    }

}
