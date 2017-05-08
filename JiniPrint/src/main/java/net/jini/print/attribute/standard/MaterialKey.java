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

import java.util.Objects;
import javax.print.attribute.Attribute;

/**
 * This REQUIRED member attribute provides an unlocalized name of the material
 * that can be localized using the strings file referenced by the
 * "printer-strings-uri" Printer attribute.
 *
 * @author peter
 */
public class MaterialKey implements Attribute {

    private final String key;

    public MaterialKey(String key) {
	this.key = key;
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return MaterialKey.class;
    }

    @Override
    public String getName() {
	return "material-key";
    }

    @Override
    public String toString() {
	return key;
    }

    @Override
    public int hashCode() {
	int hash = 7;
	hash = 41 * hash + Objects.hashCode(this.key);
	return hash;
    }

    @Override
    public boolean equals(Object o) {
	if (!(o instanceof MaterialKey)) {
	    return false;
	}
	return key.equals(((MaterialKey) o).key);
    }
}
