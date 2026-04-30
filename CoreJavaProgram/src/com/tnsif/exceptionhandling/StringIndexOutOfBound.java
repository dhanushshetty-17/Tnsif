package com.tnsif.exceptionhandling;



//Demo for string index


public class StringIndexOutOfBound {
	public static void main(String[] args) {
		String str = "Atria college";
		
		try {
			char ch = str.charAt(20);
		}
		catch(Exception r) {
			System.out.println(r);
		}
		System.out.println("Exception caught");
	}
}
