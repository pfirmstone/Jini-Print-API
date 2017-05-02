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
import javax.print.attribute.EnumSyntax;
import javax.print.attribute.PrintJobAttribute;

/**
 *
 * @author peter
 */
public class PageDelivery extends EnumSyntax implements PrintJobAttribute {
    
    public static final PageDelivery SAME_ORDER_FACE_UP = new PageDelivery(0);
    public static final PageDelivery SAME_ORDER_FACE_DOWN = new PageDelivery(1);
    public static final PageDelivery REVERSE_ORDER_FACE_UP = new PageDelivery(2);
    public static final PageDelivery REVERSE_ORDER_FACE_DOWN = new PageDelivery(3);
    public static final PageDelivery SYSTEM_SPECIFIED = new PageDelivery(4);
    
    PageDelivery(int i){
	super(i);
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return PageDelivery.class;
    }

    @Override
    public String getName() {
	return "page-delivery";
    }
    
     @Override
    protected String[] getStringTable() {
	return new String[]{
	    "same-order-face-up",
	    "same-order-face-down",
	    "reverse-order-face-up",
	    "reverse-order-face-down",
	    "system-specified", 
	};
    }

    @Override
    protected EnumSyntax[] getEnumValueTable() {
	return new EnumSyntax[]{
	    SAME_ORDER_FACE_UP,
	    SAME_ORDER_FACE_DOWN,
	    REVERSE_ORDER_FACE_UP,
	    REVERSE_ORDER_FACE_DOWN,
	    SYSTEM_SPECIFIED,
	};
    }
    
}
