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

import java.util.Arrays;
import javax.print.attribute.Attribute;
import javax.print.attribute.DocAttribute;

/**
 *<p>
 * This attribute forces the identified Input-Pages (numbered 1 to n) to be
 * imaged on the front side of a sheet in the Finished Document. This attribute
 * is typically used to start a new chapter or section of a document. For each
 * identified Input-Page, if that page:
 *</p>
 * <ol>
 * <li>would have been imaged on the back side of a sheet in the Finished
 * Document, that back side is left blank and the page is imaged on the front
 * side of the next sheet in the Finished Document</li>
 * <li> Otherwise, the Printer prints the identified page as usual.
 * </li>
 * </ol>
 * <p>
 * Interaction between the “force-front-sided” and “number-up” attributes</p><p>
 * If the “number-up” attribute (see [RFC2911] section 4.2.9) is also supplied
 * and the specified page image would have been in the first position on the
 * front side of a sheet anyway, this attribute has no effect. Otherwise, the
 * Printer places the specified page image in the first position of the front
 * side of next sheet in the Finished Document and the intervening page
 * positions are left blank.,
 * </p>
 * 
 * @see javax.print.attribute.standard.NumberUp
 *
 * @author peter
 */
public class ForceFrontSide implements DocAttribute {

    private final int[] pages;

    public ForceFrontSide(int[] pages) {
	Arrays.sort(pages);
	this.pages = pages.clone();
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return ForceFrontSide.class;
    }

    @Override
    public String getName() {
	return "force-front-side";
    }

    public String getString() {
	StringBuilder b = new StringBuilder(pages.length * 3);
	for (int i = 0, l = pages.length; i < l; i++) {
	    b.append(pages[i]);
	    if (i < l - 1) {
		b.append(",");
	    }
	}
	return b.toString();
    }

}
