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
import javax.print.attribute.EnumSyntax;

/**
 *
 * @author peter
 */
public class MediaSourceFeedDirection extends EnumSyntax implements Attribute {
    
    public final static MediaSourceFeedDirection 
	    LONG_EDGE_FIRST = new MediaSourceFeedDirection(0),
	    SHORT_EDGE_FIRST = new MediaSourceFeedDirection(0);
    
    protected MediaSourceFeedDirection(int i){
	super(i);
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return MediaSourceFeedDirection.class;
    }

    @Override
    public String getName() {
	return "media-source-feed-direction";
    }
    
    @Override
    protected String[] getStringTable() {
        return new String[]{
	    "long-edge-first",
	    "short-edge-first",
	};
    }

    @Override
    protected EnumSyntax[] getEnumValueTable() {
        return new EnumSyntax[]{
	    LONG_EDGE_FIRST,
	    SHORT_EDGE_FIRST,
	};
    }
    
}
