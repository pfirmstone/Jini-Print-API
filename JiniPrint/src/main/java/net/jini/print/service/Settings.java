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

import javax.print.DocFlavor;
import javax.print.attribute.AttributeSet;

/**
 * Class Settings is a record holding the settings for a supposed print job,
 * used by the capability methods in interface PrintService.
 */
public class Settings {

    /**
     * @serialField Attribute set giving the printing attributes for the
     * supposed print job. A value of null is equivalent to an empty set.
     */
    private final AttributeSet attributes;

    /**
     * @serialField Doc flavor giving the print data format for the supposed
     * print job. A value of null means the doc flavor is unspecified.
     */
    private final DocFlavor flavor;

    /**
     * Constructs a new settings object initialized with a null doc flavor and a
     * null attribute set.
     */
    public Settings() {
	attributes = null;
	flavor = null;
    }

    /**
     * Constructs a new settings object initialized with the given doc flavor
     * and the given attribute set.
     *
     * @param theFlavor Doc flavor, or null.
     * @param theAttributes Attribute set, or null.
     */
    public Settings(DocFlavor theFlavor,
	    AttributeSet theAttributes) {
	flavor = theFlavor;
	attributes = theAttributes;
    }

    /**
     *
     * @return Attribute set giving the printing attributes for the supposed
     * print job. A value of null is equivalent to an empty set.
     */
    public AttributeSet getAttributes() {
	return attributes;
    }

    /**
     *
     * @return Doc flavor giving the print data format for the supposed print
     * job. A value of null means the doc flavor is unspecified.
     */
    public DocFlavor getDocFlavor() {
	return flavor;
    }

}
