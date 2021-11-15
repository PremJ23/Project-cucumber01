package com.helper.com;

import org.openqa.selenium.WebDriver;

import com.main.project.com.Adactin_Login;
import com.main.project.com.Card_Details;
import com.main.project.com.Form_Fill;
import com.main.project.com.Room_Booking;
import com.main.project.com.SelectRooms;

public class PageObjectManager {

	public static WebDriver driver;

	private Adactin_Login lg;

	private Form_Fill ff;

	private SelectRooms sr;

	private Card_Details cc;

	private Room_Booking rb;

	public PageObjectManager(WebDriver driver2) {

		this.driver = driver2;

	}

	public Adactin_Login loginpage() {

		lg = new Adactin_Login(driver);

		return lg;

	}

	public Form_Fill filling() {

		ff = new Form_Fill(driver);

		return ff;
	}



	public SelectRooms room() {

		sr = new SelectRooms(driver);

		return sr;

	}


	public Card_Details details() {

		cc = new Card_Details(driver);

		return cc;

	}


	public Room_Booking Itinerary() {

		rb = new Room_Booking(driver);

		return rb;

	}

}
