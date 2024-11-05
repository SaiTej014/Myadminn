package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		//features = {".//FeatureFiles/1_Login.feature",".//FeatureFiles/2_MailGenerator.feature",".//FeatureFiles/3_AddUser.feature",".//FeatureFiles/4_DeleteUser.feature",".//FeatureFiles/5_SitesVal.feature"},
		features = {".//FeatureFiles/1_Login.feature"},
		//features = {".//FeatureFiles/1_Login.feature",".//FeatureFiles/5_SitesVal.feature"},
		glue="stepDefinations",
				plugin= {"pretty","html:reports//myreport.html",
						"json:reports/myreport.json",
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"	
				},
		dryRun=false,
		monochrome=true,
		publish=true
		)
public class TestRunner {

}