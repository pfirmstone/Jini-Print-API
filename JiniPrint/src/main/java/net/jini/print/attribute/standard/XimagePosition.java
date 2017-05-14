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
 * This attribute causes the specified point of the Finished-Page Image to be
 * positioned at a specified location. One standard value causes the
 * Finished-Page Image to be centered along the x-axis on the media to which it
 * is applied. Two other standard values specify that the location is
 * co-incident with the specified edge of the printable area by moving the image
 * parallel to the x-axis on the media to which it is applied.
 * </p><p>
 * Note: the ‘center’ value is centered with respect to the physical edges of
 * the medium rather than the printable area of it because the printable area
 * may have different left and right margins. If this specification defined two
 * separate attributes, one for values that are medium-relative and one for
 * values that are relative to printable area, the rules for defaulting would be
 * too complicated.
 * </p>
 * See 
 * <a HREF="ftp://ftp.pwg.org/pub/pwg/candidates/cs-ippprodprint10-20010212-5100.3.pdf">
 * [PWG5100.3] Section 3.19</a> Image Shifting Attributes for more details on
 * how this attribute interacts with {@link javax.print.attribute.standard.NumberUp}, 
 * {@link javax.print.attribute.standard.Sides} and {@link ImpositionTemplate).
 */
public class XimagePosition extends EnumSyntax implements DocAttribute, PrintRequestAttribute {

    public static final XimagePosition NONE = new XimagePosition(0);
    public static final XimagePosition CENTRE = new XimagePosition(1);
    public static final XimagePosition LEFT = new XimagePosition(2);
    public static final XimagePosition RIGHT = new XimagePosition(3);

    protected XimagePosition(int i) {
	super(i);
    }

    /**
     *
     * @return XimagePosition.class
     */
    @Override
    public Class<? extends Attribute> getCategory() {
	return XimagePosition.class;
    }

    /**
     * 
     * @return "x-image-position"
     */
    @Override
    public String getName() {
	return "x-image-position";
    }

    @Override
    protected String[] getStringTable() {
	return new String[]{"none", "centre", "left", "right"};
    }

    /**
     * Returns the enumeration value table for class MediaBackCoating.
     *
     * @return the enumeration value table for class MediaBackCoating.
     */
    @Override
    protected EnumSyntax[] getEnumValueTable() {
	return new EnumSyntax[]{NONE, CENTRE, LEFT, RIGHT};
    }
}
