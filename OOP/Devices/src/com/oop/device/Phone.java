package com.oop.device;

public class Phone extends Device {
	private boolean isCalling ;
	private boolean isPlaying ; 
	private boolean isCharging ;
	
	public Phone(int battery) {
		super(battery);
		this.isCalling = false ;
		this.isPlaying = false ;
		this.isCharging = false ;
	}
	
	public void makeCall() {
		isCalling = true;
		setBattery(getBattery() - 5);
		System.out.println("The phone is calling... and the battery is " + getBattery());
	}
	
	public boolean isCalling() {
        return isCalling;
    }
	
	public void playGame() {
		isPlaying = true ;
		setBattery(getBattery() - 20);
		System.out.println("You are playing a game and the battery is " + getBattery());
	}
	
	public boolean isPlaying() {
		return isPlaying ;
	}
	
	public void charge() {
		isCharging = true ;
		if (getBattery() < 50) {
	        setBattery(getBattery() + 50);
		}
		System.out.println("The phone is charging and the charging value is " + getBattery());
		
	}
	

}
