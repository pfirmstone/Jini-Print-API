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
import javax.print.attribute.EnumSyntax;

/**
 * <p>
 * The "stitching-reference-edge" member attribute specifies the Finishing
 * Reference Edge of the output media relative to which the stapling or
 * stitching MUST be applied. The individual staples or stitches are situated
 * along a line or axis parallel to the Finishing Reference Edge.
 * </p><p>
 * A Printer MUST support this member attribute and at least the 'left' value.
 * </p><p>
 * Note: The 'left' value works with 'portrait' and 'landscape' Documents since
 * 'landscape' Documents are rotated anti-clock-wise 90 degrees, i.e., plus 90
 * degrees, with respect to 'portrait' Documents. The left edge becomes the top
 * edge when the human reader orients the landscape Document for reading.
 * </p>
 *
 * @see Stitching
 */
public class StitchingReferenceEdge extends EnumSyntax implements Attribute {

    public static final StitchingReferenceEdge BOTTOM = new StitchingReferenceEdge(0),//[PWG5100.1]
	    LEFT = new StitchingReferenceEdge(1),//[PWG5100.1]
	    RIGHT = new StitchingReferenceEdge(2),//[PWG5100.1]
	    TOP = new StitchingReferenceEdge(3);//[PWG5100.1]

    protected StitchingReferenceEdge(int i) {
	super(i);
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return StitchingReferenceEdge.class;
    }

    @Override
    public String getName() {
	return "stitching-reference-edge";
    }

    @Override
    protected String[] getStringTable() {
	return new String[]{
	    "bottom",
	    "left",
	    "right",
	    "top",};
    }

    @Override
    protected EnumSyntax[] getEnumValueTable() {
	return new EnumSyntax[]{
	    BOTTOM,
	    LEFT,
	    RIGHT,
	    TOP,};
    }

}
