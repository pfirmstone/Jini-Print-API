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
 * The "folding-direction" member attribute specifies whether the sheets are
 * pushed outward ('outward') or pulled inward ('inward') for the current fold.
 * The default value may be derived from the "finishing-template" value or, if a
 * default value cannot be determined from that value, using an implementation
 * or site defined value.
 * 
 * @see Folding
 * @see FinishingsCollection
 * @see FinishingsTemplate
 *
 * @author peter
 */
public class FoldingDirection extends EnumSyntax implements PrintJobAttribute {

    public static final FoldingDirection INWARD = new FoldingDirection(0),//[PWG5100.1]
	    OUTWARD = new FoldingDirection(1);//[PWG5100.1]

    protected FoldingDirection(int i) {
	super(i);
    }

    /**
     * 
     * @return FoldingDirection.class
     */
    @Override
    public Class<? extends Attribute> getCategory() {
	return FoldingDirection.class;
    }

    /**
     * 
     * @return "folding-direction" string.
     */
    @Override
    public String getName() {
	return "folding-direction";
    }

    @Override
    protected String[] getStringTable() {
	return new String[]{
	    "inward",
	    "outward",};
    }

    @Override
    protected EnumSyntax[] getEnumValueTable() {
	return new EnumSyntax[]{
	    INWARD,
	    OUTWARD,};
    }

}
