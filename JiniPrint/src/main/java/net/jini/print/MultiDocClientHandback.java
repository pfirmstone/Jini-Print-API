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
package net.jini.print;

import java.io.IOException;
import java.io.Serializable;
import javax.print.Doc;
import net.jini.core.constraint.MethodConstraints;
import net.jini.core.constraint.RemoteMethodControl;
import net.jini.core.lease.Lease;

/**
 * MultiDocClientHandback allows clients to utilise a MultiDocClient to
 * implement MultiDoc, without requiring the MultiDocPrintService to download a
 * codebase for the client's handback proxy.
 * 
 * This MultiDoc is passed as an argument to the MultiDocPrintService by the client
 * it allows each Doc to be transmitted remotely if necessary on an as needed
 * basis, it also contains a Lease which the client may use to determine
 * whether it can clean up resources required to hold the documents, such as
 * memory or files.
 *
 */
public class MultiDocClientHandback implements MultiDoc, Serializable, RemoteMethodControl {

    private static final long serialVersionUID = 1L;

    /**
     * @serial the multi doc client service.
     */
    private final MultiDocClient service;
    /**
     * @serial the lease associated with this MultiDoc if there is one.
     */
    private final Lease lease;
    /**
     * @serial the next doc.
     */
    private final Doc theDoc;

    /**
     * 
     * @param service MultiDocClient used to obtain the next Doc.
     * @param lease Lease or null.
     * @param theDoc the first Doc in the sequence.
     */
    public MultiDocClientHandback(MultiDocClient service, Lease lease, Doc theDoc) {
	this.service = service;
	this.lease = lease;
	this.theDoc = theDoc;
    }

    @Override
    public Doc getDoc() throws IOException {
	return theDoc;
    }

    @Override
    public javax.print.MultiDoc next() throws IOException {
	Doc next = service.next();
	return next == null ? null : new MultiDocClientHandback(service, lease, next);
    }

    @Override
    public Lease getLease() {
	return lease;
    }

    @Override
    public MultiDocClientHandback setConstraints(MethodConstraints constraints) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public MethodConstraints getConstraints() {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
