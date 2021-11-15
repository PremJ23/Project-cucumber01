package com.main.project.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectRooms {

	public static WebDriver driver;

	@FindBy(name = "radiobutton_0")

	private WebElement select;

	@FindBy(name = "continue")

	private WebElement ok;

	public SelectRooms(WebDriver driver2) {

		this.driver = driver2;

		PageFactory.initElements(driver2, this);

	}

	public WebElement getSelect() {
		return select;
	}

	public WebElement getOk() {
		return ok;
	}

}
