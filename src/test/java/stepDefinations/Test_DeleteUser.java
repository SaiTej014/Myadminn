package stepDefinations;

import io.cucumber.java.en.*;
import pageObjects.UsersPage;
import testBase.BaseClass;

public class Test_DeleteUser extends BaseClass {
	public UsersPage Hp = new UsersPage(driver);

	@Given("Iam in the Users Page")
	public void iam_in_the_users_page() throws InterruptedException {
		
	//Hp.ClickUser();
		driver.navigate().back();
	}
	@Given("I enter the updated User Id")
	public void i_enter_the_updated_user_id() throws InterruptedException {
		Hp.EnterUserField();
	}
	@When("I click Search")
	public void i_click_search() throws InterruptedException {
	    Hp.ClickSearch();
	}
	@When("I should get the new user details")
	public void i_should_get_the_new_user_details() throws InterruptedException {
	 System.out.println("Displaying User Info");
	}
	@When("Click on the EmailId")
	public void click_on_the_email_id() throws InterruptedException {
		   Hp.ClickUserInfo();
	}
	@Then("I delete the users")
	public void i_delete_the_users() throws InterruptedException {
	   Hp.DeleteUser();
	   Hp.DELSAVE();
	   Hp.Click_CloseBtn();
	   //Hp.ClickPop();
	  // Hp.Click_CloseBtn();
	}


}
