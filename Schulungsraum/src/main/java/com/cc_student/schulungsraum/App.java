package com.cc_student.schulungsraum;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import com.cc_student.schulungsraum.model.ConfigReader;
import com.cc_student.schulungsraum.model.ConfigWriter;
import com.cc_student.schulungsraum.model.Tier;

public class App {

	public static void main(String[] args) {
		// App-Ordner erstellen
		String appdir = System.getProperty("user.home") + "/.bhs";
		try {
			Files.createDirectories(Paths.get(appdir));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		ConfigReader cr = new ConfigReader(appdir + "/config.xml");
		List<Tier> tiere = cr.readConfig();
		for (Tier tier : tiere) {
			System.out.println(tier);
		}
		
		Tier lamm = new Tier();
		lamm.setName("Lamm");
		lamm.setPreis("23");
		tiere.add(lamm);
		ConfigWriter cw = new ConfigWriter(appdir + "/config.xml");
		cw.writeConfig(tiere);
	}

}
