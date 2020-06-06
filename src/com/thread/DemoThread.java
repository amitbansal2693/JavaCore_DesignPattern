package com.thread;

public class DemoThread extends Thread {
    public DemoThread() {
        super("DemoThread");
    }
	public void run() {
		System.out.println("thread is running...");
	}

	public static void main(String args[]) {
		DemoThread t1 = new DemoThread();
		t1.start();
	}

}
