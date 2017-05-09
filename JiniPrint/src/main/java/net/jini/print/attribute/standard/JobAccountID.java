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

import java.util.Locale;
import javax.print.attribute.Attribute;
import javax.print.attribute.PrintJobAttribute;
import javax.print.attribute.PrintRequestAttribute;
import javax.print.attribute.TextSyntax;

/**
 * The "job-account-id" attribute is a character string representing the account
 * associated with the job. The "job-account-id" attribute could be a customer
 * name, a sequence of digits referencing an internal billing number, or even a
 * credit card number. How the printer uses the "job-account-id" attribute is
 * implementation dependent. A zero-length value indicates that there is no
 * account name.z
 * 
 * //TODO should this be encrypted?
 *
 * @author peter
 */
public class JobAccountID extends TextSyntax implements PrintRequestAttribute, PrintJobAttribute {

    JobAccountID(String name, Locale locale) {
	super(name, locale);
    }

    /**
     * 
     * @return JobAccountID.class
     */
    @Override
    public Class<? extends Attribute> getCategory() {
	return JobAccountID.class;
    }

    /**
     * 
     * @return "job-account-id"
     */
    @Override
    public String getName() {
	return "job-account-id";
    }

}
