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

import java.io.Serializable;
import javax.print.attribute.AttributeSet;
import net.jini.print.attribute.NullAttributeSet;

/**
 * Class MultiDocSettings is a record holding the settings for a supposed
 * multiple-document print job, used by the capability methods in interface
 * MultiDocPrintService.
 */
public class MultiDocSettings implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * @serialField Attribute set giving the job-level printing attributes for
     * the supposed print job. A value of null is equivalent to an empty set.
     */
    private final AttributeSet attributes;
    /**
     * @serialField Array of Settings objects. Each element in the array
     * corresponds to an individual doc in the print job and gives the print
     * data format (doc flavor) and document-level attributes for that doc. A
     * null element in the array means the corresponding doc's settings are
     * unspecified. A null value for docSettings is equivalent to a zero-length
     * array, both denoting a print job with no docs.
     *
     */
    private final Settings[] docSettings;

    /**
     * Constructs a new multidoc settings object initialized with a zero length
     * array of doc settings and a null object pattern attribute set.
     *
     * @see NullAttributeSet
     */
    public MultiDocSettings() {
	attributes = NullAttributeSet.NULL_SET;
	docSettings = new Settings[0];
    }

    /**
     * Constructs a new multidoc settings object initialized with the given
     * array of doc settings and the given attribute set.
     *
     * @param theDocSettings Array of doc settings, or null.
     * @param theAttributes Attribute set, or null.
     */
    public MultiDocSettings(Settings[] theDocSettings,
	    AttributeSet theAttributes) {
	docSettings = theDocSettings == null ? new Settings[0] : theDocSettings.clone();
	attributes = theAttributes == null ? NullAttributeSet.NULL_SET : theAttributes;
    }

    /**
     * Attribute set giving the job-level printing attributes for the supposed
     * print job.
     *
     * @return Attribute set giving the job-level printing attributes for the
     * supposed print job or an empty set.
     */
    public AttributeSet getAttributeSet() {
	return attributes;
    }

    /**
     * Array of Settings objects. Each element in the array corresponds to an
     * individual doc in the print job and gives the print data format (doc
     * flavor) and document-level attributes for that doc. A null element in the
     * array means the corresponding doc's settings are unspecified. A
     * zero-length array, denotes a print job with no docs.
     *
     * @return a cloned Array of Settings objects or zero length array.
     */
    public Settings[] getSettings() {
	return docSettings.length == 0 ? docSettings : docSettings.clone();
    }

}
