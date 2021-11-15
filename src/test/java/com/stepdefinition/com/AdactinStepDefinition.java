package com.stepdefinition.com;

import org.openqa.selenium.WebDriver;

import com.MavenEveProject.Base_Class;
import com.MavenEveProject.Confirm_Page;
import com.MavenEveProject.Poll;
import com.MavenEveProject.Select_Page;
import com.helper.com.FileReaderManager;
import com.runner.com.AdactinRunner;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;

public class AdactinStepDefinition extends Base_Class {
	public static WebDriver driver = AdactinRunner.driver;
	Select_Page rv = new Select_Page(driver);
	Poll mk = new Poll(driver);
	Confirm_Page bo = new Confirm_Page(driver);
	@Given("^user launch the application$")
	public void user_launch_the_application() throws Throwable {
		String url = FileReaderManager.getInstanceCR().getUrl();
		
	    getUrl(url);
	}

	@When("^user enter the valid username in the username field$")
	public void user_enter_the_valid_username_in_the_username_field() throws Throwable  {
		String username = FileReaderManager.getInstanceCR().getUsername();
	inputValue(rv.getRo(),username)  ;  
	}

	@When("^user enter the valid password in the password field$")
	public void user_enter_the_valid_password_in_the_password_field() throws Throwable {
		String password = FileReaderManager.getInstanceCR().getPassword();
	 inputValue(rv.getDe(),password);   
	}


@Then("^user clicks on the login button and user navigate to next page$")
public void user_clicks_on_the_login_button_and_user_navigate_to_next_page() throws Throwable {
   clickOnElement(rv.getFr());
}
@Given("^user select the preferred location$")
public void user_select_the_preferred_location() throws Throwable {
 dropdown(mk.getGt(),"ByVisibleText","London");
}

@When("^user select the preferred hotel$")
public void user_select_the_preferred_hotel() throws Throwable {
	dropdown(mk.getHu(),"ByVisibleText","Hotel Sunshine");
}

@When("^user select the no of rooms$")
public void user_select_the_no_of_rooms() throws Throwable {
	dropdown(mk.getSq(),"ByVisibleText","Double");
}
@When("^user select room type$")
public void user_select_room_type() throws Throwable {
	dropdown(mk.getYy(),"ByValue","3");
}

@When("^user enter the check In date$")
public void user_enter_the_check_In_date() throws Throwable {
	inputValue(mk.getOi(),"08"); 
}

@When("^user enter the check Out date$")
public void user_enter_the_check_Out_date() throws Throwable {
	inputValue(mk.getGg(),"09");
}

@When("^user select the Adults per room$")
public void user_select_the_Adults_per_room() throws Throwable {
	dropdown(mk.getSx(),"ByValue","1");
}


@When("^user clicks on the search button and navigate to next page$")
public void user_clicks_on_the_search_button_and_navigate_to_next_page() throws Throwable {
	clickOnElement(mk.getBm());
}
@When("^user click on the selected hotel$")
public void user_click_on_the_selected_hotel() throws Throwable {
	clickOnElement(mk.getDn());
}

@Then("^user click on the continue button and navigate to the next page$")
public void user_click_on_the_continue_button_and_navigate_to_the_next_page() throws Throwable {
	clickOnElement(mk.getSm());
}

@Given("^User enter the first name$")
public void user_enter_the_first_name() throws Throwable {
	String getfirstname = FileReaderManager.getInstanceCR().getfirstname();
	inputValue(bo.getKc(),getfirstname);
}

@When("^User enter the last name$")
public void user_enter_the_last_name() throws Throwable {
	String getlastname = FileReaderManager.getInstanceCR().getlastname();
	inputValue(bo.getKx(),getlastname);
}

@When("^user enter the Billing address$")
public void user_enter_the_Billing_address() throws Throwable {
	String getaddress = FileReaderManager.getInstanceCR().getaddress();
	inputValue(bo.getKj(),getaddress);
}

@When("^user enter the credit card no$")
public void user_enter_the_credit_card_no() throws Throwable {
	String getcardnumber = FileReaderManager.getInstanceCR().getcardnumber();
	inputValue(bo.getKr(),getcardnumber);
}

@When("^user select the credit card type$")
public void user_select_the_credit_card_type() throws Throwable {
	String getcard = FileReaderManager.getInstanceCR().getCardtype();
	dropdown(bo.getKv(),"ByVisibleText",getcard);
}

@When("^user select the month$")
public void user_select_the_month() throws Throwable {
	String getexpirymonth = FileReaderManager.getInstanceCR().getexpirymonth();
	dropdown(bo.getKd(),"ByValue", getexpirymonth);
}

@When("^user select the year$")
public void user_select_the_year() throws Throwable {
	String getexpiryyear = FileReaderManager.getInstanceCR().getexpiryyear();
	dropdown(bo.getKp(),"ByValue",getexpiryyear);
}

@When("^User enter the CVV number$")
public void user_enter_the_CVV_number() throws Throwable {
	String getcvv = FileReaderManager.getInstanceCR().getcvv();
	inputValue(bo.getAm(),getcvv);
}

@When("^user click on Book now button$")
public void user_click_on_Book_now_button() throws Throwable {
	clickOnElement(bo.getDp());
}

@When("^user click on My Iternary button$")
public void user_click_on_My_Iternary_button() throws Throwable {
	clickOnElement(bo.getHc());
}

@Then("^user click on logout button$")
public void user_click_on_logout_button() throws Throwable {
	clickOnElement(bo.getVj());
}


}





