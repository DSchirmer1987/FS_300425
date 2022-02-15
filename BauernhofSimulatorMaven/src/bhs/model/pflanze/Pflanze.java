package bhs.model.pflanze;

import java.util.Random;

public class Pflanze {
	private String sorte;
	private Integer erntemenge;
	private Integer qualitaet;
	
	public String getSorte() {
		return sorte;
	}

	public void setSorte(String sorte) {
		this.sorte = sorte;
	}

	public Integer getErntemenge() {
		return erntemenge;
	}

	public void setErntemenge(Integer erntemenge) {
		this.erntemenge = erntemenge;
	}

	public Integer getQualitaet() {
		return qualitaet;
	}

	public void setQualitaet(Integer qualitaet) {
		this.qualitaet = qualitaet;
	}

	public Pflanze(String sorte) {
		this.sorte = sorte;
		this.erntemenge = 0;
	}
	
	public Integer ernten() {
		Random r =  new Random();
		this.qualitaet = 50 + r.nextInt(85 - 50 + 1);
		return this.qualitaet;
	}
	
	public String toString() {
		return "Sorte: " + this.sorte;
	}
}
