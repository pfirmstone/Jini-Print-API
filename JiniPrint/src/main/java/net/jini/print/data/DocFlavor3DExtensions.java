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
package net.jini.print.data;

import javax.print.DocFlavor;

/**
 *
 * PWG 5100.21 – IPP 3D Printing Extensions (3D) February 10, 2017
 * 
 * Printers MUST support Documents conforming to the 3MF [3MF] ("model/3mf")
 * format and SHOULD support Documents conforming to the PDF [ISO32000]
 * ("application/pdf") format containing U3D [U3D] or PRC [PRC] content.
 *
 */
public interface DocFlavor3DExtensions {

    public final static DocFlavor BYTE_ARRAY_3MF = new DocFlavor.BYTE_ARRAY("model/3mf"),
	    INPUT_STREAM_3MF = new DocFlavor.INPUT_STREAM("model/3mf");
}
