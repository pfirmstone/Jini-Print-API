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

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import javax.print.DocFlavor;
import javax.print.attribute.DocAttributeSet;

/**
 * InputStreamDoc encapsulates and buffers a RemoteInputStream allowing large
 * documents to be processed in 8kB sized chunks.
 */
public class InputStreamDoc extends AbstractDoc {
    private static final long serialVersionUID = 1L;
    
    /**
     * RemoteInputStream proxy
     * @serial
     */
    private RemoteInputStream printData;
    
    private static class ISWrapper extends InputStream {
		
	private final RemoteInputStream ris;
	
	private ISWrapper(RemoteInputStream ris){
	    this.ris = ris;
	}

	@Override
	public int read() throws IOException {
	    byte [] b = new byte[1];
	    int len = read(b, 0, 1);
	    if (len < 0) return -1;
	    return b[0];
	}
	
	@Override
	public int read(byte b[], int off, int len) throws IOException {
	    byte [] read = ris.read(len);
	    if (read.length == 0) return -1;
	    for (int i = 0, l = read.length; i < l; i++){
		b[i + off] = read[i];
	    }
	    return read.length;
	}
	
	@Override
	public void close() throws IOException {
	    ris.close();
	}
	
    }

    public InputStreamDoc(DocFlavor.INPUT_STREAM flavor, DocAttributeSet attributes, RemoteInputStream proxy) {
	this(attributes, flavor, printDataNotNull(proxy));
    }
    
    private InputStreamDoc(DocAttributeSet attributes, DocFlavor flavor, RemoteInputStream printData){
	super(flavor, attributes);
	this.printData = printData;
    }
    
    private static RemoteInputStream printDataNotNull(RemoteInputStream printData){
	if (printData == null) throw new NullPointerException("print data cannot be null");
	return printData;
    }

    @Override
    public Object getPrintData() throws IOException {
	return new BufferedInputStream(new ISWrapper(printData));
    }

    @Override
    public Reader getReaderForText() throws IOException {
	return null;
    }

    @Override
    public InputStream getStreamForBytes() throws IOException {
	return new BufferedInputStream(new ISWrapper(printData));
    }
    
    RemoteInputStream getRemoteInputStream(){
	return printData;
    }
    
}
