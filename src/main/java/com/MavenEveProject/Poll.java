package com.MavenEveProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Poll {
	public static WebDriver driver;
	@FindBy(id = "location")
	private WebElement gt;
	public Poll(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}
	
	public WebElement getGt() {
		return gt;
	}
	public WebElement getHu() {
		return hu;
	}
	public WebElement getSq() {
		return sq;
	}
	public WebElement getYy() {
		return yy;
	}
	public WebElement getOi() {
		return oi;
	}
	public WebElement getGg() {
		return gg;
	}
	public WebElement getSx() {
		return sx;
	}
	public WebElement getBm() {
		return bm;
	}
	public WebElement getDn() {
		return dn;
	}
	public WebElement getSm() {
		return sm;
	}
	@FindBy(id = "hotels")
	private WebElement hu;
	@FindBy(id = "room_type")
	private WebElement sq;
	@FindBy(id = "room_nos")
	private WebElement yy;
	@FindBy(id = "datepick_in")
	private WebElement oi;
	@FindBy(id = "datepick_out")
	private WebElement gg;
	@FindBy(id = "adult_room")
	private WebElement sx;
	@FindBy(id = "Submit")
	private WebElement bm;
	@FindBy(id = "radiobutton_0")
	private WebElement dn;
	@FindBy(id = "continue")
	private WebElement sm;
	

}
