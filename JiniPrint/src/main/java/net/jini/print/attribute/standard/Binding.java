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
 *
 * The "binding" member attribute specifies the location and type of binding to
 * apply to the hardcopy output. Printers with a binding finisher MUST support
 * this member attribute and all "binding-xxx" member attributes if they support
 * the "finishings-col" attribute.
 * 
 * @see FinishingsCollection
 *
 * @author peter
 */
public class Binding extends CollectionSyntax implements Attribute {

    private final BindingReferenceEdge refEdge;
    private final BindingType type;

    public Binding(BindingReferenceEdge refEdge, BindingType type) {
	this.refEdge = refEdge;
	this.type = type;
    }

    @Override
    protected Attribute[] getAttributes() {
	return new Attribute[]{refEdge, type};
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return Binding.class;
    }

    @Override
    public String getName() {
	return "binding";
    }

}
