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
package net.jini.print.lookup;

import javax.print.DocFlavor;

/**
 * Class FlavorEntry is a Jini service attribute containing a print data format
 * ("doc flavor") a Jini Print Service instance supports. See {@link DocFlavor}
 * for further information. For each doc flavor it supports, a Jini Print
 * Service instance must register a service attribute of class FlavorEntry in
 * its service registration in the Jini Lookup Service (JLUS).
 *
 */
public final class FlavorEntry extends net.jini.entry.AbstractEntry {

    /**
     * Print data format (doc flavor) the Jini Print Service instance supports.
     */
    public DocFlavor flavor;

    /**
     * Construct a flavor entry containing a null (wildcard) doc flavor.
     */
    public FlavorEntry() {
    }

    /**
     * Construct a flavor entry containing the given doc flavor.
     *
     * @param theFlavor Doc flavor.
     */
    public FlavorEntry(DocFlavor theFlavor) {
	flavor = theFlavor;
    }

}
