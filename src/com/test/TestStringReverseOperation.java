package com.test;

public class TestStringReverseOperation {
	public void fun(Object i) {
		System.out.println("Object output ");
	}

	public void fun(String name) {
		System.out.println("String output ");
	}
	


	// Driver code
	public static void main(String[] args) {
		TestStringReverseOperation mv = new TestStringReverseOperation();

		// This line causes error
		mv.fun(null);//String will be called
		mv.fun(123);
		mv.fun((short)2);
		
	}
}
