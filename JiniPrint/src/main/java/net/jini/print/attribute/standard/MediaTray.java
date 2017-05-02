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

import javax.print.attribute.EnumSyntax;

/**
 * Do we really need this?
 * @author peter
 */
class MediaTray extends javax.print.attribute.standard.MediaTray {
    
    public static final MediaTray BYPASS_TRAY = new MediaTray(8);
    public static final MediaTray TRAY_1 = new MediaTray(9);
    public static final MediaTray TRAY_2 = new MediaTray(10);
    public static final MediaTray TRAY_3 = new MediaTray(11);
    public static final MediaTray TRAY_4 = new MediaTray(12);
    public static final MediaTray TRAY_5 = new MediaTray(13);
    public static final MediaTray TRAY_6 = new MediaTray(14);
    public static final MediaTray TRAY_7 = new MediaTray(15);
    public static final MediaTray TRAY_8 = new MediaTray(16);
    
    protected MediaTray(int i){
	super(i);
    }
    
    @Override
    protected String[] getStringTable() {
	return new String[]{
	    "bypass-tray",
	    "tray-1",
	    "tray-2",
	    "tray-3",
	    "tray-4",
	    "tray-5",
	    "tray-6",
	    "tray-7",
	    "tray-8",
	};
    }

    @Override
    protected EnumSyntax[] getEnumValueTable() {
	return new EnumSyntax[]{
	    BYPASS_TRAY,
	    TRAY_1,
	    TRAY_2,
	    TRAY_3,
	    TRAY_4,
	    TRAY_5,
	    TRAY_6,
	    TRAY_7,
	    TRAY_8,
	};
    }

    @Override
    protected int getOffset() {
	return 8;
    }
}
