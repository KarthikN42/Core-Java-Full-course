package com.enhapp.web.pom;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.enhapp.common.library.Constants;
import com.enhapp.common.library.WebBasePage;

public class StoreAndEventPagePo extends WebBasePage implements Constants {
	
	public StoreAndEventPagePo(WebDriver driver) {
		super(driver);
	}
		@FindBy(xpath = "//span[normalize-space()='Store & Event Distribution']")
		private WebElement Storeandevents;
		
		@FindBy(xpath = "//*[@class='action_btn']")
		private WebElement createNew;
		
		@FindBy(xpath = "//*[@id='Common_CW_wt18_block_wt19_wtContent_wtMainContent_wt34_wtprogramtitle_inpt']")
		private WebElement Programtittle;
		
		@FindBy(xpath = "//input[@id='Common_CW_wt18_block_wt19_wtContent_wtMainContent_wt34_OutSystemsUIWeb_wtIconforCalendar2_block_wtInput_wtStartDate_inpt']")
		private WebElement dateClick;
		
		@FindBy(xpath = "//*[@class='pika-today-container pika-button']")
		private WebElement todayDate;
		
		@FindBy(xpath = "//*[@id='Common_CW_wt18_block_wt19_wtContent_wtMainContent_wt34_OutSystemsUIWeb_wtIconforCalendar_block_wtInput_wtEndDate_ip']")
		private WebElement endDate;
		
		@FindBy(xpath = "//*[@id='Common_CW_wt18_block_wt19_wtContent_wtMainContent_wt34_OutSystemsUIWeb_wt49_block_wtContent_wt91']")
		private WebElement packages1;
		
		@FindBy(xpath = "//*[@id='Common_CW_wt18_block_wt19_wtContent_wtMainContent_wt34_OutSystemsUIWeb_wt50_block_wtContent_OutSystemsUIWeb_wt51_block_wtContent_wt76']")
		private WebElement B2C;
		
		@FindBy(xpath = "//*[@id='Common_CW_wt18_block_wt19_wtContent_wtMainContent_wt34_wtCorporateName_cbx']")
		private WebElement selectCorporate;
		
		@FindBy(xpath = "//*[@class='choices__input choices__input--cloned SmartInput ReadOnly']")
		private WebElement selectCorporateForPackage;
		
		@FindBy(xpath="//*[@id=\"Common_CW_wt18_block_wt19_wtContent_wtMainContent_wt34_wtForm1\"]/div[4]/div[1]")
		private WebElement outerClick;
		
		@FindBy(xpath = "//*[@id='Common_CW_wt18_block_wt19_wtContent_wtMainContent_wt34_wtAccesssType']")
		private WebElement packgaeAcessType;
		
		@FindBy(xpath = "//*[@id='Common_CW_wt18_block_wt19_wtContent_wtMainContent_wt34_wtProgramManager']")
		private WebElement pFM;
		
		@FindBy(xpath = "//*[@id='Common_CW_wt18_block_wt19_wtContent_wtMainContent_wt34_wt102']")
		private WebElement salesManager;
		
		@FindBy(xpath = "//*[@id='Common_CW_wt18_block_wt19_wtContent_wtMainContent_wt34_wt111']")
		private WebElement others;
		
		@FindBy(xpath = "//*[@id='Common_CW_wt18_block_wt19_wtContent_wtMainContent_wt34_wt129']")
		private WebElement next;
		
		@FindBy(xpath = "//*[@id='Common_CW_wt18_block_wt19_wtContent_wtMainContent_wtEvenListBlock_wt16']")
		private WebElement addEvent;
		
		@FindBy(xpath = "//*[@id='Common_CW_wt18_block_wt19_wtContent_wtMainContent_wtEvenListBlock2_wt16']")
		private WebElement addEventB2C;
		
		@FindBy(xpath = "//*[@id='Common_CW_wt18_block_wt19_wtContent_wtMainContent_wtEvenListBlock_OutSystemsUIWeb_wtEventListPopUp_block_wtContent_wtPopUpEvent_listRecords_ctl00_OutSystemsUIWeb_wt69_block_wtContent_OutSystemsUIWeb_wt59_block_wtContent_wt119']")
		private WebElement addEventClick;
		
		@FindBy(xpath = "//*[@onclick=\"OsAjax(arguments[0] || window.event,'Common_CW_wt18_block_wt19_wtContent_wtMainContent_wtEvenListBlock2_OutSystemsUIWeb_wtEventListPopUp_block_wtContent_wtPopUpEvent_listRecords_ctl00_OutSystemsUIWeb_wt69_block_wtContent_OutSystemsUIWeb_wt59_block_wtContent_wt119','Common_CW_wt18$block$wt19$wtContent$wtMainContent$wtEvenListBlock2$OutSystemsUIWeb_wtEventListPopUp$block$wtContent$wtPopUpEvent_listRecords$ctl00$OutSystemsUIWeb_wt69$block$wtContent$OutSystemsUIWeb_wt59$block$wtContent$wt119','Change','__OSVSTATE,','');\"]")
		private WebElement addEventClickB2C;
		
		@FindBy(xpath = "//*[@id='Common_CW_wt18_block_wt19_wtContent_wtMainContent_wtEvenListBlock_OutSystemsUIWeb_wtEventListPopUp_block_wtFooter_wt110']")
		private WebElement addEventSave;
		
		@FindBy(xpath = "//*[@onclick=\"OsAjax(arguments[0] || window.event,'Common_CW_wt18_block_wt19_wtContent_wtMainContent_wtEvenListBlock2_OutSystemsUIWeb_wtEventListPopUp_block_wtFooter_wt110','Common_CW_wt18$block$wt19$wtContent$wtMainContent$wtEvenListBlock2$OutSystemsUIWeb_wtEventListPopUp$block$wtFooter$wt110','','__OSVSTATE,',''); return false;\"]")
		private WebElement addEventSaveB2C;
		
		@FindBy(xpath = "//*[@id='Common_CW_wt18_block_wt19_wtContent_wtMainContent_wtEvenListBlock_wtEventsListRecords_ctl03_wtBatchinput']")
		private WebElement onKeyUp;
		
		@FindBy(xpath = "//input[@id='Common_CW_wt18_block_wt19_wtContent_wtMainContent_wtEvenListBlock2_wtEventsListRecords_ctl03_wtBatchinput']")
		private WebElement onKeyUpB2C;
		
		@FindBy(xpath = "//*[@id='Common_CW_wt18_block_wt19_wtContent_wtMainContent_wtEvenListBlock_wt125']")
		private WebElement nextButton1;
		
		@FindBy(xpath = "//*[@id=\"Common_CW_wt18_block_wt19_wtContent_wtMainContent_wtEvenListBlock2_wt125\"]")
		private WebElement nextButton1B2C;
		
		@FindBy(xpath = "//*[@id='Common_CW_wt18_block_wt19_wtContent_wtMainContent_wt98_OutSystemsUIWeb_wt199_block_wtContent_wt49']")
		private WebElement addEmployee;
		
		@FindBy(xpath = "//*[@id='Common_CW_wt18_block_wt19_wtContent_wtMainContent_wt120_OutSystemsUIWeb_wt199_block_wtContent_wt49']")
		private WebElement addEmployeeForPackgesB2B;
		
		@FindBy(xpath = "//*[@id='Common_CW_wt18_block_wt19_wtContent_wtMainContent_wt98_OutSystemsUIWeb_wtEmployeeListPopUp_block_wtContent_wtBulkCheckBox2']")
		private WebElement addEmployeeClick;
		
		@FindBy(xpath = "//*[@id='Common_CW_wt18_block_wt19_wtContent_wtMainContent_wt120_OutSystemsUIWeb_wtEmployeeListPopUp_block_wtContent_wtBulkCheckBox2']")
		private WebElement ClickAddEmployeeForPackgesB2B;
		
		@FindBy(xpath = "//*[@id='Common_CW_wt18_block_wt19_wtContent_wtMainContent_wt98_OutSystemsUIWeb_wtEmployeeListPopUp_block_wtFooter_wt8']")
		private WebElement addEmployeeClickSave;
			
		@FindBy(xpath = "//*[@id='Common_CW_wt18_block_wt19_wtContent_wtMainContent_wt120_OutSystemsUIWeb_wtEmployeeListPopUp_block_wtFooter_wt8']")
		private WebElement addEmployeeClickSaveforB2BPackages;
		
		@FindBy(xpath = "//*[@id='Common_CW_wt18_block_wt19_wtContent_wtMainContent_wt98_wt267']")
		private WebElement nextButton2;
		
		@FindBy(xpath = "//*[@id='Common_CW_wt18_block_wt19_wtContent_wtMainContent_wt120_wt267']")
		private WebElement nextButton2PackgesB2B;
		
		@FindBy(xpath = "//*[@id='Common_CW_wt18_block_wt19_wtContent_wtMainContent_wt24_OutSystemsUIWeb_wtPlanDetail_block_wtColumn1_Spotcheck_Pat_wt34_block_wtDragElementsHere_OutSystemsUIWeb_wtPackageStructure_block_wtListRecords_wtPackages_corporate_ctl00_Spotcheck_Pat_wt137_block_wtContent']")
		private WebElement packagefrom;
		
		@FindBy(xpath = "//*[@id='Common_CW_wt18_block_wt19_wtContent_wtMainContent_wt24_OutSystemsUIWeb_wtPlanDetail_block_wtColumn2']")
		private WebElement packageTo;
		
		@FindBy(xpath = "//*[@id='Common_CW_wt18_block_wt19_wtContent_wtMainContent_wt24_OutSystemsUIWeb_wtPlanDetail_block_wtColumn2_Spotcheck_Pat_wtPackageDetailDrop_block']")
		private WebElement dropBlock;
		
		@FindBy(xpath = "//*[@id='Common_CW_wt18_block_wt19_wtContent_wtMainContent_wt24_wt115']")
		private WebElement packageSaveB2B;
		
		@FindBy(xpath = "//*[@id='Common_CW_wt18_block_wt19_wtContent_wtMainContent_wt132_wtListRecords1_ctl00_wt20_wtListRecords1_ctl00_OutSystemsUIWeb_wt8_block_wtTimeDropdown_wtPrompt_wtInput_wt45']")
		private WebElement startTime;
		
		@FindBy(xpath = "//*[@id=\"Common_CW_wt18_block_wt19_wtContent_wtMainContent_wt35_wtListRecords1_ctl00_wt20_wtListRecords1_ctl00_OutSystemsUIWeb_wt8_block_wtTimeDropdown_wtPrompt_wtInput_wt45\"]")
		private WebElement startTimeB2C;
		
		@FindBy(xpath = "//*[@id='Common_CW_wt18_block_wt19_wtContent_wtMainContent_wt132_wtListRecords1_ctl00_wt20_wtListRecords1_ctl00_wtEndDate_inpt']")
		private WebElement endDate1;
		
		@FindBy(xpath = "//*[@id=\"Common_CW_wt18_block_wt19_wtContent_wtMainContent_wt35_wtListRecords1_ctl00_wt20_wtListRecords1_ctl00_wtEndDate_inpt\"]")
		private WebElement endDate1B2C;
		
		//@FindBy(xpath = "//div[@class='heading6 padding-m']")
		//private WebElement outerClick;
		
		@FindBy(xpath = "//*[@id='Common_CW_wt18_block_wt19_wtContent_wtMainContent_wt132_wtListRecords1_ctl00_wt20_wtListRecords1_ctl00_OutSystemsUIWeb_wt58_block_wtTimeDropdown_wtPrompt_wtInput_wt10']")
		private WebElement endTime1;
		
		@FindBy(xpath = "//*[@id=\"Common_CW_wt18_block_wt19_wtContent_wtMainContent_wt35_wtListRecords1_ctl00_wt20_wtListRecords1_ctl00_OutSystemsUIWeb_wt58_block_wtTimeDropdown_wtPrompt_wtInput_wt10\"]")
		private WebElement endTime1B2C;
		
		@FindBy(xpath = "//*[@id='Common_CW_wt18_block_wt19_wtContent_wtMainContent_wt132_wtListRecords1_ctl00_wt20_wtListRecords1_ctl00_wtCapacity']")
		private WebElement capacity;
		
		@FindBy(xpath = "//*[@name=\"Common_CW_wt18$block$wt19$wtContent$wtMainContent$wt35$wtListRecords1$ctl00$wt20$wtListRecords1$ctl00$wtCapacity\"]")
		private WebElement capacityB2C;
		
		@FindBy(xpath = "//*[@id='Common_CW_wt18_block_wt19_wtContent_wtMainContent_wt132_wtListRecords1_ctl00_wt20_wtListRecords1_ctl00_wt29']")
		private WebElement location;
		
		@FindBy(xpath = "//*[@id=\"Common_CW_wt18_block_wt19_wtContent_wtMainContent_wt35_wtListRecords1_ctl00_wt20_wtListRecords1_ctl00_wt29\"]")
		private WebElement locationB2C;
		
		@FindBy(xpath = "//*[@id='Common_CW_wt18_block_wt19_wtContent_wtMainContent_wt132_wt21']")
		private WebElement save;
		
		@FindBy(xpath = "//*[@id='Common_CW_wt18_block_wt19_wtContent_wtMainContent_wt35_wt21']")
		private WebElement saveB2C;
		
		
		String programTittle = PROGRAM_TITTLE;
		String storAndEventdendDate =  STOREANDEVENTS_END_DATE;
		String deliveryMode = DELIVERY_MODE;
		String toStore = TO_STORE;
		String selectCOrporate = SELECT_CORPORATE;
		String batch = BATCH;
		String eventStartTime = BATCH;
		String eventEndDate = EVENT_END_DATE;
		String eventEndTime = EVENT_END_TIME;
		String eventcapacity = CAPACITY;
		String eventlocation = LOCATION;
		
		
		public void goToStorAndEvents()  {

			verifyElement(Storeandevents, "Store & Event link");
			Storeandevents.click();
			
		}
		
		public void createNew(){
			
			verifyElement(createNew ,"Create New");
			createNew.click();
			
		}
		
		public void createStoreAndEvents() throws InterruptedException {
			{
			verifyElement(Programtittle,"Program Title");
			//Program Title
			Programtittle.sendKeys(programTittle);
			
			dateClick.click();
			
        	todayDate.click();
        	
        	//End Date
			endDate.sendKeys(storAndEventdendDate);
			
		
			//Package or Events
			
			if(deliveryMode.equalsIgnoreCase("Packages")) {
				packages1.click();
				if (toStore.equalsIgnoreCase("B2C")) {
					B2C.click();
					//Professional Account Manage
					
					Select pfm = new Select(pFM);
					pfm.selectByIndex(1);
					
					//Sales Manager
					Select sales = new Select(salesManager);
					sales.selectByIndex(1);
					
					//Others
					Select ot = new Select(others);
					ot.selectByIndex(1);
					
					next.click();
			}else {
				    selectCorporateForPackage.sendKeys(selectCOrporate+Keys.ENTER);
				    dateClick.click();
					
					Thread.sleep(2000);
					packgaeAcessType.click();
					Select pat =new Select(packgaeAcessType);
					pat.selectByValue("1");
					
					//Professional Account Manage
					Select pfm = new Select(pFM);
					pfm.selectByIndex(1);
					
					//Sales Manager
					Select sales = new Select(salesManager);
					sales.selectByIndex(1);
					
					//Others
					Select ot = new Select(others);
					ot.selectByIndex(1);
					
					next.click();
					Thread.sleep(2000);
					
					//Add Employee
					addEmployeeForPackgesB2B.click();
					Thread.sleep(2000);
					
					//Click CHeck Box
					ClickAddEmployeeForPackgesB2B.click();
					Thread.sleep(2000);
					
					//Save
					addEmployeeClickSaveforB2BPackages.click();
					
					Thread.sleep(2000);
					nextButton2PackgesB2B.click();
					
					Thread.sleep(2000);
					Actions click = new Actions(driver);
					//click.dragAndDrop(packagefrom, packageTo).build().perform();
					click.clickAndHold(packagefrom)
					.pause(Duration.ofSeconds(2))
					.moveToElement(packageTo)
					.pause(Duration.ofSeconds(2))
					.release(packageTo).
					build()
					.perform();
					//click.dragAndDropBy(packagefrom, 300, 200);
					Thread.sleep(2000);
					packageSaveB2B.click();
				}
			}
			
			//B2BorB2C
			
			if (toStore.equalsIgnoreCase("B2C")) {
				B2C.click();
				
				//Professional Account Manage
				Select pfm = new Select(pFM);
				pfm.selectByIndex(1);
				
				//Sales Manager
				Select sales = new Select(salesManager);
				sales.selectByIndex(1);
				
				//Others
				Select ot = new Select(others);
				ot.selectByIndex(1);
				
				next.click();
				
				//Add Event
				addEventB2C.click();
				Thread.sleep(2000);
				
				//Add Event Click
				addEventClickB2C.click();
				Thread.sleep(2000);
				
				//Save
				addEventSaveB2C.click();
				Thread.sleep(2000);
				
				//Batch
				Thread.sleep(2000);
				onKeyUpB2C.click();
				onKeyUpB2C.clear();
				onKeyUpB2C.sendKeys(batch);
				
				nextButton1B2C.click();
				
				//Start Time
	        	startTimeB2C.clear();
	        	startTimeB2C.sendKeys(eventStartTime);
	        	startTimeB2C.click();
	        	
				//End Date
				endDate1B2C.clear();
				endDate1B2C.sendKeys(eventEndDate);
				
				//EndTime
				endTime1B2C.clear();
				endTime1B2C.sendKeys(eventEndTime);
				endTime1B2C.click();
				
				//capacity 
				capacityB2C.clear();
				capacityB2C.sendKeys(eventcapacity);
				capacityB2C.click();
				Thread.sleep(2000);
				
				//Location
				locationB2C.sendKeys(eventlocation);
				locationB2C.click();
				Thread.sleep(2000);
				
				//Save
				verifyElement(saveB2C,"Save");
				saveB2C.click();
				Thread.sleep(5000);
				
			}else {
				selectCorporate.sendKeys(selectCOrporate);
				selectCorporate.click();	
				
				//Professional Account Manage
				Select pfm = new Select(pFM);
				pfm.selectByIndex(1);
				
				//Sales Manager
				Select sales = new Select(salesManager);
				sales.selectByIndex(1);
				
				//Others
				Select ot = new Select(others);
				ot.selectByIndex(1);
				
				next.click();
				
				//Add Event
				addEvent.click();
				Thread.sleep(2000);
				
				//Add Event Click
				addEventClick.click();
				Thread.sleep(2000);

				//Save
				addEventSave.click();
				Thread.sleep(2000);
				
				//Batch
				Thread.sleep(2000);
				onKeyUp.click();
				onKeyUp.clear();
				onKeyUp.sendKeys(batch);
				
				nextButton1.click();
				
				//Add Employee
				addEmployee.click();
				Thread.sleep(2000);
				
				//Add Employee Click
				addEmployeeClick.click();
				Thread.sleep(2000);
				
				//Add Employee Click Save
				addEmployeeClickSave.click();
	        	Thread.sleep(2000);
	        	
	        	nextButton2.click();
	        	
	        	//Start Time
	        	startTime.clear();
				startTime.sendKeys(eventStartTime);
				startTime.click();
	        	
				//End Date
				endDate1.clear();
				endDate1.sendKeys(eventEndDate);
				
				//End Time
				endTime1.clear();
				endTime1.sendKeys(eventEndTime);
				endTime1.click();
				
				//capacity 
				capacity.clear();
				capacity.sendKeys(eventcapacity);
				capacity.click();
				Thread.sleep(2000);
				
				//Location
				
				location.sendKeys(eventlocation);
				location.click();
				Thread.sleep(2000);
				
				//Save
				verifyElement(save,"Save");
				save.click();
				Thread.sleep(5000);
				 
				
			}
			
			}
		}
		 
		public void createStoreAndeventsB2C() throws InterruptedException {
			
			goToStorAndEvents();
			createNew();
			createStoreAndEvents();

			}
		}