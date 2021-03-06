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
import net.jini.print.attribute.CollectionSyntax;

/**
 *
 * @author peter
 */
public class MediaSourceProperties extends CollectionSyntax implements Attribute {
    
    private final MediaSourceFeedDirection feedDirection;
    private final MediaSourceFeedOrientation feedOrientation;

    public MediaSourceProperties(
	    MediaSourceFeedDirection feedDirection,
	    MediaSourceFeedOrientation feedOrientation)
    {
	this.feedDirection = feedDirection;
	this.feedOrientation = feedOrientation;
    }
    
    @Override
    protected Attribute[] getAttributes() {
	return new Attribute[]{feedDirection, feedOrientation};
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return MediaSourceProperties.class;
    }

    @Override
    public String getName() {
	return "media-source-properties";
	
    }
    
}
