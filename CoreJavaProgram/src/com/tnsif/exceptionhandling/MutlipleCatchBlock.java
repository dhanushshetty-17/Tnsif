package com.tnsif.exceptionhandling;
//Demo for mutliple catch 
public class MutlipleCatchBlock {
	public static void main(String[] args) {
		int number[] = new int[4];
		
		try {
			int i = number[8];
			System.out.println("World");
		}
		catch(ArithmeticException s) {
			System.out.println("welcome");
		}
		catch(StringIndexOutOfBoundsException u) {
			System.out.println("good bye");
		}
		catch(Exception v) {
			System.out.println("hurray");
		}
	}

}
