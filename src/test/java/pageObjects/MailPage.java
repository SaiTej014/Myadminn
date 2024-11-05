package pageObjects;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
 
 
public class MailPage extends Basepage {
 
	public WebDriver driver;
	public MailPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(id="input")
	WebElement SearchBar;
	public void SearchBar() {
	}
	@FindBy(id="pre_rand")
	WebElement RandomName;
	public void ClickRandomName() {
		RandomName.click();
	}
	@FindBy(id="pre_button")
	WebElement TextBar;
	public void RandomEmail() {
		Boolean DisplayText = TextBar.isDisplayed();
		if(DisplayText=true) {
			System.out.println("TexTBar is Present");
			String TEMPEmail=TextBar.getText();
			Emails.add(TEMPEmail);
			System.out.println(Emails.get(0));
		}
		if(DisplayText=false) {
			System.out.println("TexTBar is not Present");
		}
		}

 
	@FindBy(id="pre_copy")
	WebElement CopyBtn;
	public void ClickCopy() {
		CopyBtn.click();
	}
	public void Back() {
		System.out.println("Going to previous window ");
	}
	public void switching(int i) {
		Set<String>NewWindow= driver.getWindowHandles();
		List<String>GoogleWindow=new ArrayList<String>(NewWindow);
		driver.switchTo().window(GoogleWindow.get(i));
	}

 
}