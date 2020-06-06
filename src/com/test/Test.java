package com.test;

/**
 * When using wrapper class,That means they accept null values. When we pass a
 * null value to the method1 the compiler gets confused which method it has to
 * select, as both are accepting the null.
 * 
 **/
public class Test {
	public void fun(int i) {
		System.out.println("fun(Integer ) ");
	}

	public void fun(Object name) {
		System.out.println("fun(Object ) ");
	}
	


	// Driver code
	public static void main(String[] args) {
		Test mv = new Test();
		mv.fun(null);
		mv.fun("ad");
	}
}
