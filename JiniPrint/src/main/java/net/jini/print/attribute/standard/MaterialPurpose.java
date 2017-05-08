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
import javax.print.attribute.EnumSyntax;

/**
 *
 * @author peter
 */
public class MaterialPurpose implements Attribute {

    public static final Purpose ALL = new Purpose(0),//[PWG5100.21]
	    BASE = new Purpose(1),//[PWG5100.21]
	    IN_FILL = new Purpose(2),//[PWG5100.21]
	    SHELL = new Purpose(3),//[PWG5100.21]
	    SUPPORT = new Purpose(4);//[PWG5100.21]

    private final Purpose[] set;

//    public enum Purpose {
//
//	ALL("all"),
//	BASE("base"),
//	IN_FILL("in-fill"),
//	SHELL("shell"),
//	SUPPORT("support");
//	private final String value;
//	
//	private Purpose(String name){
//	    this.value = name;
//	}
//	
//	@Override
//	public String toString(){
//	    return value;
//	}
//    }
    public static class Purpose extends EnumSyntax {

	protected Purpose(int i) {
	    super(i);
	}

	@Override
	protected String[] getStringTable() {
	    return new String[]{
		"all",
		"base",
		"in-fill",
		"shell",
		"support",};
	}

	@Override
	protected EnumSyntax[] getEnumValueTable() {
	    return new EnumSyntax[]{
		ALL,
		BASE,
		IN_FILL,
		SHELL,
		SUPPORT,};
	}
    }

    private static Purpose[] getSet(Set<Purpose> purposes) {
	return purposes.toArray(new Purpose[purposes.size()]);
    }

    public MaterialPurpose(Set<Purpose> purposeSet) {
	this(getSet(purposeSet));
    }

    private MaterialPurpose(Purpose[] set) {
	this.set = set;
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return MaterialPurpose.class;
    }

    @Override
    public String getName() {
	return "material-purpose";
    }

    @Override
    public String toString() {
	StringBuilder b = new StringBuilder(6 * set.length);
	for (int i = 0, l = set.length; i < l; i++) {
	    b.append(set[i]);
	    if (i < l - 1) {
		b.append(",");
	    }
	}
	return b.toString();
    }

}
