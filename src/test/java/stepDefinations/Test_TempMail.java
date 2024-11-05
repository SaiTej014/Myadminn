package stepDefinations;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
 
import org.openqa.selenium.WindowType;
 
import io.cucumber.java.en.*;
import pageObjects.MailPage;
import testBase.BaseClass;
 
public class Test_TempMail extends BaseClass {
	public MailPage Mp = new MailPage(driver);
		@Given("Im in Temp mail Website")
		public void im_in_temp_mail_website() {
			driver.switchTo().newWindow(WindowType.TAB);
			driver.get("https://tempmail.plus/en/#!");
		   Mp.SearchBar();
		}
 
		@Given("I verify the search bar")
		public void i_verify_the_search_bar() {
		    Mp.ClickRandomName();
		    Mp.RandomEmail();
		}
 
		@When("I enter a random email")
		public void i_enter_a_random_email() {
		    Mp.ClickCopy();
		}
 
		@When("I click on Copy")
		public void i_click_on_copy() throws InterruptedException {
		    Mp.Back();
		    Thread.sleep(10000);
		}
 
		@Then("I Close the Window")
		public void i_close_the_window() throws InterruptedException {
			//Mp.switching(0);
			driver.close();
			Set<String>NewWindow= driver.getWindowHandles();
			List<String>GoogleWindow=new ArrayList<String>(NewWindow);
			driver.switchTo().window(GoogleWindow.get(0));
			Thread.sleep(10000);
		}
 
 
	}
 
 
