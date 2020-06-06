package com.thread;


public class DemoRunnable implements Runnable {
	public void run() {
		System.out.println("thread is running...");
	}

	public static void main(String args[]) {
		DemoRunnable m = new DemoRunnable();
		Thread t1 = new Thread(m);
		t1.start();
	}
}