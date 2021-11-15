package com.MavenEveProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirm_Page {
	public static WebDriver driver;

	public Confirm_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);

	}

	public WebElement getKc() {
		return kc;
	}

	public WebElement getKx() {
		return kx;
	}

	public WebElement getKj() {
		return kj;
	}

	public WebElement getKr() {
		return kr;
	}

	public WebElement getKv() {
		return kv;
	}

	public WebElement getKd() {
		return kd;
	}

	public WebElement getKp() {
		return kp;
	}

	public WebElement getAm() {
		return am;
	}

	public WebElement getDp() {
		return dp;
	}

	public WebElement getHc() {
		return hc;
	}

	public WebElement getVj() {
		return vj;
	}

	@FindBy(id = "first_name")
	private WebElement kc;
	@FindBy(id = "last_name")
	private WebElement kx;
	@FindBy(id = "address")
	private WebElement kj;
	@FindBy(id = "cc_num")
	private WebElement kr;
	@FindBy(id = "cc_type")
	private WebElement kv;
	@FindBy(id = "cc_exp_month")
	private WebElement kd;
	@FindBy(id = "cc_exp_year")
	private WebElement kp;
	@FindBy(id = "cc_cvv")
	private WebElement am;
	@FindBy(id = "book_now")
	private WebElement dp;
	@FindBy(xpath = "/html/body/table[2]/tbody/tr[1]/td[2]/a[2]")
	private WebElement hc;
	@FindBy(xpath = "/html/body/table[2]/tbody/tr[1]/td[2]/a[4]")
	private WebElement vj;

}
