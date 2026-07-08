package com.tnsif.multithreading;

public class OrderProcessing implements Runnable {
	
	String Ordername;

	public OrderProcessing(String ordername) {
		this.Ordername = ordername;
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" Started Processing "+Ordername);
		try {
			Thread.sleep(1000);
		}catch(Exception e) {}
		System.out.println(Thread.currentThread().getName()+" Completed "+Ordername);
	
	}
	public static void main(String[] args) {
		OrderProcessing r1 = new OrderProcessing("Order 1");
		OrderProcessing r2 = new OrderProcessing("Order 2");
		OrderProcessing r3 = new OrderProcessing("Order 3");
		
		Thread t1 = new Thread(r1,"Worker 1");
		Thread t2 = new Thread(r2,"Worker 2");
		Thread t3 = new Thread(r2,"Worker 3");
		
		t1.start();
		t2.start();
		t3.start();
		
	}
	

}
