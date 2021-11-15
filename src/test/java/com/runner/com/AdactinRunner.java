package com.runner.com;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.com.Base;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature\\com", glue = "com.setpdefinition.com", monochrome = true, plugin = {
		"pretty", "html:Report","com.cucumber.listener.ExtentCucumberFormatter:Report/extentReport.html"})

public class AdactinRunner {

	public static WebDriver driver;

	@BeforeClass
	public static void setUp() {

		driver = Base.Launch();

	}

}
