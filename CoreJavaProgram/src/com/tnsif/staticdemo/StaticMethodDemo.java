package com.tnsif.staticdemo;
//Demo for static method 

class PaymentGateway{
	static void showNotification() {
		System.out.println("Supported bank : sbi , hdfc , ...");
	}
}


public class StaticMethodDemo {
	public static void main(String[] args) {
		PaymentGateway.showNotification();
	}
}
