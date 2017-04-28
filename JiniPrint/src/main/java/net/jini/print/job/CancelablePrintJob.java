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

/**
 * <P>
 * Interface CancelablePrintJob provides an operation for canceling a submitted
 * Print Job. This is an optional capability that not all Jini Print Service
 * instances need support. If a Jini Print Service instance supports canceling
 * print jobs, the print service will return Print Job objects that implement
 * interface CancelablePrintJob as well as interface <A
 * HREF="../../../../net/jini/print/job/PrintJob.html"><CODE>PrintJob</CODE></A>.
 * <P>
 * There is no restriction on the number of client threads that may be
 * simultaneously accessing the same Print Job. Therefore, all implementations
 * of interface PrintJob and its subinterfaces must be designed to be multiple
 * thread safe.
 * <P>
 * Interface CancelablePrintJob's methods all throw <A
 * HREF="file:///C:/jdk1.2.2/docs/api/java/rmi/RemoteException.html"><CODE>RemoteException</CODE></A>
 * to provide for the possibility that the Print Job object's implementation
 * performs remote method calls. The Print Job object's implementation in fact
 * may or may not perform remote method calls.
 * <P>
 * <B>DRAFT STANDARD VERSION 1.0 (23-MAY-2000)</B>
 *
 */
public interface CancelablePrintJob extends PrintJob {

    /**
     * Cancel this Print Job. Calling cancel() on an already-canceled Print Job
     * has no effect.
     *
     * @throws PrintJobException Thrown if there was an error canceling this
     * Print Job. Canceling an already-canceled Print Job is not considered an
     * error.
     * @throws IOException Thrown if a remote error occurred.
     */
    public void cancel() throws PrintJobException, IOException;

}
