package com.tnsif.finalkeyworddemo;
//DEmo for final method ( u can't override)

final class EcomercePlatform{
	 void calculator() {
		System.out.println("Base Discoun 10%);
	}
}
class Amazon extends EcomercePlatform{ // class cant't be inherited because of final
	@Override
	void calculator() { 
		System.out.println("Base Discount 20%");
	}
}

public class FinalMethoDemo {
	public static void main(String[] args) {
		Amazon a = new Amazon(); 
	}
}
