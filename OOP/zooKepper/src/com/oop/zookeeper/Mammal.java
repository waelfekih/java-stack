package com.oop.zookeeper;

public abstract class Mammal {
	private int energy ;
	
	public Mammal(int energy) {
		this.energy = energy;
	}
	
	public void displayEnergy() {
		System.out.println("Your energy is " + energy);
	}
	
	
	
	
	//getters & setters
	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}

}
