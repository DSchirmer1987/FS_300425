package bhs.model.tier;

public class Kuh extends Tier{
	
	private Integer melkmenge;
	
	public Kuh() {
		super();
		this.melkmenge = 6;
	}
	
	public int melken() {
		return this.melkmenge;
	}
}
