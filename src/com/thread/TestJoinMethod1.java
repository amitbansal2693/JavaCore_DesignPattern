package com.thread;

/**
 * The join() method waits for a thread to die. In other words, it causes the
 * currently running threads to stop executing until the thread it joins with
 * completes its task
 * 
 * e.g t1-->t2-->t3 
 * In the above example,when t1 is completes its task for 1500
 * miliseconds(3 times) then t2 and t3 starts executing.
 * 
 * output: 12345 1212345345
 * @author Dell
 *
 */
class TestJoinMethod1 extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String args[]) {
		TestJoinMethod1 t1 = new TestJoinMethod1();
		TestJoinMethod1 t2 = new TestJoinMethod1();
		TestJoinMethod1 t3 = new TestJoinMethod1();
		t1.start();
		try {
			t1.join();
		} catch (Exception e) {
			System.out.println(e);
		}

		t2.start();
		t3.start();
	}
}
