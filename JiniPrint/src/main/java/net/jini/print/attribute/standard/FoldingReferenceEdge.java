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
import javax.print.attribute.PrintJobAttribute;

/**
 *
 * @author peter
 */
public class FoldingReferenceEdge extends EnumSyntax implements PrintJobAttribute {

    public static final FoldingReferenceEdge 
	    BOTTOM = new FoldingReferenceEdge(0),//[PWG5100.1]
	    LEFT = new FoldingReferenceEdge(1),//[PWG5100.1]
	    RIGHT = new FoldingReferenceEdge(2),//[PWG5100.1]
	    TOP = new FoldingReferenceEdge(3);//[PWG5100.1]

    protected FoldingReferenceEdge(int i) {
	super(i);
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return FoldingReferenceEdge.class;
    }

    @Override
    public String getName() {
	return "folding-reference-edge";
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
