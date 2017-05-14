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
import javax.print.attribute.DocAttribute;
import javax.print.attribute.EnumSyntax;
import javax.print.attribute.PrintRequestAttribute;

/**
 * <p>
 * This attribute specifies the page order of the print-stream pages defined in
 * the document data. The "page-order-received" attribute does not provide any
 * direct processing instructions, it only provides information about the page
 * order so that the client can specify ordinal page numbers with respect to the
 * original source document, rather than having to take into account whether the
 * print stream pages are being sent "one to N" or "N to one".
 * </p><p>
 * The "page-order-received" attribute applies to all documents in a Job
 * Creation or Document Creation request. If a job consists of multiple
 * documents, and all of the documents are not in the same page order, either
 * '1-to-n-order' or 'reverse,' then inconsistent processing of other Job
 * Template attributes that depend on "page-order-received" may occur.
 * </p><p>
 * If the "page-order-received" attribute is not present in a Job Creation or
 * Document Creation request, then the printer SHOULD assume a value of
 * '1-to-n-order.'
 * </p>
 *
 * @see PageDelivery
 */
public class PageOrderReceived extends EnumSyntax implements DocAttribute, PrintRequestAttribute {

    public static final PageOrderReceived _1_TO_N_ORDER = new PageOrderReceived(0),//[PWG5100.3]
	    N_TO_1_ORDER = new PageOrderReceived(1);//[PWG5100.3]

    protected PageOrderReceived(int i) {
	super(i);
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return PageOrderReceived.class;
    }

    @Override
    public String getName() {
	return "page-order-received";
    }

    @Override
    protected String[] getStringTable() {
	return new String[]{
	    "1-to-n-order",
	    "n-to-1-order",};
    }

    @Override
    protected EnumSyntax[] getEnumValueTable() {
	return new EnumSyntax[]{
	    _1_TO_N_ORDER,
	    N_TO_1_ORDER,};
    }

}
