package com.helper.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

	public static Properties p;

	public ConfigurationReader() throws Throwable {

		File f = new File(
				"C:\\Users\\Prem\\eclipse-workspace\\Adactin\\src\\test\\java\\com\\properties\\com\\TestData.properties");

		FileInputStream fis = new FileInputStream(f);

		p = new Properties();

		p.load(fis);

	}

	public String GetURL() {

		String url = p.getProperty("URL");

		return url;

	}

	public String getCard() {

		String card = p.getProperty("CardNo");

		return card;

	}
	
	public String getCVV() {
		
		String cvv = p.getProperty("CVV");
		
		return cvv;

	}

}
