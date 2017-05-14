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

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import org.apache.river.api.io.AtomicSerial;
import org.apache.river.api.io.AtomicSerial.GetArg;
import org.apache.river.api.io.Valid;

/**
 * The '1setOf X' attribute syntax is one or more values of attribute syntax
 * type X. This syntax type is used for multi-valued attributes. The syntax type
 * is called '1setOf' rather than just 'setOf' as a reminder that the set of
 * values MUST NOT be empty (i.e., a set of size 0). Sets are normally
 * unordered; however, each attribute description of this type can specify that
 * the values MUST be in a certain order for that attribute.
 *
 * Values are comma separated and represented in string form as determined by 
 * {@link Object#toString()}
 *
 * @author peter
 * @param <X>
 */
@AtomicSerial
public abstract class OneSetOfSyntax<X> implements Serializable {

    private static final long serialVersionUID = 1L;

    private final X[] values;

    /**
     * Ensures the set of values MUST NOT be empty (i.e., a set of size 0).
     *
     * Order and whether duplicates are allowed is determined by the subclass
     * implementation at time of construction.
     *
     * Values are copied in the order they are found, the order is preserved as
     * found at the time of construction, null values are ignored, provided
     * there is at least one value in the collection.
     *
     * @param values the values.
     * @throws IllegalArgumentException if values is empty.
     * @throws NullPointerException if values is null.
     */
    protected OneSetOfSyntax(Collection<X> values) {
	this(check(values));
    }

    /**
     * Subclasses should create an anonymous instance of this abstract class in
     * a static method and check the array contents returned from 
     * {@link #getValues() } are of the expected type before creating an object
     * instance of their subclass.
     *
     * Subclasses should call this constructor during atomic de-serialization.
     *
     * @param arg
     * @throws IOException
     */
    protected OneSetOfSyntax(GetArg arg) throws IOException {
	this(
		check(
			(X[]) Valid.nullElement(
				Valid.notNull(
					arg.get("values", null, Object[].class),
					"Null values not allowed"
				),
				"cannot contain null elements"
			)
		)
	);
    }

    private OneSetOfSyntax(X[] values) {
	this.values = values.clone();
    }

    private static <X> X[] check(X[] values) throws IOException {
	if (values.length == 0) {
	    throw new InvalidObjectException("values array cannot be zero length");
	}
	return values;
    }

    private static <X> X[] check(Collection<X> values) {
	if (values == null) {
	    throw new NullPointerException("Collection was null");
	}
	if (values.isEmpty()) {
	    throw new IllegalArgumentException("Collection was empty");
	}
	return (X[]) values.toArray();
    }

    /**
     * Returns a copy of the values.
     *
     * @return array of X
     */
    public final X[] getValues() {
	return values.clone();
    }
    
    public boolean contains(Object value){
	for (int i = 0, l = values.length; i < l; i++){
	    if (values[i].equals(value)) return true;
	}
	return false;
    }

    @Override
    public final String toString() {
	StringBuilder b = new StringBuilder(values.length * 8);
	for (int i = 0, l = values.length; i < l; i++) {
	    b.append(values[i]);
	    if (i < l - 1) {
		b.append(',');
	    }
	}
	return b.toString();
    }

    /**
     * R rue if both sets contain the same values in the same order, subclasses
     * should override if this context is too narrow..
     *
     * @param o object to test for equality.
     * @return true if both sets contain the same values in the same order.
     */
    @Override
    public boolean equals(Object o) {
	if (!this.getClass().isInstance(o)) {
	    return false;
	}
	return Arrays.equals(values, ((OneSetOfSyntax) o).values);
    }

    @Override
    public int hashCode() {
	int hash = 5;
	hash = 31 * hash + this.getClass().hashCode();
	hash = 31 * hash + Arrays.hashCode(values);
	return hash;
    }
}
