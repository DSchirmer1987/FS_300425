package bhs.model.tier;

public abstract class Tier {
	private Integer alter;
	private Double gewicht;
	private Integer hunger;
	private Boolean erwachsen;
	private String status;
	private Boolean actionPerformend;
	
	public Tier() {
		this.alter = 1;
		this.gewicht = 5.00;
		this.hunger = 0;
		this.erwachsen = false;
		this.actionPerformend = false;
	}

	public Integer getAlter() {
		return alter;
	}

	public void setAlter(Integer alter) {
		this.alter = alter;
		if(this.alter >= 6) {
			this.erwachsen = true;
		}
	}

	public Double getGewicht() {
		return gewicht;
	}

	public void setGewicht(Double gewicht) {
		this.gewicht = gewicht;
	}

	public Integer getHunger() {
		return hunger;
	}

	public void setHunger(Integer hunger) {
		this.hunger = hunger;
	}

	public Boolean getErwachsen() {
		return erwachsen;
	}

	public void setErwachsen(Boolean erwachsen) {
		this.erwachsen = erwachsen;
	}
	
	public Boolean getActionPerformend() {
		return actionPerformend;
	}

	public void setActionPerformend(Boolean actionPerformend) {
		this.actionPerformend = actionPerformend;
	}

	public String toString() {
		return "Alter: " + this.getAlter() + " Gewicht: " + this.getGewicht() + " " + this.getStatus();
	}
	
	public String getStatus() {
		if(this.getErwachsen()) {
			this.status = "erwachsen";
		} else {
			this.status = "jung";
		}
		if(this.getHunger() == 0) {
			this.status += "/satt";
		} else {
			this.status = this.status + "/hungrig";
		}
		return this.status;
	}
	
	public void fuettern() {
		this.hunger = 0;
		this.gewicht = this.gewicht + 5;
	}
}
