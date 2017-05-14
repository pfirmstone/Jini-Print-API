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
 * <p>
 * The "stitching" member attribute (originally defined in section 3.2.2 of
 * [PWG5100.3]) specifies the locations of stitches or staples that are used to
 * bind the hardcopy output. Printers with a stapler and/or stitching finisher
 * MUST support this member attribute and all "stitching-xxx" member attributes
 * if they support the "finishings-col" attribute.
 * </p><p>
 * A Client that chooses to request custom stitching using the "stitching"
 * collection attribute MUST specify the "stitching-reference-edge", the
 * "stitching-offset", and the "stitching-locations" member attributes. If the
 * Client supplies a malformed request by not supplying all three member
 * attributes, the Printer MUST (depending on implementation) either reject the
 * request and return the ‘client-error-bad-request' (see [RFC2911] section
 * 13.1.4.1) or default the omitted member attributes, independent of the value
 * of the "ipp-attribute-fidelity" attribute supplied by the Client.
 * </p>
 *
 * @see FinishingsCollection
 */
public class Stitching extends CollectionSyntax implements Attribute {

    private final StitchingLocations locations;
    private final StitchingOffset offset;
    private final StitchingReferenceEdge referenceEdge;

    public Stitching(StitchingLocations locations,
	    StitchingOffset offset,
	    StitchingReferenceEdge referenceEdge
    ) {
	this.locations = locations;
	this.offset = offset;
	this.referenceEdge = referenceEdge;
    }

    @Override
    protected Attribute[] getAttributes() {
	return new Attribute[]{locations, offset, referenceEdge};
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return Stitching.class;
    }

    @Override
    public String getName() {
	return "stitching";
    }

    /**
     * @return the offset
     */
    public StitchingOffset getOffset() {
	return offset;
    }

    /**
     * @return the referenceEdge
     */
    public StitchingReferenceEdge getReferenceEdge() {
	return referenceEdge;
    }

    /**
     * @return the locations
     */
    public StitchingLocations getLocations() {
	return locations;
    }

}
