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
 * Class PrintRequestException encapsulates an error condition that occurred
 * while using a Print Request object.
 *
 * Class PrintRequestException extends the base class PrintException by
 * providing additional information about which object encountered the error,
 * namely a Print Request object.
 */
class PrintRequestException extends PrintException {
    
    /**
     * @serialField Print Request object that encountered the error.
     */
    private final PrintRequest printRequest;
    
    public PrintRequestException(PrintRequest thePrintRequest){
	printRequest = thePrintRequest;
    }
    
    public PrintRequestException(PrintRequest thePrintRequest, String s){
	super(s);
	printRequest = thePrintRequest;
    }
    
    public PrintRequestException(PrintRequest thePrintRequest, String s, Exception cause){
	super(s, cause);
	printRequest = thePrintRequest;
    }
    
    /**
     * Returns the Print Request object that encountered the error.
     * 
     * @return Print Request object that encountered the error.
     */
    public PrintRequest getPrintRequest(){
	return printRequest;
    }

}
