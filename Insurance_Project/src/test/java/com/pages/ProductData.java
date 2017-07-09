package com.pages;

import java.io.IOException;
import java.util.HashMap;

import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.xml.sax.SAXException;

import com.utilities.Utilities;
import com.utilities.XmlParser;

public class ProductData {

	static String startDate = ".//*[@id='startdate']";
	static String insuranceSum = ".//*[@id='insurancesum']";
	static String meritRating = ".//*[@id='meritrating']";
	static String damageInsurance = ".//*[@id='damageinsurance']";
	static String euroProtection = ".//*[@id='insurance-form']/div/section[3]/div[5]/p/label[1]/span";
	static String legalDefenceInsurance = ".//*[@id='insurance-form']/div/section[3]/div[5]/p/label[2]/span";
	static String courtesyCar = ".//*[@id='courtesycar']";
	static String next = ".//*[@id='nextselectpriceoption']";
	String prev = ".//*[@id='preventerinsurancedata']";
	static String url = System.getProperty("user.dir") + "\\src\\test\\resources\\ProductData.xml";

	static public void enterProductData(WebDriver driver, String tagname) throws InterruptedException, ParserConfigurationException, SAXException, IOException {

		Thread.sleep(2000);
		
		HashMap<String, String> product = XmlParser.getxmlData(tagname,url);

		driver.findElement(By.xpath(startDate)).sendKeys(product.get("StartDate"));
		driver.findElement(By.xpath(insuranceSum)).sendKeys(product.get("InsuranceSum"));
		driver.findElement(By.xpath(meritRating)).sendKeys(product.get("MeritRating"));
		driver.findElement(By.xpath(damageInsurance)).sendKeys(product.get("DamageInsurance"));
		driver.findElement(By.xpath(euroProtection)).click();
		driver.findElement(By.xpath(legalDefenceInsurance)).click();
		driver.findElement(By.xpath(courtesyCar)).sendKeys(product.get("CourtesyCar"));
		driver.findElement(By.xpath(next)).click();

	}

}
