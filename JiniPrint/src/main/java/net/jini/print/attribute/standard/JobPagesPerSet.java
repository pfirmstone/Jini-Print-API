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
import javax.print.attribute.DocAttribute;
import javax.print.attribute.IntegerSyntax;
import javax.print.attribute.PrintRequestAttribute;

/**
 * <p>
 * The RECOMMENDED "job-pages-per-set" Job Template attribute specifies the
 * number of input pages that constitute a set for finishing processes.
 * </p>
 * <CENTER>
 * <img SRC="../../doc-files/JobPagesPerSet.gif" ALT=Example>
 * </CENTER>
 * <p>
 * For example, if a Client submits a 14 page PWG Raster Format Document for
 * printing that actually contains two copies of four duplex pages each, the
 * Client could specify a "job-pages-per-set" Job Template attribute with a
 * value of 7, a "sides" attribute with a value of 'two-sided-long-edge', and a
 * "finishings" attribute with a value of 4 (staple) to have the Printer staple
 * two Sets of four sheets.
 * </p>
 * 
 * @see FinishingsCol
 * @see FinishingsSet
 * @see javax.print.attribute.standard.Finishings
 * @see javax.print.attribute.standard.Sides
 *
 */
public class JobPagesPerSet extends IntegerSyntax implements DocAttribute, PrintRequestAttribute {

    public JobPagesPerSet(int i) {
	super(check(i));
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return JobPagesPerSet.class;
    }

    @Override
    public String getName() {
	return "job-pages-per-set";
    }

    @Override
    public boolean equals(Object theObject) {
	return super.equals(theObject) && this.getClass().isInstance(theObject);
    }

    private static int check(int i) {
	if (i < 0) {
	    throw new IllegalArgumentException("integer must be positive");
	}
	return i;
    }

    /**
     * IntegerSyntax can be deserialized by AtomicMarshalInputStream, since it
     * only contains primitive fields, which are not seen as a threat for gadget
     * attacks, however this object still has invariants which need to be
     * checked. Implementing @AtomicSerial would make this class responsible for
     * managing serial form, while implementing readObject() would prevent
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
     * deserialization.
     *
     * @throws ObjectStreamException
     */
    protected void validateInvariants() throws ObjectStreamException {
    }

}
