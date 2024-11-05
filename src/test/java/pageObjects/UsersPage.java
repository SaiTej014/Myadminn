package pageObjects;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.time.Duration;
 
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class UsersPage extends Basepage{
 
public WebDriver driver;
	public UsersPage(WebDriver driver) {
		super(driver);
	}
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
	@FindBy(id="frmCMSLandingPage_appHeaderAudit_btnMenuUser")
	WebElement Users;
	public void ClickUser() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(Users));
		//Thread.sleep(5000);
		try {
			Users.click();
		}
		catch(Exception e) {
			System.out.println("Users already clicked");
		}
	
	}
	//@FindBy(xpath="//input[@id=\"frmUserBasicInfo_txtSearchTextBoxBI\"]")
	@FindBy(id="frmUserBasicInfo_txtSearchTextBoxBI")
	WebElement FindUser;
	public void EnterUserField() throws InterruptedException {
		Thread.sleep(5000);
		FindUser.sendKeys(Keys.CONTROL, "v");
//		Actions Act = new Actions(driver);
//		Act.click(FindUser).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		//FindUser.sendKeys("abcdef@mailto.plus");
	}
	@FindBy(xpath="//*[@value=\"Search\"]")
	WebElement Search;
	public void ClickSearch() throws InterruptedException {
		Thread.sleep(3000);
		Search.click();
	}
	@FindBy(id="frmUserBasicInfo_btnAddButtonBI")
	WebElement Add;
	public void ClickAdd() {
		Add.click();
	}
	@FindBy(id="frmUserBasicInfo_txtReEnterEmail")
	WebElement ReEnterEmail;
	public void ReEnterEmail() throws InterruptedException, HeadlessException, UnsupportedFlavorException, IOException {
		Thread.sleep(3000);
		String s= FindUser.getText();
		String myText = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor); // extracting the text that was copied to the clipboard
		System.out.println(myText);
		ReEnterEmail.sendKeys(myText);
//		Actions Act = new Actions(driver);
//		Act.click(FindUser).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		//ReEnterEmail.sendKeys("abcdef@mailto.plus");
	}
	@FindBy(id="frmUserBasicInfo_txtUserFirstName")
	WebElement FirstName;
	public void EnterFstName() {
		FirstName.sendKeys("ABC");
	}
	@FindBy(id="frmUserBasicInfo_txtUserLastName")
	WebElement LastName;
	public void EnterLstName() {
		LastName.sendKeys("DEF");
	}
	@FindBy(id="frmUserBasicInfo_txtContactNumber")
	WebElement ContractNum;
	public void EnterContractNum() {
		ContractNum.sendKeys("1234567890");
	}
 
	@FindBy(id="frmUserBasicInfo_btnSubmit")
	WebElement CreateBtn;
	public void ClickCreateBtn() throws InterruptedException {
		CreateBtn.click();
		Thread.sleep(3000);
	}
	@FindBy(id="frmUserSitePermissions_cmbBxSelectCountry")
	WebElement Cntry;
	public void SelectCountry() throws InterruptedException {
		Thread.sleep(3000);
		Select Country = new Select(Cntry);
		Cntry.click();
		Country.selectByVisibleText("IT");
		}
	@FindBy(id="frmUserSitePermissions_btnAddCountry")
	WebElement Addcountry;
	public void ClickAddCountry() {
		Addcountry.click();
	}
	@FindBy(id="frmUserSitePermissions_cmbSearchKeyR")
	WebElement SelContractNum;
	public void SelectContrct() throws InterruptedException {
		Select Cntrct = new Select(SelContractNum);
		SelContractNum.click();
		Thread.sleep(3000);
		Cntrct.selectByVisibleText("Contract Number");
	}
	@FindBy(id="frmUserSitePermissions_txtSearchKeyR")
	WebElement EnterCntrtNum;
	public void EnterCntrctNum() {
		EnterCntrtNum.sendKeys("00853308");
	}
	@FindBy(id="frmUserSitePermissions_btnSearchR")
	WebElement Go;
	public void ClickGo() {
		Go.click();
	}
	@FindBy(id="segFlxAccountsSearch_btnAccSearchAdd")
	WebElement ADD;
	public void ClickADD() {
		ADD.click();
	}
	@FindBy(id="frmUserSitePermissions_btnDoneAccountsAdding")
//	@FindBy(xpath="(//div[@class='kcell btnGradientGraySmallSkin'])[2]")
	WebElement DoneAdding;
	@FindBy(id="segFlxAccountsSearch_lblAccSearchAddress")
	WebElement scroll;
	public void ClickDoneAdding() throws InterruptedException {
		Thread.sleep(3000);
		DoneAdding.click();
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		
//		DoneAdding.click();
//		js.executeScript("arguments[0].click();", DoneAdding);
	}
	@FindBy(id="frmUserSitePermissions_cmbUserRoleR")
	WebElement Role;
	public void ChangeRole() {
		Select role = new Select(Role);
		role.selectByVisibleText("Admin");
	}
	@FindBy(id="frmUserSitePermissions_cmbUserTypeR")
	WebElement Userprofile;
	public void ChangeUserProfile() {
		Select role = new Select(Userprofile);
		role.selectByVisibleText("Lite user");
	}
	@FindBy(id="frmUserSitePermissions_cmbVisitNotificationR")
	WebElement Notifications;
	public void ChangeNotifications() {
		Select role = new Select(Notifications);
		role.selectByVisibleText("POS");
	}
	@FindBy(id="frmUserSitePermissions_cmbDefaultLanguageR")
	WebElement Lnguge;
	public void ChangeLang() {
		Select role = new Select(Lnguge);
		role.selectByVisibleText("English");
	}
	@FindBy(id="frmUserSitePermissions_btnSaveAndEmailR")
	WebElement SaveAndEmail;
	public void ClickSaveEmail() {
		SaveAndEmail.click();
	}
	@FindBy(xpath="//*[@value=\"Close\"]")
	WebElement Close;
	public void Close() {
		wait.until(ExpectedConditions.elementToBeClickable(Close));
		Close.click();
	}
	
	@FindBy(id="FBox0jaefb1a0ec8a4c_lblUserDetails")
	WebElement UserInfo;
	public void ClickUserInfo() throws InterruptedException {
		Thread.sleep(3000);
		UserInfo.click();
	}
	
	@FindBy(xpath="//*[@class='kcell middlecenteralignslImage']")
	WebElement Delete;
	public void DeleteUser() throws InterruptedException {
		Thread.sleep(3000);
		Delete.click();
	}
	@FindBy(id="frmUserSitePermissions_btnPermissionsSaveR")
	WebElement SaveUser;
	public void DELSAVE() {
		SaveUser.click();
	}
	@FindBy(id="frmUserSitePermissions_confirmChangeActionAlert_btnSave")
	WebElement PopUpSave;
	public void ClickPop() {
		PopUpSave.click();
		
	}
	@FindBy(id="frmUserSitePermissions_wCustomAlert_btnOk")				// Closing PopUp  by clicking close Button //input[@id="frmUserSitePermissions_btnPermissionsSaveR"]
	WebElement CloseBtn;
	public void Click_CloseBtn() throws InterruptedException {
		//Thread.sleep(8000);
		wait.until(ExpectedConditions.elementToBeClickable(CloseBtn));
		CloseBtn.click();
	}

}