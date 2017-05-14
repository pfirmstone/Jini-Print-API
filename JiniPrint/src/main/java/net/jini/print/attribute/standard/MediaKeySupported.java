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

import java.util.Set;
import javax.print.attribute.Attribute;
import javax.print.attribute.SupportedValuesAttribute;
import net.jini.print.attribute.OneSetOfSyntax;

/**
 * The "media-key-supported" (1setOf (type3 keyword | name(MAX))) Printer
 * attribute identifies the values of the "media-key" member attribute that the
 * Printer supports.
 * 
 * @author peter
 */
public class MediaKeySupported extends OneSetOfSyntax implements SupportedValuesAttribute {
    
    public MediaKeySupported(Set<MediaKey> keys){
	super(keys);
    }

    /**
     * 
     * @return MediaKeySupported.class
     */
    @Override
    public Class<? extends Attribute> getCategory() {
	return MediaKeySupported.class;
    }

    /**
     * 
     * @return "media-key-supported"
     */
    @Override
    public String getName() {
	return "media-key-supported";
    }
    
}
