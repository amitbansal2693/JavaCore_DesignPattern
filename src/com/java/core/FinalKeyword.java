package com.java.core;

class A 
{
    final void m1() 
    {
        System.out.println("This is a final method.");
    }
    final void m1(int a) 
    {
        System.out.println("This is a final method.");
    }
}

public class FinalKeyword {

	public static void main(String[] args) {
		// a final reference variable sb
		final StringBuilder sb = new StringBuilder("Geeks");

		System.out.println(sb);
		sb.append("ForGeeks"); // changing internal state of object is ok but it
								// can not refer to other object
		System.out.println(sb);
		
		
		final int a;
		a = 1;
		System.out.println(a);// final variable must be assigned anywhere only
								// once, otheriwse it will give error
		//a=2;//The final local variable a may already have been assigned
		
		int arr[] = { 1, 2, 3 };

		// final with for-each statement
		// legal statement
		for (final int i : arr)
			System.out.print(i + " ");
		// Since the i variable goes out of scope with each iteration of the
		// loop, it is actually re-declaration each iteration, allowing the same
		// token (i.e. i) to be used to represent multiple variables.
	
	
	}
	   public void finalize() 
	    { 
	        System.out.println("finalize method overriden"); 
	    } 
}
