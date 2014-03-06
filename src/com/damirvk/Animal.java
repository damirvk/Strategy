package com.damirvk;

public class Animal {
	
	public Animal(String eyes, Integer legs, Flying flying) {
		super();
		this.eyes = eyes;
		this.legs = legs;
		this.flying = flying;
	}

	public String getEyes() {
		return eyes;
	}

	public void setEyes(String eyes) {
		this.eyes = eyes;
	}

	public Integer getLegs() {
		return legs;
	}

	public void setLegs(Integer legs) {
		this.legs = legs;
	}

	public Flying getFlying() {
		return flying;
	}

	public void setFlying(Flying flying) {
		this.flying = flying;
	}

	private String eyes;
	
	private Integer legs;
	
	private Flying flying;

}
