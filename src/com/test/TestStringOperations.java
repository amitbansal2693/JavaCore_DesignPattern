package com.test;

class A{
	public void test(String s){
		System.out.println("Inside String Method "+s);
	}

	public void test(Object o){
		System.out.println("Inside Object Method "+o);
	}
	

}
public class TestStringOperations {
	public static void main(String []s) {
		A a=new A();
		a.test("amit");
		a.test(null);//Inside String Method --regardless of position
		a.test(12345);//Inside Object----regardless of position
		a.test(123.45);//Object
		a.test((short) 1);//Object
		
	}
}
