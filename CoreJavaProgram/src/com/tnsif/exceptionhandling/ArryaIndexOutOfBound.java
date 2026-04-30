package com.tnsif.exceptionhandling;
//Demo for array index
public class ArryaIndexOutOfBound {
	public static void main(String[] args) {
		int arr[] = new int[4];
		System.out.println(arr.length);
		
		try {
			int i = arr[8];
		}
		catch(Exception h) {
			System.out.println(h);
		}
	}
}
