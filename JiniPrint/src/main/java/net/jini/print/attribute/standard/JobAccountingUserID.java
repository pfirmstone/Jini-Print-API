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
 * The "job-accounting-user-id" attribute specifies the user ID associated with
 * the account specified by the "job-account-id" attribute (see section 3.6)
 * used for this job. These two attributes are used for authentication and
 * account tracking either by a mechanism internal to the printer, or by
 * tracking software external to the printer such as Equitrac. Account tracking
 * systems will usually support a job account ID as having multiple job
 * accounting user IDs, as well as, a job accounting user ID to be used with
 * multiple job account IDs. It is allowable for value of the
 * "job-originating-user-name" (see RFC 2911 section 4.3.6) to be the same as
 * the "job-accounting-user-id". A zero-length value indicates that there is no
 * user accounting ID.
 *
 * @author peter
 */
public class JobAccountingUserID extends TextSyntax
	implements PrintRequestAttribute, PrintJobAttribute {

    public JobAccountingUserID(String name, Locale locale) {
	super(name, locale);
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return JobAccountingUserID.class;
    }

    @Override
    public String getName() {
	return "job-accounting-user-id";
    }

}
