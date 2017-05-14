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

import java.util.Set;
import javax.print.attribute.Attribute;
import javax.print.attribute.SupportedValuesAttribute;
import net.jini.print.attribute.CollectionSyntax;
import net.jini.print.attribute.Dimension;
import net.jini.print.attribute.Dimension.UNIT;
import net.jini.print.attribute.OneSetOfSyntax;

/**
 * Indicates the sizes supported by the Printer. A requested media size
 * dimension matches a supported media dimension if it is within an
 * implementation-defined tolerance. For example, PostScript [redbook] specifies
 * a tolerance of 5 points (5/72 of an inch = 1.7 mm) of a supported dimension,
 * i.e., within 176 units of the value of the dimension.
 *
 * @see MediaSize
 */
public class MediaSizeSupported extends OneSetOfSyntax implements SupportedValuesAttribute {

    public MediaSizeSupported(Set<MediaSizeTolerances> supported) {
	super(supported);
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return MediaSizeSupported.class;
    }

    @Override
    public String getName() {
	return "media-size-supported";
    }

    public static class MediaSizeTolerances extends CollectionSyntax {

	private final ToleranceRange xtol;
	private final ToleranceRange ytol;

	public MediaSizeTolerances(XdimensionTolerance xtol, YdimensionTolerance ytol) {
	    this(notNull(xtol), notNull(ytol));
	}
	
	private static ToleranceRange notNull(ToleranceRange range){
	    if (range == null) throw new NullPointerException ("tolerance cannot be null");
	    return range;
	}
	
	private MediaSizeTolerances(ToleranceRange xtol, ToleranceRange ytol){
	    this.xtol = xtol;
	    this.ytol = ytol;
	}

	@Override
	protected Attribute[] getAttributes() {
	    return new Attribute[]{xtol, ytol};
	}
	
	public boolean supports(MediaSize size){
	    return xtol.within(size.getXdimension()) && ytol.within(size.getYdimension());
	}

    }

    /**
     * Indicates the size of the media in hundredths of a millimeter along the
     * bottom edge of the media. This is equivalent to 1/2540 th of an inch
     * resolution. The rangeOfInteger attribute syntax accommodated variable
     * size implementations, such as printers supporting adjustable input trays
     * and web printers. See section 2.4 regarding the coordinate system and
     * section 5.1 regarding user-define media sizes.
     */
    public static class XdimensionTolerance extends ToleranceRange {

	/**
	 *
	 * @param min
	 * @param max
	 * @param units
	 */
	public XdimensionTolerance(int min, int max, UNIT units) {
	    super(new Dim(min, units), new Dim(max, units));
	}

	public XdimensionTolerance(UNIT units, int value, int plusMinus) {
	    super(new Dim(value - plusMinus, units), new Dim(value + plusMinus, units));
	}

	public XdimensionTolerance(int dim, UNIT units) {
	    super(new Dim(dim, units), null);
	}

	/**
	 * 
	 * @return XdimensionTolerance.class
	 */
	@Override
	public Class<? extends Attribute> getCategory() {
	    return XdimensionTolerance.class;
	}

	/**
	 * 
	 * @return "x-dimension"
	 */
	@Override
	public String getName() {
	    return "x-dimension";
	}
    }

    /**
     * Indicates the size of the media in hundredths of a millimeter along the
     * left edge of the media. This is equivalent to 1/2540 th of an inch
     * resolution. The rangeOfInteger attribute syntax accommodated variable
     * size implementations, such as printers supporting adjustable input trays
     * and web printers. See section 2.4 regarding the coordinate system and
     * section 5.1 regarding user-defined media sizes.
     */
    public static class YdimensionTolerance extends ToleranceRange {

	public YdimensionTolerance(int min, int max, UNIT units) {
	    super(new Dim(min, units), new Dim(max, units));
	}

	public YdimensionTolerance(UNIT units, int value, int plusMinus) {
	    super(new Dim(value - plusMinus, units), new Dim(value + plusMinus, units));
	}

	public YdimensionTolerance(int dim, UNIT units) {
	    super(new Dim(dim, units), null);
	}

	/**
	 * 
	 * @return YdimensionTolerance.class
	 */
	@Override
	public Class<? extends Attribute> getCategory() {
	    return YdimensionTolerance.class;
	}

	/**
	 * 
	 * @return "y-dimension"
	 */
	@Override
	public String getName() {
	    return "y-dimension";
	}
    }

    private static class Dim extends Dimension {

	public Dim(int i, UNIT unit) {
	    super(i, unit);
	}

    }

    private static abstract class ToleranceRange implements Attribute {

	private final Dim min;
	private final Dim max;

	private ToleranceRange(Dim min, Dim max) {
	    this.min = min;
	    this.max = max;
	}
	
	boolean within(int value){
	    return (value > min.getValue()) && (value < max.getValue());
	}

	@Override
	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append(min);
	    if (max != null) {
		sb.append('-').append(max);
	    }
	    return sb.toString();
	}
    }

}
