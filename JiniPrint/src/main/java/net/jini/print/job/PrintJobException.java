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

import javax.print.PrintException;

/**
 *
 * Class PrintJobException encapsulates an error condition that occurred while
 * using a Print Job object.
 *
 * Class PrintJobException extends the base class PrintException by providing
 * additional information about which object encountered the error, namely a
 * Print Job object.
 *
 * DRAFT STANDARD VERSION 1.0 (23-MAY-2000)
 */
public class PrintJobException extends PrintException {

    private static final long serialVersionUID = 1L;

    /**
     * @serialField 
     */
    private final PrintJob printJob;
    
    public PrintJobException(PrintJob thePrintJob){
	printJob = thePrintJob;
    }
    
    public PrintJobException(PrintJob thePrintJob, String s){
	super(s);
	printJob = thePrintJob;
    }
    
    public PrintJobException(PrintJob thePrintJob, String s, Exception e){
	super(s,e);
	printJob = thePrintJob;
    }
    
    /**
     * Returns the Print Job object that encountered the error.
     * 
     * @return the Print Job object that encountered the error.
     */
    public PrintJob getPrintJob(){
	return printJob;
    }
}
