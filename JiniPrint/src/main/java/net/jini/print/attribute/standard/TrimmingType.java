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
 *
 * @author peter
 */
public class TrimmingType extends EnumSyntax implements Attribute {

    public final static TrimmingType 
	    DRAW_LINE = new TrimmingType(0),//[IPPWG20160325]
	    FULL = new TrimmingType(1),//[PWG5100.1]
	    PARTIAL = new TrimmingType(2),//[PWG5100.1]
	    PERFORATE = new TrimmingType(3),//[PWG5100.1]
	    SCORE = new TrimmingType(4),//[PWG5100.1]
	    TAB = new TrimmingType(5);//[PWG5100.1]

    public TrimmingType(int i) {
	super(i);
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return TrimmingType.class;
    }

    @Override
    public String getName() {
	return "trimming-type";
    }

    @Override
    protected String[] getStringTable() {
	return new String[]{"draw-line",
	    "full",
	    "partial",
	    "perforate",
	    "score",
	    "tab",};
    }

    @Override
    protected EnumSyntax[] getEnumValueTable() {
	return new EnumSyntax[]{
	    DRAW_LINE,
	    FULL,
	    PARTIAL,
	    PERFORATE,
	    SCORE,
	    TAB,};
    }

}
