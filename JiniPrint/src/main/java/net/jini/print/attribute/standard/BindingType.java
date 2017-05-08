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
 * The "binding-type" member attribute specifies the type of binding to apply.
 * If not specified, an implementation or site defined value is used.
 *
 * @see Binding
 * @see FinishingsCollection
 *
 * @author peter
 */
public class BindingType extends EnumSyntax implements Attribute {

    /**
     * Sheets are bound using glue or adhesive.
     */
    public static final BindingType ADHESIVE = new BindingType(0);
    /**
     * Sheets are bound by placing small rectangular holes along the binding
     * edge and using a tube-shaped plastic binding strip with comb like fingers
     * that fit through the holes.
     */
    public static final BindingType COMB = new BindingType(1);
    /**
     * Sheets are bound so that they can lay flat when the hardcopy output is
     * opened. The specific method of producing such a binding is implementation
     * defined.
     */
    public static final BindingType FLAT = new BindingType(2);
    /**
     * Sheets are bound by applying a non-penetrating adhesive to the edge of
     * the stack of sheets so that the sheets can be easily peeled off one at a
     * time.
     */
    public static final BindingType PADDING = new BindingType(3);
    /**
     * Sheets are bound by roughing the binding edge and applying an adhesive.
     */
    public static final BindingType PERFECT = new BindingType(4);
    /**
     * Sheets are bound by placing small round holes along the binding edge and
     * winding plastic or metal wire through the holes in a spiral pattern.
     */
    public static final BindingType SPIRAL = new BindingType(5);
    /**
     * Sheets are bound by placing tape along the binding edge, overlapping the
     * top and bottom sheets of the stack.
     */
    public static final BindingType TAPE = new BindingType(6);
    /**
     * Sheets are bound by placing small holes along the binding edge and
     * joining the sheets using plastic strips with pins that extend through
     * those holes.
     */
    public static final BindingType VELO = new BindingType(7);

    protected BindingType(int i) {
	super(i);
    }

    /**
     * 
     * @return BindingType.class
     */
    @Override
    public Class<? extends Attribute> getCategory() {
	return BindingType.class;
    }

    /**
     * 
     * @return "binding-type" string.
     */
    @Override
    public String getName() {
	return "binding-type";
    }

    @Override
    protected String[] getStringTable() {
	return new String[]{
	    "adhesive",
	    "comb",
	    "flat",
	    "padding",
	    "perfect",
	    "spiral",
	    "tape",
	    "velo",};
    }

    @Override
    protected EnumSyntax[] getEnumValueTable() {
	return new EnumSyntax[]{
	    ADHESIVE,
	    COMB,
	    FLAT,
	    PADDING,
	    PERFECT,
	    SPIRAL,
	    TAPE,
	    VELO,};
    }

}
