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
 * The "punching-reference-edge" member attribute specifies which edge of the
 * sheets will be punched or drilled: 'bottom', 'left', 'right', or 'top'. The
 * default value may be derived from the "finishing-template" value or, if a
 * default value cannot be determined from that value, using an implementation
 * or site defined value.
 *
 * @see Punching
 */
public class PunchingReferenceEdge extends EnumSyntax implements Attribute {

    public static final PunchingReferenceEdge BOTTOM = new PunchingReferenceEdge(0),//[PWG5100.1]
	    LEFT = new PunchingReferenceEdge(1),//[PWG5100.1]
	    RIGHT = new PunchingReferenceEdge(2),//[PWG5100.1]
	    TOP = new PunchingReferenceEdge(3);//[PWG5100.1]

    protected PunchingReferenceEdge(int i) {
	super(i);
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return PunchingReferenceEdge.class;
    }

    @Override
    public String getName() {
	return "punching-reference-edge";
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
