package com.pages;

import java.io.IOException;
import java.util.HashMap;

import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.xml.sax.SAXException;

import com.utilities.Utilities;
import com.utilities.XmlParser;

public class Automobile {

	static String make_vehicle = ".//*[@id='make']";
	static String enginePerformance = ".//*[@id='engineperformance']";
	static String dateofManufacture = ".//*[@id='dateofmanufacture']";
	static String numberOfSeats = ".//*[@id='numberofseats']";
	static String fuel = ".//*[@id='fuel']";
	static String listPrice = ".//*[@id='listprice']";
	static String licensePlateNumber = ".//*[@id='licenseplatenumber']";
	static String annualMileage = ".//*[@id='annualmileage']";
	static String nextButton = ".//*[@id='nextenterinsurantdata']";
	static String url = System.getProperty("user.dir") + "\\src\\test\\resources\\VehicleData.xml";
    
	public static void vehicleInfo_Automobile(WebDriver driver, String tagname)
			throws ParserConfigurationException, SAXException, IOException, InterruptedException {
		
		HomePage.automobile(driver);
		Thread.sleep(5000);
		HashMap<String, String> vehicle = XmlParser.getxmlData(tagname,url);

		driver.findElement(By.xpath(make_vehicle)).sendKeys(vehicle.get("Make"));

		driver.findElement(By.xpath(enginePerformance)).sendKeys(vehicle.get("EnginePerformance"));

		driver.findElement(By.xpath(dateofManufacture)).sendKeys(vehicle.get("DateofManufacture"));

		driver.findElement(By.xpath(numberOfSeats)).sendKeys(vehicle.get("NumberofSeats"));

		driver.findElement(By.xpath(fuel)).sendKeys(vehicle.get("FuelType"));

		driver.findElement(By.xpath(listPrice)).sendKeys(vehicle.get("ListPrice"));

		driver.findElement(By.xpath(licensePlateNumber)).sendKeys(vehicle.get("LicensePlateNumber"));

		driver.findElement(By.xpath(annualMileage)).sendKeys(vehicle.get("AnnualMileage"));
		driver.findElement(By.xpath(nextButton)).click();

	}

}
