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
 *
 * This attribute carries a message from the user to the operator to indicate
 * something about the processing of the print job. A zero length text value
 * indicates no message. Note: this attribute may be used in conjunction with
 * the IPP "job-hold-until" Job Template attribute (see [RFC2911] section
 * 4.2.2); specifically with the 'indefinite' value. This combination allows a
 * client to specify instructions to the operator, while simultaneously
 * preventing the job from being processed until some operator intervention
 * occurs. This combination is particularly useful in production printing
 * environments, where printer configuration may be required to properly print
 * the job.
 * 
 * @see javax.print.attribute.standard.JobHoldUntil;
 *
 * @author peter
 */
public class JobMessageToOperator extends TextSyntax implements PrintJobAttribute, PrintRequestAttribute {

    JobMessageToOperator(String message, Locale locale) {
	super(message, locale);
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return JobMessageToOperator.class;
    }

    @Override
    public String getName() {
	return "job-message-to-operator";
    }
}
