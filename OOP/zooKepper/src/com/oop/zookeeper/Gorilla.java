package com.oop.zookeeper;

public class Gorilla extends Mammal {
	private boolean hasThrow ;
	private boolean hasEatenBanana ;
	private boolean hasClimbed;

	
	public Gorilla() {
		super(100);
		this.hasThrow = true ;
		this.hasEatenBanana = true ;
		this.hasClimbed = true;
	}
	
	public void hasThrowSomething() {
		hasThrow = true ;
		System.out.println("Your energy is " + (getEnergy() - 5));
	}
	
	public void throwSomething() {
		if (hasThrow && getEnergy() >= 5) {
			setEnergy(getEnergy() - 5);
			
			System.out.println("Gorilla throw something and the energy is " + getEnergy()) ;
		} else {
			System.out.println("Your gorilla didn't throw something & your energy is " + getEnergy() ) ;

		}		
	}
	
	public void eatBananas() {
		if (hasEatenBanana && getEnergy() < 100) {
			setEnergy(Math.min(getEnergy() + 10, 100 )) ;
			System.out.println("Your energy after eating banana is " + getEnergy()) ;
		} else {
			System.out.println("Energy can not be increased");
		}
	}
	
	public void climb() {
		if (hasClimbed && getEnergy() >= 10) {
			setEnergy(getEnergy() - 10);
			System.out.println("Gorilla has climbed the tree and the energy is " + getEnergy());
		} else {
			System.out.println("Cannot climb the tree");
		}
		
	}

}
