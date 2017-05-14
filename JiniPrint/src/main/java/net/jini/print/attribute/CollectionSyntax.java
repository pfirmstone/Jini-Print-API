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
package net.jini.print.attribute;

import java.util.Arrays;
import javax.print.attribute.Attribute;

/**
 * Utility class for Collection based attributes.
 *
 * Collections
 *
 * @author peter
 */
public abstract class CollectionSyntax {

    /**
     * Returns a string version of this attribute. The string version is the
     * concatenation of the string versions of the individual non-null attribute
     * characteristics, each value preceded by its category name and an equals
     * character. Characteristics are delimited by pipe characters ; for
     * example:
     * <CODE>"{media-color=white|media-weight-metric=90 g/m**2}"</CODE>.
     *
     * The pipe character was chosen to distinguish a collection from a setOf
     * which uses comma separators.
     *
     * Previously a colon was used to separate key value pairs, however as this
     * symbol may also be used to represent a range by the standard and equals
     * is typically used in IPP standards pseudo code examples, as such, it was
     * changed.
     *
     * @return string version of this attribute
     */
    @Override
    public String toString() {
	Attribute[] attributes = getAttributes();
	StringBuilder result = new StringBuilder(attributes.length * 32);
	result.append('{'); // Beginning of Collection
	for (int i = 0, l = attributes.length; i < l; i++) {
	    addToString(result, attributes[i]);
	}
	result.append('}'); // End of Collection
	return result.toString();
    }

    private static void addToString(StringBuilder result, Attribute value) {
	if (value == null) {
	    return;
	}
	if (result.length() > 0) {
	    result.append('|'); //Collection separator
	}
	result.append(value.getName());
	result.append('='); //Key  Value separator
	result.append(value.toString());
    }

    /**
     * The attribute collection fields, individual elements may be null, however
     * attribute array must have a length equal to all named elements in the
     * standard. Unimplemented or unsupported elements should be null.
     *
     * @return the attribute fields in the order listed by the relevant
     * standard.
     */
    protected abstract Attribute[] getAttributes();

    /**
     * Determine whether this collection attribute is supported by the given
     * collection attribute.
     *
     * @param c collection attribute to test.
     *
     * @return If both AttributeCollections are the same type and every
     * non-wildcarded (non-null) field of this Media attribute equals the
     * corresponding field of given attribute, true is returned. Otherwise,
     * false is returned.
     */
    public boolean isSupportedBy(CollectionSyntax c) {
	if (!this.getClass().isInstance(c)) {
	    return false;
	}
	Attribute[] mine = getAttributes();
	Attribute[] given = c.getAttributes();
	if (mine.length != given.length) {
	    return false;
	}
	for (int i = 0, l = mine.length; i < l; i++) {
	    if (mine[i] != null && !mine[i].equals(given[i])) {
		return false;
	    }
	}
	return true;
    }

    @Override
    public boolean equals(Object o) {
	if (!this.getClass().isInstance(o)) {
	    return false;
	}
	Attribute[] attributes = getAttributes();
	Attribute[] oAttributes = ((CollectionSyntax) o).getAttributes();
	return Arrays.equals(attributes, oAttributes);
    }

    @Override
    public int hashCode() {
	int hash = 5;
	hash = 31 * hash + this.getClass().hashCode();
	hash = 31 * hash + Arrays.hashCode(getAttributes());
	return hash;
    }

}
