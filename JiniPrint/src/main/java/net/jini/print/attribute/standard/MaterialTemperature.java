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

/**
 * //TODO
 * 
 * @author peter
 */
public class MaterialTemperature implements Attribute {
    
    private static final long serialVersionUID = 1L;
    
    private static int check(int temp){
	if (temp < -273) throw new IllegalArgumentException(
	    "temperature out of range, cannot be below absolute zero, -273 deg C");
	return temp;
    }
    
    private static boolean check(int min, int max){
	if (min < max) return true;
	throw new IllegalArgumentException("minimum temperature must be less than max");		
    }
    private final int min;
    private final int max;
    
    public MaterialTemperature(int min, int max){
	this(check(min), check(max), check(min, max));
    }
    
    private MaterialTemperature(int min, int max, boolean check){
	this.min = min;
	this.max = max;
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return MaterialTemperature.class;
    }

    @Override
    public String getName() {
	return "material-temperature";
    }
    
    @Override
    public String toString() {
	StringBuilder b = new StringBuilder();
	return b.append(min).append('-').append(max).toString();	
    }
    
}
