package com.damirvk;

public class Main {
	
	
	public static void main(String[] args) {
	
		Bird bird = new Bird("2", 2, new CanFly());
		Horse horse = new Horse("2", 4,new CannotFly());
		
		System.out.println("Ptica "+bird.getFlying().getIFlying());
		System.out.println("Konj "+horse.getFlying().getIFlying());
		
		
	}

}
