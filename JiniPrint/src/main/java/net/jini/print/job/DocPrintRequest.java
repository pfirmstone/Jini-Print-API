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

import net.jini.print.Doc;


/**
 * Interface DocPrintRequest specifies the interface for conveying to a Jini
 * Print Service instance a request to print a job consisting of a single piece
 * of print data. Interface DocPrintRequest extends interface PrintRequest with
 * a method to specify the Doc object to be printed. ("Doc" is a short,
 * easy-to-pronounce term that means "a piece of print data.")
 *
 * Interface DocPrintRequest's methods do not throw RemoteException; these
 * methods are not intended to make remote method calls and must be implemented
 * locally.
 */
public interface DocPrintRequest extends PrintRequest {

    /**
     * Specify the doc for this print request. The previous print data is
     * replaced with the given doc.
     *
     * The setDoc() method does not verify whether this Jini Print Service
     * instance supports the given doc's doc flavor and printing attributes.
     * This verification is done during Print Job processing after this Print
     * Request has been submitted.
     *
     * @param theDoc Doc to be printed.
     */
    public void setDoc(Doc theDoc);

}
