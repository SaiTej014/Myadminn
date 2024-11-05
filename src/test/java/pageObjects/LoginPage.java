package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class LoginPage extends Basepage {
	public WebDriver driver;
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
	public static String[] data;
	//Constructor to initialize WebElements
	@FindBy(id="frmLogin_txtEmail")
	WebElement EmailIDField;
	public WebElement EnterEmail() {
		return EmailIDField;
	}
	@FindBy(id="frmLogin_txtPassword")
	WebElement PassWordField;
	public WebElement EnterPassword() {
		return PassWordField;
	}
	@FindBy(id="frmLogin_btnSubmit")
	WebElement Submit;
	public void ClickLoginBtn() throws InterruptedException {
		Submit.click();
		Thread.sleep(5000);
	}

	@FindBy(id="frmLogin_regionSelection_cmbRegions")
	WebElement Region;
	public void SelectRegion() throws InterruptedException {
		Thread.sleep(5000);
		//Region.click();
//		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(Region));
		Select Reg = new Select(Region);
		Reg.selectByVisibleText("Europe");
	}
	@FindBy(id="frmLogin_regionSelection_btnSubmit")
	WebElement Go;
	public void ClickGo() {
		Go.click();
	}
}