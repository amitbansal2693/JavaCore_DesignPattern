package com.java8;

@FunctionalInterface
public interface MyFirstFunctionalInterface 
{
    public void firstWork();
 
    default void doSomeMoreWork1(){  }
    default void doSomeMoreWork1(int a){  }
    default  public void doSomeMoreWork2(){  }
    public static void a1(){}
    public static void a1(int b){}
    
     static void a3(){}
     //override object methods
     @Override
     public String toString();                //Overridden from Object class
     @Override
     public boolean equals(Object obj);
     
}

class a implements MyFirstFunctionalInterface{

	@Override
	public void firstWork() {
		// TODO Auto-generated method stub
		
	}
	
	public void doSomeMoreWork1(){  }

}