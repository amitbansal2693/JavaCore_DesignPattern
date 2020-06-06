package com.design.creational;

import java.io.IOException;

class EmployeeRecord implements Cloneable {

	private int id;
	private String name, designation;
	private double salary;

	public EmployeeRecord(int id, String name, String designation, double salary) {

		this.id = id;
		this.name = name;
		this.designation = designation;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new EmployeeRecord(id, name, designation, salary);
	}

	@Override
	public String toString() {
		return "EmployeeRecord [id=" + id + ", name=" + name + ", designation=" + designation + ", salary=" + salary
				+ "]";
	}

}

public class PrototypeDesign {
	public static void main(String[] args) throws IOException, CloneNotSupportedException {

		EmployeeRecord e1 = new EmployeeRecord(123, "Sara", "StoreManager", 123.45);
		System.out.println("Employee Details." + e1);
		EmployeeRecord e2 = (EmployeeRecord) e1.clone();
		System.out.println("Employee Details." + e2);
	}

}
