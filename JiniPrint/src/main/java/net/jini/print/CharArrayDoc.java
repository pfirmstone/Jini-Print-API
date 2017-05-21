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

package net.jini.print;

import java.io.CharArrayReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import javax.print.DocFlavor;
import javax.print.attribute.DocAttributeSet;

/**
 *
 * @author peter
 */
public class CharArrayDoc extends AbstractDoc {
    private static final long serialVersionUID = 1L;
    
    private final char[] printData;

    public CharArrayDoc(DocFlavor.CHAR_ARRAY flavor, DocAttributeSet attributes, char[] printData) {
	super(printDataNotNull(printData, flavor), attributes);
	this.printData = printData.clone();
    }
    
    private static DocFlavor printDataNotNull(char[] printData, DocFlavor flavor){
	if (printData == null) throw new NullPointerException("print data cannot be null");
	return flavor; // super class checks flavor isn't null.
    }

    @Override
    public Object getPrintData() throws IOException {
	return printData;
    }

    @Override
    public Reader getReaderForText() throws IOException {
	return new CharArrayReader(printData);
    }

    @Override
    public InputStream getStreamForBytes() throws IOException {
	return null;
    }
    
}
