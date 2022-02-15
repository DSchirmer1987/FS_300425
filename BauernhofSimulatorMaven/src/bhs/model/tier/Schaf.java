package bhs.model.tier;

public class Schaf extends Tier{
	private int schermenge;
	
	public Schaf() {
		super();
		this.schermenge = 4;
	}
	
	public int scheren() {
		return this.schermenge;
	}
}
