package com.tnsif.exceptionhandling;
//demo for nested try catch block
public class NestedTryCatch {
	public static void check() {
		String str1="TNS";
		
		int slength=str1.length();
		System.out.println("string lentgh"+slength);
		
		
		String str2=null;
		int y=6;
		try {
			try {
				System.out.println(str1.charAt(y));
				
			}
			catch(StringIndexOutOfBoundsException ex) {
				System.out.println(ex.getMessage());
			}
			System.out.println("String length"+str2.length());
		}
		catch(NullPointerssException d) {
			System.out.println(d.getMessage());
		}
	}
	
	public static void main(String[] args) {
		NestedTryCatch.check();
	}
		
}