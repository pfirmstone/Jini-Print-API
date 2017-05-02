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
import javax.print.attribute.IntegerSyntax;
import javax.print.attribute.standard.MediaSizeName;
import static javax.print.attribute.standard.MediaSizeName.A;
import static javax.print.attribute.standard.MediaSizeName.B;
import static javax.print.attribute.standard.MediaSizeName.C;
import static javax.print.attribute.standard.MediaSizeName.D;
import static javax.print.attribute.standard.MediaSizeName.E;
import static javax.print.attribute.standard.MediaSizeName.EXECUTIVE;
import static javax.print.attribute.standard.MediaSizeName.FOLIO;
import static javax.print.attribute.standard.MediaSizeName.INVOICE;
import static javax.print.attribute.standard.MediaSizeName.ISO_A0;
import static javax.print.attribute.standard.MediaSizeName.ISO_A1;
import static javax.print.attribute.standard.MediaSizeName.ISO_A10;
import static javax.print.attribute.standard.MediaSizeName.ISO_A2;
import static javax.print.attribute.standard.MediaSizeName.ISO_A3;
import static javax.print.attribute.standard.MediaSizeName.ISO_A4;
import static javax.print.attribute.standard.MediaSizeName.ISO_A5;
import static javax.print.attribute.standard.MediaSizeName.ISO_A6;
import static javax.print.attribute.standard.MediaSizeName.ISO_A7;
import static javax.print.attribute.standard.MediaSizeName.ISO_A8;
import static javax.print.attribute.standard.MediaSizeName.ISO_A9;
import static javax.print.attribute.standard.MediaSizeName.ISO_B0;
import static javax.print.attribute.standard.MediaSizeName.ISO_B1;
import static javax.print.attribute.standard.MediaSizeName.ISO_B10;
import static javax.print.attribute.standard.MediaSizeName.ISO_B2;
import static javax.print.attribute.standard.MediaSizeName.ISO_B3;
import static javax.print.attribute.standard.MediaSizeName.ISO_B4;
import static javax.print.attribute.standard.MediaSizeName.ISO_B5;
import static javax.print.attribute.standard.MediaSizeName.ISO_B6;
import static javax.print.attribute.standard.MediaSizeName.ISO_B7;
import static javax.print.attribute.standard.MediaSizeName.ISO_B8;
import static javax.print.attribute.standard.MediaSizeName.ISO_B9;
import static javax.print.attribute.standard.MediaSizeName.ISO_C0;
import static javax.print.attribute.standard.MediaSizeName.ISO_C1;
import static javax.print.attribute.standard.MediaSizeName.ISO_C2;
import static javax.print.attribute.standard.MediaSizeName.ISO_C3;
import static javax.print.attribute.standard.MediaSizeName.ISO_C4;
import static javax.print.attribute.standard.MediaSizeName.ISO_C5;
import static javax.print.attribute.standard.MediaSizeName.ISO_C6;
import static javax.print.attribute.standard.MediaSizeName.ISO_DESIGNATED_LONG;
import static javax.print.attribute.standard.MediaSizeName.ITALY_ENVELOPE;
import static javax.print.attribute.standard.MediaSizeName.JAPANESE_DOUBLE_POSTCARD;
import static javax.print.attribute.standard.MediaSizeName.JAPANESE_POSTCARD;
import static javax.print.attribute.standard.MediaSizeName.JIS_B0;
import static javax.print.attribute.standard.MediaSizeName.JIS_B1;
import static javax.print.attribute.standard.MediaSizeName.JIS_B10;
import static javax.print.attribute.standard.MediaSizeName.JIS_B2;
import static javax.print.attribute.standard.MediaSizeName.JIS_B3;
import static javax.print.attribute.standard.MediaSizeName.JIS_B4;
import static javax.print.attribute.standard.MediaSizeName.JIS_B5;
import static javax.print.attribute.standard.MediaSizeName.JIS_B6;
import static javax.print.attribute.standard.MediaSizeName.JIS_B7;
import static javax.print.attribute.standard.MediaSizeName.JIS_B8;
import static javax.print.attribute.standard.MediaSizeName.JIS_B9;
import static javax.print.attribute.standard.MediaSizeName.LEDGER;
import static javax.print.attribute.standard.MediaSizeName.MONARCH_ENVELOPE;
import static javax.print.attribute.standard.MediaSizeName.NA_10X13_ENVELOPE;
import static javax.print.attribute.standard.MediaSizeName.NA_10X14_ENVELOPE;
import static javax.print.attribute.standard.MediaSizeName.NA_10X15_ENVELOPE;
import static javax.print.attribute.standard.MediaSizeName.NA_5X7;
import static javax.print.attribute.standard.MediaSizeName.NA_6X9_ENVELOPE;
import static javax.print.attribute.standard.MediaSizeName.NA_7X9_ENVELOPE;
import static javax.print.attribute.standard.MediaSizeName.NA_8X10;
import static javax.print.attribute.standard.MediaSizeName.NA_9X11_ENVELOPE;
import static javax.print.attribute.standard.MediaSizeName.NA_9X12_ENVELOPE;
import static javax.print.attribute.standard.MediaSizeName.NA_LEGAL;
import static javax.print.attribute.standard.MediaSizeName.NA_LETTER;
import static javax.print.attribute.standard.MediaSizeName.NA_NUMBER_10_ENVELOPE;
import static javax.print.attribute.standard.MediaSizeName.NA_NUMBER_11_ENVELOPE;
import static javax.print.attribute.standard.MediaSizeName.NA_NUMBER_12_ENVELOPE;
import static javax.print.attribute.standard.MediaSizeName.NA_NUMBER_14_ENVELOPE;
import static javax.print.attribute.standard.MediaSizeName.NA_NUMBER_9_ENVELOPE;
import static javax.print.attribute.standard.MediaSizeName.PERSONAL_ENVELOPE;
import static javax.print.attribute.standard.MediaSizeName.QUARTO;
import static javax.print.attribute.standard.MediaSizeName.TABLOID;
import net.jini.print.attribute.CollectionSyntax;
import net.jini.print.attribute.Dimension;
import net.jini.print.attribute.Dimension.UNIT;
import static net.jini.print.attribute.standard.MediaSizeName.ARCH_A;
import static net.jini.print.attribute.standard.MediaSizeName.ARCH_B;
import static net.jini.print.attribute.standard.MediaSizeName.ARCH_C;
import static net.jini.print.attribute.standard.MediaSizeName.ARCH_D;
import static net.jini.print.attribute.standard.MediaSizeName.ARCH_E;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_220x330;
import static net.jini.print.attribute.standard.MediaSizeName.ISO_A4_WIDE;
import static net.jini.print.attribute.standard.MediaSizeName.JP_REPLY_POSTCARD;
import static net.jini.print.attribute.standard.MediaSizeName.NA_LETTER_COVER;
import static net.jini.print.attribute.standard.MediaSizeName.NA_POSTCARD;
import static net.jini.print.attribute.standard.MediaSizeName.TAIWAN_815;

/**
 * PWG 5100.3-2001 IPP: Production Printing Attributes - Set1 Section 3.13.8
 * page 45.
 *
 * The "media-size" member attribute is a collection that explicitly specifies
 * the numerical media width and height dimensions. It is RECOMMENDED that a
 * client localize the collection values to the size names that users are
 * familiar with, such as 'letter' and ' A4', possibly also including the exact
 * dimensions as well (and in the units appropriate for the user's locale). If a
 * client does not recognize a pair of numbers as a named size, it can simply
 * display the two numbers instead. Thus the pair of size dimensions serve the
 * same function as keyword values, except that the client has an obvious
 * fallback display for an unrecognized pair, namely, the actual dimension
 * numbers.
 */
public class MediaSize extends CollectionSyntax implements Attribute {

    private static final MediaSizeName[] MEDIA_SIZE_NAMES = {
	ISO_A0,
	ISO_A1,
	ISO_A2,
	ISO_A3,
	ISO_A4,
	ISO_A5,
	ISO_A6,
	ISO_A7,
	ISO_A8,
	ISO_A9,
	ISO_A10,
	ISO_B0,
	ISO_B1,
	ISO_B2,
	ISO_B3,
	ISO_B4,
	ISO_B5,
	ISO_B6,
	ISO_B7,
	ISO_B8,
	ISO_B9,
	ISO_B10,
	JIS_B0,
	JIS_B1,
	JIS_B2,
	JIS_B3,
	JIS_B4,
	JIS_B5,
	JIS_B6,
	JIS_B7,
	JIS_B8,
	JIS_B9,
	JIS_B10,
	ISO_C0,
	ISO_C1,
	ISO_C2,
	ISO_C3,
	ISO_C4,
	ISO_C5,
	ISO_C6,
	NA_LETTER,
	NA_LEGAL,
	EXECUTIVE,
	LEDGER,
	TABLOID,
	INVOICE,
	FOLIO,
	QUARTO,
	JAPANESE_POSTCARD,
	JAPANESE_DOUBLE_POSTCARD,
	A,
	B,
	C,
	D,
	E,
	ISO_DESIGNATED_LONG,
	ITALY_ENVELOPE,
	MONARCH_ENVELOPE,
	PERSONAL_ENVELOPE,
	NA_NUMBER_9_ENVELOPE,
	NA_NUMBER_10_ENVELOPE,
	NA_NUMBER_11_ENVELOPE,
	NA_NUMBER_12_ENVELOPE,
	NA_NUMBER_14_ENVELOPE,
	NA_6X9_ENVELOPE,
	NA_7X9_ENVELOPE,
	NA_9X11_ENVELOPE,
	NA_9X12_ENVELOPE,
	NA_10X13_ENVELOPE,
	NA_10X14_ENVELOPE,
	NA_10X15_ENVELOPE,
	NA_5X7,
	NA_8X10,
	ISO_A4_WIDE,
	NA_LETTER_COVER,
	JP_REPLY_POSTCARD,
	NA_POSTCARD,
	TAIWAN_815,
	ISO_220x330,
	ARCH_A,
	ARCH_B,
	ARCH_C,
	ARCH_D,
	ARCH_E,
    };

    private static final MediaSize[] MEDIA_SIZE = {
	new MediaSize(841, 1189, UNIT.MM), //	ISO_A0,
	new MediaSize(594, 841, UNIT.MM), //	ISO_A1,
	new MediaSize(420, 594, UNIT.MM), //	ISO_A2,
	new MediaSize(297, 420, UNIT.MM), //	ISO_A3,
	new MediaSize(210, 297, UNIT.MM), //	ISO_A4,
	new MediaSize(148, 210, UNIT.MM), //	ISO_A5,
	new MediaSize(105, 148, UNIT.MM), //	ISO_A6,
	new MediaSize(74, 105, UNIT.MM), //	ISO_A7,
	new MediaSize(52, 74, UNIT.MM), //	ISO_A8,
	new MediaSize(37, 52, UNIT.MM), //	ISO_A9,
	new MediaSize(26, 37, UNIT.MM), //	ISO_A10,
	new MediaSize(1000, 1414, UNIT.MM), //	ISO_B0,
	new MediaSize(707, 1000, UNIT.MM), //	ISO_B1,
	new MediaSize(500, 707, UNIT.MM), //	ISO_B2,
	new MediaSize(353, 500, UNIT.MM), //	ISO_B3,
	new MediaSize(250, 353, UNIT.MM), //	ISO_B4,
	new MediaSize(176, 250, UNIT.MM), //	ISO_B5,
	new MediaSize(125, 176, UNIT.MM), //	ISO_B6,
	new MediaSize(88, 125, UNIT.MM), //	ISO_B7,
	new MediaSize(62, 88, UNIT.MM), //	ISO_B8,
	new MediaSize(44, 62, UNIT.MM), //	ISO_B9,
	new MediaSize(31, 44, UNIT.MM), //	ISO_B10,
	new MediaSize(1030, 1456, UNIT.MM), //	JIS_B0,
	new MediaSize(728, 1030, UNIT.MM), //	JIS_B1,
	new MediaSize(515, 728, UNIT.MM), //	JIS_B2,
	new MediaSize(364, 515, UNIT.MM), //	JIS_B3,
	new MediaSize(257, 364, UNIT.MM), //	JIS_B4,
	new MediaSize(182, 257, UNIT.MM), //	JIS_B5,
	new MediaSize(128, 182, UNIT.MM), //	JIS_B6,
	new MediaSize(91, 128, UNIT.MM), //	JIS_B7,
	new MediaSize(64, 91, UNIT.MM), //	JIS_B8,
	new MediaSize(45, 64, UNIT.MM), //	JIS_B9,
	new MediaSize(32, 45, UNIT.MM), //	JIS_B10,
	new MediaSize(917, 1297, UNIT.MM), //	ISO_C0,
	new MediaSize(648, 917, UNIT.MM), //	ISO_C1,
	new MediaSize(458, 648, UNIT.MM), //	ISO_C2,
	new MediaSize(324, 458, UNIT.MM), //	ISO_C3,
	new MediaSize(229, 324, UNIT.MM), //	ISO_C4,
	new MediaSize(162, 229, UNIT.MM), //	ISO_C5,
	new MediaSize(114, 162, UNIT.MM), //	ISO_C6,
	new MediaSize(8500, 11000, UNIT.THOU_INCH), //	NA_LETTER,
	new MediaSize(8500, 14000, UNIT.THOU_INCH), //	NA_LEGAL,
	new MediaSize(7250, 10500, UNIT.THOU_INCH), //	EXECUTIVE,
	new MediaSize(11000, 17000, UNIT.THOU_INCH), //	LEDGER,
	new MediaSize(11, 17, UNIT.INCH), //	TABLOID,
	new MediaSize(5500, 8500, UNIT.THOU_INCH), //	INVOICE,
	new MediaSize(8500, 13000, UNIT.THOU_INCH), //	FOLIO,
	new MediaSize(8500, 10830, UNIT.THOU_INCH), //	QUARTO,
	new MediaSize(100, 148, UNIT.MM), //	JAPANESE_POSTCARD,
	new MediaSize(148, 200, UNIT.MM), //	JAPANESE_DOUBLE_POSTCARD,
	new MediaSize(8500, 11000, UNIT.THOU_INCH), //	A,
	new MediaSize(11, 17, UNIT.INCH), //	B,
	new MediaSize(17, 22, UNIT.INCH), //	C,
	new MediaSize(22, 34, UNIT.INCH), //	D,
	new MediaSize(34, 44, UNIT.INCH), //	E,
	new MediaSize(110, 220, UNIT.MM), //	ISO_DESIGNATED_LONG,
	new MediaSize(110, 230, UNIT.MM), //	ITALY_ENVELOPE,
	new MediaSize(3870, 7500, UNIT.THOU_INCH), //	MONARCH_ENVELOPE,
	new MediaSize(3625, 6500, UNIT.THOU_INCH), //	PERSONAL_ENVELOPE,
	new MediaSize(3875, 8875, UNIT.THOU_INCH), //	NA_NUMBER_9_ENVELOPE,
	new MediaSize(4125, 9500, UNIT.THOU_INCH), //	NA_NUMBER_10_ENVELOPE,
	new MediaSize(4500, 10375, UNIT.THOU_INCH), //	NA_NUMBER_11_ENVELOPE,
	new MediaSize(4750, 11000, UNIT.THOU_INCH), //	NA_NUMBER_12_ENVELOPE,
	new MediaSize(5000, 11500, UNIT.THOU_INCH), //	NA_NUMBER_14_ENVELOPE,
	new MediaSize(6, 9, UNIT.INCH), //	NA_6X9_ENVELOPE,
	new MediaSize(7, 9, UNIT.INCH), //	NA_7X9_ENVELOPE,
	new MediaSize(9, 11, UNIT.INCH), //	NA_9X11_ENVELOPE,
	new MediaSize(9, 12, UNIT.INCH), //	NA_9X12_ENVELOPE,
	new MediaSize(10, 13, UNIT.INCH), //	NA_10X13_ENVELOPE,
	new MediaSize(10, 14, UNIT.INCH), //	NA_10X14_ENVELOPE,
	new MediaSize(10, 15, UNIT.INCH), //	NA_10X15_ENVELOPE,
	new MediaSize(5, 7, UNIT.INCH), //	NA_5X7,
	new MediaSize(8, 10, UNIT.INCH), //	NA_8X10,
	new MediaSize(223, 297, UNIT.MM), //	ISO_A4_WIDE,
	new MediaSize(9, 11, UNIT.INCH), //	NA_LETTER_COVER,
	new MediaSize(148, 200, UNIT.MM), //	JP_REPLY_POSTCARD,
	new MediaSize(4500, 6000, UNIT.THOU_INCH), //	NA_POSTCARD,
	new MediaSize(267, 388, UNIT.MM), //	TAIWAN-815,
	new MediaSize(220, 330, UNIT.MM), //	ISO_220x330,
	new MediaSize(9, 12, UNIT.INCH),    //	ARCH_A,
	new MediaSize(12, 18, UNIT.INCH),   //	ARCH_B,
	new MediaSize(18, 24, UNIT.INCH),   //	ARCH_C,
	new MediaSize(24, 36, UNIT.INCH),   //	ARCH_D,
	new MediaSize(36, 48, UNIT.INCH),   //	ARCH_E,
    };

    /**
     * Method to choose media size from standard names.
     *
     * @param name
     * @return
     */
    public static MediaSize getMediaSize(MediaSizeName name) {
	for (int i = 0, l = MEDIA_SIZE_NAMES.length; i < l; i++) {
	    if (name == MEDIA_SIZE_NAMES[i]) {
		return MEDIA_SIZE[i];
	    }
	}
	return null;
    }

    /**
     * @serialField Indicates the size of the media in hundredths of a
     * millimeter along the bottom edge of the media.
     */
    private final Attribute x;
    /**
     * @serialField Indicates the size of the media in hundredths of a
     * millimeter along the left edge of the media.
     */
    private final Attribute y;

    public MediaSize(int xDimension, int yDimension, UNIT unit) {
	x = new Xdimension(xDimension, unit);
	y = new Ydimension(yDimension, unit);
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return MediaSize.class;
    }

    @Override
    public String getName() {
	return "media-size";
    }

    @Override
    protected Attribute[] getAttributes() {
	return new Attribute[]{x, y};
    }

    /**
     * Indicates the size of the media in hundredths of a millimeter along the
     * bottom edge of the media.
     *
     * @return
     */
    public int getXdimension() {
	return ((IntegerSyntax) x).getValue();
    }

    /**
     * Indicates the size of the media in hundredths of a millimeter along the
     * left edge of the media.
     *
     * @return
     */
    public int getYdimension() {
	return ((IntegerSyntax) y).getValue();
    }

    /**
     * Indicates the size of the media in hundredths of a millimeter along the
     * bottom edge of the media.
     */
    public static class Xdimension extends Dimension implements Attribute {

	/**
	 * Creates a new Xdimension instance.
	 *
	 * @param x size of media in hundredths of a millimeter along the bottom
	 * edge of the media.
	 */
	Xdimension(int x, UNIT unit) {
	    super(x, unit);
	}

	@Override
	public Class<? extends Attribute> getCategory() {
	    return Xdimension.class;
	}

	@Override
	public String getName() {
	    return "x-dimension";
	}

    }

    /**
     * Indicates the size of the media in hundredths of a millimeter along the
     * left edge of the media.
     */
    public static class Ydimension extends Dimension implements Attribute {

	Ydimension(int y, UNIT unit) {
	    super(y, unit);
	}

	@Override
	public Class<? extends Attribute> getCategory() {
	    return Ydimension.class;
	}

	@Override
	public String getName() {
	    return "y-dimension";
	}

    }

}
