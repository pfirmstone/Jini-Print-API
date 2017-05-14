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
 * This attribute causes the specified point of the Finished-Page Image to be
 * positioned at a specified location. One standard value causes the
 * Finished-Page Image to be centered along the y-axis on the media to which it
 * is applied. Two other standard values specify that the location is
 * co-incident with the specified edge of the printable area by moving the image
 * parallel to the y-axis on the media to which it is applied.
 *
 * See
 * <a
 * HREF="ftp://ftp.pwg.org/pub/pwg/candidates/cs-ippprodprint10-20010212-5100.3.pdf">
 * [PWG5100.3] Section 3.19</a> Image Shifting Attributes for more details on
 * how this attribute interacts with {@link javax.print.attribute.standard.NumberUp},
 * {@link javax.print.attribute.standard.Sides} and {@link ImpositionTemplate).
 */
public class YimagePosition extends EnumSyntax implements DocAttribute, PrintRequestAttribute {

    public static final YimagePosition NONE = new YimagePosition(0);
    public static final YimagePosition CENTRE = new YimagePosition(1);
    public static final YimagePosition TOP = new YimagePosition(2);
    public static final YimagePosition BOTTOM = new YimagePosition(3);

    YimagePosition(int i) {
	super(i);
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return YimagePosition.class;
    }

    @Override
    public String getName() {
	return "y-image-position";
    }

    @Override
    protected String[] getStringTable() {
	return new String[]{"none", "centre", "top", "bottom"};
    }

    /**
     * Returns the enumeration value table for class MediaBackCoating.
     *
     * @return the enumeration value table for class MediaBackCoating.
     */
    @Override
    protected EnumSyntax[] getEnumValueTable() {
	return new EnumSyntax[]{NONE, CENTRE, TOP, BOTTOM};
    }
}
