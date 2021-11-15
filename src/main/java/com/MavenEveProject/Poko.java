package com.MavenEveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Poko extends Base_Class{
	
	public static void main(String[] args) throws InterruptedException {
		browse_Launch("chrome");
		getUrl("https://adactinhotelapp.com/SearchHotel.php");
		sleep();
		Select_Page rv = new Select_Page(driver);
		Poll mk = new Poll(driver);
		Confirm_Page bo = new Confirm_Page(driver);
		inputValue(rv.getRo(),"deepthimk");
		inputValue(rv.getDe(),"Karthika@04");
		clickOnElement(rv.getFr());
		dropdown(mk.getGt(),"ByVisibleText","London");
		dropdown(mk.getHu(),"ByVisibleText","Hotel Sunshine");
		dropdown(mk.getSq(),"ByVisibleText","Double");
		dropdown(mk.getYy(),"ByValue","3");
		inputValue(mk.getOi(),"08");
		inputValue(mk.getGg(),"09");
		dropdown(mk.getSx(),"ByValue","1");
		clickOnElement(mk.getBm());
		clickOnElement(mk.getDn());
		clickOnElement(mk.getSm());
		inputValue(bo.getKc(),"karthika");
		inputValue(bo.getKx(),"M");
		inputValue(bo.getKj(),"no:7/101,west street,chennai");
		inputValue(bo.getKr(),"7894561239874563");
		dropdown(bo.getKv(),"ByVisibleText","Master Card");
		dropdown(bo.getKd(),"ByValue","6");
		dropdown(bo.getKp(),"ByValue","2022");
		inputValue(bo.getAm(),"3654");
		clickOnElement(bo.getDp());
		clickOnElement(bo.getHc());
		clickOnElement(bo.getVj());
		







		
		
		
	}

}
