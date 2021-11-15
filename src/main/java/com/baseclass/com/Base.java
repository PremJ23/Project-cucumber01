package com.baseclass.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

	public static WebDriver driver;

	public static WebDriver Launch() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prem\\eclipse-workspace\\Browser_Launch\\Driver2\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		return driver;

	}

	public static void toSendKeys(WebElement element, String value) {

		element.sendKeys(value);

	}

	public static void toClick(WebElement element) {

		element.click();
		

	}

	public static void toSelected(WebElement element) {

		boolean selected = element.isSelected();

		System.out.println("it is : " + selected);

	}

	public static void toDisplayed(WebElement element) {

		boolean display = element.isDisplayed();

		System.out.println("it is : " + display);

	}

	public static void toEnable(WebElement element) {

		boolean enable = element.isEnabled();

		System.out.println("It is : " + enable);

	}

	public static void toGetText(WebElement element) {

		String text = element.getText();

		System.out.println("WebElement text is : " + text);

	}

	public static void toGet(String url) {

		driver.get(url);

	}

	public static void toClose() {

		driver.close();

	}

	public static void Screenshot(String pic) throws Throwable {

		TakesScreenshot tc = (TakesScreenshot) driver;

		File source = tc.getScreenshotAs(OutputType.FILE);

		File destination = new File("C:\\Users\\Prem\\eclipse-workspace\\MavenEveProject\\Screenshot\\" + pic + ".png");

		FileUtils.copyFile(source, destination);

	}

	public static void implicitWait(int seconds) {

		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);

	}
	
	public static void explicitWait(long seconds, WebElement element) {
		

		WebDriverWait wait = new WebDriverWait(driver, seconds);
		
		wait.until(ExpectedConditions.visibilityOf(element));

		
		
	}
	
	public static void toQuit() {
		
		driver.quit();

	}
	
	public void toClear(WebElement element) {

     element.clear();
		
	}
	
	public static void toAttribute(WebElement element, String name) {

		element.getAttribute(name);
		
	}
	
	public static void toGetCurrentUrl() {

		String url = driver.getCurrentUrl();
		
		System.out.println(url);
		
	}
	
	
	public static void toNavigate(String url) {
		
		driver.navigate().to(url);

	}
	
	public static void toForward() {

		driver.navigate().forward();
		
	}
	
	public static void toBack() {

		driver.navigate().back();
		
	}
	
	public static void toRefresh() {

		driver.navigate().refresh();
		
	}
	
	
	public static void toGetTitle() {

		String title = driver.getTitle();
		
		System.out.println(title);
		
		
		
	}
	
	public static void dropDownSelection(WebElement element, String option, String input) {

		Select sc = new Select (element);
		
		if (option.equalsIgnoreCase("index")) {
			
			int parseInt = Integer.parseInt(input);
			
			sc.selectByIndex(parseInt);

			
		}
		
		else if (option.equalsIgnoreCase("value")) {
						
			sc.selectByValue(input);
			
		}
		
		else if (option.equalsIgnoreCase("text")) {
			
			sc.selectByVisibleText(input);
			
		}
		
		else {
			
			System.out.println("invalid input");
		}
		
		
		
		
		
	}
	
	
	public static void toConfirmAlert(String alert) {
		
		if (alert.equalsIgnoreCase("accept")) {
			
			driver.switchTo().alert().accept();

		}
		
		else if (alert.equalsIgnoreCase("dismiss")) {
			
			driver.switchTo().alert().dismiss();
			
		}
		
		else {
			
			System.out.println("invalid values");
			
		}
		
		

		
	}
	
	
	
	public static void toPromptAlert(String values) {
		
		driver.switchTo().alert().sendKeys(values);
		
		driver.switchTo().alert().accept();

	}
	
	public static void toDragDrop(WebElement drag, WebElement drop) {
		
		Actions ac = new Actions (driver);
		
		ac.dragAndDrop(drag, drop).build().perform();
		

	}
	
	public static void toMoveElement(WebElement element) {

		Actions ac = new Actions (driver);
		
		ac.moveToElement(element).build().perform();
	}
	
	
	public static void toContextClick() {
		
    
		Actions ac = new Actions (driver);
		
		ac.contextClick().build().perform();


		
		
	}
	
	public static void toDoubleClick() {

		Actions ac = new Actions (driver);
		
		ac.doubleClick().build().perform();

		
	}
	
	public static void toClickHold() {

		Actions ac = new Actions (driver);


		
		ac.clickAndHold().build().perform();
	}
	
	public static void toFrame(int value) {

		driver.switchTo().frame(0);
		
	}
	
	public static void toWindowHandle(String handles) {
		
		if(handles.equalsIgnoreCase("windowhandle")) {
			
			driver.getWindowHandle();
		}
		
		else if (handles.equalsIgnoreCase("windowhandles")) {
			
			driver.getWindowHandles();
		}

	}
	
	public static void toRobot() throws Throwable {

		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}
	
	public static void toMultiple(WebElement element) {

		Select sc = new Select (element);
		
		boolean multiple = sc.isMultiple();
		
		System.out.println(multiple);
		
	}
	
	public static void toGetSelected(WebElement element, String values) {
		
		Select sc = new Select (element);
		
		if(values.equalsIgnoreCase("allSelect")) {
			
			sc.getAllSelectedOptions();
		}
		
		else if (values.equalsIgnoreCase("firstSelect")) {
			
			sc.getFirstSelectedOption();
		}
		
		else {
			
			System.out.println("Input wrong");
		}

	}
	
	public static void toScrolling(WebElement element) {
		
		JavascriptExecutor jd = (JavascriptExecutor) driver;
		
		jd.executeScript("arguments[0].scrollIntoView(0)", element);


	}
	
	public static void toScrollUpDown(String value) {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript(value);
			
		
		

	}

}
