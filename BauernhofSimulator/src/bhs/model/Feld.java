package bhs.model;

import bhs.model.pflanze.Pflanze;

public class Feld {
	private Pflanze[] pflanzen;
	private Integer anzahl;
	private String sorte;
	private Integer feldnummer;
	private static Integer stFeld = 0;
	
	public Pflanze[] getPflanzen() {
		return pflanzen;
	}

	public Feld() {
		this.sorte = "Keine";
		this.anzahl = 0;
		this.stFeld++;
		this.feldnummer = this.stFeld;
	}
	
	public void wachsen() {
		if(this.anzahl <= 20 && this.anzahl != 0) {
			this.pflanzen[this.anzahl -1] = new Pflanze(this.sorte);
			this.anzahl++;
		}
	}
	
	public void bepflanzen(String sorte) {
		this.pflanzen = new Pflanze[20];
		this.anzahl = 1;
		this.sorte = sorte;
	}
	
	public String toString() {
		return "Feld " + this.feldnummer + " Sorte: " + this.sorte + " Anzahl: " + this.anzahl;
	}
}
