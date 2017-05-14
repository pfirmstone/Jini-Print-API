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
import javax.print.attribute.PrintRequestAttribute;
import net.jini.print.attribute.Dimension;

/**
 * <p>
 * This attribute causes each Finished-Page Image that would be placed on the
 * back side of a sheet of the Finished Document to be shifted in position with
 * respect to the media on which the Finished-Page Image is to be rendered. The
 * direction of shift MUST be along the y-axis of the Coordinate System (see
 * section 2.4) with respect to the medium. The sign of the value indicates the
 * direction of the shift. If the bind edge is along the x-axis, then bind edge
 * image shift can be accomplished by applying shifts of equal magnitude, and
 * opposite sign, to the "y-side1-image-shift" and "y-side2-image-shift"
 * attributes, respectively (assuming that the "sides" attribute is
 * 'two-sided-short-edge' or imposition has equivalent behavior).
 * </p><p>
 * See
 * <a
 * HREF="ftp://ftp.pwg.org/pub/pwg/candidates/cs-ippprodprint10-20010212-5100.3.pdf">
 * [PWG5100.3] Section 3.19</a> Image Shifting Attributes for more details on
 * how this attribute interacts with {@link javax.print.attribute.standard.NumberUp},
 * {@link javax.print.attribute.standard.Sides} and {@link ImpositionTemplate).
 * </p>
 */
public class Yside2ImageShift extends Dimension implements DocAttribute, PrintRequestAttribute {

    public Yside2ImageShift(int i, UNIT unit) {
	super(i, unit);
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return Yside2ImageShift.class;
    }

    @Override
    public String getName() {
	return "y-side2-image-shift";
    }

}
