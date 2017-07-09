package com.test;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.xml.sax.SAXException;

import com.pages.Automobile;
import com.pages.InsurantData;
import com.pages.HomePage;
import com.pages.ProductData;
import com.pages.SelectPriceOption;
import com.pages.SendQuote;
import com.utilities.Utilities;

public class NewInsuranceAutomobile extends Utilities {

	
	@BeforeMethod

	public void setUp() throws InterruptedException, IOException {
		Utilities.initialize();
	}

	@AfterMethod

	public void tearDown() {

		driver.close();
		System.out.println("test1234");

	}

	@Test
	public void newAutomobileInsuranceSilver() throws InterruptedException, IOException, ParserConfigurationException, SAXException {
	
		 Automobile.vehicleInfo_Automobile(driver,"BMW");
		 InsurantData.ensurantDetails(driver, "AutomobileBMW");
		 ProductData.enterProductData(driver, "AutomobileProductAudi");
		 SelectPriceOption.selectPriceOption(driver);
		 SendQuote.sendQuote(driver, "AutomobileSendQuoteAudi");
	}

	/*@Test(enabled = false)
	public void newAutomobileInsuranceGold() {
		HomePage.automobile(driver);
		Automobile.makeType("B", driver);
		Automobile.enginePerf("2000", driver);
		Automobile.dateOfM("06/01/2017", driver);
		Automobile.numOfSeat("5", driver);
		Automobile.fuelType("Petrol", driver);
		Automobile.listPr("15000", driver);
		Automobile.licensePlate("UP 14 HC 66676", driver);
		Automobile.annualMil("30000", driver);
		Automobile.nextB(driver);
	}
*/
}
