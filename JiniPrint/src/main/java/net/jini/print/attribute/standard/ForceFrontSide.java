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

/**
 *
 * @author peter
 */
public class ForceFrontSide implements Attribute {
    private final int[] pages;
    
    public ForceFrontSide(int [] pages){
	Arrays.sort(pages);
	this.pages = pages.clone();
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getName() {
	return "force-front-side";
    }
    
    public String getString(){
	StringBuilder b = new StringBuilder(pages.length * 3);
	for (int i = 0, l = pages.length; i<l; i++){
	    b.append(pages[i]);
	    if (i < l - 1) b.append(",");
	}
	return b.toString();
    }
    
}
