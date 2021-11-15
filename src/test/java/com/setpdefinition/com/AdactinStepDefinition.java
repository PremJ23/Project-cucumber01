package com.setpdefinition.com;

import org.openqa.selenium.WebDriver;

import com.baseclass.com.Base;
import com.helper.com.FileReaderManager;
import com.main.project.com.Adactin_Login;
import com.main.project.com.Card_Details;
import com.main.project.com.Form_Fill;
import com.main.project.com.Room_Booking;
import com.main.project.com.SelectRooms;
import com.runner.com.AdactinRunner;

import cucumber.api.java.en.*;

public class AdactinStepDefinition extends Base {

	public static WebDriver driver = AdactinRunner.driver;

	Adactin_Login lp = new Adactin_Login(driver);

	Form_Fill ff = new Form_Fill(driver);

	SelectRooms sr = new SelectRooms(driver);

	Card_Details cc = new Card_Details(driver);

	Room_Booking rb = new Room_Booking(driver);

	@Given("^user launch the application$")
	public void user_launch_the_application() throws Throwable {

		String url = FileReaderManager.getInstanceCR().GetURL();

		toGet(url);

	}

	@When("^User enter the valid \"([^\"]*)\" in the username field$")
	public void user_enter_the_valid_in_the_username_field(String arg1) throws Throwable {

		toSendKeys(lp.getUsername(), arg1);

	}

	@When("^User enter the correct \"([^\"]*)\" in the password field$")
	public void user_enter_the_correct_in_the_password_field(String arg1) throws Throwable {

		toSendKeys(lp.getPass(), arg1);

	}

	@Then("^User clicks on the login button$")
	public void user_clicks_on_the_login_button() throws Throwable {

		toClick(lp.getLogin());

	}

	@Given("^User select the correct location in the location field$")
	public void user_select_the_correct_location_in_the_location_field() throws Throwable {

		dropDownSelection(ff.getLocations(), "index", "5");

	}

	@When("^User select the correct hotel in the hotels field$")
	public void user_select_the_correct_hotel_in_the_hotels_field() throws Throwable {

		dropDownSelection(ff.getHotel(), "value", "Hotel Creek");

	}

	@When("^User has to select the corrcet room type in the room type field$")
	public void user_has_to_select_the_corrcet_room_type_in_the_room_type_field() throws Throwable {

		dropDownSelection(ff.getRoom(), "text", "Deluxe");

	}

	@When("^User select the corrcet number of room in the number of rooms field$")
	public void user_select_the_corrcet_number_of_room_in_the_number_of_rooms_field() throws Throwable {

		dropDownSelection(ff.getNo(), "index", "5");

	}

	@When("^User enter the valid checkin date in the checkin date field$")
	public void user_enter_the_valid_checkin_date_in_the_checkin_date_field() throws Throwable {

		toClick(ff.getCheckIn());

	}

	@When("^User enter the valid checkout date in the checkout date field$")
	public void user_enter_the_valid_checkout_date_in_the_checkout_date_field() throws Throwable {

		toClick(ff.getCheckOut());

	}

	@When("^User select the adults in the adults per room field$")
	public void user_select_the_adults_in_the_adults_per_room_field() throws Throwable {

		dropDownSelection(ff.getAdult(), "index", "3");

	}

	@When("^User select the childrens in the children per room field$")
	public void user_select_the_childrens_in_the_children_per_room_field() throws Throwable {

		dropDownSelection(ff.getChild(), "index", "2");

	}

	@Then("^User clicks the search button$")
	public void user_clicks_the_search_button() throws Throwable {

		toClick(ff.getSubmit());

	}

	@Given("^User select the hotel in the select hotel field$")
	public void user_select_the_hotel_in_the_select_hotel_field() throws Throwable {

		toClick(sr.getSelect());

	}

	@Then("^User clicks on the continue button$")
	public void user_clicks_on_the_continue_button() throws Throwable {

		toClick(sr.getOk());

	}

	@Given("^User enter the valid first name in the first name field$")
	public void user_enter_the_valid_first_name_in_the_first_name_field() throws Throwable {

		toSendKeys(cc.getFirstName(), "Jesus");

	}

	@When("^User enter the valid last name in the last name field$")
	public void user_enter_the_valid_last_name_in_the_last_name_field() throws Throwable {

		toSendKeys(cc.getLastName(), "christ");

	}

	@When("^User enter the valid address in the billing address field$")
	public void user_enter_the_valid_address_in_the_billing_address_field() throws Throwable {

		toSendKeys(cc.getAddress(), "heaven");

	}

	@When("^User enter the valid credit card number in the card no field$")
	public void user_enter_the_valid_credit_card_number_in_the_card_no_field() throws Throwable {
		
		String card = FileReaderManager.getInstanceCR().getCard();

		toSendKeys(cc.getCredit_Card(), card);

	}

	@When("^User selecting the correct card type in the credit card type field$")
	public void user_selecting_the_correct_card_type_in_the_credit_card_type_field() throws Throwable {

		dropDownSelection(cc.getType(), "value", "VISA");

	}

	@When("^User selecting the correct month in the expiry month field$")
	public void user_selecting_the_correct_month_in_the_expiry_month_field() throws Throwable {

		dropDownSelection(cc.getMonth(), "text", "March");

	}

	@When("^User selecting the correct year in the expiry year field$")
	public void user_selecting_the_correct_year_in_the_expiry_year_field() throws Throwable {

		dropDownSelection(cc.getYear(), "index", "5");

	}

	@When("^User enter the valid cvv number in the cvv number field$")
	public void user_enter_the_valid_cvv_number_in_the_cvv_number_field() throws Throwable {
		
		String cvv = FileReaderManager.getInstanceCR().getCVV();

		toSendKeys(cc.getCVV(), cvv);

	}

	@Then("^User clicks on the book button$")
	public void user_clicks_on_the_book_button() throws Throwable {

		toClick(cc.getBook());

		implicitWait(10);

	}

	@When("^User clicks on the ltinerary button$")
	public void user_clicks_on_the_ltinerary_button() throws Throwable {

		toClick(rb.getItinerary());

		implicitWait(10);

	}

	@Then("^User clicks on the logout button$")
	public void user_clicks_on_the_logout_button() throws Throwable {

		toClick(rb.getLogout());

	}

}
