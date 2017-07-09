package com.pages;

import java.io.IOException;
import java.util.HashMap;

import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.xml.sax.SAXException;

import com.utilities.Utilities;
import com.utilities.XmlParser;

public class SendQuote {
	
	
	static String email = ".//*[@id='email']";
	static String phone = ".//*[@id='phone']";
	static String username = ".//*[@id='username']";
	static String password = ".//*[@id='password']";
	static String confirmPassword = ".//*[@id='confirmpassword']";
	static String comments = ".//*[@id='Comments']";
	static String send = ".//*[@id='sendemail']";
	String prev = ".//*[@id='prevselectpriceoption']";
	static String url = System.getProperty("user.dir") + "\\src\\test\\resources\\SendQuoteData.xml";
	
	public static void sendQuote(WebDriver driver, String tagname) throws InterruptedException, ParserConfigurationException, SAXException, IOException{
		
		Thread.sleep(3000);
		
		HashMap<String, String> quote = XmlParser.getxmlData(tagname,url);
		driver.findElement(By.xpath(email)).sendKeys(quote.get("Email"));
		driver.findElement(By.xpath(phone)).sendKeys(quote.get("Phone"));
		driver.findElement(By.xpath(username)).sendKeys(quote.get("Username"));
		driver.findElement(By.xpath(password)).sendKeys(quote.get("Password"));
		driver.findElement(By.xpath(confirmPassword)).sendKeys(quote.get("ConfirmPassword"));
		driver.findElement(By.xpath(comments)).sendKeys(quote.get("Comments"));
		Thread.sleep(3000);
		/*driver.findElement(By.xpath(send)).click();*/
		
		
		
		
		
	}
	
	

}
