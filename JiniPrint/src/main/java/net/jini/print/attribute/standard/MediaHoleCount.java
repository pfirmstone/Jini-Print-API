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

import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import javax.print.attribute.IntegerSyntax;
import javax.print.attribute.Attribute;

/**
 * Class MediaHoleCount is an integer valued printing attribute class that
 * specifies the number of holes in the desired media. A value of 0 (zero)
 * indicates that no holes should be present in the media. An instance of class
 * MediaHoleCount is not placed directly into an attribute set; rather, it is
 * always stored in a field of a {@link Media Media} attribute, and the {@link
 * Media Media} attribute is placed into the attribute set.
 * <P>
 * <B>Support Requirements:</B> Support for media hole count is indicated along
 * with support for media as a whole. See class {@link Media Media} for further
 * information. For the MediaHoleCount category, the
 * <CODE>getSupportedAttributeValues()</CODE> capability method in interface
 * {@link net.jini.print.service.PrintService PrintService} returns an array of
 * zero or more MediaHoleCount objects which represents the union of the media
 * hole count values of the supported {@link Media Media} values. The
 * <CODE>getDefaultAttributeValue()</CODE> capability method returns the media
 * hole count value of the default {@link Media Media} attribute. The
 * <CODE>isAttributeValueSupported()</CODE> capability method returns true if
 * there is some supported {@link Media Media} attribute with the given media
 * hole count value.
 * <P>
 * <B>IPP Compatibility:</B> The integer value gives the IPP integer value. The
 * category name returned by <CODE>getName()</CODE> gives the IPP attribute
 * name.
 * </P>
 *
 */
public class MediaHoleCount extends IntegerSyntax implements Attribute {

    /**
     * Construct a new media hole count attribute with the given integer value.
     *
     * @param theValue Integer value.
     *
     * @exception IllegalArgumentException (Unchecked exception) Thrown if
     * <CODE>theValue</CODE> is less than 0.
     */
    public MediaHoleCount(int theValue) {
	super(check(theValue));
    }

    /**
     * Returns whether this media hole count attribute is equivalent to the
     * passed in object. To be equivalent, all of the following conditions must
     * be true:
     * <OL TYPE=1>
     * <LI>
     * <CODE>theObject</CODE> is not null.
     * <LI>
     * <CODE>theObject</CODE> is an instance of class MediaHoleCount.
     * <LI>
     * This media hole count attribute's value and <CODE>theObject</CODE>'s
     * value are equal.
     * </OL>
     *
     * @param theObject Object to compare to.
     *
     * @return True if <CODE>theObject</CODE> is equivalent to this media hole
     * count attribute, false otherwise.
     */
    @Override
    public boolean equals(Object theObject) {
	return super.equals(theObject) && theObject instanceof MediaHoleCount;
    }

    /**
     * Get the printing attribute class which is to be used as the "category"
     * for this printing attribute value when it is added to an attribute set or
     * included in a supported attribute entry in the service registration in
     * the Jini Lookup Service (JLUS).
     * <P>
     * For class MediaHoleCount and any vendor-defined subclasses, the category
     * is class MediaHoleCount itself.
     *
     * @return Printing attribute class (category), an instance of class
     * {@link java.lang.Class java.lang.Class}.
     */
    @Override
    public final Class<? extends Attribute> getCategory() {
	return MediaHoleCount.class;
    }

    /**
     * Get the name of the category of which this attribute value is an
     * instance.
     * <P>
     * For class MediaHoleCount and any vendor-defined subclasses, the category
     * name is <CODE>"media-hole-count"</CODE>.
     *
     * @return Attribute category name.
     */
    @Override
    public final String getName() {
	return "media-hole-count";
    }
    
    private static int check(int i){
	if ( i < 0 ) 
	    throw new IllegalArgumentException("integer must be positive");
	return i;
    }
    
    /**
     * IntegerSyntax can be de-serialized by AtomicMarshalInputStream, since it
     * only contains primitive fields, which are not seen as a threat for gadget
     * attacks, however this object still has invariants which need to
     * be checked. Implementing @AtomicSerial would make this class responsible
     * for managing serial form, while implementing readObject() would prevent
     * de-serialization with AtomicMarshalInputStream. As such readResolve is
     * the only option to validate input in this case, it is protected so that
     * all subclasses inherit it, to ensure it is also called for subclass
     * instances. It is final to ensure the validation check cannot be bypassed.
     *
     *
     * @serial Checks the value from the stream satisfies the same invariants as
     * our constructor.
     *
     * @return this
     * @throws ObjectStreamException
     */
    protected final Object readResolve() throws ObjectStreamException {
	try {
	    check(getValue());
	    validateInvariants();
	    return this;
	} catch (IllegalArgumentException e) {
	    throw new InvalidObjectException(e.getMessage());
	}
    }
    
    /**
     * Subclasses can override this method to have check their invariants during
     * de-serialization.
     * 
     * @throws ObjectStreamException 
     */
    protected void validateInvariants() throws ObjectStreamException {}

}
