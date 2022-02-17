package com.cc_student.schulungsraum.model;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

public class ConfigReader {
	private String file;
	private final String NAME = "name";
	private final String PREIS = "preis";
	private final String ITEM = "item";
	
	public ConfigReader(String file) {
		this.file = file;
	}
	
	public List<Tier> readConfig(){
		List<Tier> tiere = new ArrayList<Tier>();
		// Zuerst die XMLInputFactory aufbauen, welche mit dem Input einer XML arbeitet.
		XMLInputFactory inputFactory = XMLInputFactory.newInstance();
		ClassLoader cl = getClass().getClassLoader();
		InputStream is = cl.getResourceAsStream(file);
		try {
			XMLEventReader eventReader = inputFactory.createXMLEventReader(is);
			Tier tier = null;
			while(eventReader.hasNext()) {
				XMLEvent event = eventReader.nextEvent();
				if(event.isStartElement()) {
					StartElement startElement = event.asStartElement();
					String elementName =  startElement.getName().getLocalPart();
					switch(elementName) {
						case ITEM: {
							tier = new Tier();
							break;
						}
						case NAME: {
							event = eventReader.nextEvent();
							tier.setName(event.asCharacters().getData());
							break;
						}
						case PREIS: {
							event = eventReader.nextEvent();
							tier.setPreis(event.asCharacters().getData());
							break;
						}
					}
				}
				if(event.isEndElement()) {
					EndElement endElement = event.asEndElement();
					if(endElement.getName().getLocalPart().equals(ITEM)) {
						tiere.add(tier);
					}
				}
			}
		} catch (XMLStreamException e) {
			e.printStackTrace();
		}
		return tiere;
	}
}
