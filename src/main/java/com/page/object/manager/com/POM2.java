package com.page.object.manager.com;

import org.openqa.selenium.WebDriver;

import com.main.project.com.Adactin_Login;
import com.main.project.com.Card_Details;
import com.main.project.com.Form_Fill;
import com.main.project.com.Room_Booking;
import com.main.project.com.SelectRooms;

public class POM2 {

	public static WebDriver driver;

	private Adactin_Login lg;

	private Form_Fill ff;

	private SelectRooms sr;

	private Card_Details cc;

	private Room_Booking rb;

	public POM2(WebDriver driver2) {

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

	public Form_Fill Hotels() {

		ff = new Form_Fill(driver);

		return ff;

	}

	public Form_Fill Rooms() {

		ff = new Form_Fill(driver);

		return ff;

	}

	public Form_Fill number() {

		ff = new Form_Fill(driver);

		return ff;

	}

	public Form_Fill CheckIn() {

		ff = new Form_Fill(driver);

		return ff;

	}

	public Form_Fill CheckOut() {

		ff = new Form_Fill(driver);

		return ff;

	}

	public Form_Fill Adults() {

		ff = new Form_Fill(driver);

		return ff;

	}

	public Form_Fill Childs() {

		ff = new Form_Fill(driver);

		return ff;
	}

	public Form_Fill Submit() {

		ff = new Form_Fill(driver);

		return ff;

	}

	public SelectRooms tick() {

		sr = new SelectRooms(driver);

		return sr;

	}

	public SelectRooms clickOk() {

		sr = new SelectRooms(driver);

		return sr;

	}

	public Card_Details FirstName() {

		cc = new Card_Details(driver);

		return cc;

	}

	public Card_Details LastName() {

		cc = new Card_Details(driver);

		return cc;

	}

	public Card_Details Address() {

		cc = new Card_Details(driver);

		return cc;

	}

	public Card_Details CardDetails() {

		cc = new Card_Details(driver);

		return cc;

	}

	public Card_Details CardType() {

		cc = new Card_Details(driver);

		return cc;

	}

	public Card_Details Month() {

		cc = new Card_Details(driver);

		return cc;

	}

	public Card_Details Year() {

		cc = new Card_Details(driver);

		return cc;

	}

	public Card_Details CVV() {

		cc = new Card_Details(driver);

		return cc;

	}

	public Card_Details Book() {

		cc = new Card_Details(driver);

		return cc;

	}

	public Room_Booking Itinerary() {

		rb = new Room_Booking(driver);

		return rb;

	}

	public Room_Booking logout() {

		rb = new Room_Booking(driver);

		return rb;

	}

}
