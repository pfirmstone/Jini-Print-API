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
package net.jini.print.service;

import javax.print.PrintException;

/**
 * Class PrintServiceException encapsulates an error condition that occurred
 * while using a Print Service object.
 *
 * Class PrintServiceException extends the base class PrintException by
 * providing additional information about which object encountered the error,
 * namely a Print Service object.
 */
class PrintServiceException extends PrintException {

    /**
     * @serialField Print Service object that encountered the error.
     */
    private final PrintService printService;

    public PrintServiceException(PrintService thePrintService) {
	super();
	printService = thePrintService;
    }

    public PrintServiceException(PrintService thePrintService, String s) {
	super(s);
	printService = thePrintService;
    }

    public PrintServiceException(PrintService thePrintService, String s, Exception cause) {
	super(s, cause);
	printService = thePrintService;
    }

}
