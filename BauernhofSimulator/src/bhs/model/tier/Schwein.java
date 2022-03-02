package bhs.model.tier;

import java.util.Random;

public class Schwein extends Tier{
	
	public Schwein() {
		super();
	}
	
	public double schlachten() {
		Random r =  new Random();
		double prozentsatz = 0.5 + (0.75 - 0.5) * r.nextDouble();
		double tmpGewicht = this.getGewicht() * prozentsatz;
		tmpGewicht = tmpGewicht * Math.pow(10, 2);
		tmpGewicht = (int) tmpGewicht;
		tmpGewicht = (double) tmpGewicht / Math.pow(10, 2);
		
		return tmpGewicht;
	}
}
