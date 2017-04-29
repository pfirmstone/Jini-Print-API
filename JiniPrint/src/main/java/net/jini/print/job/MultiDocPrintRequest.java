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

import javax.print.MultiDoc;

/**
 * Interface MultiDocPrintRequest specifies the interface for conveying to a
 * Jini Print Service instance a request to print a job consisting of multiple
 * pieces of print data. Interface MultiDocPrintRequest extends interface
 * PrintRequest with a method to specify the MultiDoc object to be printed.
 * ("Doc" is a short, easy-to-pronounce term that means "a piece of print data,"
 * and a "multidoc" is a group of several docs.)
 *
 * Interface MultiDocPrintRequest's methods do not throw RemoteException; these
 * methods are not intended to make remote method calls and must be implemented
 * locally.
 */
public interface MultiDocPrintRequest extends PrintRequest {

    /**
     * Specify the multidoc for this print request. The previous print data is
     * replaced with the given multidoc.
     *
     * The setMultiDoc() method does not verify whether this Jini Print Service
     * instance supports the doc flavors and printing attributes of the docs in
     * the given multidoc. This verification is done during Print Job processing
     * after this Print Request has been submitted.
     *
     * @param theMultiDoc Multidoc to be printed.
     * @throws NullPointerException (unchecked exception) Thrown if theMultiDoc
     * is null.
     */
    public void setMultiDoc(MultiDoc theMultiDoc);
}
