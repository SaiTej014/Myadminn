package stepDefinations;
import java.io.IOException;
import io.cucumber.java.en.*;
import pageObjects.LoginPage;
import testBase.BaseClass;
import uTiles.ExcelUtiles;
 
public class Test_Login extends BaseClass {
	public static String[] data;
	public LoginPage Lp= new LoginPage(driver);
	@Given("Im in the Login Page")
	public void im_in_the_login_page() throws IOException {
	    System.out.println("Opening Website");
	}
	@When("I Fill the Login Credentials")
	public void i_fill_the_login_credentials() throws IOException {
		data=ExcelUtiles.readExcelData("data");
		 Lp.EnterEmail().sendKeys(data[0]);
		 Lp.EnterPassword().sendKeys(data[1]);
		 
	}
	@When("I click on Login button")
	public void i_click_on_login_button() throws InterruptedException {
	     Lp.ClickLoginBtn();
	}
	@When("dropdown for selecting server should be present")
	public void dropdown_for_selecting_server_should_be_present() throws InterruptedException, IOException {
		Thread.sleep(1000);
		Lp.SelectRegion();
	}
	@When("I select country as Europe and click Go button")
	public void i_select_country_as_europe_and_click_go_button() throws InterruptedException {
		Thread.sleep(1000);
		Lp.ClickGo();
	}
	@Then("I should navigate to home page")
	public void i_should_navigate_to_home_page() {
		String Title = driver.getTitle();
		System.out.println(Title);
	}
 
 
 
}