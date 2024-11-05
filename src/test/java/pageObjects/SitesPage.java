package pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class SitesPage extends Basepage {
JavascriptExecutor js;
	
	
	public SitesPage(WebDriver driver){
		super(driver);
	}
	public void scroll(WebElement ele)
	{
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments [0].scrollIntoView();",ele);
	}
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
	@FindBy(xpath="/html/body/div/div[1]/form/div[1]/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div/div/div/div/div[3]/div/div/div/input")  	//opening Sites page
	WebElement Sites;
	public void ClickSites() throws InterruptedException {
		//Thread.sleep(15000);
		wait.until(ExpectedConditions.elementToBeClickable(Sites));
		Sites.click();
	}
	
	@FindBy(xpath = "//input[@value='IT']")        		//Selecting Country As Italy
	WebElement IT;
	@FindBy(id="frmUserSitePermissions_confirmChangeActionAlert_btnSave")
	WebElement PopUpSave;
	public void ClickPop() {
		PopUpSave.click();
		
		
	}
	public void SelectCountry() {
		try {
			
			IT.click();
			
		}
		catch(Exception e){
			System.out.println("Click intercepted");
			
		}
		
		
	}
	
	@FindBy(id="frmSites_cmbSearchKeySEPRHASHIT")  		//Selecting contract Number in Drop
	WebElement SitesDrp;
	public void SelectCntrctNum() {
		Select CntctNumber = new Select(SitesDrp);
		CntctNumber.selectByVisibleText("Contract Number");
		}
	
	@FindBy(id="frmSites_txtSearchKeySEPRHASHIT")   	//Enter contract number
	WebElement SearchKey;
	public void EnterContractNum() throws InterruptedException {
		Thread.sleep(2000);
		SearchKey.sendKeys("00853308");
	}
	
	@FindBy(id="frmSites_btnSearchSEPRHASHIT")			//Click Search Button
	WebElement ButtonSearch;
	public void Click_Search() throws InterruptedException {
		Thread.sleep(2000);
		ButtonSearch.click();							
	}
	
	@FindBy(id="flxSearchResultRowSEPRHASHIT_lblSearchResultColumn1")    // Clicking the Displayed Accounts
	WebElement AccDetails;
	public void ClickDetails() {
		AccDetails.click();
	}
	
	@FindBy(id="frmSites_btnSaveSEPRHASHIT")
	WebElement SaveBtn;
	public void Click_saveBTn() throws InterruptedException {   // Clicking Save Button
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].scrollIntoView();",SaveBtn);
		scroll(SaveBtn);
		Thread.sleep(2000);
		SaveBtn.click();
	}
	
	@FindBy(id="frmSites_wCustomAlert_btnOk")				// Closing PopUp  by clicking close Button
	WebElement CloseBtn;
	public void Click_CloseBtn() throws InterruptedException {
		//Thread.sleep(8000);
		wait.until(ExpectedConditions.elementToBeClickable(CloseBtn));
		CloseBtn.click();
	}
	
	@FindBy(id="frmSites_btnSiteContractSEPRHASHIT")		// Click contract page 
	WebElement ContractPage;
	public void ClickContractPage() throws InterruptedException {
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView();",ContractPage);
		scroll(ContractPage);
		ContractPage.click();
		Thread.sleep(2000);
	}
	
	@FindBy(id="frmSites_txaSiteContract14SEPRHASHIT")
	WebElement TextBar_1;
	public void EnterText_1() throws InterruptedException {		// entering the text
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView();",TextBar_1);
		scroll(TextBar_1);
		Thread.sleep(2000);
		TextBar_1.sendKeys("Abc");
	}
	
	@FindBy(xpath="//*[@id=\"frmSites_chkSiteContract16SEPRHASHIT\"]/div/input")  // Clicking The ChecKbox
	WebElement ContractCheckbox;
	public void ClickCntrtcheckbox() throws InterruptedException {
		Thread.sleep(5000);
		ContractCheckbox.click();
	}
	/*@FindBy(id="frmSites_btnSaveSEPRHASHIT")							//Click the save button
	WebElement SaveBtn;
	public void Click_saveBTn() throws InterruptedException {   
		js.executeScript("arguments[0].scrollIntoView();",SaveBtn);
		Thread.sleep(2000);
		SaveBtn.click();
	}*/
	
	/*@FindBy(id="frmSites_wCustomAlert_btnOk")				// Closing PopUp  by clicking close Button
	WebElement CloseBtn;
	public void Click_CloseBtn() {
		CloseBtn.click();
	}*/
	
	@FindBy(id="frmSites_btnSiteUsersSEPRHASHIT")		// clicking SiteUsers Section
	WebElement SiteUsers;
	public void ClickSiteUsers() throws InterruptedException {
		Thread.sleep(3000);
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView();",SiteUsers);
		scroll(SiteUsers);
		Thread.sleep(3000);
		SiteUsers.click();
	}
	
	@FindBy(id="frmSites_txtSiteUserSearchKeySEPRHASHIT")  // Searching the user 
	WebElement SiteUsersSearch;
	@FindBy(id="frmSites_btnSearchSEPRHASHIT")
	WebElement Goo;
	public void SiteUsers_SearchBar() {
		SiteUsersSearch.sendKeys("Karthik");
		Goo.click();
	}
	
	@FindBy(id="flxSearchResultRowSEPRHASHIT_btnSearchResultColumn2")// clicking add/delete button
	WebElement AddRemove;
	public void ClickAddRemoveBtn() throws InterruptedException {
		Thread.sleep(6000);
		AddRemove.click();
	}
	
	@FindBy(id="frmSites_btnSiteUserSaveSEPRHASHIT")
	WebElement SiteUsersSave;
	public void ClickSiteUsers_Save() throws InterruptedException {
		SiteUsersSave.click();
		Thread.sleep(5000);
	}
	/*@FindBy(id="frmSites_wCustomAlert_btnOk")				// Closing PopUp  by clicking close Button
	WebElement CloseBtn;
	public void Click_CloseBtn() {
		CloseBtn.click();
	}*/
	
	@FindBy(id="frmSites_btnRiskAssessmentSEPRHASHIT")				// clicking the Riskassessment page
	WebElement RiskAssessment;
	public void ClickRiskAssessment() throws InterruptedException {
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView();",RiskAssessment);
		scroll(RiskAssessment);
		Thread.sleep(3000);
		RiskAssessment.click();
	}
	
	@FindBy(xpath="//*[@id='frmSites_chkSiteRiskSEPRHASHIT-1']/div/input") // checking/unchecking the checkboxes
	WebElement RiskAssCheckBox_1;
	public void ClickRiskAssCheckBox_1() {
		RiskAssCheckBox_1.click();
	}
	
	@FindBy(xpath="//*[@id='frmSites_chkSiteRiskSEPRHASHIT-2']/div/input")
	WebElement RiskAssCheckBox_2;
	public void ClickRiskAssCheckBox_2() {
		RiskAssCheckBox_2.click();
	}
	@FindBy(xpath="//*[@id='frmSites_chkSiteRiskSEPRHASHIT-3']/div/input")
	WebElement RiskAssCheckBox_3;
	public void ClickRiskAssCheckBox_3() {
		RiskAssCheckBox_3.click();
	}
	@FindBy(xpath="//*[@id='frmSites_chkSiteRiskSEPRHASHIT-4']/div/input")
	WebElement RiskAssCheckBox_4;
	public void ClickRiskAssCheckBox_4() {
		RiskAssCheckBox_4.click();
	}
	@FindBy(id="frmSites_txaSiteRiskSEPRHASHIT-15")				//Entering some text in the textfield 
	WebElement RiskAssText_1;
	public void RiskAss_Text1() throws InterruptedException {
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView();",RiskAssText_1);
		scroll(RiskAssText_1);
		Thread.sleep(3000);
		RiskAssText_1.sendKeys("Abc");
	}
	
	@FindBy(id="frmSites_txaSiteRiskSEPRHASHIT-18")				// clearing the text
	WebElement RiskAssText_2;
	public void RiskAss_Text2() {
		RiskAssText_2.clear();
	}
	/*@FindBy(id="frmSites_btnSaveSEPRHASHIT")							//Click the save button
	WebElement SaveBtn;
	public void Click_saveBTn() throws InterruptedException {   
		js.executeScript("arguments[0].scrollIntoView();",SaveBtn);
		Thread.sleep(2000);
		SaveBtn.click();
	}*/
	
	/*@FindBy(id="frmSites_wCustomAlert_btnOk")				// Closing PopUp  by clicking close Button
	WebElement CloseBtn;
	public void Click_CloseBtn() {
		CloseBtn.click();
	}*/
	
	@FindBy(id="frmSites_btnSiteAreasSEPRHASHIT")       // clicking siteareas button
	WebElement SiteAreas;
	public void ClickSiteAreas() throws InterruptedException {
		Thread.sleep(3000);
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView();",SiteAreas);
		scroll(SiteAreas);
		SiteAreas.click();
	}
	
	@FindBy(id="frmSites_txtSiteAreaAddNew")			// add name of the building
	WebElement AddBuildingText;
	public void AddBuilding_name() throws InterruptedException {
		Thread.sleep(3000);
		AddBuildingText.sendKeys("TestBuilding_02");
	}
	
	@FindBy(id="frmSites_btnSiteAreaAddNew")			// click add button 
	WebElement Buildings_addBtn;
	public void ClickBuildings_add() {
		Buildings_addBtn.click();
	}
	/*@FindBy(id="frmSites_wCustomAlert_btnOk")				// Closing PopUp  by clicking close Button
	WebElement CloseBtn;
	public void Click_CloseBtn() {
		CloseBtn.click();
	}*/
	
	@FindBy(id="frmSites_btnSiteAreaFloor")				// Clicking the floor button in site areas section 
	WebElement Floors;
	public void ClickFloorsBtn() throws InterruptedException {
		Thread.sleep(3000);
		Floors.click();
	}
	@FindBy(id="frmSites_cmbxSiteAreaSelBuilding")		//selecting the building name
	WebElement Building;
	public void SelectBuildingName() throws InterruptedException {
		Select BuildingDrp = new Select(Building);
		BuildingDrp.selectByVisibleText("TestBuilding_02");
		Thread.sleep(3000);
	}
	@FindBy(id="frmSites_txtSiteAreaAddNew")			//creating the floor name 
	WebElement FloorSection;
	public void AddFloor() {
		FloorSection.sendKeys("testing123");
	}
	@FindBy(xpath="//*[@id='frmSites_btnSiteAreaAddNew']")  // clicking add button
	WebElement FloorAdd;
	public void Click_FloorAddBtn() throws InterruptedException {
		FloorAdd.click();
		Thread.sleep(3000);
	}
	
	/*@FindBy(id="frmSites_wCustomAlert_btnOk")				// Closing PopUp  by clicking close Button
	WebElement CloseBtn;
	public void Click_CloseBtn() {
		CloseBtn.click();
	}*/
	
	@FindBy(id="frmSites_btnSiteAreaZones")				// click on zones section 
	WebElement Zones;
	public void ClickZones() {
		Zones.click();
	}
	/*@FindBy(id="frmSites_cmbxSiteAreaSelBuilding")		//selecting the building name
	WebElement Building;
	public void SelectBuildingName() throws InterruptedException {
		Select BuildingDrp = new Select(Building);
		BuildingDrp.selectByVisibleText("TestBuilding_1");
		Thread.sleep(3000);*/
	
	@FindBy(id="frmSites_cmbxSiteAreaSelFloor")		//selecting the Floor name 
	WebElement SelFloorName;
	public void SelectfloorName() throws InterruptedException {
		Select FloorDrp = new Select(SelFloorName);
		FloorDrp.selectByVisibleText("testing123");
		Thread.sleep(3000);
	}
	
	@FindBy(id="frmSites_txtSiteAreaAddNew")  // add new zone
	WebElement AddNewZone;
	public void AddNewZoneName() {
		AddNewZone.sendKeys("testing01");
	}
	@FindBy(id="frmSites_cmbxSiteAreaSelRiskLevel")		//selecting the level
	WebElement Level;
	public void SelectLevel() throws InterruptedException {
		Select LevelDrp = new Select(Level);
		LevelDrp.selectByVisibleText("Level 3");
		Thread.sleep(3000);
	}
	@FindBy(id="frmSites_btnSiteAreaAddNew")	// clicking the add button 
	WebElement ZonesAdd;
	public void ClickZonesAdd() {
		ZonesAdd.click();
	}
	/*@FindBy(id="frmSites_wCustomAlert_btnOk")				// Closing PopUp  by clicking close Button
	WebElement CloseBtn;
	public void Click_CloseBtn() {
		CloseBtn.click();
	}*/
	
	@FindBy(id="frmSites_btnSiteAreaLocation")     //clicking the locations 
	WebElement Locations;
	public void ClickLocations() {
		Locations.click();
	}
	
	@FindBy(id="frmSites_btnViewAllLoc")
	WebElement ViewAllLoc;
	public void ClickViewAllLoc() throws InterruptedException {   // Click ViewAllLocations text
		wait.until(ExpectedConditions.elementToBeClickable(ViewAllLoc));
		ViewAllLoc.click();
		Thread.sleep(3000);
	}
	
	@FindBy(xpath="//*[@id=\"frmSites_chckSeghHeadDeleted\"]/div/input")  // click view deleted button 
	WebElement ViewAllCheckBox;
	public void ClickViewAllDelcheck() throws InterruptedException {
		try {
		ViewAllCheckBox.click();
		Thread.sleep(5000);
		}
		catch(Exception e) {
			System.out.println("checkbox is not interacting");
		}
	}
	
	@FindBy(id="frmSites_btnBackToLocBtn")           //Click Back Button
	WebElement LocationsBack;
	public void ClickLocationsBack() {
		LocationsBack.click();
	}
	/*@FindBy(id="frmSites_cmbxSiteAreaSelBuilding")		//selecting the building name
	WebElement Building;
	public void SelectBuildingName() throws InterruptedException {
		Select BuildingDrp = new Select(Building);
		BuildingDrp.selectByVisibleText("TestBuilding_1");
		Thread.sleep(3000);
	
	@FindBy(id="frmSites_cmbxSiteAreaSelFloor")		//selecting the Floor name 
	WebElement SelFloorName;
	public void SelectfloorName() throws InterruptedException {
		Select FloorDrp = new Select(SelFloorName);
		FloorDrp.selectByVisibleText("testing");
		Thread.sleep(3000);
	}*/
	
	@FindBy(id="frmSites_cmbxSiteAreaSelZone")		//selecting the zone name 
	WebElement SelZoneName;
	public void SelectZoneName() throws InterruptedException {
		Select ZoneDrp = new Select(SelZoneName);
		ZoneDrp.selectByVisibleText("testing01");
	}
	
	@FindBy(id="frmSites_txtLocationName")       //adding new location name//input[@id="frmSites_txtLocationName"]
	WebElement AddNewLoc;
	public void AddNewLoc() {
		AddNewLoc.sendKeys("Abcd");
	}
	
	@FindBy(id="frmSites_cmbLocationArea")     // Select New Area
	WebElement AddNewArea;
	public void SelNewArea() throws InterruptedException {
		Select NewAreaDrp = new Select(AddNewArea);
		NewAreaDrp.selectByVisibleText("Interno");
		Thread.sleep(3000);
	}
	@FindBy(id="frmSites_cmbDetType")         //Selecting detectortype  
	WebElement DetectorType;
	public void SelDetType() throws InterruptedException {
		Select DetDrp = new Select(DetectorType);
		DetDrp.selectByVisibleText("Global");
		Thread.sleep(3000);
	}
	@FindBy(id="frmSites_cmbDetector")     // Select Detector
	WebElement Detector;
	public void SelDet() throws InterruptedException {
		Select DetDrp = new Select(Detector);
		DetDrp.selectByVisibleText("Global");
		Thread.sleep(3000);
	}
	
	@FindBy(id="frmSites_txtBarCode")      // enter the barcode
	WebElement Barcode;
	public void EnterBarcode() {
			Barcode.sendKeys("1234");
	}
	
	@FindBy(id="frmSites_btnAddLocation")     // Click add button
	WebElement LocationsAdd;
	public void ClickLocationsAdd() throws InterruptedException {
		LocationsAdd.click();
		Thread.sleep(7000);
	}
	/*@FindBy(id="frmSites_wCustomAlert_btnOk")				// Closing PopUp  by clicking close Button
	WebElement CloseBtn;
	public void Click_CloseBtn() {
		CloseBtn.click();
	}*/
	
	@FindBy(id="flxRowTemp_btnSegEditLocation")       // click the edit button 
	WebElement EditBtn;
	public void ClickEditBtn() throws InterruptedException {
		EditBtn.click();
			Thread.sleep(5000);
	}
	
	@FindBy(id="flxRowTemp_txtSegLocation")      //edit the location name and add new area
	WebElement ChangeLoc;
	public void ChangeLocName() throws InterruptedException {
		ChangeLoc.sendKeys("001");
		
		Thread.sleep(3000);
		}
	@FindBy(xpath="//select[@id='flxRowTemp_cmbxSegLocationArea']")
	WebElement ChangareaLoc;
	public void EditLoc() {
	Select NewLocDrp = new Select(ChangareaLoc);
	NewLocDrp.selectByVisibleText("Esterno");
	}
	@FindBy(id="flxRowTemp_cmbxSegDetectorType")   // Edit detector type
	WebElement EditDetType;
	public void ChangeDetType() throws InterruptedException {
		Select EditDet = new Select(EditDetType);
		EditDet.selectByVisibleText("Cattura Volatili");
		Thread.sleep(7000);
	}
	@FindBy(xpath="//*[@id=\"flxRowTemp_cmbxSegDetector\"]")      //Edit Detector
	WebElement EditDet;
	public void ChangeDet() {
		Select EditDetDrp=new Select(EditDet);
		EditDetDrp.selectByVisibleText("Gabbie Per Passerotti");
	}
	
	@FindBy(id="flxRowTemp_txtSegBarcode")                    // Edit BarCode number
	WebElement EditBar;
	public void ChangeBar() {
		EditBar.sendKeys("65");
	}
	
	@FindBy(id="flxRowTemp_btnSegSaveLocation")				//Clicking save button 
	WebElement EditSaveBtn;
	public void ClickEditSaveBtn() throws InterruptedException {
		EditSaveBtn.click();
		Thread.sleep(7000);
		CloseBtn.click();
		Thread.sleep(3000);
	}
	
	@FindBy(id="flxRowTemp_btnSegMoveLocation")              // Clicking move button
	WebElement LocMove;
	public void Loc_move() {
		LocMove.click();
	}
	
	@FindBy(id="frmSites_popupMoveDetectorLocation_cmbNewBuilding")			//Moving building name  
	WebElement MoveNewBuilding;
	public void Loc_NewBuilding() throws InterruptedException {
		Select NewBuilding = new Select(MoveNewBuilding);
		NewBuilding.selectByVisibleText("Global Pesticides Records");
		Thread.sleep(2000);
	}
	
	@FindBy(id="frmSites_popupMoveDetectorLocation_cmbNewFloor")			//Moving Floor name  
	WebElement MoveNewFloor;
	public void Loc_NewFloor() throws InterruptedException {
		Select NewFloor = new Select(MoveNewFloor);
		NewFloor.selectByVisibleText("All Areas");
		Thread.sleep(2000);
	}
	  																				
	@FindBy(id="frmSites_popupMoveDetectorLocation_cmbNewZone")				//Moving new zone
	WebElement MoveNewZone;
	public void Loc_NewZone() throws InterruptedException {
		Select NewZone = new Select(MoveNewZone);
		NewZone.selectByVisibleText("Internal and External");
		Thread.sleep(2000);
	}
	
	@FindBy(id="frmSites_popupMoveDetectorLocation_btnDone")               // click done button
	WebElement Loc_MoveDone;
	@FindBy(id="frmSites_popupMoveDetectorLocation_btnCancel")
	WebElement Loc_CancelBtn;
	public void Loc_DoneBtn() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(Loc_MoveDone));
		try {
		Loc_MoveDone.click();
		Thread.sleep(6000);
		CloseBtn.click();
		Thread.sleep(3000);
		}
		catch(Exception e) {
			System.out.println("Done Button not interacting");
			Loc_CancelBtn.click();
		}
		
	}
	
	//Again checking the new building, Floor and zone 
	
	@FindBy(id="frmSites_cmbxSiteAreaSelBuilding")			//Checking building name  
	WebElement LocNewBuilding;
	public void LocCheck_NewBuilding() throws InterruptedException {
		Select New_Building = new Select(LocNewBuilding);
		New_Building.selectByVisibleText("safta");
		Thread.sleep(2000);
	}
	@FindBy(id="frmSites_cmbxSiteAreaSelFloor")			//Checking Floor name  
	WebElement LocNewFloor;
	public void LocCheck_NewFloor() throws InterruptedException {
		Select New_Floor = new Select(LocNewFloor);
		New_Floor.selectByVisibleText("shorta run");
		Thread.sleep(2000);
	}																		
	@FindBy(id="frmSites_cmbxSiteAreaSelZone")				//Checking new zone
	WebElement LocNewZone;
	public void LocCheck_NewZone() throws InterruptedException {
		Select New_Zone = new Select(LocNewZone);
		New_Zone.selectByVisibleText("area nuova");
		Thread.sleep(2000);
	}
	@FindBy(xpath="(//*[@id='flxRowTemp_vflxDeleteLocation']/div)[1]")  //Deleting the Location
	WebElement Del;
	public void ClickDELBtn() throws InterruptedException {
		Thread.sleep(4000);
		Del.click();
	}
	@FindBy(id="frmSites_popupConfirmDeleteAction_btnYes")    //clicking Yes Button
	WebElement YesBtn;
	public void ClickYesBtn() throws InterruptedException {
		Thread.sleep(5000);
		YesBtn.click();
		Thread.sleep(5000);
		CloseBtn.click();
	}
	@FindBy(xpath="//*[@id='frmSites_chckSeghHeadDeleted']/div/input")  //Clicking the view deleted checkbox
	WebElement DelCheckBox;
	public void ClickDelCheckBox() throws InterruptedException {
		DelCheckBox.click();
		Thread.sleep(5000);
	}
	@FindBy(id="flxRowTemp_btnSegEditLocation")                        //Click restore Button
	WebElement RestoreBtn;
	public void Click_RestoreBtn() throws InterruptedException {
		RestoreBtn.click();
		Thread.sleep(5000);
	}
	@FindBy(id="frmSites_popupSiteAreasDeleteRestore_btnYes")         //Click Yes bUTTON and uncheck the checkbox
	WebElement Restore_YesBtn;
	public void ClickRestore_YesBtn() throws InterruptedException {
		Restore_YesBtn.click();
		Thread.sleep(5000);
		CloseBtn.click();
		Thread.sleep(5000);
		DelCheckBox.click();
		Thread.sleep(5000);
	}
	
	@FindBy(xpath="//span[@id=\"frmSites_imgPDFSites_span\"]")    //exporting the pdf
	WebElement Pdf;
	@FindBy(id="frmSites_popupExportLocationTree_btnExport")
	WebElement ExportDataBtn;
	public void Export_pdf() throws InterruptedException {
		Pdf.click();
		Thread.sleep(5000);
		ExportDataBtn.click();
		Thread.sleep(10000);
	}
	@FindBy(id="frmSites_btnSiteAreaCriticalLimits")           //Clicking CriticalLimits page
	WebElement CriticalLimits;
	@FindBy(id="frmSites_cmbxCriticalLimitsPestGroup")         //Clicking PestGroup
	WebElement PestGrp;
	@FindBy(id="frmSites_cmbxCriticalLimitsPestType")          //Clicking PestType
	WebElement PestType;
	@FindBy(id="frmSites_chkCriticalLimitsRiskLevel2")         //Selecting the level 2
	WebElement Level_2;
	@FindBy(id="frmSites_btnCrticalLimitsAdd")                  // Click add button  and close
	WebElement CriticalLim_Add;
	@FindBy(id="frmSites_imgCriticalLimitsOpenCloseBtnSEPRHASHIT-1_span") // click entry of level 2 
	WebElement Check_Lv2;
	@FindBy(id="frmSites_imgCriticalLimitsDeleteBtnSEPRHASHIT-1-0_span")  // click delete button
	WebElement CrtDel;
	@FindBy(id="frmSites_btnCriticalLimitsSave")                       //Click Save and close button
	WebElement Crt_Save;
	public void criticalLimits() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(CriticalLimits));
		//scroll(CriticalLimits);
		CriticalLimits.click();
		Thread.sleep(3000);
		Select Pest_Grp=new Select(PestGrp);
		Pest_Grp.selectByVisibleText("Volatili");
		Thread.sleep(5000);
		Select Pest_Type=new Select(PestType);
		Pest_Type.selectByVisibleText("All ");
		Thread.sleep(5000);
		Level_2.click();
		CriticalLim_Add.click();
		Thread.sleep(5000);
		CloseBtn.click();
		Thread.sleep(5000);
		Check_Lv2.click();
		Thread.sleep(5000);
		CrtDel.click();
		Thread.sleep(5000);
		Crt_Save.click();
		CloseBtn.click();
	}
	@FindBy(id="frmSites_btnSiteAreaAlerts")
	WebElement Alerts;
	@FindBy(id="frmSites_lblAlertsIntContact")
	WebElement RentokilContact;
	public void AlertsPage() throws InterruptedException {   // Alerts Page 
		Alerts.click();
		Thread.sleep(6000);
		if(RentokilContact.isDisplayed()) {
			System.out.println("Page is loaded");
		}
		else {
			System.out.println("Page is not Loaded");
		}
		Thread.sleep(5000);
	}
	
}
