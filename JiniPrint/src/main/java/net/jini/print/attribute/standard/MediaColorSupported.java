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
 *
 * The "media-color-supported" (1setOf (type3 keyword | name(MAX))) Printer
 * attribute identifies the values of the "media-color" member attribute that
 * the Printer supports, i.e., the colors supported.
 *
 */
public class MediaColorSupported extends OneSetOfSyntax implements SupportedValuesAttribute {

    public MediaColorSupported(Set<MediaColor> supported) {
	super(supported);
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return MediaColorSupported.class;
    }

    @Override
    public String getName() {
	return "media-color-supported";
    }

}
