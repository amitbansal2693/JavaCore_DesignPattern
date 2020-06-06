package com.java.core;

import java.util.*;

public class ComparableExample {
	public static void main(String args[]) {
		ArrayList<Student1> al = new ArrayList<Student1>();
		al.add(new Student1(101, "Vijay", 23));
		al.add(new Student1(106, "Ajay", 27));
		al.add(new Student1(105, "Jai", 21));

		Collections.sort(al);
		System.out.println("By Age");
		for (Student1 st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}
}

class Student1 implements Comparable<Student1> {
	int rollno;
	String name;
	int age;

	Student1(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public int compareTo(Student1 st) {
		if (age == st.age)
			return 0;
		else if (age > st.age)
			return 1;
		else
			return -1;
	}
}
