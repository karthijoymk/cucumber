package com.MavenEveProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Page {
	public static WebDriver driver;

	public Select_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getRo() {
		return ro;
	}

	public WebElement getDe() {
		return de;
	}

	public WebElement getFr() {
		return fr;
	}

	@FindBy(id = "username")
	private WebElement ro;
	@FindBy(id = "password")
	private WebElement de;
	@FindBy(id = "login")
	private WebElement fr;

}
