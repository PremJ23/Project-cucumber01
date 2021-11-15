package com.main.project.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Card_Details {

	public static WebDriver driver;

	@FindBy(name = "first_name")

	private WebElement FirstName;

	@FindBy(name = "last_name")

	private WebElement LastName;

	@FindBy(name = "address")

	private WebElement Address;

	@FindBy(name = "cc_num")

	private WebElement Credit_Card;

	@FindBy(name = "cc_type")

	private WebElement Type;

	@FindBy(name = "cc_exp_month")

	private WebElement month;

	@FindBy(name = "cc_exp_year")

	private WebElement year;

	@FindBy(name = "cc_cvv")

	private WebElement CVV;

	@FindBy(name = "book_now")

	private WebElement Book;

	public Card_Details(WebDriver driver2) {

		this.driver = driver2;

		PageFactory.initElements(driver2, this);

	}

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getAddress() {
		return Address;
	}

	public WebElement getCredit_Card() {
		return Credit_Card;
	}

	public WebElement getType() {
		return Type;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCVV() {
		return CVV;
	}

	public WebElement getBook() {
		return Book;
	}

}
