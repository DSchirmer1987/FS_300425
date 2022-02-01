package bhs.model.tier;

public abstract class Tier {
	private Integer alter;
	private Double gewicht;
	private Integer hunger;
	private Boolean erwachsen;
	
	public Tier() {
		this.alter = 0;
		this.gewicht = 0.00;
		this.hunger = 0;
		this.erwachsen = false;
	}
}
