package testBase;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.Map;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
 
public class BaseClass {
 
		 public static WebDriver driver;
	     static Properties p;
	     static String browser;
	 
	     
	@BeforeTest
	public static WebDriver initilizeBrowser() throws IOException
	{
		
		p=getProperties();
		browser=p.getProperty("browser");
		 
		String userHome = System.getProperty("user.home");
	    String downloadDirectory = Paths.get(userHome, "Downloads", "Testing Downloads").toString();
	            
		switch(browser) 
				{
				case "chrome":
					ChromeOptions chromeOptions = new ChromeOptions();
	                // Set the download directory
	                chromeOptions.addArguments("download.default_directory=" + downloadDirectory);
	                
	                // Define download behavior for Chrome
	                chromeOptions.setExperimentalOption("prefs", Map.of(
	                    "download.default_directory", downloadDirectory,
	                    "download.prompt_for_download", false,
	                    "download.directory_upgrade", true,
	                    "safebrowsing.enabled", true
	                ));
	                
	                driver = new ChromeDriver(chromeOptions);
	                break;
			    case "edge":
			    	EdgeOptions edgeOptions = new EdgeOptions();
	                edgeOptions.addArguments("download.default_directory=" + downloadDirectory);
	                driver=new EdgeDriver();
			        break;
			    default:
			        System.out.println("No  matching browser");
			        driver=null;
				}
		driver.manage().deleteAllCookies(); 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 return driver;
	}
	@AfterTest
	public void close_browser() {
		
		driver.quit();
	}
	public static Properties getProperties() throws IOException
	{		 
        FileReader file=new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties");
        p=new Properties();
		p.load(file);
		return p;
	}
	
//	   public static String screenshot(String ssnum) throws IOException {
//		   TakesScreenshot ts=(TakesScreenshot)driver;
//			File src=ts.getScreenshotAs(OutputType.FILE);
//			File trg= new File(System.getProperty("user.dir")+"\\SCREENSHOTS\\"+ssnum+".png");
//			FileUtils.copyFile(src, trg);
//			return  trg.getAbsolutePath();
//		}

	
	

}
