package com.BrowserLaunch.com;

import org.openqa.selenium.WebDriver;

import com.baseclass.com.Base;
import com.helper.com.PageObjectManager;
import com.main.project.com.Adactin_Login;
import com.main.project.com.Card_Details;
import com.main.project.com.Form_Fill;
import com.main.project.com.Room_Booking;
import com.main.project.com.SelectRooms;


public class Launch extends Base {

	public static WebDriver driver;

	public static void main(String[] args) {

		driver = Launch();

//		Adactin_Login lg = new Adactin_Login(driver);
//
//		Form_Fill ff = new Form_Fill(driver);
//
//		SelectRooms sr = new SelectRooms(driver);
//
//		Card_Details cc = new Card_Details(driver);
//
//		Room_Booking rb = new Room_Booking(driver);

		PageObjectManager pm = new PageObjectManager(driver);

		toGet("https://adactinhotelapp.com/index.php");

		toSendKeys(pm.loginpage().getUsername(), "8056976137");

		toSendKeys(pm.loginpage().getPass(), "805697613");

		toClick(pm.loginpage().getLogin());

		implicitWait(10);

		dropDownSelection(pm.filling().getLocations(), "index", "5");

		dropDownSelection(pm.filling().getHotel(), "value", "Hotel Creek");

		dropDownSelection(pm.filling().getRoom(), "text", "Deluxe");

		dropDownSelection(pm.filling().getNo(), "index", "5");

		toClick(pm.filling().getCheckIn());

		toClick(pm.filling().getCheckOut());

		dropDownSelection(pm.filling().getAdult(), "index", "3");

		dropDownSelection(pm.filling().getChild(), "index", "2");

		toClick(pm.filling().getSubmit());

		implicitWait(10);

		toClick(pm.room().getSelect());

		toClick(pm.room().getOk());

		implicitWait(10);

		toSendKeys(pm.details().getFirstName(), "Prem");

		toSendKeys(pm.details().getLastName(), "John");

		toSendKeys(pm.details().getAddress(), "no:7 google stree, microoft building");

		toSendKeys(pm.details().getCredit_Card(), "1236547893214569");

		dropDownSelection(pm.details().getType(), "value", "VISA");

		dropDownSelection(pm.details().getMonth(), "text", "March");

		dropDownSelection(pm.details().getYear(), "index", "5");

		toSendKeys(pm.details().getCVV(), "526");

		toClick(pm.details().getBook());

		implicitWait(10);

		toClick(pm.Itinerary().getItinerary());

		implicitWait(10);

		toClick(pm.Itinerary().getLogout());

	}

}
