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
 * The "covering" member attribute specifies which cover to apply over the
 * hardcopy output. Printers with a cover finisher MUST support this member
 * attribute and all "covering-xxx" member attributes if they support the
 * "finishings-col" attribute. Note: Unlike the "cover-back" and "cover-front"
 * Job Template attributes [PWG5100.3], finishing covers are applied over any
 * binding, edge stitching, or staples and do not contain print-stream pages.
 * 
 * @see FinishingsCollection
 * 
 * @author peter
 */
public class Covering extends CollectionSyntax implements Attribute {

    private final CoveringName coveringName;

    public Covering(CoveringName name) {
	this.coveringName = name;
    }

    @Override
    protected Attribute[] getAttributes() {
	return new Attribute[]{coveringName};
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return Covering.class;
    }

    @Override
    public String getName() {
	return "covering";
    }

}
