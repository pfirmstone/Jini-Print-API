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

import java.io.Serializable;
import javax.print.attribute.Attribute;
import javax.print.attribute.DocAttribute;
import javax.print.attribute.PrintJobAttribute;
import javax.print.attribute.PrintRequestAttribute;
import net.jini.print.attribute.BooleanSyntax;

/**
 * The Client MAY supply and the Printer MUST support this attribute. The value
 * 'true' indicates that total fidelity to Client-supplied Job Template
 * attributes and values is required; otherwise, the Printer MUST reject the
 * Print-Job request. The value 'false' indicates that a reasonable attempt to
 * print the Job is acceptable and the Printer MUST accept the Print-Job
 * request. If not supplied, the Printer assumes that the value is 'false'.
 * 
 * See: <a href="https://tools.ietf.org/html/rfc8011#appendix-C">RFC8011 Appendix C</a>
 *
 * @see javax.print.attribute.standard.PDLOverrideSupported
 * 
 * @author peter
 */
public class IPPAttributeFidelity extends BooleanSyntax implements DocAttribute, PrintRequestAttribute, PrintJobAttribute{

    public IPPAttributeFidelity(boolean fidelity) {
	super(fidelity);
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return IPPAttributeFidelity.class;
    }

    @Override
    public String getName() {
	return "ipp-attribute-fidelity";
    }

}
