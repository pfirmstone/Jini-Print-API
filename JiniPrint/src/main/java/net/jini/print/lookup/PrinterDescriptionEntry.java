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
package net.jini.print.lookup;

import javax.print.attribute.standard.ColorSupported;
import javax.print.attribute.standard.PagesPerMinute;
import javax.print.attribute.standard.PagesPerMinuteColor;
import javax.print.attribute.standard.PrinterInfo;
import javax.print.attribute.standard.PrinterLocation;
import javax.print.attribute.standard.PrinterMakeAndModel;
import javax.print.attribute.standard.PrinterMoreInfo;
import javax.print.attribute.standard.PrinterMoreInfoManufacturer;
import javax.print.attribute.standard.PrinterName;
import net.jini.print.attribute.standard.PDLOverrideSupported;

/**
 * <P>
 * Class PrinterDescriptionEntry is a Jini service attribute a Jini Print
 * Service instance includes in its service registration in the Jini Lookup
 * Service (JLUS) to advertise general information about the printer. Clients
 * can then specify this information when they search the JLUS for Jini Print
 * Service instances.
 * </P><P>
 * A printer description entry consists of the following fields containing
 * printer description attributes.
 * </P>
 * <UL>
 * <LI> {@link PrinterName}
 * <LI> {@link PrinterLocation}
 * <LI> {@link PrinterInfo}
 * <LI> {@link PrinterMoreInfo}
 * <LI> {@link PrinterMakeAndModel}
 * <LI> {@link PrinterMoreInfoManufacturer}
 * <LI> {@link ColorSupported}
 * <LI> {@link PDLOverrideSupported}
 * <LI> {@link PagesPerMinute}
 * <LI> {@link PagesPerMinuteColor}
 * </UL>
 * <P>
 * In a printer description entry stored in a service registration in the JLUS,
 * the {@link PrinterName} and {@link PDLOverrideSupported} fields are mandatory
 * and must always be set to non-null values. The remaining fields are optional
 * and may be set to null to indicate "not specified." However, if the
 * {@link PagesPerMinuteColor} field is set to a non-null value, the
 * {@link ColorSupported} field must be set to a value of SUPPORTED.
 * </P><P>
 * As usual, when used to search the JLUS for matching printers, any printer
 * description entry field may be set to null to match any value (wildcard) or
 * may be set to a non-null value to match that attribute value.
 * </P><P>
 * The above printer description attributes can also appear in a Jini Print
 * Service instance's attribute set returned by the
 * {@link net.jini.PrintService#getAttributes} method. Thus, a client can
 * discover these information items either by querying the Print Service object
 * or by examining the service registration in the JLUS. The above attributes
 * rarely if ever change their values and hence are suitable to be included in
 * the JLUS service registration. (If an administrator reconfigures the printer,
 * these attributes might change.) The Print Service's attribute set includes
 * additional printer description attributes whose values change dynamically as
 * the printer operates; such attributes are not included in the printer
 * description entry in the JLUS service registration.
 * </P><P>
 * The items included in a PrinterDescriptionEntry are not printing attributes
 * the client can specify when setting up a print job. Support for
 * client-specifiable printing attributes is indicated using
 * {@link AttributeEntry} and {@link MediaEntry}.
 * </P>
 */
public class PrinterDescriptionEntry {

    /**
     * Printer name, or null if not specified or wildcarded.
     */
    public PrinterName printerName;
    /**
     * Printer location, or null if not specified or wildcarded.
     */
    public PrinterLocation printerLocation;
    /**
     * Printer info, or null if not specified or wildcarded.
     */
    public PrinterInfo printerInfo;
    /**
     * Printer more info, or null if not specified or wildcarded.
     */
    public PrinterMoreInfo printerMoreInfo;
    /**
     * Printer make and model, or null if not specified or wildcarded.
     */
    public PrinterMakeAndModel printerMakeAndModel;
    /**
     * Printer more info manufacturer, or null if not specified or wildcarded.
     */
    public PrinterMoreInfoManufacturer printerMoreInfoManufacturer;
    /**
     * Color supported, or null if not specified or wildcarded.
     */
    public ColorSupported colorSupported;
    /**
     * PDL override supported, or null if not specified or wildcarded.
     */
    public PDLOverrideSupported pdlOverrideSupported;
    /**
     * Pages per minute, or null if not specified or wildcarded.
     */
    public PagesPerMinute pagesPerMinute;
    /**
     * Pages per minute color, or null if not specified or wildcarded.
     */
    public PagesPerMinuteColor pagesPerMinuteColor;

    /**
     * Constructs a new printer description entry with all fields null
     * (unspecified or wildcarded).
     */
    public PrinterDescriptionEntry() {
    }

    /**
     * Constructs a new printer description entry with the given printer
     * description attribute values. Any argument may be null to leave the
     * corresponding field unspecified (wildcarded).
     *
     * @param printerName Printer name, or null if not specified or wildcarded.
     * @param printerLocation Printer location, or null if not specified or
     * wildcarded.
     * @param printerInfo Printer info, or null if not specified or wildcarded.
     * @param printerMoreInfo Printer more info, or null if not specified or
     * wildcarded.
     * @param printerMakeAndModel Printer make and model, or null if not
     * specified or wildcarded.
     * @param printerMoreInfoManufacturer Printer more info manufacturer, or
     * null if not specified or wildcarded.
     * @param colorSupported Color supported, or null if not specified or
     * wildcarded.
     * @param pdlOverrideSupported PDL override supported, or null if not
     * specified or wildcarded.
     * @param pagesPerMinute Pages per minute, or null if not specified or
     * wildcarded.
     * @param pagesPerMinuteColor Pages per minute color, or null if not
     * specified or wildcarded.
     */
    public PrinterDescriptionEntry(PrinterName printerName,
	    PrinterLocation printerLocation,
	    PrinterInfo printerInfo,
	    PrinterMoreInfo printerMoreInfo,
	    PrinterMakeAndModel printerMakeAndModel,
	    PrinterMoreInfoManufacturer printerMoreInfoManufacturer,
	    ColorSupported colorSupported,
	    PDLOverrideSupported pdlOverrideSupported,
	    PagesPerMinute pagesPerMinute,
	    PagesPerMinuteColor pagesPerMinuteColor) {
	this.printerName = printerName;
	this.printerLocation = printerLocation;
	this.printerInfo = printerInfo;
	this.printerMoreInfo = printerMoreInfo;
	this.printerMakeAndModel = printerMakeAndModel;
	this.printerMoreInfoManufacturer = printerMoreInfoManufacturer;
	this.colorSupported = colorSupported;
	this.pdlOverrideSupported = pdlOverrideSupported;
	this.pagesPerMinute = pagesPerMinute;
	this.pagesPerMinuteColor = pagesPerMinuteColor;
    }

}
