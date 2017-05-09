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

import java.util.Collection;
import javax.print.attribute.Attribute;
import javax.print.attribute.DocAttribute;
import javax.print.attribute.PrintJobAttribute;
import javax.print.attribute.PrintRequestAttribute;
import javax.print.attribute.standard.Finishings;
import net.jini.print.attribute.OneSetOfSyntax;

/**
 * finishings-col (no-value | 1setOf collection)
 * <p>
 * The {@link FinishingsCol} attribute augments the {@link FinishingsSet} attribute
 * and allows the Client to specify detailed finishing instructions that cannot
 * be specified using the simple enumerated values of the {@link FinishingsSet}
 * attribute.
 * </p><p>
 * Clients can only specify either {@link FinishingsSet} or {@link FinishingsCol}
 * attributes in an {@link javax.print.attribute.AttributeSet}, not both.
 * </p>
 *
 * @see Finishings
 * @see FinishingsSet
 * @see FinishingsCollection
 *
 * @author peter
 */
public class FinishingsCol extends OneSetOfSyntax
	implements DocAttribute, PrintRequestAttribute, PrintJobAttribute {

    /**
     *
     * @param finishings the desired finishings.
     */
    public FinishingsCol(Collection<FinishingsCollection> finishings) {
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
     * @return "finishings-col"
     */
    @Override
    public String getName() {
	return "finishings-col";
    }

}
