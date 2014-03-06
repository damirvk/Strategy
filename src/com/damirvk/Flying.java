package com.damirvk;

public interface Flying {

	public String getIFlying();
}

class CanFly implements Flying {

	@Override
	public String getIFlying() {
		return "Fly";
	}	
}

class CannotFly implements Flying {
	
	@Override
	public String getIFlying() {
		return "Cannot Fly";
	}
}