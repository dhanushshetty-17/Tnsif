package com.tnsif.polymorphism;

class A{
	 A(int a){
		System.out.println("A-1st");
	}
	A(String a , int b){
		System.out.println("A-2nd");
	}
	A(int a, int b, int c){
		System.out.println("A-3rd");
	}
}

public class ConstructorOverload {
	public static void main(String[] args) {
		A a = new A(1);
		A b = new A("Dhanush",17);
		A c = new A(9,3,4);
	}
}
