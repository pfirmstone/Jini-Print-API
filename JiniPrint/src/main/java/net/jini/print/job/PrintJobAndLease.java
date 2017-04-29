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

import net.jini.core.lease.Lease;

/**
 * Class PrintJobAndLease is a container for a PrintJob object and its
 * associated lease object. Methods in interface PrintRequest that return a
 * reference to a Print Job actually return both the Print Job and its lease,
 * enclosed in a PrintJobAndLease object.
 */
public class PrintJobAndLease {

    /**
     * @serialField Lease object associated with the printJob.
     */
    private final Lease lease;

    /**
     * @serialField Print Job object.
     */
    private final PrintJob printJob;

    /**
     * Constructs a new print-job-and-lease object containing the given print job object and lease object.
     * @param thePrintJob Print Job object.
     * @param theLease Lease object associated with thePrintJob.
     */
    public PrintJobAndLease(PrintJob thePrintJob,
                        Lease theLease){
	printJob = thePrintJob;
	lease = theLease;
    }
    
    /**
     * 
     * @return Lease object associated with the printJob.
     */
    public Lease getLease(){
	return lease;
    }
    
    /**
     * 
     * @return Print Job object.
     */
    public PrintJob getPrintJob(){
	return printJob;
    }
    
}
