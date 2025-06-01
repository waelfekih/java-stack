package com.oop.device;

public class Device {
	

	private int battery;
	
	public Device(int battery) {
		this.battery = 100;
	}
	
	//getters & setters
	public int getBattery() {
		return battery;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}
}
