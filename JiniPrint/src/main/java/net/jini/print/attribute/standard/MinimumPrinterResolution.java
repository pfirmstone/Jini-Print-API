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

import javax.print.attribute.ResolutionSyntax;
import javax.print.attribute.DocAttribute;
import javax.print.attribute.PrintRequestAttribute;
import javax.print.attribute.PrintJobAttribute;
import javax.print.attribute.standard.PrinterResolution;

/**
 * Class MinimumPrinterResolution is a printing attribute class that specifies a
 * minimum resolution to be used for a print job. Class MinimumPrinterResolution
 * is used in two ways:
 * <OL TYPE=1>
 * <LI>
 * When a client searches the JLUS looking for a printer that supports the
 * client's desired resolution or any higher resolution, the client specifies an
 * instance of class MinimumPrinterResolution indicating the minimum resolution
 * the client wants. Printers supporting that resolution or any higher
 * resolution will match the search.
 * 
 * <LI>
 * When a client needs to print a job using the client's desired resolution or
 * any higher resolution, the client specifies an instance of class
 * MinimumPrinterResolution as an attribute of the Print Job. This will succeed
 * unless the Print Job can only support lower resolutions.
 * </OL>
 *
 * There is also a way for a client to search the JLUS for a printer that
 * supports <I>exactly</I> the client's desired resolution, no more, no less.
 * Only printers supporting that exact resolution will match the search. See
 * class {@link PrinterResolution PrinterResolution} for further information.
 * 
 * <B>Support Requirements:</B> If a Jini Print Service instance supports the
 * {@link PrinterResolution PrinterResolution} attribute, it must also support
 * the MinimumPrinterResolution attribute. If a Jini Print Service instance
 * supports the PrinterResolution attribute, the supported PrinterResolution
 * values must be registered into the Jini Lookup Service (JLUS) as service
 * attributes (see package {@link net.jini.print.lookup net.jini.print.lookup}
 * for further information). Note that the JLUS cannot match on a
 * MinimumPrinterResolution attribute directly, rather the client's
 * MinimumPrinterResolution attribute and the JLUS's PrinterResolution attribute
 * must be matched on the client side (using the "less than or equals"
 * operation). For the PrinterResolution category, the
 * <CODE>getSupportedAttributeValues()</CODE> capability method in interface
 * {@link net.jini.print.service.PrintService PrintService} returns an array of
 * the supported PrinterResolution objects.
 * 
 * <B>IPP Compatibility:</B> The information needed to construct an IPP
 * <CODE>"printer-resolution"</CODE> attribute can be obtained by calling
 * methods on the MinimumPrinterResolution object. The category name returned by
 * <CODE>getName()</CODE> gives the IPP attribute name.
 * 
 */
public class MinimumPrinterResolution
	extends ResolutionSyntax
	implements DocAttribute, PrintRequestAttribute, PrintJobAttribute {

    /**
     * Value to indicate units of dots per inch (dpi). It is actually the
     * conversion factor by which to multiply dpi to yield dphi ({@link
     * javax.print.attribute.ResolutionSyntax#DPI
     * ResolutionSyntax.DPI}).
     */
    public static final int DPI = ResolutionSyntax.DPI;

    /**
     * Value to indicate units of dots per centimeter (dpcm). It is actually the
     * conversion factor by which to multiply dpcm to yield dphi ({@link
     * javax.print.attribute.ResolutionSyntax#DPCM
     * ResolutionSyntax.DPCM}).
     */
    public static final int DPCM = ResolutionSyntax.DPCM;

    /**
     * Construct a new minimum printer resolution attribute from the given
     * items.
     *
     * @param theCrossFeedResolution Cross feed direction resolution.
     * @param theFeedResolution Feed direction resolution.
     * @param theUnits Unit conversion factor, e.g. {@link #DPI
     * DPI} or {@link
     *     #DPCM DPCM}.
     *
     * @exception IllegalArgumentException (unchecked exception) Thrown if
     * <CODE>theCrossFeedResolution</CODE> < 1 or <CODE>theFeedResolution</CODE>
     * < 1 or <CODE>theUnits</CODE> < 1.
     */
    public MinimumPrinterResolution(int theCrossFeedResolution,
	    int theFeedResolution,
	    int theUnits) {
	super(theCrossFeedResolution, theFeedResolution, theUnits);
    }

    /**
     * Returns whether this minimum printer resolution attribute is equivalent
     * to the passed in object. To be equivalent, all of the following
     * conditions must be true:
     * <OL TYPE=1>
     * <LI>
     * <CODE>theObject</CODE> is not null.
     * <LI>
     * <CODE>theObject</CODE> is an instance of class MinimumPrinterResolution.
     * <LI>
     * This attribute's cross feed direction resolution is equal to
     * <CODE>theObject</CODE>'s cross feed direction resolution.
     * <LI>
     * This attribute's feed direction resolution is equal to
     * <CODE>theObject</CODE>'s feed direction resolution.
     * </OL>
     *
     * @param theObject Object to compare to.
     *
     * @return True if <CODE>theObject</CODE> is equivalent to this minimum
     * printer resolution attribute, false otherwise.
     */
    public boolean equals(Object theObject) {
	return super.equals(theObject)
		&& theObject instanceof MinimumPrinterResolution;
    }

    /**
     * Get the printing attribute class which is to be used as the "category"
     * for this printing attribute value when it is added to an attribute set or
     * included in a supported attribute entry in the service registration in
     * the Jini Lookup Service (JLUS).
     * 
     * For class MinimumPrinterResolution and any vendor-defined subclasses, the
     * category is class {@link PrinterResolution PrinterResolution}.
     *
     * @return Printing attribute class (category), an instance of class
     * {@link java.lang.Class java.lang.Class}.
     */
    @Override
    public final Class getCategory() {
	return PrinterResolution.class;
    }

    /**
     * Get the name of the category of which this attribute value is an
     * instance.
     * 
     * For class MinimumPrinterResolution and any vendor-defined subclasses, the
     * category name is <CODE>"printer-resolution"</CODE>.
     *
     * @return Attribute category name.
     */
    @Override
    public final String getName() {
	return "printer-resolution";
    }

}
