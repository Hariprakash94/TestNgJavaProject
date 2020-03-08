package com.annotations_config;

import org.springframework.beans.factory.annotation.Autowired;

public class Meal {
	@Autowired
	private Meat meat;
	@Autowired
	private Dairy dairy;
	@Autowired
	private Grain grain;
	@Autowired
	private Fruit fruit;
	@Autowired
	private Vegetable veg;
	


	public Meat getMeat() {
		return meat;
	}

	public void setMeat(Meat meat) {
		this.meat = meat;
	}

	public Dairy getDairy() {
		return dairy;
	}

	public void setDairy(Dairy dairy) {
		this.dairy = dairy;
	}

	public Grain getGrain() {
		return grain;
	}

	public void setGrain(Grain grain) {
		this.grain = grain;
	}

	public Fruit getFruit() {
		return fruit;
	}

	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}

	public Vegetable getVeg() {
		return veg;
	}

	public void setVeg(Vegetable veg) {
		this.veg = veg;
	}


	public String whatsInThisMeal() {

		String answer = "this meal contains ";

		if (dairy != null) answer += " some dairy ";
		if (fruit != null) answer += " some fruit ";
		if (grain != null) answer += " some grain ";
		if (veg != null) answer += " some veg ";
		if (meat != null) answer += " some meat ";

		return answer;
	}
}
