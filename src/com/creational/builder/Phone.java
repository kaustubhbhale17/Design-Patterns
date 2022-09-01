package com.creational.builder;

public class Phone {
	private String os;
	private int ram;
	private String processor;
	private double size;
	private int battery;
	
	
	public Phone(String os, int ram, String processor, double size, int battery) {
		super();
		this.os = os;
		this.ram = ram;
		this.processor = processor;
		this.size = size;
		this.battery = battery;
	}
	
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public int getBattery() {
		return battery;
	}
	public void setBattery(int battery) {
		this.battery = battery;
	}
	@Override
	public String toString() {
		return "Phone [os=" + os + ", ram=" + ram + ", processor=" + processor + ", size=" + size + ", battery="
				+ battery + "]";
	}
	
	
	

}
