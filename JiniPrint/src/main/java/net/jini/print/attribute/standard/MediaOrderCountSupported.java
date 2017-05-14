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
 *
 * 
 */
public class MediaOrderCountSupported extends SetOfIntegerSyntax implements SupportedValuesAttribute {
    
    public MediaOrderCountSupported(int [][] supportedRanges){
	super(checkSupported(supportedRanges));
    }
    
    public MediaOrderCountSupported(String supportedRanges){
	super(checkSupported(supportedRanges));
    }
    
    /**
     * Implementation note, only "safe" constructors in SetOfIntegerSyntax are
     * supported, that is, those that are not subject to finalizer attack. 
     * 
     * However it would be safe to use those constructors if we check superclass
     * invariants before creating an Object instance of MediaOrderCountSupported,
     * as per below.
     * 
     * @param supportedRanges
     * @return 
     */
    private static String checkSupported(String supportedRanges){
	SetOfIntegerSyntax sets = new SetOfIntegerSyntax(supportedRanges) {};
	if (sets.contains(0)) throw new IllegalArgumentException("Ranges must begin at 1");
	return supportedRanges;
    }
    
     private static int [][] checkSupported(int [][] supportedRanges){
	SetOfIntegerSyntax sets = new SetOfIntegerSyntax(supportedRanges) {};
	if (sets.contains(0)) throw new IllegalArgumentException("Ranges must begin at 1");
	return supportedRanges;
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return MediaOrderCountSupported.class;
    }

    @Override
    public String getName() {
	return "media-order-count-supported";
    }
    
}
