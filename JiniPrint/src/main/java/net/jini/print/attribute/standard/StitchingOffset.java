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
import net.jini.print.attribute.Dimension;

/**
 *
 * @author peter
 */
public class StitchingOffset extends Dimension implements Attribute {

    public StitchingOffset(int i, UNIT unit) {
	super(i, unit);
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return StitchingOffset.class;
    }

    @Override
    public String getName() {
	return "stitching-offset";
    }
    
}
