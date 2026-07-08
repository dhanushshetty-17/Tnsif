package com.tnsif.finalkeyworddemo;
//DEmo for final method ( u can't override)

class EcomercePlatform{
	final void calculator() {
		System.out.println("Base Discoun 10%);
	}
}
class Amazon extends EcomercePlatform{
	@Override
	void calculator() { // Method cant be override because of final
		System.out.println("Base Discount 20%");
	}
}

public class FinalMethoDemo {
	public static void main(String[] args) {
		Amazon a = new Amazon(); 
	}
}
