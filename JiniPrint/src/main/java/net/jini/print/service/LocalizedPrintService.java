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
package net.jini.print.service;

import java.io.IOException;
import java.util.Locale;
import javax.print.DocFlavor;
import javax.print.attribute.Attribute;

/**
 * <P>
 * Interface LocalizedPrintService specifies the capability for determining
 * localized versions of print data formats, printing attribute categories, and
 * printing attribute values. Interface LocalizedPrintService represents an
 * optional capability that a Jini Print Service instance need not provide. If
 * this capability is provided, the Jini Print Service proxy object will
 * implement interface LocalizedPrintService.
 * <P>
 * Each of the <CODE>localize()</CODE> methods uses the following algorithm to
 * determine the locale to use, given the locale the caller specified and the
 * locales the printer supports. (This is similar to the algorithm class
 * <CODE>java.util.ResourceBundle</CODE> uses.)
 * <OL TYPE=1>
 * <LI>
 * If the caller specified the locale
 * <CODE>"<I>Language_Country_Variant</I>"</CODE>:
 * <OL TYPE=a>
 * <LI>
 * If the printer supports the locale
 * <CODE>"<I>Language_Country_Variant</I>"</CODE>, then the printer uses that
 * locale.
 * <LI>
 * Else if the printer supports the locale
 * <CODE>"<I>Language_Country</I>"</CODE>, then the printer uses that locale.
 * <LI>
 * Else if the printer supports the locale <CODE>"<I>Language</I>"</CODE>, then
 * the printer uses that locale.
 * <LI>
 * Else the printer uses the printer's default locale.
 * </OL>
 * <LI>
 * Else if the caller specified the locale
 * <CODE>"<I>Language_Country</I>"</CODE>:
 * <OL TYPE=a>
 * <LI>
 * If the printer supports the locale <CODE>"<I>Language_Country</I>"</CODE>,
 * then the printer uses that locale.
 * <LI>
 * Else if the printer supports the locale <CODE>"<I>Language</I>"</CODE>, then
 * the printer uses that locale.
 * <LI>
 * Else the printer uses the printer's default locale.
 * </OL>
 * <LI>
 * Else if the caller specified the locale <CODE>"<I>Language</I>"</CODE>:
 * <OL TYPE=a>
 * <LI>
 * If the printer supports the locale <CODE>"<I>Language</I>"</CODE>, then the
 * printer uses that locale.
 * <LI>
 * Else the printer uses the printer's default locale.
 * </OL>
 * <LI>
 * Else (the caller specified a null locale or a locale other than one of the
 * above forms) the printer uses the printer's default locale.
 * </OL>
 * <P>
 * If the printer supports the locale
 * <CODE>"<I>Language_Country_Variant</I>"</CODE>, then the printer must also
 * support the locale <CODE>"<I>Language_Country</I>"</CODE>. If the printer
 * supports the locale <CODE>"<I>Language_Country</I>"</CODE>, then the printer
 * must also support the locale <CODE>"<I>Language</I>"</CODE>. The printer must
 * always support some default locale. Interface LocalizedPrintService provides
 * <B>capability methods</B> that let the client discover the specific locales
 * for which the printer can provide localized strings as well as the default
 * locale. In addition, for each locale it supports the printer includes a
 * service attribute of class <A
 * HREF="../../../../net/jini/print/lookup/LocaleEntry.html"><CODE>LocaleEntry</CODE></A>
 * in its service registration in the Jini Lookup Service (JLUS).
 * <P>
 * There is no restriction on the number of client threads that may be
 * simultaneously accessing the same Print Service. Therefore, all
 * implementations of interface <A
 * HREF="../../../../net/jini/print/service/PrintService.html"><CODE>PrintService</CODE></A>
 * and its subinterfaces must be designed to be multiple thread safe.
 * <P>
 * Interface LocalizedPrintService's methods all throw <A
 * HREF="file:///C:/jdk1.2.2/docs/api/java/rmi/RemoteException.html"><CODE>RemoteException</CODE></A>
 * to provide for the possibility that the Print Service object's implementation
 * performs remote method calls. The Print Service object's implementation in
 * fact may or may not perform remote method calls.
 * <P>
 */
public interface LocalizedPrintService extends PrintService {

    /**
     * Returns a localized string for the given print data format in the given
     * locale. A print data format is designated by a "doc flavor" (class
     * DocFlavor) consisting of a MIME type plus a print data representation
     * class. The returned string is a localized version of just the MIME type.
     *
     * If this Print Service does not support the given locale, it will instead
     * use a supported locale that best matches the given locale as described
     * above.
     *
     * @param theFlavor Doc flavor to localize.
     * @param theLocale Locale to use, or null to use this Print Service's
     * default locale.
     * @return Localized string for theFlavor in theLocale.
     * @throws IOException Thrown if a remote error occurred.
     * @throws NullPointerException (unchecked exception) Thrown if theFlavor is
     * null.
     */
    public String localize(DocFlavor theFlavor,
	    Locale theLocale)
	    throws IOException;

    /**
     * Returns a localized string for the given printing attribute category in
     * the given locale. A printing attribute category is designated by a Class
     * that implements interface Attribute.
     *
     * If this Print Service does not support the given locale, it will instead
     * use a supported locale that best matches the given locale as described
     * above.
     *
     * @param theCategory Printing attribute category to localize. It must be a
     * Class that implements interface Attribute.
     * @param theLocale Locale to use, or null to use this Print Service's
     * default locale.
     * @return Localized string for theCategory in theLocale.
     * @throws IOException Thrown if a remote error occurred.
     * @throws NullPointerException (unchecked exception) Thrown if theCategory
     * is null.
     * @throws IllegalArgumentException (unchecked exception) Thrown if
     * theCategory is not a Class that implements interface Attribute.
     */
    public String localize(Class theCategory,
	    Locale theLocale)
	    throws IOException;

    /**
     * Returns a localized string for the given printing attribute value in the
     * given locale. A printing attribute value is an instance of a class that
     * implements interface Attribute.
     *
     * If this Print Service does not support the given locale, it will instead
     * use a supported locale that best matches the given locale as described
     * above.
     *
     * If theValue is an instance of the TextSyntax abstract syntax class, then
     * theValue already is a localized string in some locale. In this case the
     * localize() method just returns the attribute's text string; the
     * localize() method does not try to translate the text string from the text
     * string's own language to theLocale's language.
     *
     * @param theValue Printing attribute value to localize.
     * @param theLocale Locale to use, or null to use this Print Service's
     * default locale.
     * @return Localized string for theValue in theLocale.
     * @throws IOException Thrown if a remote error occurred.
     * @throws NullPointerException (unchecked exception) Thrown if theValue is
     * null.
     */
    public String localize(Attribute theValue,
	    Locale theLocale)
	    throws IOException;

    /**
     * Determine the locales this Print Service supports.
     *
     * @return Array of the supported locales.
     * @throws IOException Thrown if a remote error occurred.
     */
    public Locale[] getSupportedLocales()
	    throws IOException;

    /**
     * Determine whether this Print Service supports the given locale.
     *
     * @param theLocale Locale to test.
     * @return True if this Print Service supports theLocale, false if it
     * doesn't.
     * @throws IOException Thrown if a remote error occurred.
     * @throws NullPointerException (unchecked exception) Thrown if theLocale is
     * null.
     */
    public boolean isLocaleSupported(Locale theLocale)
	    throws IOException;

    /**
     * Determine this Print Service's default locale.
     *
     * @return Default locale.
     * @throws IOException Thrown if a remote error occurred.
     */
    public Locale getDefaultLocale()
	    throws IOException;

}
