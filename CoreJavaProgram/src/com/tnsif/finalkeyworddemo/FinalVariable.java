package com.tnsif.finalkeyworddemo;

class UPIAPP{
	final int max = 10000;

void showlimit() {
	System.out.println("amount "+max);
}
}
public class FinalVariable {
	public static void main(String[] args) {
		UPIAPP u = new UPIAPP();
		u.showlimit();
		//u.max = 20000;
	}
}

