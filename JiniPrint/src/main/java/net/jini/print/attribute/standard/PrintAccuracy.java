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
import javax.print.attribute.PrintRequestAttribute;
import net.jini.print.attribute.CollectionSyntax;

/**
 * This REQUIRED Job Template attribute specifies the requested general
 * positioning and feature accuracy for the Job. When enforcing attribute
 * fidelity ("ipp-attribute-fidelity" with a value of 'true'), Printers only
 * reject "print-accuracy" values that are smaller than the
 * "print-accuracy-supported" (section 8.3.21) value.
 * 
 * @see PrintAccuracy
 * @see IPPAttributeFidelity
 *
 * @author peter
 */
public class PrintAccuracy extends CollectionSyntax
	implements DocAttribute, PrintRequestAttribute {

    private final AccuracyUnits units;
    private final Xaccuracy xacc;
    private final Yaccuracy yacc;
    private final Zaccuracy zacc;

    /**
     * 
     * @param units
     * @param xacc
     * @param yacc
     * @param zacc 
     */
    public PrintAccuracy(
	    AccuracyUnits units,
	    Xaccuracy xacc,
	    Yaccuracy yacc,
	    Zaccuracy zacc
    ) {
	this.units = units;
	this.xacc = xacc;
	this.yacc = yacc;
	this.zacc = zacc;
    }

    @Override
    protected Attribute[] getAttributes() {
	return new Attribute[]{units, xacc, yacc, zacc};
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return PrintAccuracy.class;
    }

    @Override
    public String getName() {
	return "print-accuracy";
    }

}
