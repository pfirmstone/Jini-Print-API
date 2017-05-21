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

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import javax.print.DocFlavor;
import javax.print.attribute.DocAttributeSet;

/**
 * A Serializable Doc implementation that contains the print data in a byte
 * array.
 *
 * All document data is serialized, this implementation's
 * {@link javax.print.Doc#getPrintData()} and 
 * {@link javax.print.Doc#getStreamForBytes() } methods return data local to the
 * jvm without making remote method calls.
 *
 */
public class ByteArrayDoc extends AbstractDoc {

    public static final long serialVersionUID = 1L;
    
    /**
     * The print data.
     * 
     * @serial
     */
    private final byte[] printData;

    /**
     * Construct a new ByteArrayDoc instance.
     * 
     * @param flavor the doc flavor
     * @param attributes the attributes or null.
     * @param printData the print data.
     * @throws NullPointerException if flavor or printData are null.
     */
    public ByteArrayDoc(DocFlavor.BYTE_ARRAY flavor, DocAttributeSet attributes, byte[] printData) {
	super(printDataNotNull(printData, flavor), attributes);
	this.printData = printData.clone();
    }

    private static DocFlavor printDataNotNull(Object printData, DocFlavor flavor) {
	if (printData == null) {
	    throw new NullPointerException("print data cannot be null");
	}
	return flavor; // super class checks flavor isn't null.
    }

    @Override
    public Object getPrintData() throws IOException {
	return printData.clone();
    }

    @Override
    public Reader getReaderForText() throws IOException {
	return null;
    }

    @Override
    public InputStream getStreamForBytes() throws IOException {
	return new ByteArrayInputStream(printData);
    }

}
