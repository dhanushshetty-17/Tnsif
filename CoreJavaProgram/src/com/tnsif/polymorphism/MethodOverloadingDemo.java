package com.tnsif.polymorphism;

class Calculator{
		int add(int a , int b) {
			return a+b;
		}
		double add(double a , double b) {
			return a+b;
		}
		int add (int a , int b , int c) {
			return a+b+c;
		}
		
	}

public class MethodOverloadingDemo {
	public static void main(String args[]) {
		Calculator c = new Calculator();
		
		System.out.println(c.add(25,25));
		System.out.println(c.add(4.8,5.9));
		System.out.println(c.add(2,3,6));
	}
	
}
