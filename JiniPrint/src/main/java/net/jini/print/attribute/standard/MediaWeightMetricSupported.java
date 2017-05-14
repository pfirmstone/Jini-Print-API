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
import javax.print.attribute.SetOfIntegerSyntax;
import javax.print.attribute.SupportedValuesAttribute;

/**
 * The "media-weight-metric-supported" (1setOf rangeOfInteger(1:MAX)) Printer
 * attribute identifies the values of the "media-weight-metric" member attribute
 * that the Printer supports, i.e., the weights supported in metric units.
 *
 * @see MediaWeightMetric
 */
public class MediaWeightMetricSupported extends SetOfIntegerSyntax
	implements SupportedValuesAttribute {
    
    public MediaWeightMetricSupported(String supportedValues){
	super(check(supportedValues));
    }
    
    public MediaWeightMetricSupported(int [][] supportedValues){
	super(check(supportedValues));
    }
    
    private static String check(String supportedValues){
	SetOfIntegerSyntax s = new SetOfIntegerSyntax(supportedValues){};
	if (s.contains(0)) throw new IllegalArgumentException("supported values must be greater than zero");
	return supportedValues;
    }
    
    private static int [][] check(int [][] supportedValues){
	SetOfIntegerSyntax s = new SetOfIntegerSyntax(supportedValues){};
	if (s.contains(0)) throw new IllegalArgumentException("supported values must be greater than zero");
	return supportedValues;
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return MediaWeightMetricSupported.class;
    }

    @Override
    public String getName() {
	return "media-weight-metric-supported";
    }

}
