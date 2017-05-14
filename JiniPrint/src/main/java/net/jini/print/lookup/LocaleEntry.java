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
package net.jini.print.lookup;

import java.util.Locale;
import net.jini.entry.AbstractEntry;

/**
 * Class LocaleEntry is a Jini service attribute containing a locale a Jini
 * Print Service instance supports. If a Jini Print Service instance supports
 * the optional capability of generating localized strings as specified in
 * interface LocalizedPrintService, then for each locale it supports, the Jini
 * Print Service instance must register a service attribute of class LocaleEntry
 * in its service registration in the Jini Lookup Service (JLUS). *
 */
public class LocaleEntry extends AbstractEntry {

    /**
     * Locale the Jini Print Service instance supports.
     */
    public Locale locale;
    
    /**
     * Construct a locale entry containing a null (wildcard) locale.
     */
    public LocaleEntry(){}
    
    /**
     * Construct a locale entry containing the given locale.
     * @param theLocale Locale.
     */
    public LocaleEntry(Locale theLocale){
	locale = theLocale;
    }
}
