package com.oop.zookeeper;

public class Bat extends Mammal {
	private boolean isFlying;
	private boolean isEating ;
	private boolean isAttacking;
	
	public Bat() {
		super(300);
		this.isFlying = true ;
		this.isEating = true ;
		this.isAttacking = true;
	}
	
	public void fly() {
		if (isFlying && getEnergy() >= 50) {
			setEnergy(getEnergy() - 50);
			
			System.out.println("The bat is airborne and the energy is " + getEnergy()) ;
		} else {
			System.out.println("The bat didn't fly & your energy is " + getEnergy() ) ;

		}		
	}
	
	public void eatHumans() {
		if (isEating && getEnergy() < 300) {
			setEnergy(Math.min(getEnergy() + 25, 300 )) ;
			System.out.println("You successfully eat a human and Your energy is " + getEnergy()) ;
		} else {
			System.out.println("Energy is full");
		}
	}
	
	public void attackTown() {
		if (isAttacking && getEnergy() >= 100) {
			setEnergy(getEnergy() - 100 ) ;
			System.out.println("The bat have successfully attacked the town and his energy is " + getEnergy()) ;
		} else {
			System.out.println("The bat couldn't attack the town");
		}
		
	}
}
