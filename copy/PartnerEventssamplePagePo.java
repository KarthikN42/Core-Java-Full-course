package com.enhapp.web.pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import com.enhapp.common.library.Constants;
import com.enhapp.common.library.WebBasePage;

public class PartnerEventssamplePagePo extends WebBasePage implements Constants {

	public PartnerEventssamplePagePo(WebDriver driver) {
		super(driver);
	}

	public String imageUrl = System.getProperty("user.dir") + "\\test-images\\testImage.jpg";

	// FindBy(how=How.CLASS_NAME,using="nav_icon icon-kiosk-event")
	@FindBy(xpath = "(//*[(text()='Events')])[1]")
	private WebElement events;

	@FindBy(xpath = "//*[@class='action_btn']")
	private WebElement createNew;

	@FindBy(xpath = "//*[@id='Common_CW_wt12_block_wt19_wtContent_wtMainContent_OutSystemsUIWeb_wt289_block_wtContent_OutSystemsUIWeb_wt15_block_wtContent_wtLiveEevents']")
	private WebElement liveEvent;

	@FindBy(xpath = "//input[@id='Common_CW_wt12_block_wt19_wtContent_wtMainContent_OutSystemsUIWeb_wt289_block_wtContent_wtEventName']")
	private WebElement eventName;

	@FindBy(xpath = "//input[@id='Common_CW_wt12_block_wt19_wtContent_wtMainContent_OutSystemsUIWeb_wt289_block_wtContent_OutSystemsUIWeb_wt58_block_wtInput_wtEventStartDate']")
	private WebElement dateClick;

	@FindBy(xpath = "//*[@class='pika-go-today']")
	private WebElement startDate;

	@FindBy(xpath = "//input[@id='Common_CW_wt12_block_wt19_wtContent_wtMainContent_OutSystemsUIWeb_wt289_block_wtContent_OutSystemsUIWeb_wt158_block_wtInput_wtEventEndDate']")
	private WebElement endDate;

	@FindBy(xpath = "//*[@id='Common_CW_wt12_block_wt19_wtContent_wtMainContent_OutSystemsUIWeb_wt289_block_wtContent_wtEventDescription']")
	private WebElement eventDescription;

	@FindBy(xpath = "//*[@name='Common_CW_wt12$block$wt19$wtContent$wtMainContent$OutSystemsUIWeb_wt289$block$wtContent$wtEventType']")
	private WebElement eventType;

	@FindBy(xpath = "//*[@name='Common_CW_wt12$block$wt19$wtContent$wtMainContent$OutSystemsUIWeb_wt289$block$wtContent$wtOrganizationType']")
	private WebElement organisationType;

	@FindBy(xpath = "//*[@id='Common_CW_wt12_block_wt19_wtContent_wtMainContent_OutSystemsUIWeb_wt289_block_wtContent_wtOrganizationName']")
	private WebElement oganisationName;

	@FindBy(xpath = "//*[@id=\"Common_CW_wt12_block_wt19_wtContent_wtMainContent_OutSystemsUIWeb_wt289_block_wtContent_wtOrganizationLocationContainer\"]/div[1]/div/div[1]/div[2]/input")
	private WebElement organisationLocation;

	@FindBy(xpath = "//*[@id='Common_CW_wt12_block_wt19_wtContent_wtMainContent_OutSystemsUIWeb_wt289_block_wtContent_wtRemarks']")
	private WebElement remarks;

	@FindBy(id = "Common_CW_wt12_block_wt19_wtContent_wtMainContent_OutSystemsUIWeb_wt289_block_wtContent_wtctn_Imageupload")
	private WebElement thumbImageUploadBtn;

	@FindBy(xpath = "//*[@class='os-internal-ui-dialog os-internal-ui-widget os-internal-ui-widget-content os-internal-ui-corner-all os-internal-Popup os-internal-ui-draggable']//iframe")
	private WebElement imageFrameXpath;

	@FindBy(id = "wt9")
	private WebElement thumbImageUploadSaveBtn;

	@FindBy(xpath = "//*[@id=\"Common_CW_wt12_block_wt19_wtContent_wtMainContent_OutSystemsUIWeb_wt289_block_wtContent_wt180\"]")
	private WebElement submit;
	
	@FindBy(xpath = "//*[@id='Common_CW_wt12_block_wt19_wtContent_wtMainContent_OutSystemsUIWeb_wt289_block_wtContent_OutSystemsUIWeb_wtFreeRnot_block_wtContent_OutSystemsUIWeb_wt193_block_wtLabel']")
	private WebElement freeEvent;
	
	@FindBy(xpath = "//select[@id='Common_CW_wt12_block_wt19_wtContent_wtMainContent_OutSystemsUIWeb_wt289_block_wtContent_wtCountryPriceLR_ctl00_wtcb_country']")
	private WebElement selectCountry;
	
	@FindBy(xpath = "//input[@id='Common_CW_wt12_block_wt19_wtContent_wtMainContent_OutSystemsUIWeb_wt289_block_wtContent_wtCountryPriceLR_ctl00_wt183']")
	private WebElement price;
	
	@FindBy(xpath = "//select[@id='Common_CW_wt12_block_wt19_wtContent_wtMainContent_OutSystemsUIWeb_wt289_block_wtContent_wtCountryPriceLR_ctl00_wtcb_CurrencyId']")
	private WebElement currency;
	
	@FindBy(xpath = "//*[@id='Common_CW_wt12_block_wt19_wtContent_wtMainContent_OutSystemsUIWeb_wt289_block_wtContent_OutSystemsUIWeb_wt155_block_wtContent_wtConsultationacall']")
	private WebElement consulatationCall;
	
	@FindBy(xpath = "//*[@id='Common_CW_wt12_block_wt19_wtContent_wtMainContent_OutSystemsUIWeb_wt289_block_wtContent_OutSystemsUIWeb_wt52_block_wtInput_wtCallEndDateIn']")
	private WebElement callEndDate;
	
	@FindBy(xpath = "//*[@id='Common_CW_wt12_block_wt19_wtContent_wtMainContent_OutSystemsUIWeb_wt289_block_wtContent_wtProfessionallistBoxAjaxRfrsh']//input")
	private WebElement selectProfessional;

	@FindBy(xpath = "//input[@id='Common_CW_wt12_block_wt19_wtContent_wtMainContent_OutSystemsUIWeb_wt289_block_wtContent_OutSystemsUIWeb_wt101_block_wtContent_wtActive2']")
	private WebElement status;

	@FindBy(xpath = "//*[@id='Common_CW_wt12_block_wt19_wtContent_wtMainContent_OutSystemsUIWeb_wt289_block_wtContent_wt180']")
	private WebElement save;

	public void goToEvents() {

		verifyElement(events, "Event link");
		events.click();

	}

	public void clickCreateNew() {
		// System.out.println("karthik is inside gotoEvents");
		verifyElement(createNew, "create New");
		createNew.click();

	}

	public void clickLiveEvent() {
        if(!(liveEvent.isEnabled())) {
        	liveEvent.click();
        }
		verifyElement(liveEvent, "Live Events");
		

	}

	public void setEventName(String eventNameValue) {

		verifyElement(eventName, "Event Name");
		eventName.sendKeys(eventNameValue);

	}

	public void calendertDateClick() throws InterruptedException {

		verifyElement(dateClick, "dateclick");
		dateClick.click();
		Thread.sleep(2000);
	}

	public void starttDateClick() throws InterruptedException {

		verifyElement(startDate, "Event Start Date");
		startDate.click();
		Thread.sleep(2000);
	}

	public void endtDateClick() throws InterruptedException {

		verifyElement(endDate, "End Date");
		endDate.sendKeys("08-07-2022"+Keys.ENTER);
         Thread.sleep(2000);
	}
	
	/*
	 * public void descriptionClick() {
	 * verifyElement(eventDescriptionclick,"eventDescriptionclick");
	 * eventDescriptionclick.click(); }
	 */

	public void entereventDescription() {

		verifyElement(eventDescription, "Event Description");
		eventDescription.sendKeys("Live event using automation");
	}

	public void eventTypeSelect() {

		verifyElement(eventType, "Event Type");
		select_By_value_from_list(eventType, "Trial");

	}
    
		
		public void organisationTypeSelect() throws InterruptedException {
		

		verifyElement(organisationType, "Organization Type");
		select_By_value_from_list(organisationType, "Partner");
		Thread.sleep(2000);
		}
		
	public void organisationTypeSelectB2B() throws InterruptedException {

		verifyElement(organisationType, "Organization Type");
		select_By_value_from_list(organisationType, "Corporate");
		Thread.sleep(2000);

	}
		
	public void organisatioName() throws InterruptedException {

		verifyElement(oganisationName, "Organization Name");
		select_By_value_from_list(oganisationName, "United partner");
		Thread.sleep(2000);

	}
	
	public void organisatioNameB2B() throws InterruptedException {

		verifyElement(oganisationName, "Organization Name");
		select_By_value_from_list(oganisationName, "Nokia");
		Thread.sleep(2000);

	}

	public void organisationLocation() {

		verifyElement(organisationLocation, "Organization Location");
		organisationLocation.sendKeys("U" + Keys.ENTER);

	}

	public void remarksEnter() {

		verifyElement(remarks, "Remarks");
		remarks.sendKeys("Remarks for live events");
	}

	public void imageUpload() throws AWTException, InterruptedException {

		Thread.sleep(5000);
		verifyElement(thumbImageUploadBtn, "imageupload");
		
		  
		  //thumbImageUploadBtn.sendKeys(imageUrl); Thread.sleep(5000);
		 // switchToFrameAndClick(imageFrameXpath, thumbImageUploadSaveBtn);
		  
		  
		 Thread.sleep(3000);
		  
		  thumbImageUploadBtn.click(); Thread.sleep(4000); String
		  file="C:\\Users\\Spotcheck\\Pictures\\Upload.jpg"; 
		  StringSelection file1 = new StringSelection(file);
		  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file1, null);
		  Robot obj = new Robot(); 
		  obj.keyPress(KeyEvent.VK_CONTROL);
		  obj.keyPress(KeyEvent.VK_V);
		  obj.keyRelease(KeyEvent.VK_V);
		  obj.keyRelease(KeyEvent.VK_CONTROL); 
		  obj.keyPress(KeyEvent.VK_ENTER);
		  Thread.sleep(5000); 
		  driver.switchTo().frame(imageFrameXpath);
		  Thread.sleep(2000); thumbImageUploadSaveBtn.click();
		  Thread.sleep(2000);
		  driver.switchTo().defaultContent(); 
		 
	}
	
	public void freeEvent() throws InterruptedException {

		verifyElement(freeEvent, "Free Event");
		freeEvent.click();
		Thread.sleep(5000);
	}
	
	public void selectCountry() throws InterruptedException {

		verifyElement(selectCountry, "SelectCountry");
		Select coun = new Select(selectCountry);
		coun.selectByVisibleText("United States");
		Thread.sleep(2000);
	}
	
	public void price() throws InterruptedException {

		verifyElement(price, "Price");
		price.sendKeys("200");
		Thread.sleep(2000);
		
	}
	public void currency() throws InterruptedException {
		verifyElement(currency, "Currency");
		Select coun = new Select(currency);
		coun.selectByIndex(1);
		Thread.sleep(2000);
	}
	
	public void consulationCallYes() {
		verifyElement(consulatationCall,"Consulatation call"); 
		consulatationCall.click();
	}
	

    public void Callendate() throws InterruptedException {
    	
    	verifyElement(callEndDate,"End Date");
    	callEndDate.clear();
    	callEndDate.sendKeys("21-07-2022"+Keys.ENTER);
		Thread.sleep(2000);
	}
    
    
    public void selectProfessionals() throws InterruptedException  {
    	
    	verifyElement(selectProfessional,"select Professionals");
    	selectProfessional.sendKeys("David Beckham"+Keys.ENTER);
    	Thread.sleep(2000);
    	selectProfessional.click();
    }
    
	public void statusClick() throws InterruptedException {
		Thread.sleep(3000);
		verifyElement(status, "status");
		status.click();
	}
	
	

	public void saveClick() throws InterruptedException {

		verifyElement(save, "Save");
		save.click();
		Thread.sleep(3000);
		
	}
	
	

	public void createEvent() throws InterruptedException, AWTException {
		
		goToEvents();
		clickCreateNew();
		clickLiveEvent();
		setEventName("Live event automate 63 B2C");
		calendertDateClick();
		starttDateClick();
		endtDateClick();
		//descriptionClick();
		entereventDescription();
		eventTypeSelect();	
	}
	
	public void createEventForB2C() throws InterruptedException, AWTException {
		
		organisationTypeSelect();
		organisatioName();
		organisationLocation();
		remarksEnter();
		imageUpload();
		
	}
	
	public void createEventForB2B() throws InterruptedException, AWTException {
		
		organisationTypeSelectB2B();
		organisatioNameB2B();
		organisationLocation();
		remarksEnter();
		imageUpload();	
	}
	
	
	public void createEventWithPayment() throws InterruptedException {
		
			freeEvent();
			selectCountry();
			price();
			currency();	
		}
	
	public void consulatationCall() throws InterruptedException {
		
		consulationCallYes();
		Callendate();
		selectProfessionals();
		
	}
		
		public void save() throws InterruptedException {
			statusClick();
			saveClick();
			
		}
	
	
}