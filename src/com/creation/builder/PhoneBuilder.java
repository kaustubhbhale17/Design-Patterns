package com.creation.builder;

public class PhoneBuilder {

	private String os;
	private int ram;
	private String processor;
	private double size;
	private int battery;
	
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public  PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public PhoneBuilder setSize(double size) {
		this.size = size;
		return this;
	}
	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	
	public Phone getPhone() {
		return new Phone(os,ram,processor,size,battery);
	}
}
