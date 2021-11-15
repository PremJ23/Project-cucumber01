package com.main.project.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Login {

	public static WebDriver driver;

	@FindBy(name = "username")
	private WebElement username;

	@FindBy(id = "password")
	private WebElement pass;

	@FindBy(xpath = "//input[@name='login']")
	private WebElement login;

	public Adactin_Login(WebDriver driver2) {
		this.driver = driver2;

		PageFactory.initElements(driver2, this);
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogin() {
		return login;
	}

}
