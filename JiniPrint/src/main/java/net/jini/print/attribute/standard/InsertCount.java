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
package net.jini.print.attribute.standard;

import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import javax.print.attribute.Attribute;
import javax.print.attribute.IntegerSyntax;

/**
 * The "insert-count" member attribute indicates how many sheets to insert. If
 * the "insert-count" attribute is omitted, then the printer assumes a value
 * of 1. The value 0 indicates that no inserts sheets are to be inserted. The
 * "insert-count-supported" (rangeOfInteger(0:MAX)) Printer attribute specifies
 * the range of values that the Printer supports, i.e., the minimum number
 * and the maximum number of pages.
 *
 * @author peter
 */
public class InsertCount extends IntegerSyntax implements Attribute {

    public InsertCount(int i) {
	super(check(i));
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return InsertCount.class;
    }

    @Override
    public String getName() {
	return "insert-count";
    }
    
    @Override
    public boolean equals(Object theObject) {
	return super.equals(theObject) && this.getClass().isInstance(theObject);
    }
    
    private static int check(int i){
	if ( i < 0 ) 
	    throw new IllegalArgumentException("integer must be positive");
	return i;
    }
    
    /**
     * IntegerSyntax can be de-serialized by AtomicMarshalInputStream, since it
     * only contains primitive fields, which are not seen as a threat for gadget
     * attacks, however this object still has invariants which need to
     * be checked. Implementing @AtomicSerial would make this class responsible
     * for managing serial form, while implementing readObject() would prevent
     * de-serialization with AtomicMarshalInputStream. As such readResolve is
     * the only option to validate input in this case, it is protected so that
     * all subclasses inherit it, to ensure it is also called for subclass
     * instances. It is final to ensure the validation check cannot be bypassed.
     *
     *
     * @serial Checks the value from the stream satisfies the same invariants as
     * our constructor.
     *
     * @return this
     * @throws ObjectStreamException
     */
    protected final Object readResolve() throws ObjectStreamException {
	try {
	    check(getValue());
	    validateInvariants();
	    return this;
	} catch (IllegalArgumentException e) {
	    throw new InvalidObjectException(e.getMessage());
	}
    }
    
    /**
     * Subclasses can override this method to have check their invariants during
     * de-serialization.
     * 
     * @throws ObjectStreamException 
     */
    protected void validateInvariants() throws ObjectStreamException {}
    
}
