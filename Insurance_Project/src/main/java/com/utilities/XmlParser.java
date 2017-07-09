package com.utilities;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.pages.Automobile;

public class XmlParser {
	
	public static HashMap<String, String> getxmlData(String tagname, String url)
			throws ParserConfigurationException, SAXException, IOException {

		HashMap<String, String> data = new HashMap<String, String>();
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(new File(url));

		NodeList sList = doc.getElementsByTagName(tagname);
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
