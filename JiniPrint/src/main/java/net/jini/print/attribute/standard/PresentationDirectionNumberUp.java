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
 * This attribute specifies the order that the Printer places page im ages on a
 * Finished-Page Im age with the "number-up" attribute. This attribute is
 * especially useful to control the presentation direction in languages or
 * multi-lingual documents that have m ore than one presentation direction, but
 * may be used with any language. For example of the former, in Japanese text
 * on pages can have a presentation direction that is either top-to-bottom
 * -right-to-left or left-to-right-top- to-bottom . For an example of the
 * latter, a mixed English and Hebrew document, text on pages can have a
 * presentation direction that is either left-to-right- top-to-bottom or
 * right-to-left-top-to-bottom . This attribute allows the client to specify
 * the placement of page im ages on Finished-Page Images to mirror the
 * direction of the text on pages.
 *
 * @author peter
 */
public class PresentationDirectionNumberUp extends EnumSyntax implements PrintJobAttribute {

    public static final PresentationDirectionNumberUp TOBOTTOM_TOLEFT = new PresentationDirectionNumberUp(0),//[PWG5100.3]
	    TOBOTTOM_TORIGHT = new PresentationDirectionNumberUp(1),//[PWG5100.3]
	    TOLEFT_TOBOTTOM = new PresentationDirectionNumberUp(2),//[PWG5100.3]
	    TOLEFT_TOTOP = new PresentationDirectionNumberUp(3),//[PWG5100.3]
	    TORIGHT_TOBOTTOM = new PresentationDirectionNumberUp(4),//[PWG5100.3]
	    TORIGHT_TOTOP = new PresentationDirectionNumberUp(5),//[PWG5100.3]
	    TOTOP_TOLEFT = new PresentationDirectionNumberUp(6),//[PWG5100.3]
	    TOTOP_TORIGHT = new PresentationDirectionNumberUp(7);//[PWG5100.3]

    protected PresentationDirectionNumberUp(int i) {
	super(i);
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return PresentationDirectionNumberUp.class;
    }

    @Override
    public String getName() {
	return "presentation-direction-number-up";
    }

    @Override
    protected String[] getStringTable() {
	return new String[]{
	    "tobottom-toleft",
	    "tobottom-toright",
	    "toleft-tobottom",
	    "toleft-totop",
	    "toright-tobottom",
	    "toright-totop",
	    "totop-toleft",
	    "totop-toright",};
    }

    @Override
    protected EnumSyntax[] getEnumValueTable() {
	return new EnumSyntax[]{
	    TOBOTTOM_TOLEFT,
	    TOBOTTOM_TORIGHT,
	    TOLEFT_TOBOTTOM,
	    TOLEFT_TOTOP,
	    TORIGHT_TOBOTTOM,
	    TORIGHT_TOTOP,
	    TOTOP_TOLEFT,
	    TOTOP_TORIGHT,};
    }

}
