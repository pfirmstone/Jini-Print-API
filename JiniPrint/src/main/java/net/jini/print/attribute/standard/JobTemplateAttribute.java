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
import javax.print.attribute.PrintJobAttribute;
import net.jini.print.attribute.CollectionSyntax;

/**
 * This class defines Job Template Attribute extensions for production printing.
 *
 * @author peter
 */
public class JobTemplateAttribute extends CollectionSyntax
	implements PrintJobAttribute {

    private final CoverBack coverBack;
    private final CoverFront coverFront;
    private final FinishingsCol finishingsCol;
    private final ForceFrontSide forceFrontSide;
    private final ImpositionTemplate impositionTemplate;
    private final InsertSheets insertSheet;
    private final JobAccountID jobAccountID;
    private final JobAccountingUserID jobAccountingUserID;
    private final JobAccountingSheets jobAccountingSheets;
    private final JobErrorSheet jobErrorSheet;
    private final JobMessageToOperator jobMessageToOperator;
    private final JobPagesPerSet jobPagesPerSet;
    private final JobSheetsCollection jobSheetsCollection;
    private final JobSheetMessage jobSheetsMessage;
    private final MediaCollection mediaCollection;
    private final MediaInputTrayCheck mediaInputTrayCheck;
    private final OutputBin outputBin;
    private final PageDelivery pageDelivery;
    private final PageOrderReceived pageOrderReceived;
    private final PresentationDirectionNumberUp presentationDirectionNumberUp;
    private final SeparatorSheets separatorSheets;
    private final XimagePosition xImagePosition;
    private final XimageShift xImageShift;
    private final Xside1ImageShift xSide1ImageShift;
    private final Xside2ImageShift xSide2ImageShift;
    private final YimagePosition yImagePosition;
    private final YimageShift yImageShift;
    private final Yside1ImageShift ySide1ImageShift;
    private final Yside2ImageShift ySide2ImageShift;

    public JobTemplateAttribute(
	    CoverBack coverBack, // PWG5100.3-2001 IPP Production Printing Attributes - Set 1
	    CoverFront coverFront, // PWG5100.3-2001 IPP Production Printing Attributes - Set 1
	    FinishingsCol finishingsCol, // PWG5100.3-2001 IPP Production Printing Attributes - Set 1
	    ForceFrontSide forceFrontSide, // PWG5100.3-2001 IPP Production Printing Attributes - Set 1
	    ImpositionTemplate impositionTemplate, // PWG5100.3-2001 IPP Production Printing Attributes - Set 1
	    InsertSheets insertSheet, // PWG5100.3-2001 IPP Production Printing Attributes - Set 1
	    JobAccountID jobAccountID, // PWG5100.3-2001 IPP Production Printing Attributes - Set 1
	    JobAccountingUserID jobAccountingUserID, // PWG5100.3-2001 IPP Production Printing Attributes - Set 1
	    JobAccountingSheets jobAccountingSheets, // PWG5100.3-2001 IPP Production Printing Attributes - Set 1
	    JobErrorSheet jobErrorSheet, // PWG5100.3-2001 IPP Production Printing Attributes - Set 1
	    JobMessageToOperator jobMessageToOperator, // PWG5100.3-2001 IPP Production Printing Attributes - Set 1
	    JobPagesPerSet jobPagesPerSet, // PWG5100.1 - IPP Finishings 2.0
	    JobSheetsCollection jobSheetsCollection, // PWG5100.3-2001 IPP Production Printing Attributes - Set 1
	    JobSheetMessage jobSheetsMessage, // PWG5100.3-2001 IPP Production Printing Attributes - Set 1
	    MediaCollection mediaCollection, // PWG5100.3-2001 IPP Production Printing Attributes - Set 1
	    MediaInputTrayCheck mediaInputTrayCheck, // PWG5100.3-2001 IPP Production Printing Attributes - Set 1
	    OutputBin outputBin, //PWG 5100.2-2001 IPP: “output-bin” attribute extension
	    PageDelivery pageDelivery, // PWG5100.3-2001 IPP Production Printing Attributes - Set 1
	    PageOrderReceived pageOrderReceived, // PWG5100.3-2001 IPP Production Printing Attributes - Set 1
	    PresentationDirectionNumberUp presentationDirectionNumberUp, // PWG5100.3-2001 IPP Production Printing Attributes - Set 1
	    SeparatorSheets separatorSheets, // PWG5100.3-2001 IPP Production Printing Attributes - Set 1
	    XimagePosition xImagePosition, // PWG5100.3-2001 IPP Production Printing Attributes - Set 1
	    XimageShift xImageShift, // PWG5100.3-2001 IPP Production Printing Attributes - Set 1
	    Xside1ImageShift xSide1ImageShift, // PWG5100.3-2001 IPP Production Printing Attributes - Set 1
	    Xside2ImageShift xSide2ImageShift, // PWG5100.3-2001 IPP Production Printing Attributes - Set 1
	    YimagePosition yImagePosition, // PWG5100.3-2001 IPP Production Printing Attributes - Set 1
	    YimageShift yImageShift, // PWG5100.3-2001 IPP Production Printing Attributes - Set 1
	    Yside1ImageShift ySide1ImageShift, // PWG5100.3-2001 IPP Production Printing Attributes - Set 1
	    Yside2ImageShift ySide2ImageShift // PWG5100.3-2001 IPP Production Printing Attributes - Set 1		
    ) {
	this.coverBack = coverBack;
	this.coverFront = coverFront;
	this.finishingsCol = finishingsCol;
	this.forceFrontSide = forceFrontSide;
	this.impositionTemplate = impositionTemplate;
	this.insertSheet = insertSheet;
	this.jobAccountID = jobAccountID;
	this.jobAccountingUserID = jobAccountingUserID;
	this.jobAccountingSheets = jobAccountingSheets;
	this.jobErrorSheet = jobErrorSheet;
	this.jobMessageToOperator = jobMessageToOperator;
	this.jobPagesPerSet = jobPagesPerSet;
	this.jobSheetsCollection = jobSheetsCollection;
	this.jobSheetsMessage = jobSheetsMessage;
	this.mediaCollection = mediaCollection;
	this.mediaInputTrayCheck = mediaInputTrayCheck;
	this.outputBin = outputBin;
	this.pageDelivery = pageDelivery;
	this.pageOrderReceived = pageOrderReceived;
	this.presentationDirectionNumberUp = presentationDirectionNumberUp;
	this.separatorSheets = separatorSheets;
	this.xImagePosition = xImagePosition;
	this.xImageShift = xImageShift;
	this.xSide1ImageShift = xSide1ImageShift;
	this.xSide2ImageShift = xSide2ImageShift;
	this.yImagePosition = yImagePosition;
	this.yImageShift = yImageShift;
	this.ySide1ImageShift = ySide1ImageShift;
	this.ySide2ImageShift = ySide2ImageShift;
    }

    @Override
    public Attribute[] getAttributes() {
	return new Attribute[]{
	    coverBack,
	    coverFront,
	    finishingsCol,
	    forceFrontSide,
	    impositionTemplate,
	    insertSheet,
	    jobAccountID,
	    jobAccountingUserID,
	    jobAccountingSheets,
	    jobErrorSheet,
	    jobMessageToOperator,
	    jobPagesPerSet,
	    jobSheetsCollection,
	    jobSheetsMessage,
	    mediaCollection,
	    mediaInputTrayCheck,
	    outputBin,
	    pageDelivery,
	    pageOrderReceived,
	    presentationDirectionNumberUp,
	    separatorSheets,
	    xImagePosition,
	    xImageShift,
	    xSide1ImageShift,
	    xSide2ImageShift,
	    yImagePosition,
	    yImageShift,
	    ySide1ImageShift,
	    ySide2ImageShift,};
    }

    @Override
    public Class<? extends Attribute> getCategory() {
	return JobTemplateAttribute.class;
    }

    @Override
    public String getName() {
	return "job-template-attribute";
    }

    /**
     * @return the coverBack
     */
    public CoverBack getCoverBack() {
	return coverBack;
    }

    /**
     * @return the coverFront
     */
    public CoverFront getCoverFront() {
	return coverFront;
    }

    /**
     * @return the finishingsCol
     */
    public FinishingsCol getFinishingsCol() {
	return finishingsCol;
    }

    /**
     * @return the forceFrontSide
     */
    public ForceFrontSide getForceFrontSide() {
	return forceFrontSide;
    }

    /**
     * @return the impositionTemplate
     */
    public ImpositionTemplate getImpositionTemplate() {
	return impositionTemplate;
    }

    /**
     * @return the insertSheets
     */
    public InsertSheets getInsertSheets() {
	return insertSheet;
    }

    /**
     * @return the jobAccountID
     */
    public JobAccountID getJobAccountID() {
	return jobAccountID;
    }

    /**
     * @return the jobAccountingUserID
     */
    public JobAccountingUserID getJobAccountingUserID() {
	return jobAccountingUserID;
    }

    /**
     * @return the jobAccountingSheets
     */
    public JobAccountingSheets getJobAccountingSheets() {
	return jobAccountingSheets;
    }

    /**
     * @return the jobErrorSheet
     */
    public JobErrorSheet getJobErrorSheet() {
	return jobErrorSheet;
    }

    /**
     * @return the jobMessageToOperator
     */
    public JobMessageToOperator getJobMessageToOperator() {
	return jobMessageToOperator;
    }

    /**
     * @return the jobPagesPerSet
     */
    public JobPagesPerSet getJobPagesPerSet() {
	return jobPagesPerSet;
    }

    /**
     * @return the jobSheetsCollection
     */
    public JobSheetsCollection getJobSheetsCollection() {
	return jobSheetsCollection;
    }

    /**
     * @return the jobSheetsMessage
     */
    public JobSheetMessage getJobSheetsMessage() {
	return jobSheetsMessage;
    }

    /**
     * @return the mediaCollection
     */
    public MediaCollection getMediaCollection() {
	return mediaCollection;
    }

    /**
     * @return the mediaInputTrayCheck
     */
    public MediaInputTrayCheck getMediaInputTrayCheck() {
	return mediaInputTrayCheck;
    }

    /**
     * @return the pageDelivery
     */
    public PageDelivery getPageDelivery() {
	return pageDelivery;
    }

    /**
     * @return the pageOrderReceived
     */
    public PageOrderReceived getPageOrderReceived() {
	return pageOrderReceived;
    }

    /**
     * @return the presentationDirectionNumberUp
     */
    public PresentationDirectionNumberUp getPresentationDirectionNumberUp() {
	return presentationDirectionNumberUp;
    }

    /**
     * @return the separatorSheets
     */
    public SeparatorSheets getSeparatorSheets() {
	return separatorSheets;
    }

    /**
     * @return the xImagePosition
     */
    public XimagePosition getxImagePosition() {
	return xImagePosition;
    }

    /**
     * @return the xImageShift
     */
    public XimageShift getxImageShift() {
	return xImageShift;
    }

    /**
     * @return the xSide1ImageShift
     */
    public Xside1ImageShift getxSide1ImageShift() {
	return xSide1ImageShift;
    }

    /**
     * @return the xSide2ImageShift
     */
    public Xside2ImageShift getxSide2ImageShift() {
	return xSide2ImageShift;
    }

    /**
     * @return the yImagePosition
     */
    public YimagePosition getyImagePosition() {
	return yImagePosition;
    }

    /**
     * @return the yImageShift
     */
    public YimageShift getyImageShift() {
	return yImageShift;
    }

    /**
     * @return the ySide1ImageShift
     */
    public Yside1ImageShift getySide1ImageShift() {
	return ySide1ImageShift;
    }

    /**
     * @return the ySide2ImageShift
     */
    public Yside2ImageShift getySide2ImageShift() {
	return ySide2ImageShift;
    }

    /**
     * @return the outputBin
     */
    public OutputBin getOutputBin() {
	return outputBin;
    }

}
