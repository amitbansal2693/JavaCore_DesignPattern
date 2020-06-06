package com.design.creational;

import java.io.Serializable;
//Singleton class- serialization, synchonization and Clone issues resolved
class GFG  implements Serializable, Cloneable
{ 
  private static GFG instance; 
  private GFG() { } 
  
 //synchronized method to control simultaneous access 
  synchronized public static GFG getInstance()  
  { 
    if (instance == null)  
    { 
      // if instance is null, initialize 
      instance = new GFG(); 
    } 
    return instance; 
  } 
  
  //
  // Resolves de-Serialization Problem 
  protected Object readResolve() 
  { 
      return instance; 
  } 
  
  //Resolves Cloning Problem
  @Override
  protected Object clone() throws CloneNotSupportedException  
  { 
    return instance; 
  } 
  
  public String getAccountDetails(){
	  return "Account: ABC "+" PAN: xcclr14356";
  }
  
} 
public class SingletonDesign {

	public static void main(String args[]) throws CloneNotSupportedException {
		GFG singleton=GFG.getInstance();
		System.out.println("Singleton method called. "+singleton.getAccountDetails());
		//clone
		GFG clone=(GFG) singleton.clone();
		System.out.println("Clone method called. Original Hashcode "+singleton.hashCode()+" Hashcode Clone: "+clone.hashCode());
	}
}
