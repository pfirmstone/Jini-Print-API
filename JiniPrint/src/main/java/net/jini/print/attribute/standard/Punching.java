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
 * The "punching" member attribute specifies the locations of holes to make in
 * the hardcopy output. Printers with a hole punching/drilling finisher MUST
 * support this member attribute and all "punching-xxx" member attributes if
 * they support the "finishings-col" attribute.
 *
 * @see FinishingsCollection
 */
public class Punching extends CollectionSyntax implements Attribute {

    private final PunchingLocations locations;
    private final PunchingOffset offset;
    private final PunchingReferenceEdge edge;

    public Punching(PunchingLocations locations,
	    PunchingOffset offset,
	    PunchingReferenceEdge edge) {
	this.locations = locations;
	this.offset = offset;
	this.edge = edge;
    }

    @Override
    protected Attribute[] getAttributes() {
	return new Attribute[]{locations, offset, edge};
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return Punching.class;
    }

    @Override
    public String getName() {
	return "punching";
    }

    /**
     * @return the locations
     */
    public PunchingLocations getLocations() {
	return locations;
    }

    /**
     * @return the offset
     */
    public PunchingOffset getOffset() {
	return offset;
    }

    /**
     * @return the edge
     */
    public PunchingReferenceEdge getEdge() {
	return edge;
    }

}
