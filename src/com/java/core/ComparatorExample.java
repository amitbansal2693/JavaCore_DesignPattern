package com.java.core;

import java.util.*;

class Student {
	int rollno;
	String name;
	int age;

	Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}

class AgeComparator implements Comparator {
	public int compare(Object o1, Object o2) {
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;

		if (s1.age == s2.age)
			return 0;
		else if (s1.age > s2.age)
			return 1;
		else
			return -1;
	}
}

class NameComparator implements Comparator {
	public int compare(Object o1, Object o2) {
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;

		return s1.name.compareTo(s2.name);
	}
}

public class ComparatorExample {
	public static void main(String args[]) {

		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(101, "Vijay", 23));
		al.add(new Student(106, "Ajay", 27));
		al.add(new Student(108, "Ajay", 27));
		al.add(new Student(105, "Jai", 21));
		al.add(new Student(105, "Jai", 30));
		al.add(new Student(109, "Bajesh", 29));

		System.out.println("Sorting by Name");

		Collections.sort(al, new NameComparator());
		for (Student st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

		System.out.println("Sorting by age");

		Collections.sort(al, new AgeComparator());
		for (Student st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
		
		//Java 8 using Lambda. But getter and setter must be available
		//Sorting elements on the basis of name  
		  Comparator<Student> cm1=Comparator.comparing(Student::getName,Comparator.nullsFirst(String::compareTo));  
		   Collections.sort(al,cm1.reversed());  
		   System.out.println("\n Java 8=========");  
		   System.out.println("Sorting by Name=========");  
		   for(Student st: al){  
		     System.out.println(st.rollno+" "+st.name+" "+st.age);  
		     }  
		   
		   //Reverse Method reverse the comparator.
		   System.out.println("Sorting by Age"); 
		   al.sort(Comparator.comparingInt(Student::getAge).reversed());
		   for(Student st: al){  
		     System.out.println(st.rollno+" "+st.name+" "+st.age);  
		     }  
		   
		   //Sorting Multiple Fields
		   System.out.println("Sorting Multiple fields:----------");
		   al.sort(Comparator.comparing(Student::getName)
           .thenComparing(Student::getAge).thenComparing(Student::getRollno).reversed());
		   for(Student st: al){  
			     System.out.println(st.rollno+" "+st.name+" "+st.age);  
			     }  
		   System.gc(); 
	}
}