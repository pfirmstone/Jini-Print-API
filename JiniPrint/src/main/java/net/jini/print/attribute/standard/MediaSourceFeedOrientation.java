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
import javax.print.attribute.standard.OrientationRequested;
import net.jini.print.attribute.CollectionSyntax;

/**
 *
 * @author peter
 */
public class MediaSourceFeedOrientation extends CollectionSyntax implements Attribute {
    
    private final OrientationRequested orientation;

    public MediaSourceFeedOrientation(OrientationRequested orientation ){
	this.orientation = orientation;
    }
    
    @Override
    protected Attribute[] getAttributes() {
	return new Attribute[]{orientation};
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return MediaSourceFeedOrientation.class;
    }

    @Override
    public String getName() {
	return "media-source-feed-orientation";
    }
    
}
