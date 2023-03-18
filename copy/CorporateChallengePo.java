package com.enhapp.web.pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.enhapp.common.library.Constants;
import com.enhapp.common.library.WebBasePage;

public class CorporateChallengePo extends WebBasePage implements Constants {

	private static final Object Miles = null;
	public WebDriverWait wait;
	public WebDriverWait waitInvisible;

	public CorporateChallengePo(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//*[contains(text(),'Challenges')]")
	private WebElement challenges;

	@FindBy(xpath = "//*[@id='Common_CW_wt195_block_wt19_wtContent_wtActions_Spotcheck_Pat_wt329_block_wtCreateNew_Link']/span")
	private WebElement createNew;

	@FindBy(xpath = "//input[@name='Common_CW_wt50$block$wt19$wtContent$wtMainContent$wtChallenge_Name'][@type=\"text\"]")
	private WebElement name;

	@FindBy(xpath = "//*[@id='Common_CW_wt50_block_wt19_wtContent_wtMainContent_OutSystemsUIWeb_wt318_block_wtInput_wtChallenge_StartDate']")
	private WebElement startDate;

	@FindBy(xpath = "//*[@class=\"pika-go-today\"]")
	private WebElement TodayClick;

	@FindBy(xpath = "//*[@id='Common_CW_wt50_block_wt19_wtContent_wtMainContent_OutSystemsUIWeb_wt67_block_wtInput_wtChallenge_EndDate']")
	private WebElement endDate;

	@FindBy(id = "Common_CW_wt50_block_wt19_wtContent_wtMainContent_Spotcheck_Pat_wt104_block_wtPlaceTextAreaHere_wtChallenge_Description")
	private WebElement description;

	@FindBy(xpath = "//*[@id='Common_CW_wt50_block_wt19_wtContent_wtMainContent_Spotcheck_Pat_wt42_block_wtctn_Imageupload']//div[2]")
	private WebElement thumbImageUploadBtn;

	@FindBy(xpath = "//*[@class='os-internal-ui-dialog os-internal-ui-widget os-internal-ui-widget-content os-internal-ui-corner-all os-internal-Popup os-internal-ui-draggable']//iframe")
	private WebElement imageFrameXpath;

	@FindBy(xpath = "//*[@id=\"wt16\"]")
	private WebElement thumbImageUploadSaveBtn;

	@FindBy(xpath = "//input[@id='Common_CW_wt50_block_wt19_wtContent_wtMainContent_Spotcheck_Pat_wt369_block_wtActivityImageURL']")
	private WebElement videoURL;

	@FindBy(xpath = "//*[@id='Common_CW_wt50_block_wt19_wtContent_wtMainContent_wtChallenge_PerformanceIndicatorId']")
	private WebElement performanceIndicator;

	@FindBy(xpath = "//*[@name=\"Common_CW_wt50$block$wt19$wtContent$wtMainContent$wtChallenge_Goal\"][@type=\"number\"]")
	private WebElement goal;

	@FindBy(xpath = "//*[@id='Common_CW_wt50_block_wt19_wtContent_wtMainContent_OutSystemsUIWeb_wt16_block_wtContent_wt55']")
	private WebElement maximumAchieved;

	@FindBy(xpath = "//*[@id='Common_CW_wt50_block_wt19_wtContent_wtMainContent_wtChallenge_ParticipantLimit']")
	private WebElement participentLimit;

	@FindBy(xpath = "//*[@id='Common_CW_wt50_block_wt19_wtContent_wtMainContent_wtChallenge_LeaderboardFrequencyId']")
	private WebElement consider;

	@FindBy(xpath = "//*[@id='Common_CW_wt50_block_wt19_wtContent_wtMainContent_wtChallenge_LeaderboardFrequencyId3']")
	private WebElement tracker;

	@FindBy(xpath = "//*[@id='Common_CW_wt50_block_wt19_wtContent_wtMainContent_wtChallenge_GoalPeriodId2']")
	private WebElement UOM;

	@FindBy(xpath = "//*[@id='Common_CW_wt50_block_wt19_wtContent_wtMainContent_OutSystemsUIWeb_wt324_block_wtContent_wtWinnerConCheckbox']")
	private WebElement winnerAnnouce;

	@FindBy(xpath = "//*[@id='Common_CW_wt50_block_wt19_wtContent_wtMainContent_wtChallenge_NumberofWinners']")
	private WebElement noOfWinners;

	@FindBy(xpath = "//*[@id='Common_CW_wt50_block_wt19_wtContent_wtMainContent_wtListOfWinnerReward_ctl00_wtReward']")
	private WebElement rewards1;

	@FindBy(xpath = "//*[@id='Common_CW_wt50_block_wt19_wtContent_wtMainContent_wtListOfWinnerReward_ctl02_wtReward']")
	private WebElement rewards2;

	@FindBy(xpath = "//*[@id='Common_CW_wt50_block_wt19_wtContent_wtMainContent_OutSystemsUIWeb_wt103_block_wtContent_OutSystemsUIWeb_wt261_block_wtContent_wtActive3']")
	private WebElement winnerAnncounceManual;

	@FindBy(xpath = "//*[@id='Common_CW_wt50_block_wt19_wtContent_wtMainContent_wt61']")
	private WebElement save;

	public void goTochallenge() {

		verifyElement(challenges, "challenge ");
		challenges.click();

	}

	public void createNew() {

		verifyElement(createNew, "Create New");
		createNew.click();

	}

	public void name() {

		verifyElement(name, "Name");

	}

	public void startDateClick() {

		verifyElement(startDate, "StartDate");
		startDate.click();

	}

	public void todayDateClick() {

		verifyElement(TodayClick, "Today Click");
		TodayClick.click();

	}

	public void endDateClick() {

		verifyElement(endDate, "EndDate Click");
		endDate.clear();

	}

	public void description() {

		verifyElement(description, "Description");

	}

	public void imageUpload() throws InterruptedException, AWTException {

		verifyElement(thumbImageUploadBtn, "imageupload");
		// thumbImageUploadBtn.sendKeys(imageUrl); Thread.sleep(5000);
		// switchToFrameAndClick(imageFrameXpath, thumbImageUploadSaveBtn);
		thumbImageUploadBtn.click();
		Thread.sleep(4000);
		String file = "C:\\Users\\Spotcheck\\Pictures\\Upload.jpg";
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
		thumbImageUploadSaveBtn.click();
		Thread.sleep(5000);
		// driver.switchTo().defaultContent();

	}

	public void videoURL() throws InterruptedException {
		
		verifyElement(videoURL, "Upload Video");
		Thread.sleep(3000);
	}

//	public void performanceIndicator(String indicator) throws InterruptedException {
//
//		verifyElement(performanceIndicator, "Performance Indicator");
//		performanceIndicator.click();
//		Select per = new Select(performanceIndicator);
//
//		if (indicator.equals("Steps")) {
//			per.selectByVisibleText("Steps");
//		} else if (indicator.equals("Calories")) {
//			per.selectByVisibleText("Calories");
//		} else if (indicator.equals("Water")) {
//			per.selectByVisibleText("Water");
//		} else if (indicator.equals("Hiking")) {
//			per.selectByVisibleText("Hiking");
//		} else if (indicator.equals("Running")) {
//			per.selectByVisibleText("Running");
//		} else if (indicator.equals("Bicycling")) {
//			per.selectByVisibleText("Bicycling");
//		} else {
//			per.selectByVisibleText("Swimming");
//		}
//	}

	public void stepsChallenge() throws InterruptedException {

		performanceIndicator.click();
		Select per = new Select(performanceIndicator);
		per.selectByVisibleText("Steps");
		Thread.sleep(2000);
		
		goal.sendKeys("10000");
		
		maximumAchieved.click();
		
		participentLimit.sendKeys("3");
		
		Select con = new Select(consider);
		con.selectByVisibleText("Gfit + Other Sources");

	}

	public void caloriesChallenge() throws InterruptedException {

		performanceIndicator.click();
		Select per = new Select(performanceIndicator);
		per.selectByVisibleText("Calories");
		Thread.sleep(2000);
		
		goal.sendKeys("5000");
		
		maximumAchieved.click();
		
		participentLimit.sendKeys("3");

	}
	
	public void waterChallenge() throws InterruptedException {

		performanceIndicator.click();
		Select per = new Select(performanceIndicator);
		per.selectByVisibleText("Water");
		Thread.sleep(2000);
		goal.clear();
		
		goal.sendKeys("9");
		
		maximumAchieved.click();
		
		participentLimit.sendKeys("3");

	}
	
	public void hikingChallenge() throws InterruptedException {

		performanceIndicator.click();
		Select per = new Select(performanceIndicator);
		per.selectByVisibleText("Hiking");
		Thread.sleep(2000);
		goal.clear();
		
		goal.sendKeys("9");
		
		maximumAchieved.click();
		
		participentLimit.sendKeys("3");
		
		tracker.click();
		Thread.sleep(2000);
		verifyElement(UOM, "UOM");
		UOM.click();
	
		Select se = new Select(UOM);
		
		 String mo = "Minutes";
		 
		if (mo.equals("Meters")) {
			se.selectByVisibleText("Meters");
		} else if (mo.equals("Kilometer")) {
			se.selectByVisibleText("Kilometer");
		} else {
			se.selectByVisibleText("Minutes");
		}
	}
	
	public void runningChallenge() throws InterruptedException {

		performanceIndicator.click();
		Select per = new Select(performanceIndicator);
		per.selectByVisibleText("Bicycling");
		Thread.sleep(1000);
		goal.clear();
		
		goal.sendKeys("900");
		
		maximumAchieved.click();
		
		participentLimit.sendKeys("3");
		
        Select sec = new Select(tracker);
        //sec.selectByVisibleText("Tracker");
        sec.selectByVisibleText("Manual");
        Thread.sleep(2000);
        Select tracker = new Select(UOM);

		verifyElement(UOM, "UOM");
		UOM.click();
		
		Select se = new Select(UOM);
		 String mo = "Kilometer";
//		 
//		 if (mo.equals("Meters")) {
//				se.selectByVisibleText("Meters");
//		 } else 
//				se.selectByVisibleText("Minutes");
//		 
//	}
		 
		if (mo.equals("Meters")) {
			se.selectByVisibleText("Meters");
		} else if (mo.equals("Kilometer")) {
			se.selectByVisibleText("Kilometer");
		} else {
			se.selectByVisibleText("Minutes");
		}
	}
	
	public void bicyclingChallenge() throws InterruptedException {

		performanceIndicator.click();
		Select per = new Select(performanceIndicator);
		per.selectByVisibleText("Running");
		Thread.sleep(1000);
		goal.clear();
		
		goal.sendKeys("900");
		
		maximumAchieved.click();

		participentLimit.sendKeys("3");
		
		tracker.click();
		Select sec = new Select(tracker);
       
        sec.selectByVisibleText("Tracker");
        //sec.selectByVisibleText("Manual");
        Thread.sleep(2000);
        Select tracker = new Select(UOM);

		verifyElement(UOM, "UOM");
		UOM.click();
		
		Select se = new Select(UOM);
		 String mo = "Minutes";
		 
		 if (mo.equals("Meters")) {
				se.selectByVisibleText("Meters");
		 } else 
				se.selectByVisibleText("Minutes");
		 
	}
		 
//		if (mo.equals("Meters")) {
//			se.selectByVisibleText("Meters");
//		} else if (mo.equals("Kilometer")) {
//			se.selectByVisibleText("Kilometer");
//		} else {
//			se.selectByVisibleText("Minutes");
//		}
//	}
		

	public void swimmingChallenge() throws InterruptedException {

		performanceIndicator.click();
		Select per = new Select(performanceIndicator);
		per.selectByVisibleText("Swimming");
		Thread.sleep(1000);
		goal.clear();
		
		goal.sendKeys("900");
		
		maximumAchieved.click();

		participentLimit.sendKeys("3");
		
		tracker.click();
		Select sec = new Select(tracker);
       
        //sec.selectByVisibleText("Tracker");
        sec.selectByVisibleText("Manual");
        Thread.sleep(2000);
        Select tracker = new Select(UOM);

		verifyElement(UOM, "UOM");
		UOM.click();
		
		Select se = new Select(UOM);
		 String mo = "Minutes";
		 
//		 if (mo.equals("Meters")) {
//				se.selectByVisibleText("Meters");
//		 } else 
//				se.selectByVisibleText("Minutes");
//		 
//	}
		 
		if (mo.equals("Meters")) {
			se.selectByVisibleText("Meters");
		} else if (mo.equals("Kilometer")) {
			se.selectByVisibleText("Kilometer");
		} else {
			se.selectByVisibleText("Yards");
		}
	}



			
		


		
		

	public void winnerann() throws InterruptedException {

		verifyElement(winnerAnnouce, "Winner Annouce");
		winnerAnnouce.click();
		Thread.sleep(4000);

	}

	public void noOfWinners() throws InterruptedException {

		verifyElement(noOfWinners, "No Of Winners");
		noOfWinners.click();
		Thread.sleep(3000);
		noOfWinners.sendKeys("2");

	}

	public void rewards() throws InterruptedException {

		Thread.sleep(2000);
		verifyElement(rewards1, "Rewards1");
		verifyElement(rewards2, "Rewards2");
		rewards1.sendKeys("amazon Gift");
		rewards2.sendKeys("Flipkart Gift");
	}

//	public void goal(int no) throws InterruptedException {
//
//		verifyElement(goal, "Goal");
//		goal.click();
//		goal.clear();
//		
//	}

//	public void goalcri(String criteria) {
//		
//		verifyElement(goalCriteria,"Goal Criteria");
//		if(criteria.equals("Maximum Achieved"));{
//			goalCriteria.click();
//		}
//	}

	public void manual() throws InterruptedException {

		Thread.sleep(2000);
		verifyElement(winnerAnncounceManual, "Winner Anncounce Manual");
		winnerAnncounceManual.click();
		Thread.sleep(5000);

	}

	public void save() throws InterruptedException {

		verifyElement(save, "Save");
		Thread.sleep(5000);
		save.click();
		Thread.sleep(5000);
	}

	public void createchallenge() throws InterruptedException, AWTException {

		goTochallenge();
		createNew();
		name();                      name.sendKeys("automation Swimming challenge");
		startDateClick();
		todayDateClick();
		endDateClick();              endDate.sendKeys("10-07-2022");
		description();               description.sendKeys("Water Challenge automation ");
		imageUpload();
		videoURL();                  videoURL.sendKeys("https://vimeo.com/671964165");

	}

	public void steps() throws InterruptedException {

		stepsChallenge();
	}

	public void calories() throws InterruptedException {

		caloriesChallenge();
	}
   
	public void water() throws InterruptedException {

		waterChallenge();
	}
	public void hiking()  throws InterruptedException {

		hikingChallenge();
	}
	
	public void running()  throws InterruptedException {
		
	    runningChallenge();
	}
	
	public void bicycling() throws InterruptedException {
		
		bicyclingChallenge();
	}
	
    public void swimming() throws InterruptedException {
		
	swimmingChallenge();
	}
	public void Winnerannouncement() throws InterruptedException {

		winnerann();
		noOfWinners();
		rewards();
		save();
	}
}