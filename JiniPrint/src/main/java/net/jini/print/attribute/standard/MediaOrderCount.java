/*
 * Copyright (C) the original author or authors.
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

import javax.print.attribute.IntegerSyntax;
import javax.print.attribute.Attribute;

/**
 * <P>
 * Class MediaOrderCount is an integer valued printing attribute class that
 * indicates the number of sheets, within an ordered sequence of sheets, after
 * which the sequence begins to repeat. This is also sometimes called the
 * "modulus" of the ordered media. For example, third cut tab stock has an order
 * count of 3. If the media order count is 1, then the media is not ordered.
 * </P><P>
 * An instance of class MediaOrderCount is not placed directly into an attribute
 * set; rather, it is always stored in a field of a {@link Media Media}
 * attribute, and the {@link Media Media} attribute is placed into the attribute
 * set.
 * </P><P>
 * <B>Support Requirements:</B> Support for media order count is indicated along
 * with support for media as a whole. See class {@link Media Media} for further
 * information. For the MediaOrderCount category, the "media-order-count-supported"
 * gives the range supported, the
 * <CODE>getSupportedAttributeValues()</CODE> capability method in interface
 * {@link net.jini.print.service.PrintService PrintService} returns an array of
 * zero or more MediaOrderCount objects which represents the union of the media
 * order count values of the supported {@link Media Media} values. The
 * <CODE>getDefaultAttributeValue()</CODE> capability method returns the media
 * order count value of the default {@link Media Media} attribute. The
 * <CODE>isAttributeValueSupported()</CODE> capability method returns true if
 * there is some supported {@link Media Media} attribute with the given media
 * order count value.
 * </P><P>
 * <B>IPP Compatibility:</B> The integer value gives the IPP integer value. The
 * category name returned by <CODE>getName()</CODE> gives the IPP attribute
 * name.
 * </P>
 * <A HREF="http://ftp.pwg.org/pub/pwg/candidates/cs-ippprodprint10-20010212-5100.3.pdf>
 * IPP:Production Printing Attributes - Set 1 - 3.13.7</A>
 * 
 */
public class MediaOrderCount extends IntegerSyntax implements Attribute {

    /**
     * Construct a new media order count attribute with the given integer value.
     *
     * @param theValue Integer value.
     *
     * @exception IllegalArgumentException (Unchecked exception) Thrown if
     * <CODE>theValue</CODE> is less than 1.
     */
    public MediaOrderCount(int theValue) {
	super(theValue, 1, Integer.MAX_VALUE);
    }

    /**
     * Returns whether this media order count attribute is equivalent to the
     * passed in object. To be equivalent, all of the following conditions must
     * be true:
     * <OL TYPE=1>
     * <LI>
     * <CODE>theObject</CODE> is not null.
     * <LI>
     * <CODE>theObject</CODE> is an instance of class MediaOrderCount.
     * <LI>
     * This media order count attribute's value and <CODE>theObject</CODE>'s
     * value are equal.
     * </OL>
     *
     * @param theObject Object to compare to.
     *
     * @return True if <CODE>theObject</CODE> is equivalent to this media order
     * count attribute, false otherwise.
     */
    @Override
    public boolean equals(Object theObject) {
	return super.equals(theObject) && theObject instanceof MediaOrderCount;
    }

    /**
     * Get the printing attribute class which is to be used as the "category"
     * for this printing attribute value when it is added to an attribute set or
     * included in a supported attribute entry in the service registration in
     * the Jini Lookup Service (JLUS).
     * 
     * For class MediaOrderCount and any vendor-defined subclasses, the category
     * is class MediaOrderCount itself.
     *
     * @return Printing attribute class (category), an instance of class
     * {@link java.lang.Class java.lang.Class}.
     */
    @Override
    public final Class<? extends Attribute> getCategory() {
	return MediaOrderCount.class;
    }

    /**
     * Get the name of the category of which this attribute value is an
     * instance.
     * 
     * For class MediaOrderCount and any vendor-defined subclasses, the category
     * name is <CODE>"media-order-count"</CODE>.
     *
     * @return Attribute category name.
     */
    @Override
    public final String getName() {
	return "media-order-count";
    }

}
