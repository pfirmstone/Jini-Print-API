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
import javax.print.attribute.SupportedValuesAttribute;
import net.jini.print.attribute.BooleanSyntax;

/**
 * The "media-info-supported" (boolean) Printer attribute indicates whether or
 * not the Printer supports the "media-info" member attribute.
 *
 * @see MediaInfo
 */
public class MediaInfoSupported extends BooleanSyntax implements SupportedValuesAttribute {

    public MediaInfoSupported(boolean supported) {
	super(supported);
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return MediaInfoSupported.class;
    }

    @Override
    public String getName() {
	return "media-info-supported";
    }

}
