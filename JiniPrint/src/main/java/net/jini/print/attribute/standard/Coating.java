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

import javax.print.attribute.Attribute;
import net.jini.print.attribute.CollectionSyntax;

/**
 * The "coating" member attribute specifies which coating to apply to the
 * hardcopy output. Typically the coating is applied to the entire page,
 * although some Printers MAY only coat those areas that have been marked on.
 * Printers with a coating finisher MUST support this member attribute and all
 * "coating-xxx" member attributes if they support the "finishings-col"
 * attribute.
 * 
 * @see FinishingsCollection
 *
 * @author peter
 */
public class Coating extends CollectionSyntax implements Attribute {

    private final CoatingSides sides;
    private final CoatingType type;

    public Coating(
	    CoatingSides sides,
	    CoatingType type) {
	this.sides = sides;
	this.type = type;
    }

    @Override
    protected Attribute[] getAttributes() {
	return new Attribute[]{sides, type};
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return Coating.class;
    }

    @Override
    public String getName() {
	return "coating";
    }

}
