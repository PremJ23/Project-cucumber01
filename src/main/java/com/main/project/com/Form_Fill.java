package com.main.project.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Form_Fill {

	public static WebDriver driver;

	@FindBy(name = "location")

	private WebElement locations;

	@FindBy(id = "hotels")

	private WebElement Hotel;

	@FindBy(id = "room_type")

	private WebElement Room;

	@FindBy(name = "room_nos")

	private WebElement No;

	@FindBy(name = "datepick_in")

	private WebElement checkIn;

	@FindBy(id = "datepick_out")

	private WebElement checkOut;

	@FindBy(id = "adult_room")

	private WebElement adult;

	@FindBy(name = "child_room")

	private WebElement child;
	
	@FindBy (name = "Submit")
	
	private WebElement submit;
	
	

	

	public Form_Fill(WebDriver driver2) {

		this.driver = driver2;

		PageFactory.initElements(driver2, this);

	}

	public WebElement getLocations() {
		return locations;
	}

	public WebElement getHotel() {
		return Hotel;
	}

	public WebElement getRoom() {
		return Room;
	}

	public WebElement getNo() {
		return No;
	}

	public WebElement getCheckIn() {
		return checkIn;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}
	
	public WebElement getSubmit() {
		return submit;
	}

}
