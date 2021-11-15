package com.runner.com;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.MavenEveProject.Base_Class;
import com.helper.com.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature\\com",
                  glue    = "com.stepdefinition.com",
                  monochrome = true,
                  
                  plugin = {
              		"pretty", "html:report",
          		"com.cucumber.listener.ExtentCucumberFormatter:Rreport/extentReport.html" })

                                  


public class AdactinRunner {
	public static WebDriver driver;
	@BeforeClass
	public static void setUp() throws Throwable  {
		String browser = FileReaderManager.getInstanceCR().getBrowser();
		
driver = Base_Class.browse_Launch(browser);
	}

}
