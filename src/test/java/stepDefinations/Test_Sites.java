package stepDefinations;

import io.cucumber.java.en.*;
import pageObjects.SitesPage;
import testBase.BaseClass;

public class Test_Sites extends BaseClass{
	public SitesPage Sp = new SitesPage(driver);
	@Given("I am in the sites page")
	public void i_am_in_the_sites_page() throws InterruptedException {
	    Sp.ClickSites();
	    
	}
	@Given("Selecting country as Italy and Entering contract number")
	public void selecting_country_as_italy_and_entering_contract_number() throws InterruptedException {
	    Sp.SelectCountry();
	    
	   // 
	    Sp.SelectCntrctNum();
	    Sp.EnterContractNum();
	}
	@When("I Search button")
	public void i_search_button() throws InterruptedException {
	    Sp.Click_Search();
	}
	@When("I click on the accounts which are displayed")
	public void i_click_on_the_accounts_which_are_displayed() {
	   Sp.ClickDetails();
	}
	@When("Click on Save button and close button")
	public void click_on_save_button_and_close_button() throws InterruptedException {
	    Sp.Click_saveBTn();
	    Sp.Click_CloseBtn();
	}
	@Then("I Click on Contract page and enter the text in text field")
	public void i_click_on_contract_page_and_enter_the_text_in_text_field() throws InterruptedException {
	   Sp.ClickContractPage();
	   Sp.EnterText_1();
	   Sp.ClickCntrtcheckbox();
	   Sp.Click_saveBTn();
	   Sp.Click_CloseBtn();
	}
	@When("I click on SiteUsers section")
	public void i_click_on_site_users_section() throws InterruptedException {
	   Sp.ClickSiteUsers();
	}
	@When("Search the user")
	public void search_the_user() {
	    Sp.SiteUsers_SearchBar();
	}
	@When("Click Add\\/Delete button and close button")
	public void click_add_delete_button_and_close_button() throws InterruptedException {
	    Sp.ClickAddRemoveBtn();
	    Sp.ClickSiteUsers_Save();
	    Sp.Click_CloseBtn();
	}
	@When("I click on Risk Assessment page")
	public void i_click_on_risk_assessment_page() throws InterruptedException {
	    Sp.ClickRiskAssessment();
	}
	@When("Check\\/checkbox the checkboxes")
	public void check_checkbox_the_checkboxes() {
	    Sp.ClickRiskAssCheckBox_1();
	    Sp.ClickRiskAssCheckBox_2();
	    Sp.ClickRiskAssCheckBox_3();
	    Sp.ClickRiskAssCheckBox_4();
	    
	}
	@When("Enter some text in the textField")
	public void enter_some_text_in_the_text_field() throws InterruptedException {
	    Sp.RiskAss_Text1();
	    Sp.RiskAss_Text2();
	}
	@When("clear the text and save button and close")
	public void clear_the_text_and_save_button_and_close() throws InterruptedException {
	    Sp.Click_saveBTn();
	    Sp.Click_CloseBtn();
	}
	@When("I click on SiteAreas Section")
	public void i_click_on_site_areas_section() throws InterruptedException {
	    Sp.ClickSiteAreas();
	}
	@When("Add the name of the building")
	public void add_the_name_of_the_building() throws InterruptedException {
	    Sp.AddBuilding_name();
	}
	@When("click Add button and close button")
	public void click_add_button_and_close_button() throws InterruptedException {
	    Sp.ClickBuildings_add();
	    Sp.Click_CloseBtn();
	}
	@Then("I click on Floor Button in site areas")
	public void i_click_on_floor_button_in_site_areas() throws InterruptedException {
	    Sp.ClickFloorsBtn();
	}
	@Then("I select the building  name")
	public void i_select_the_building_name() throws InterruptedException {
	   Sp.SelectBuildingName();
	}
	@Then("I Create the floor name")
	public void i_create_the_floor_name() {
	    Sp.AddFloor();
	}
	@Then("I click on Add button and close button")
	public void i_click_on_add_button_and_close_button() throws InterruptedException {
	    Sp.Click_FloorAddBtn();
	    Sp.Click_CloseBtn();
	}
	@When("I click on Zones Section")
	public void i_click_on_zones_section() {
	    Sp.ClickZones();
	}
	@When("Select the Building name and Floor name")
	public void select_the_building_name_and_floor_name() throws InterruptedException {
	    Sp.SelectBuildingName();
	    Sp.SelectfloorName();
	}
	@When("I add the new zone")
	public void i_add_the_new_zone() {
	    Sp.AddNewZoneName();
	}
	@When("I select the level")
	public void i_select_the_level() throws InterruptedException {
	    Sp.SelectLevel();
	}
	@When("Click on add button and close button")
	public void click_on_add_button_and_close_button() throws InterruptedException {
	    Sp.ClickZonesAdd();
	    Sp.Click_CloseBtn();
	}
	@When("I click on the locations page")
	public void i_click_on_the_locations_page() {
	    Sp.ClickLocations();
	}
	@When("Click on ViewAllLocations")
	public void click_on_view_all_locations() throws InterruptedException {
	    Sp.ClickViewAllLoc();
	}
	@When("Click on view deleted button")
	public void click_on_view_deleted_button() throws InterruptedException {
	    Sp.ClickViewAllDelcheck();
	}
	@When("I click on Back")
	public void i_click_on_back() {
	    Sp.ClickLocationsBack();
	}
	@Then("I select the building name and floor name and zone name")
	public void i_select_the_building_name_and_floor_name_and_zone_name() throws InterruptedException {
	    Sp.SelectBuildingName();
	    Sp.SelectfloorName();
	    Sp.SelectZoneName();
	}
	@Then("I add new location name")
	public void i_add_new_location_name() throws InterruptedException {
		Thread.sleep(3000);
	    Sp.AddNewLoc();
	}
	@Then("I select new area and detector type and detector")
	public void i_select_new_area_and_detector_type_and_detector() throws InterruptedException {
	    Sp.SelNewArea();
	    Sp.SelDetType();
	    Sp.SelDet();
	}
	@When("I enter the barcode")
	public void i_enter_the_barcode() {
	    Sp.EnterBarcode();
	   
	}
	@Then("I click on Add button")
	public void i_click_on_add_button() throws InterruptedException {
	   Sp.ClickLocationsAdd();
	}
	@Then("Close Popup using Close Button")
	public void close_popup_using_close_button() throws InterruptedException {
	   Sp.Click_CloseBtn();
	}
	@When("I click on Edit Button")
	public void i_click_on_edit_button() throws InterruptedException {
	    Sp.ClickEditBtn();
	}
	@When("Edit the location name and new area")
	public void edit_the_location_name_and_new_area() throws InterruptedException {
	    Sp.ChangeLocName();
	    Sp.EditLoc();
	}
	@When("I edit the detector type")
	public void i_edit_the_detector_type() throws InterruptedException {
	    Sp.ChangeDetType();
	    Sp.ChangeDet();
	}
	@When("Edit the barcode number")
	public void edit_the_barcode_number() {
	    Sp.ChangeBar();
	}
	@Then("I click on Save button and close button")
	public void i_click_on_save_button_and_close_button() throws InterruptedException {
	    Sp.ClickEditSaveBtn();
	}
	@When("I click on Move Button")
	public void i_click_on_move_button() {
	    Sp.Loc_move();
	}
	@When("Move the building and floor and zone name")
	public void move_the_building_and_floor_and_zone_name() throws InterruptedException {
	    Sp.Loc_NewBuilding();
	    Sp.Loc_NewFloor();
	    Sp.Loc_NewZone();
	}
	@Then("I click on Done Button")
	public void i_click_on_done_button() throws InterruptedException {
	    Sp.Loc_DoneBtn();
	}
	@When("I check the building name amd floor name and zone name")
	public void i_check_the_building_name_amd_floor_name_and_zone_name() throws InterruptedException {
	    Sp.LocCheck_NewBuilding();
	    Sp.LocCheck_NewFloor();
	    Sp.LocCheck_NewZone();
	}
	@When("I Delete the Location")
	public void i_delete_the_location() throws InterruptedException {
	    Sp.ClickDELBtn();
	}
	@When("I click on Yes Button")
	public void i_click_on_yes_button() throws InterruptedException {
	    Sp.ClickYesBtn();
	}
	@When("I click on View Deleted Checkbox")
	public void i_click_on_view_deleted_checkbox() throws InterruptedException {
	    Sp.ClickDelCheckBox();
	}
	@Then("I click on Restore Button")
	public void i_click_on_restore_button() throws InterruptedException {
	    Sp.Click_RestoreBtn();
	}
	@Then("I click on Yes Button and Uncheck the checkbox")
	public void i_click_on_yes_button_and_uncheck_the_checkbox() throws InterruptedException {
	    Sp.ClickRestore_YesBtn();
	}
	@When("I click on Exporting the Pdf")
	public void i_click_on_exporting_the_pdf() throws InterruptedException {
		
	    Sp.Export_pdf();
	    Thread.sleep(5000);
	}
	@When("I Verify the CriticalLimits Page")
	public void i_verify_the_critical_limits_page() throws InterruptedException {
		Thread.sleep(5000);
	    Sp.criticalLimits();
	}
	@Then("I Verify the Alerts Page")
	public void i_verify_the_alerts_page() throws InterruptedException {
	  Sp.AlertsPage();
	}


}
