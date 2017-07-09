package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	static String automobileTab = ".//*[@id='nav_automobile']";
	static String truckTab = ".//*[@id='nav_truck']";
	static String motorcycleTab = ".//*[@id='nav_motorcycle']";
	static String camperTab = ".//*[@id='nav_camper']";

	public static void automobile(WebDriver driver) {

		driver.findElement(By.xpath(automobileTab)).click();

	}

	public static void truck(WebDriver driver) {

		driver.findElement(By.xpath(truckTab)).click();

	}

	public static void camper(WebDriver driver) {

		driver.findElement(By.xpath(camperTab)).click();

	}

	public static void motorcycle(WebDriver driver) {

		driver.findElement(By.xpath(motorcycleTab)).click();

	}
}
