package stepDefinations;

import java.awt.HeadlessException;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
 
import io.cucumber.java.en.*;
import pageObjects.UsersPage;
import testBase.BaseClass;
 
public class Test_AddUser extends BaseClass {
	public UsersPage Hp = new UsersPage(driver);
	@Given("Im in the users page")
	public void im_in_the_users_page() throws InterruptedException {
	   Hp.ClickUser();
	}
 
	@Given("Enter the temp email")
	public void enter_the_temp_email() throws InterruptedException {
		Hp.EnterUserField();
	}
 
	@When("Click on add user")
	public void click_on_add_user() {
	    Hp.ClickAdd();
	}
 
	@When("fill all the details including contract number")
	public void fill_all_the_details_including_contract_number() throws InterruptedException, HeadlessException, UnsupportedFlavorException, IOException {
	    Hp.ReEnterEmail();
	    Hp.EnterFstName();
	    Hp.EnterLstName();
	    Hp.EnterContractNum();
	}
 
	@When("click on create button")
	public void click_on_create_button() throws InterruptedException {
	    Hp.ClickCreateBtn();
	}
 
	@Then("I add the country")
	public void i_add_the_country() throws InterruptedException {
	    Hp.SelectCountry();
	    Hp.ClickAddCountry();
	}
 
	@Then("Fill the contract number")
	public void fill_the_contract_number() throws InterruptedException {
		Hp.SelectContrct();
	    Hp.EnterCntrctNum();
	}
 
	@When("click done adding")
	public void click_done_adding() throws InterruptedException {
		Thread.sleep(2000);
	    Hp.ClickGo();
	}
 
	@Then("I click add")
	public void i_click_add() throws InterruptedException {
		Thread.sleep(5000);
		try {
		Hp.ClickADD();
		}
		catch(Exception e){
			System.out.println("Add Button Disabled");
		}
		
		Hp.ClickDoneAdding();
	}
 
	@Then("verify the dropdowns")
	public void verify_the_dropdowns() {
	    Hp.ChangeRole();
	    Hp.ChangeUserProfile();
	    Hp.ChangeNotifications();
	    Hp.ChangeLang();
	}
 
	@Then("I click Save and Email user")
	public void i_click_save_and_email_user() throws InterruptedException {
		Hp.ClickSaveEmail();
		Hp.Close();
	}

}