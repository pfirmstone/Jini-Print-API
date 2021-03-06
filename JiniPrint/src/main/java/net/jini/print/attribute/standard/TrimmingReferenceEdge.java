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
 * The "trimming-reference-edge" member attribute specifies which edge is used
 * as the basis of the cut, perforation, or score: 'bottom', 'left', 'right', or
 * 'top'. Cuts, perforations, and scores are placed parallel to the reference
 * edge at the offset specified by the "trimming-offset" member attribute. The
 * default value is generally derived from the "finishing-template" value and
 * output media.
 *
 * @see Trimming
 */
public class TrimmingReferenceEdge extends EnumSyntax implements Attribute {

    public static final TrimmingReferenceEdge BOTTOM = new TrimmingReferenceEdge(0),//[PWG5100.1]
	    LEFT = new TrimmingReferenceEdge(1),//[PWG5100.1]
	    RIGHT = new TrimmingReferenceEdge(2),//[PWG5100.1]
	    TOP = new TrimmingReferenceEdge(3);//[PWG5100.1]

    protected TrimmingReferenceEdge(int i) {
	super(i);
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return TrimmingReferenceEdge.class;
    }

    @Override
    public String getName() {
	return "trimming-reference-edge";
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
