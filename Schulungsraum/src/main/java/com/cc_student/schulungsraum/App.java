package com.cc_student.schulungsraum;

import java.util.List;

import com.cc_student.schulungsraum.model.ConfigReader;
import com.cc_student.schulungsraum.model.Tier;

public class App {

	public static void main(String[] args) {
		ConfigReader cr = new ConfigReader("config.xml");
		List<Tier> tiere = cr.readConfig();
		for (Tier tier : tiere) {
			System.out.println(tier);
		}
	}

}
