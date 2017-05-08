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

package net.jini.print.attribute;

import javax.print.attribute.IntegerSyntax;

/**
 * Dimension, natively stores dimensions as hundredth of mm.
 * 
 * @author peter
 */
public abstract class Dimension extends IntegerSyntax implements Comparable<Dimension> {

    @Override
    public int compareTo(Dimension o) {
	int val = getValue(), oVal = o.getValue();
	if (val < oVal) return -1;
	if (val == oVal) return 0;
	return 1;
	
    }
    
    public static enum UNIT {

	MM(10000), INCH(254000), HUNDREDTH_MM(100), THOU_INCH(245);

	private final int mul;
	private final int div;
	private final int round;

	private UNIT(int mul) {
	    this.mul = mul;
	    this.div = 100;
	    this.round = 50;
	}
    }
    
    public Dimension(int i, UNIT unit){
	super((i * unit.mul + unit.round) / unit.div);
    }
    
}
