package com.tnsif.multithreading;

public class WorkThread extends Thread {
	public void run() {
		for( int i = 1 ; i<=5 ; i ++) {
			System.out.println(Thread.currentThread().getName()+ "-> Step "+ i);
			try {
				Thread.sleep(500);
				}catch(Exception e) {}
		}	
	}
	public static void main(String[] args) {
		WorkThread w1 = new WorkThread();
		WorkThread w2 = new WorkThread();
		
		w1.setName("Thread A");
		w2.setName("Thread B");
		
		w1.start();
		w2.start();
		
		
		
	}
} 

