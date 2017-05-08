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
import javax.print.attribute.DocAttribute;
import javax.print.attribute.standard.Media;

/**
 * The presence of the "cover-back" attribute indicates that a back cover is
 * requested.
 * 
 * @see CoverFront
 * @see Cover
 * @see DocAttribute
 *
 * @author peter
 */
public class CoverBack extends Cover {

    public CoverBack(Media media, CoverType type) {
	super(media, type);
    }

    public CoverBack(MediaCollection mediaCol, CoverType type) {
	super(mediaCol, type);
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return CoverBack.class;
    }

    @Override
    public String getName() {
	return "cover-back";
    }

}