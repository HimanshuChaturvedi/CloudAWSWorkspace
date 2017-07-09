package com.pages;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.xml.sax.SAXException;

import com.utilities.Utilities;
import com.utilities.XmlParser;

public class InsurantData {

	static String firstName = ".//*[@id='firstname']";
	static String lastName = ".//*[@id='lastname']";
	static String birthDate = ".//*[@id='birthdate']";
	static String gender = ".//*[@id='insurance-form']/div/section[2]/div[4]/p";
	String male = ".//*[@id='insurance-form']/div/section[2]/div[4]/p/label[1]";
	String female = ".//*[@id='insurance-form']/div/section[2]/div[4]/p/label[2]";
	static String streetAddress = ".//*[@id='streetaddress']";
	static String country = ".//*[@id='country']";
	static String zipCode = ".//*[@id='zipcode']";
	static String city = ".//*[@id='city']";
	static String occupation =".//*[@id='occupation']";
	static String Hobbies = ".//*[@id='insurance-form']/div/section[2]/div[10]/p";
	static String speeding = ".//*[@id='insurance-form']/div/section[2]/div[10]/p/label[1]";
	static String bungeeJumping = ".//*[@id='insurance-form']/div/section[2]/div[10]/p/label[2]";
	static String cliffDiving = ".//*[@id='insurance-form']/div/section[2]/div[10]/p/label[3]";
	static String skyDiving = ".//*[@id='insurance-form']/div/section[2]/div[10]/p/label[4]";
	static String other = ".//*[@id='insurance-form']/div/section[2]/div[10]/p/label[5]";
	static String website = ".//*[@id='website']";
	static String picture = ".//*[@id='picture']";
	static String open = ".//*[@id='open']";
	static String prev = ".//*[@id='preventervehicledata']";
	static String next = ".//*[@id='nextenterproductdata']";
	static String url = System.getProperty("user.dir") + "\\src\\test\\resources\\InsurantData.xml";

	public static void ensurantDetails(WebDriver driver, String tagname)
			throws InterruptedException, ParserConfigurationException, SAXException, IOException {

		Thread.sleep(2000);

		HashMap<String, String> details = XmlParser.getxmlData(tagname,url);

		driver.findElement(By.xpath(firstName)).sendKeys(details.get("FirstName"));
		driver.findElement(By.xpath(lastName)).sendKeys(details.get("LastName"));
		driver.findElement(By.xpath(birthDate)).sendKeys(details.get("DateofBirth"));
		/* driver.findElement(By.xpath(gender)).sendKeys("Himanshu"); */
		/* List<WebElement> gender = driver.findElements(By.tagName("Male")); */
		driver.findElement(By.id("gendermale")).click();
		driver.findElement(By.xpath(streetAddress)).sendKeys(details.get("StreetAddress"));
		driver.findElement(By.xpath(country)).sendKeys(details.get("Country"));
		driver.findElement(By.xpath(zipCode)).sendKeys(details.get("ZipCode"));
		driver.findElement(By.xpath(city)).sendKeys(details.get("City"));
		driver.findElement(By.xpath(occupation)).sendKeys(details.get("Occupation"));
		/* driver.findElement(By.xpath(Hobbies)).sendKeys("201002"); */
		driver.findElement(By.xpath(speeding)).click();
		driver.findElement(By.xpath(bungeeJumping)).click();
		driver.findElement(By.xpath(cliffDiving)).click();
		driver.findElement(By.xpath(skyDiving)).click();
		driver.findElement(By.xpath(other)).click();
		driver.findElement(By.xpath(website)).sendKeys(details.get("Website"));
		/* driver.findElement(By.xpath(picture)).sendKeys("201002"); */
		/*
		 * driver.findElement(By.xpath(open)).click();
		 * driver.findElement(By.xpath(prev)).click();
		 */
		driver.findElement(By.xpath(next)).click();

	}

}
