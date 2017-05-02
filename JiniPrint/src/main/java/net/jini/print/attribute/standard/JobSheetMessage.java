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
import javax.print.attribute.TextSyntax;

/**
 * This attribute is used to convey a message that is delivered with the job,
 * and may be printed on a job sheet (e.g., the 'standard' job sheet). The
 * message may contain any type of information, but typically includes either
 * instructions for offline processing (e.g., finishing), or a message for the
 * job recipient.
 *
 * @author peter
 */
public class JobSheetMessage extends TextSyntax implements Attribute {

    public JobSheetMessage(String message, Locale locale) {
	super(message, locale);
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return JobSheetMessage.class;
    }

    @Override
    public String getName() {
	return "job-sheet-message";
    }

}
