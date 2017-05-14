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

/**
 * <h1>"finishing-template"</h1>
 * <h2>PWG5100.1 2014 IPP Finishings 2.0</h2>
 * <p>
 * The REQUIRED "finishing-template" member attribute (originally defined in
 * section 3.2.1 of [PWG5100.3]) specifies the particular finishing process
 * using either one of the standard IANA - registered "finishings" keywords or
 * an implementation or site defined name .
 * </p><p>
 * Specifying only the "finishing -
 * template" member attribute with no other member attributes results in the
 * default values for those member attributes. In addition to t he registered
 * "finishings" value keywords , this specification also defines keywords for
 * each JDF @FoldCatalog [JDF1.5] value of the form 'jdf-fN-N'. For example, the
 * JDF @FoldCatalog value 'F8-6' (a three fold instruction similar to
 * 'fold-parallel') would be specified using a "finishing-template" value of
 * 'jdf-f8-6'. Vendor extensions, as expressed using the vendor - unique enum
 * values for the "finishings" Job Template attribute, SHOULD use unique keyword
 * values to allow Clients to localize them using the language - specific
 * strings file referenced by the "printer-strings-uri" Printer attribute [PW
 * G5100.13]. Vendor unique keywords SHOULD begin with a reverse - DNS
 * identifier prefix , f or example a vendor whose domain is "example.com" uses
 * keyword values starting with "com.example-".
 *</p>
 * <h2>PWG5100.3 Section 3.2.1 "finishing-template"</h2>
 * <p>
 * The "finishing-template" member attribute contains a string value that
 * specifies some particular finishing operation. The value MAY be a list of
 * parameters used by some implementation defined finishing software or
 * finishing device, e.g. a thir d party finisher. Alternatively, the value MAY
 * be the name of a file containing finishing parameters. The
 * "finishing-template-supported" (1setOf name(MAX )) Printer attribute
 * identifies the values of this "finishing-template" member attribute that the
 * Printer supports, i.e., the implementation-specific parameter values
 * supported.
 * </p>
 * <h2>CIP4 JDF Specification 1.5</h2>
 * Folding finishing templates as defined in FoldCatalog
 * <a
 * href="https://confluence.cip4.org/download/attachments/1376343/CIP4%20JDF%20Specification%201.5.pdf?api=v2">
 * CIP4 JDF Specification 1.5</a>
 *
 * Description of the type of fold that will be applied to all printed Sheets
 * according to the folding catalog in Figure 8-30, “Fold catalog part 1,” on
 * page 531 and Figure 8-31, “Fold catalog part 2,” on page 532. Value format
 * is: "Fn-i" where “n” is the number of finished pages and “i” is either an
 * integer, which identifies a particular fold or the letter "X", which
 * identifies a generic fold (e.g., "F6-2" describes a Z-fold of 6 finished
 * pages, and "F6-X" describes a generic fold with 6 finished pages).
 * <h2>IANA Registered Finishings - inclusive of all above</h2>
 * 
 * <a href="https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xhtml">
 * IANA IPP Registrations</a>
 * 
 * @see FinishingsCol
 */
public interface FinishingTemplate extends Attribute {

    @Override
    public default Class<? extends Attribute> getCategory() {
	return FinishingTemplate.class;
    }

    @Override
    public default String getName() {
	return "finishing-template";
    }

}
