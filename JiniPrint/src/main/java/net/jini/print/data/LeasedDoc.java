/*
 * 
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
package net.jini.print.data;

import net.jini.core.lease.Lease;

/**
 * <P>
 * Interface LeasedDoc specifies the interface for a doc object that
 * additionally provides a lease on its print data. "Doc" is a short,
 * easy-to-pronounce term that means "a piece of print data." Some print data
 * sources may allocate resources that need to be deallocated if there is a
 * distributed failure of the Print Service printing the data. For example, the
 * print data may be ephemeral and the print data source may need to release
 * storage or other resources once the print data has been transferred to the
 * Print Service. The print data source must be able eventually to release
 * resources if the Print Service fails to obtain the print data. This is done
 * using the standard Jini lease mechanism. A doc object can convey a lease on
 * the print data by implementing the optional interface LeasedDoc as well as
 * interface {@link Doc}.
 * Interface LeasedDoc is optional so print data sources that don't require a
 * lease don't have to provide a lease.
 * </P><P>
 * When the print data source creates a LeasedDoc object, the print data source
 * supplies the lease object already set for an initial duration determined by
 * the print data source. The LeasedDoc object stores the lease object so as to
 * return the lease object when the {@link LeasedDoc#getLease() }
 * method is called. When the lease expires or is canceled, the print data
 * source is permitted to clean up any resources allocated to the LeasedDoc's
 * print data. After the lease expires or is canceled, the behavior of the
 * methods in interface {@link Doc} becomes
 * undefined; the methods may no longer be able to return the doc's information
 * because resources may have been deallocated.
 * </P><P>
 * If the client passes a LeasedDoc to the Print Service, the Print Service is
 * required to obtain the LeasedDoc's lease object (by calling the 
 * {@link LeasedDoc#getLease() }
 * method) before doing anything else. If the client passes a number of
 * LeasedDocs to the Print Service as part of a {@link MultiDoc},
 * the Print Service is required to obtain the lease objects from all the
 * LeasedDocs in the {@link MultiDoc}
 * before doing anything else. For each LeasedDoc, the Print Service must renew
 * the lease as necessary to ensure the lease does not expire until after the
 * Print Service has finished obtaining all of that LeasedDoc's print data (or
 * until the Print Service encounters a nonrecoverable error while obtaining the
 * print data), and then the Print Service must cancel the lease.
 * </P><P>
 * It is expected that the print data source will initialize the LeasedDoc's
 * lease's duration to the amount of time the print data source is willing to
 * wait for the Print Service to respond before abandoning the print job and
 * discarding the print data. It is expected that the Print Service will obtain
 * and start renewing the LeasedDoc's lease as soon as possible after the job is
 * submitted, otherwise the Print Service risks the print data source abandoning
 * the print job.
 * </P><P>
 * The reason why a LeasedDoc object must be initialized with a lease object
 * whose initial duration is predetermined is as follows. The lease object
 * resides in the print data source's Java Virtual Machine (JVM). Since a
 * LeasedDoc object can be sent to a Print Service in a remote JVM, the lease
 * the Print Service gets from the LeasedDoc might actually be a remote
 * reference back to the lease object in the print data source's JVM. But since
 * a LeasedDoc object is not itself a remote object, the {@link LeasedDoc#getLease() }
 * method cannot do a remote method call back to the print data source's JVM to
 * create the lease when the Print Service asks for it. Instead, the lease must
 * already be stored inside the LeasedDoc, which means the lease must already
 * have been initialized for some duration determined by the print data source.
 * </P>
 * <B>DRAFT STANDARD VERSION 1.0 (23-MAY-2000)</B>
 * 
 *
 */
public interface LeasedDoc {

    /**
     * Obtain the lease object for this doc. If called more than once, this
     * method returns the same lease object each time.
     *
     * @return lease object
     */
    public Lease getLease();

}
