package com.design.creational;

import java.io.IOException;

interface Plan {
	int getRate(int unit);
}

class DomesticPlan implements Plan {
	public int getRate(int unit) {
		return 3 * unit;
	}
}

class CommercialPlan implements Plan {
	public int getRate(int unit) {
		return 5 * unit;
	}
}

/**
 * Create Factory
 */
class GetPlanFactory {
	public Plan getPlan(String planType) {
		if (planType == null) {
			return null;
		}
		if (planType.equalsIgnoreCase("DOMESTICPLAN")) {
			return new DomesticPlan();
		}
		if (planType.equalsIgnoreCase("COMMERCIALPLAN")) {
			return new CommercialPlan();
		}
		return null;
	}
}

public class FactoryDesign{  
    public static void main(String args[])throws IOException{  
      GetPlanFactory planFactory = new GetPlanFactory(); 

      //Fetch DOMESTICPLAN
      String planName="DOMESTICPLAN";
      Plan p = planFactory.getPlan(planName); 
      System.out.println("DOMESTICPLAN "+p.getRate(20));
      //Fetch COMMERCIALPLAN
      planName="COMMERCIALPLAN";
      p = planFactory.getPlan(planName);
      System.out.println("COMMERCIALPLAN "+p.getRate(20));
      
      }
    }