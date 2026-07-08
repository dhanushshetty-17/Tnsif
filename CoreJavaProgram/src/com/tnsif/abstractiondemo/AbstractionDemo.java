package com.tnsif.abstractiondemo;


abstract class Demo{
	public void calling () {
		System.out.println("Calling");
	}
	public abstract void AllIntegration();
	public abstract void Satelitedemo();
	public abstract void healthmonitoring();
}
 class Test1 extends Demo{
	public void AllIntegration() {
		System.out.println("Phone is integration with ai");
		
	}

	@Override
	public void Satelitedemo() {
		System.out.println("Welcome");
		
	}

	@Override
	public void healthmonitoring() {
		System.out.println("Welcome to ai");
		
	}
}


public class AbstractionDemo {
	public static void main(String[] args) {
		Test1 t = new Test1();
		t.AllIntegration();
		t.Satelitedemo();
		t.healthmonitoring();
	}
}
