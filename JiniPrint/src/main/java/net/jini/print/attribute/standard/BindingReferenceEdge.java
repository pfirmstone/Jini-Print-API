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
 * The "binding-reference-edge" member attribute specifies which edge ('bottom',
 * 'left', 'right', or 'top') is bound. If not specified, the default value is
 * either derived from the "finishing-template" keyword value ('bind-bottom',
 * 'bind-left', 'bind-right', 'bind-top') or, if no edge is specified, is an
 * implementation or site defined value.
 *
 * @see Bindings
 * @see FinishingsCollection
 * @see FinishingTemplateIANA
 * 
 * @author peter
 */
public class BindingReferenceEdge extends EnumSyntax implements PrintJobAttribute {

    public static final BindingReferenceEdge BOTTOM = new BindingReferenceEdge(0),
	    LEFT = new BindingReferenceEdge(0),
	    RIGHT = new BindingReferenceEdge(0),
	    TOP = new BindingReferenceEdge(0);

    protected BindingReferenceEdge(int i) {
	super(i);
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return BindingReferenceEdge.class;
    }

    @Override
    public String getName() {
	return "binding-reference-edge";
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
