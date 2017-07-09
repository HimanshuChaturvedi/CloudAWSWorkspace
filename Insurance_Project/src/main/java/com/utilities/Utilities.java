package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import com.pages.HomePage;

public class Utilities {

	public static WebDriver driver;

	public static String getProperty(String Property) throws IOException {

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\env.properties");
		prop.load(fis);
		return prop.getProperty(Property);

	}

	public static void initialize() throws IOException, InterruptedException {

		System.setProperty("webdriver.gecko.driver",
				"D:/Users/himanshu.chaturvedi/Data/Personal/geckodriver-v0.16.1-win64/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(Utilities.getProperty("url"));
		/* driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); */

	}

	public static HashMap<String, String> getVehicleData(String make)
			throws ParserConfigurationException, SAXException, IOException {

		HashMap<String, String> data = new HashMap<String, String>();

		String xmlFile = System.getProperty("user.dir") + "\\src\\test\\resources\\VehicleData.xml";
		File fXmlFIle = new File(xmlFile);

		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(xmlFile);

		NodeList sList = doc.getElementsByTagName(make);
		NodeList sNodeLst = sList.item(0).getChildNodes();
		for (int i = 0; i < sNodeLst.getLength(); i++) {

			Node node = sNodeLst.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {

				System.out.println(node.getNodeName() + " ***** " + node.getTextContent());
				data.put(node.getNodeName(), node.getTextContent());
			}

		}

		return data;

	}

	public static HashMap<String, String> getInsurantData(String make)
			throws ParserConfigurationException, SAXException, IOException {

		HashMap<String, String> data = new HashMap<String, String>();

		String xmlFile = System.getProperty("user.dir") + "\\src\\test\\resources\\InsurantData.xml";
		File fXmlFIle = new File(xmlFile);

		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(xmlFile);

		NodeList sList = doc.getElementsByTagName(make);
		NodeList sNodeLst = sList.item(0).getChildNodes();
		for (int i = 0; i < sNodeLst.getLength(); i++) {

			Node node = sNodeLst.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {

				System.out.println(node.getNodeName() + " ***** " + node.getTextContent());
				data.put(node.getNodeName(), node.getTextContent());
			}

		}

		return data;

	}

	public static HashMap<String, String> getProductData(String make)
			throws ParserConfigurationException, SAXException, IOException {

		HashMap<String, String> data = new HashMap<String, String>();

		String xmlFile = System.getProperty("user.dir") + "\\src\\test\\resources\\ProductData.xml";
		File fXmlFIle = new File(xmlFile);

		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(xmlFile);

		NodeList sList = doc.getElementsByTagName(make);
		NodeList sNodeLst = sList.item(0).getChildNodes();
		for (int i = 0; i < sNodeLst.getLength(); i++) {

			Node node = sNodeLst.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {

				System.out.println(node.getNodeName() + " ***** " + node.getTextContent());
				data.put(node.getNodeName(), node.getTextContent());
			}

		}

		return data;

	}
	public static HashMap<String, String> getQuoteData(String make)
			throws ParserConfigurationException, SAXException, IOException {

		HashMap<String, String> data = new HashMap<String, String>();

		String xmlFile = System.getProperty("user.dir") + "\\src\\test\\resources\\SendQuoteData.xml";
		File fXmlFIle = new File(xmlFile);

		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(xmlFile);

		NodeList sList = doc.getElementsByTagName(make);
		NodeList sNodeLst = sList.item(0).getChildNodes();
		for (int i = 0; i < sNodeLst.getLength(); i++) {

			Node node = sNodeLst.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {

				System.out.println(node.getNodeName() + " ***** " + node.getTextContent());
				data.put(node.getNodeName(), node.getTextContent());
			}

		}

		return data;

	}
}
