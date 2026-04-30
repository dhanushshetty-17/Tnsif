package com.tnsif.exceptionhandling;


//Demo for the null pointer exception
public class NullPointerException {
	public static void main(String[] args) {
		String str = null;
		
		try {
			System.out.println(str.length());
		}
		catch(Exception f) {
			System.out.println(f.getMessage());
		}
	}
}
