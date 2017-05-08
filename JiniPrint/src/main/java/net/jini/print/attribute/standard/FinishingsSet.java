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

import java.util.Set;
import javax.print.attribute.Attribute;
import javax.print.attribute.DocAttribute;
import javax.print.attribute.PrintJobAttribute;
import javax.print.attribute.PrintRequestAttribute;
import javax.print.attribute.standard.Finishings;
import net.jini.print.attribute.OneSetOfSyntax;

/**
 * <p>
 * FinishingsSet enables proper support for the "finishings" attribute as
 * defined in [RFC2911]. {@link javax.print.attribute.standard.Finishings} only
 * supports specifying one "finishing" enum attribute, however the standard
 * allows a Set to be supplied.
 * </p><p>
 * The "finishings" Job Template attribute [RFC2911] identifies the finishing
 * processes that the Printer uses for each copy of each printed Document in the
 * Job. The order of values supplied in the "finishings" attribute is not
 * significant. Printers MUST NOT require Clients to supply values in a
 * particular order. If the Client supplies a value of ‘none’ along with any
 * other combination of values, it is the same as if only that other combination
 * of values had been supplied, i.e., the ‘none’ value has no effect.</p><p>
 * The positional values are specified with respect to the Document as if the
 * Document were a portrait Document. If the Document is actually a landscape or
 * a reverse-landscape Document, the Client supplies the appropriate transformed
 * value. For example, to position a staple in the upper left hand corner of a
 * landscape Document when held for reading, the Client supplies the
 * ‘staple-bottom-left’ value since landscape is defined as an anti-clockwise
 * rotation from portrait. On the other hand, to position a staple in the upper
 * left hand corner of a reverse-landscape Document when held for reading, the
 * Client supplies the ‘staple-top-right’ value since reverse-landscape is
 * defined as a clockwise rotation from portrait.</p><p>
 * Note: The effect of this attribute on Jobs with multiple copies and Documents
 * is controlled by the “multiple-document-handling” Job Template attribute
 * (section 4.2.4 [RFC2911]) and the relationship of this attribute and the
 * other attributes that control Document processing is described in section
 * 15.3 [RFC2911].</p>
 *
 * @see Finishings
 *
 * @author peter
 */
public class FinishingsSet extends OneSetOfSyntax<Finishing>
	implements DocAttribute, PrintRequestAttribute, PrintJobAttribute {

    /**
     * Creates a new FinishingSet.
     *
     * @param finishings a set of Finishing's
     */
    public FinishingsSet(Set<Finishing> finishings) {
	super(finishings);
    }

    /**
     *
     * @return javax.print.attribute.standard.Finishings.class
     */
    @Override
    public Class<? extends Attribute> getCategory() {
	return Finishings.class;
    }

    /**
     *
     * @return "finishings"
     */
    @Override
    public String getName() {
	return "finishings";
    }

}
