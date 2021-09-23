package com.motorcyclesiteratordesignpattern.motorcycles;
/*author Saiprakash Reddy*/
public class MotorCycle {
	
	private int id;
	private String motorCycleName;
	private double size;
	private double speed;
	private String color;
	private String registrationNumber;
	
	public MotorCycle(int id,String motorCycleName, double size, double speed, String color, String registrationNumber) {
		super();
		this.id=id;
		this.motorCycleName = motorCycleName;
		this.size = size;
		this.speed = speed;
		this.color = color;
		this.registrationNumber = registrationNumber;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMotorCycleName() {
		return motorCycleName;
	}
	public void setMotorCycleName(String motorCycleName) {
		this.motorCycleName = motorCycleName;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	@Override
	public String toString() {
		return "MotorCycle [id=" + id + ", motorCycleName=" + motorCycleName + ", size=" + size + ", speed=" + speed
				+ ", color=" + color + ", registrationNumber=" + registrationNumber + "]";
	}
	
	
	
}
