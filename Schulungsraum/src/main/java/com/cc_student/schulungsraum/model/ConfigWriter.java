package com.cc_student.schulungsraum.model;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartDocument;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

public class ConfigWriter {
	private String configFile;
	
	public ConfigWriter(String file) {
		this.configFile = file;
	}
	
	public void writeConfig(List<Tier> tiere) {
		XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
		try {
			XMLEventWriter eventWriter = outputFactory.createXMLEventWriter(new FileOutputStream(this.configFile));
			XMLEventFactory eventFactory = XMLEventFactory.newInstance();
			XMLEvent end = eventFactory.createDTD("\n");
			StartDocument startDocument = eventFactory.createStartDocument();
			eventWriter.add(startDocument);
			eventWriter.add(end);
			StartElement configStartElement = eventFactory.createStartElement("", "", "config");
			eventWriter.add(configStartElement);
			eventWriter.add(end);
			
			// Nodes schreiben
			for (Tier tier : tiere) {
				eventWriter.add(eventFactory.createDTD("\t"));
				eventWriter.add(eventFactory.createStartElement("", "", "item"));
				eventWriter.add(end);
				createNode(eventWriter, "name", tier.getName());
				createNode(eventWriter, "preis", tier.getPreis());
				eventWriter.add(eventFactory.createDTD("\t"));
				eventWriter.add(eventFactory.createEndElement("", "", "item"));
				eventWriter.add(end);
			}
		
			eventWriter.add(eventFactory.createEndElement("", "", "config"));
			eventWriter.add(end);
			eventWriter.add(eventFactory.createEndDocument());
			eventWriter.close();
			// Nodes schreiben
		} catch (FileNotFoundException | XMLStreamException e) {
			e.printStackTrace();
		}
	}
	
	private void createNode(XMLEventWriter eventWriter, String name, String value) throws XMLStreamException {
		XMLEventFactory eventFactory = XMLEventFactory.newInstance();
		XMLEvent end = eventFactory.createDTD("\n");
		XMLEvent tab = eventFactory.createDTD("\t\t");
		// Create StartNode
		StartElement sElement = eventFactory.createStartElement("", "", name);
		eventWriter.add(tab);
		eventWriter.add(sElement);
		// Create value
		Characters characters = eventFactory.createCharacters(value);
		eventWriter.add(characters);
		// Create EndNote
		EndElement eElement = eventFactory.createEndElement("", "", name);
		eventWriter.add(eElement);
		eventWriter.add(end);
	}
}
