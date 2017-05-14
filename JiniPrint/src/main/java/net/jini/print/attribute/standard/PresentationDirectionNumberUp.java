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
import javax.print.attribute.DocAttribute;
import javax.print.attribute.EnumSyntax;
import javax.print.attribute.PrintRequestAttribute;

/**
 * <p>
 * This attribute specifies the order that the Printer places page images on a
 * Finished-Page Image with the "number-up" attribute. This attribute is
 * especially useful to control the presentation direction in languages or
 * multi-lingual documents that have more than one presentation direction, but
 * may be used with any language. For example of the former, in Japanese text on
 * pages can have a presentation direction that is either
 * top-to-bottom-right-to-left or left-to-right-top-to-bottom. For an example of
 * the latter, a mixed English and Hebrew document, text on pages can have a
 * presentation direction that is either left-to-right-top-to-bottom or
 * right-to-left-top-to-bottom. This attribute allows the client to specify the
 * placement of page images on Finished-Page Images to mirror the direction of
 * the text on pages.
 * </p><p>
 * Each keyword value that a client supplies for this attribute MUST be a value
 * of the “presentation-direction-number-up-supported (1setOf type2 keyword)”
 * attribute. Table 13 below shows the standard values. A Printer MUST support
 * at least one of value of Table 13. It MAY support any additional values from
 * Table 13.
 * </p><p>
 * Table 13 shows the 8 standard values for this attribute. The name of each
 * attribute value suggests the order of laying out page images on a
 * Finished-Page Image when a human reader is holding the sheet in the proper
 * orientation (i.e., oriented so text is oriented for normal reading). For each
 * ‘toxxx-toyyy’ value, the images are placed according to the ‘toxxx’
 * direction, and then according to the ‘toyyy’ direction, and the first image
 * is placed in the corner diagonally opposite the ‘xxx-yyy’ corner. For
 * example, 'toright-tobottom' starts in the upper-left corner (which is
 * diagonally opposite the ‘right-bottom’ corner). The images are placed from
 * left to right in a line, and the line progression is from top to bottom.
 * </p><p>
 * Table 13 has a separate column to show the order for each orientation. For
 * example, if the orientation is ‘landscape’, then the order of pages appears
 * to be the same as portrait if the viewer rotates the sheet 90 degrees
 * clockwise. Note: the coordinate system for this attribute is relative to the
 * orientation of the sheets, unlike other Job Template attributes, such as
 * “finishings”, “finishing-col”, and the image shifting attributes (see section
 * 3.19 of PWG 5100.3-2001 IPP: Production Printing Attributes - Set1) which are
 * absolute (i.e., as if the sheets were ‘portrait’ - see section 2.3). The
 * reason that this attribute has a relative coordinate system, is that the
 * client may not know what the orientation of the document actually is,
 * especially if the client did not generate the document.
 * </p><p>
 * The Printer determines the orientation in the following way:
 * </p>
 * <ol type=1>
 * <li>The value of the “orientation-requested” attribute is determined as
 * follows:
 * <ol type=a>
 * <li>If the client supplies the “orientation-requested” attribute, that
 * attribute specifies the orientation.</li>
 * <li>If the client doesn’t supply the “orientation-requested” attribute and
 * the Printer is able to determine the orientation by inspecting the document,
 * that is the orientation.</li>
 * <li>If the client doesn’t supply the “orientation-requested” attribute and
 * the Printer is not able to determine the orientation by inspecting the
 * document, the orientation is the value specified by the
 * “orientation-requested-default” Printer attribute.</li>
 * </ol>
 * </li>
 * <li>The value of orientation used by the “presentation-direction-number-up”
 * attribute for laying out pages on the Finished-Page Image is as follows:
 * <ol type=a>
 * <li>If the value of the “number-up” attribute is a power of 4, e.g. 1 and 4,
 * the value from step 1 is the value.</li>
 * <li>If the value of the “number-up” attribute is 2 times the power of 4, e.g.
 * 2 and 8, the value is:
 * <ol type=i>
 * <li>‘landscape’ if the value from step 1 is ‘portrait’</li>
 * <li>‘portrait’ if the value from step 1 is ‘landscape’</li>
 * <li>‘reverse-landscape’ if the value from step 1 is
 * ‘reverse-portrait’</li><li>‘reverse-portrait’ if the value from step 1 is
 * ‘reverse-landscape’</li>
 * </ol>
 * </li>
 * <li>If the value of “number-up” is any other value, e.g. 3, 6 or 12, the
 * value is IMPLEMENTATION DEFINED.</li>
 * </ol>
 * </li>
 * </ol>
 *
 * <p>
 * When a Printer lays out page images for a Finished-Page Image, the
 * “presentation-direction-number-up” attribute determines the order of laying
 * out each page and the frame of reference for that order is specified by the
 * orientation determined from the above algorithm. For example, if the value of
 * “presentation-direction-number-up” is ‘toright-tobottom’ (English order), the
 * Printer lays out 4 page images in the order of top-left, top-right,
 * bottom-left and bottom-right in the frame of reference specified by the
 * determined orientation. The top row of Table 13 shows this sample
 * presentation direction.
 * </p><p>
 * If the Printer supports the “page-order-received” attribute and the value of
 * the attribute is 'n-to-1-order', then the Printer MUST place the pages in
 * reverse order on each Finished-Page Image. For example, if the “number-up”
 * attribute has the value of 4, the first page of each Finished-Page Image is
 * placed in the position labeled “4” in Table 13. If a Printer knows the number
 * of pages in the document, it MUST treat the first Finished-Page Image as the
 * logical last Finished-Page Image and place the first page according to the
 * following formula:</p>
 * <div style="padding-left: 2em;">
 * <p>
 * P = ((N-1) mod n) + 1
 * </p><p>
 * Where P is the number of pages on the logical last Finished-Page Image (first
 * Finished-Page Image printed).
 * </p><p>
 * Where N is the number of pages in the document
 * </p><p>
 * Where n is the value of the “number-up” attribute
 * </p><p>
 * On the logical last Finished-Page Image (first Finished-Page Image printed),
 * the Printer MUST put the first page at position ‘P’ on the Finished-Page
 * Image.
 * </p>
 * </div>
 * <p>
 * A pictorial representation of each "presentation-direction-number-up" value
 * for a "number-up" value of 4 and the orientation as shown below:</p>
 * 
 * <IMG SRC="../../doc-files/PresentationDirectionNumberUp.gif" ALT="table 13">
 *
 * @see javax.print.attribute.standard.Finishings
 * @see FinishingsSet
 * @see FinishingsCol
 * @see javax.print.attribute.standard.NumberUp
 * @see XimagePosition
 * @see XimageShift
 * @see Xside1ImageShift
 * @see Xside2ImageShift
 * @see YimagePosition
 * @see YimageShift
 * @see Yside1ImageShift
 * @see Yside2ImageShift
 * @see PresentationDirectionNumberUpSupported
 */
public class PresentationDirectionNumberUp extends EnumSyntax implements PrintRequestAttribute, DocAttribute {

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

    /**
     * 
     * @return PresentationDirectionNumberUp.class
     */
    @Override
    public Class<? extends Attribute> getCategory() {
	return PresentationDirectionNumberUp.class;
    }

    /**
     * 
     * @return "presentation-direction-number-up"
     */
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
