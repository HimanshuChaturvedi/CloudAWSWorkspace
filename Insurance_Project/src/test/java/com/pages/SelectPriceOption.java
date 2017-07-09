package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectPriceOption {

	static String silver = ".//*[@id='priceTable']/tfoot/tr/th[2]/label[1]/span";
	static String gold = ".//*[@id='priceTable']/tfoot/tr/th[2]/label[2]/span";
	static String platinum = ".//*[@id='priceTable']/tfoot/tr/th[2]/label[3]/span";
	static String ultimate = ".//*[@id='priceTable']/tfoot/tr/th[2]/label[4]/span";
	static String next = ".//*[@id='nextsendquote']";
	String prev = ".//*[@id='preventerproductdata']";

	public static void selectPriceOption(WebDriver driver) throws InterruptedException {

		
		/*driver.findElement(By.xpath(silver)).click();
		driver.findElement(By.xpath(gold)).click();
		driver.findElement(By.xpath(platinum)).click();*/
		driver.findElement(By.xpath(ultimate)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(next)).click();

	}

}
