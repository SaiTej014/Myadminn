package stepDefinations;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import testBase.BaseClass;

public class Hooks {
	
	public static WebDriver driver;
	static Properties p;
	public static String[] data;
	public List<String> Emails=new ArrayList<String>();
	
	@BeforeAll
	public static void setup() throws IOException {
		driver=BaseClass.initilizeBrowser();
		p=BaseClass.getProperties();
		driver.get(p.getProperty("Url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.manage().window().maximize();
	}
	
	@AfterAll
	public static void endForAll() {
		driver.quit();
	}
	
	@AfterStep
	public void takeScreenshot(Scenario scenario) {
		TakesScreenshot ts=(TakesScreenshot) driver;
    	byte[] screenshot=ts.getScreenshotAs(OutputType.BYTES);
    	scenario.attach(screenshot, "image/png",scenario.getName());
	}
}
