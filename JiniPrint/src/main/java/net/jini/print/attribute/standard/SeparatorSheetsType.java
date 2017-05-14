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
 * <p>
 * The "separator-sheets-type" member attribute specifies which separator sheets
 * type the Printer MUST use for the separator sheets.
 * </p><p>
 * Example 1: A job is created consisting of a single document, with the
 * </p>
 * <ol TYPE=a>
 * <li> the value of the "copies" {@link javax.print.attribute.standard.Copies}
 * attribute is '3',
 * <li>the value of “job-sheets” attribute is ‘job-both-sheets’
 * {@link JobSheets}, and
 * <li>the value of the "separator-sheets-type" attribute is 'slip-sheets'.
 * </ol>
 * <p>
 * If each of the 3 "sets" is denoted by (J1), (J2), (J3), a job-sheet is
 * denoted by X, and a separator sheet is denoted by S, then the delivered
 * output would be: X (J1) S (J2) S (J3) X If the value of the
 * “separator-sheets-type” is ‘start-sheet’ instead, then the delivered output
 * would be: X S (J1) S (J2) S (J3) X
 * </p>
 *
 * <p>
 * Example 2: A job is created consisting of two documents J and K, with
 * </p>
 * <ol TYPE=a>
 * <li>the value of "copies" attribute is '3',
 * <li> the value of “job-sheets” attribute is ‘job-both-sheets’ (see section
 * 6.2),
 * <li> the value of the "separator-sheets-type" attribute is 'slip-sheets',
 * <li> the value of the “sheet-collate” attribute is ‘collated’ and
 * <li> the value of the “multiple-document-handling” attribute is
 * ‘separate-documents-uncollated-copies.
 * </ol>
 * <p>
 * If each of the "sets" is denoted by (J1), (J2), (J3), (K1), (K2), (K3), a
 * job-sheet is denoted by X, and a separator sheet is denoted by S, then the
 * delivered output would be: X (J1) S (K1) S (J2) S (K2) S (J3) S (K3) X
 * </p><p>
 * If for example 2, the value of the “separator-sheets-type” is ‘start-sheet’
 * instead, then the delivered output would be: X S (J1) S (K1) S (J2) S (K2) S
 * (J3) S (K3) X.
 * </p><p>
 * If for example 2, the value of the “multiple-document-handling” attribute is
 * ‘separate-documents-uncollated-copies, then the delivered output would be: X
 * (J1) S (J2) S (J3) S (K1) S (K2) S (K3) X.
 * </p><p>
 * If for example 2, the value of the “sheet-collate” attribute is ‘uncollated’,
 * then the delivered output would be: X (JP1) S (JP2) S (JP3) S (KP1) S (KP2) X
 * where JPn are 3 copies of page n of Job J and KPn are 3 copies of page n of
 * Job K. Job J has 3 pages and Job K has two in this example.
 * </p>
 * <p>
 * The "separator-sheets-type-supported" (1setOf (type3 keyword | name(MAX)))
 * Printer attribute identifies the values of this "separator-sheets-type"
 * member attribute that the Printer supports, i.e., the type names of the
 * separator sheets.
 * </p>
 * <p>
 * {@link javax.print.attribute.standard.SheetCollate} "sheet-collate" is
 * obsolete as it doesn't interact well with  
 * {@link javax.print.attribute.standard.Finishings},
 * {@link FinishingsSet}, or {@link FinishingsCol}, please refer to
 * <a HREF="https://tools.ietf.org/html/rfc8011">RFC8011</a>
 * </p>
 * 
 * @see SeparatorSheetsTypeSupported
 * @see javax.print.attribute.standard.MultipleDocumentHandling
 */
public class SeparatorSheetsType extends EnumSyntax implements Attribute {

    /**
     * No separator sheets are to be delivered with the printed output.
     */
    public static final SeparatorSheetsType NONE = new SeparatorSheetsType(0);
    /**
     * A separator sheet MUST be printed between "sets" of the job.
     */
    public static final SeparatorSheetsType SLIP_SHEETS = new SeparatorSheetsType(1);
    /**
     * A separator sheet MUST be printed to indicate the start of each "set" of
     * the job.
     */
    public static final SeparatorSheetsType START_SHEET = new SeparatorSheetsType(2);
    /**
     * A separator sheet MUST be printed to indicate the end of each "set" of
     * the job.
     */
    public static final SeparatorSheetsType END_SHEET = new SeparatorSheetsType(3);
    /**
     * Separator sheets MUST be printed to indicate both the start and end of
     * each "set" of the job.
     */
    public static final SeparatorSheetsType BOTH_SHEETS = new SeparatorSheetsType(4);

    SeparatorSheetsType(int i) {
	super(i);
    }

    /**
     * 
     * @return SeparatorSheetsType.class
     */
    @Override
    public Class<? extends Attribute> getCategory() {
	return SeparatorSheetsType.class;
    }

    /**
     * 
     * @return "separator-sheets-type"
     */
    @Override
    public String getName() {
	return "separator-sheets-type";
    }

    @Override
    protected String[] getStringTable() {
	return new String[]{
	    "none",
	    "slip-sheets",
	    "start-sheet",
	    "end-sheet",
	    "both-sheets",};
    }

    @Override
    protected EnumSyntax[] getEnumValueTable() {
	return new EnumSyntax[]{
	    NONE,
	    SLIP_SHEETS,
	    START_SHEET,
	    END_SHEET,
	    BOTH_SHEETS,};
    }

}
