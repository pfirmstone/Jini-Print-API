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
import javax.print.attribute.PrintServiceAttribute;
import javax.print.attribute.SupportedValuesAttribute;
import net.jini.print.attribute.OneSetOfSyntax;

/**
 * <p>
 * The "media-type-supported" (1setOf (type3 keyword | name(MAX))) Printer
 * attribute identifies the values of the "media-type" member attribute that
 * the Printer supports, i.e., the media types supported.
 * </p><p>
 * Note: The Administrator can define custom media types using the 'name' (MAX)
 * attribute syntax of the "media-type-supported" (1setOf (type3 keyword |
 * name(MAX))) Printer attribute, if the Printer supports the 'name' attribute
 * syntax for this attribute. As with other Job Template and member attributes,
 * the user can also supply user-defined media type names that are not among the
 * values of the “media-type-supported” Printer attribute, if the Administrator
 * has configured the Printer's "user-defined-values-supported" attribute to
 * contain the 'media-type' attribute keyword value
 * </p>
 *
 */
public class MediaTypeSupported extends OneSetOfSyntax implements SupportedValuesAttribute {

    public MediaTypeSupported(Set<MediaType> supported) {
	super(supported);
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return MediaTypeSupported.class;
    }

    @Override
    public String getName() {
	return "media-type-supported";
    }

}
