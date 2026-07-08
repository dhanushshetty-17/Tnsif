package com.tnsif.interfaceDemo;
// demo for interface
interface Smartdevice{
	void turnOn();
	void turnOff();
	void getStatus();
}

// class implements the interface
class Smartlight implements Smartdevice{

	@Override
	public void turnOn() {
	System.out.println("Smart light on");			
	}
	@Override
	public void turnOff() {
	System.out.println("smart light off");			
	}
	@Override
	public void getStatus() {
	System.out.println("smart light is on standy mode");		
	}
}

public class InterfaceDemo {
public static void main(String[] args) {
	Smartlight s=new Smartlight();
	s.turnOn();
	s.turnOff();
	s.getStatus();
}
}