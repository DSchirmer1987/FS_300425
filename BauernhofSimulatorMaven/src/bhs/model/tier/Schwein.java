package bhs.model.tier;

import java.util.Random;

public class Schwein extends Tier{
	
	public Schwein() {
		super();
	}
	
	public double schlachten() {
		Random r =  new Random();
		double prozentsatz = 0.5 + (0.75 - 0.5) * r.nextDouble();
		prozentsatz = Math.round(prozentsatz*100) / 100;
		return Math.round(this.getGewicht() * prozentsatz * 1000) / 1000;
	}
}
