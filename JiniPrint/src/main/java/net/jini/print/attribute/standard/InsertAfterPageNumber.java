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
 *
 * The "insert-after-page-number" m ember attribute specifies the page in the
 * Input-Document (see sections 2.2 and 2.5) print-stream after which the
 * Insert-Sheet(s) is(are) to be placed. The inserted sheet(s) does not affect
 * the numbering of print-stream pages. For-example, to insert a single sheet
 * after both pages 2 and 3 of a given document, th e value of
 * "input-after-page-number" would be 2 and 3 respectively (not 2 and 4, as it
 * would be if the inserted sheet affected the Input-Document print-stream page
 * count). For a complete description of the enumeration of print-stream pages
 * see section 2.5. If the value of the "insert-after-page-number" member
 * attribute is 0, then the sheet is inserted before the first page. If the
 * value is MAX, then the sheet is inserted after the last sheet in the
 * document. If the "insert-after-page-number" member attribute is not a valid
 * input document page reference in the print-stream , then the IPP Printer
 * SHOULD ignore the request. For example, (1) the page number is beyond the
 * last page of the document AND is not MAX or (2) the "page-ranges" Job
 * Template attribute does not include the specified page number (see section
 * 2.5). There is no way to validate the "insert-after-page-number" attribute
 * with the Validate-Job operation, since the validation cannot occur until the
 * pages of the documents have arrived at the printer. Since the
 * "insert-after-page-number" m ember attribute refers to a specific
 * Input-Document print- stream page, it is possible to specify a page that
 * would not be the last page on a sheet, e.g. an insertion occurs after the
 * page that is on the front side of a two sided document. In this case, the
 * Printer MUST force a new Sheet after the specified page, insert the specified
 * sheet, place the following pages starting on the first side of th e next
 * Sheet, and issue a warning by adding ‘job- warnings-detected’ to the
 * “job-state-reasons” and by increasing the value of the “job-warnings- count”
 * Job Description attribute by 1. See [ipp-override] for this error handling
 * specification under "Common Behavior for Sheet Attributes". The
 * "insert-after-page-number-supported" (rangeOfInteger(0:MAX)) Printer
 * attribute indicates the range of page numbers supported in the
 * "insert-after-page-number" m ember attribute, i.e., the minimum (SHOULD be 0)
 * and the maximum (SHOULD be MAX) page numbers supported.
 *
 * @author peter
 */
public class InsertAfterPageNumber extends IntegerSyntax implements Attribute {

    private static final long serialVersionUID = 1L;

    public InsertAfterPageNumber(int i) {
	super(check(i));
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return InsertAfterPageNumber.class;
    }

    @Override
    public String getName() {
	return "insert-after-page-number";
    }

    private static int check(int i) {
	if (i < 0) {
	    throw new IllegalArgumentException("integer must be positive");
	}
	return i;
    }

    /**
     * IntegerSyntax can be de-serialized by AtomicMarshalInputStream, since it
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
     * de-serialization.
     *
     * @throws ObjectStreamException
     */
    protected void validateInvariants() throws ObjectStreamException {
    }

}
