package com.MavenEveProject;



import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class {

	
	public static WebDriver driver;

	public static WebDriver browse_Launch(String s) {
		if (s.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\M.MUTHUKUMAR\\eclipse-workspace\\TestNGProject\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (s.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\M.MUTHUKUMAR\\eclipse-workspace\\Sselenium\\firefox\\firefoxdriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}

	public static void getUrl(String url) {
		driver.get(url);

	}

	public static void inputValue(WebElement element, String value) {
		element.sendKeys(value);

	}

	public static void clickOnElement(WebElement element) {
		element.click();

	}

	public static void finish() {
		driver.close();

	}

	public static void end() {
		driver.quit();
	}

	public static void anotherUrl(String Url) {
		driver.navigate().to(Url);

	}

	public static void navigateForward() {
		driver.navigate().forward();

	}

	public static void navigateBack() {
		driver.navigate().back();

	}

	public static void getRefresh() {
		driver.navigate().refresh();
	}

	public static void alertAccept() {
		driver.switchTo().alert().accept();

	}

	public static void alertDismiss() {
		driver.switchTo().alert().dismiss();
	}

	public static void promptAlert(String value) {
		driver.switchTo().alert().sendKeys(value);
	}

	public static void dragAndDrop(WebElement element, WebElement element1) {
		Actions s = new Actions(driver);
		s.clickAndHold(element).moveToElement(element1).release().build().perform();
	}

	public static void moveToElement(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).build().perform();

	}

	public static void rightClick(WebElement element) {
		Actions d = new Actions(driver);
		d.contextClick(element).build().perform();

	}

	public static void switchToFrame(WebElement element) {
		driver.switchTo().frame(element);

	}

	public static void parentFrame() {
		driver.switchTo().defaultContent();

	}

	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
public static void explicitWait(long seconds,WebElement element) {
	try {
	WebDriverWait web = new WebDriverWait(driver,30);
	web.until(ExpectedConditions.visibilityOf(element));
	

}catch(Exception e) {
}
}
	public static void sleep() throws InterruptedException {
		Thread.sleep(3000);
	}

	public static void dropdown(WebElement element, String type, String value) {
		Select s = new Select(element);
		if (type.equalsIgnoreCase("ByIndex")) {
			int parseInt = Integer.parseInt(value);
			s.selectByIndex(parseInt);

		} else if (type.equalsIgnoreCase("ByValue")) {
			s.selectByValue(value);

		} else if (type.equalsIgnoreCase("ByVisibleText")) {
			s.selectByVisibleText(value);

		}

	}

	public static void scroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,1000)", " ");
	}

	public static void isEnable(WebElement element) {
		element.isEnabled();
	}

	public static void isSelected(WebElement element) {
		element.isSelected();
	}

	public static void isDisplayed(WebElement element) {
		element.isDisplayed();

	}

	public static void getTittle() {
		driver.getTitle();
	}

	public static void getCurrentUrl() {
		driver.getCurrentUrl();
	}

}

