package com.java8;
import java.io.Serializable;

//import org.apache.commons.lang3.SerializationUtils;

 class Department implements Serializable {
     
    private static final long serialVersionUID = 1L;
     
    Integer id;
    String name;
     
    public Department(Integer id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
     
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Department [id=" + id + ", name=" + name + "]";
    }
}
 class Employee implements Serializable {
 
    private static final long serialVersionUID = 1L;
     
    private Integer id;
    private String firstName;
    private String lastName;
    private Department department;
 
    public Employee(int id, String fName, String lName, Department department) {
        super();
        this.id = id;
        this.firstName = fName;
        this.lastName = lName;
        this.department = department;
    }
 
    public Integer getId() {
        return id;
    }
 
    public void setId(Integer id) {
        this.id = id;
    }
 
    public String getFirstName() {
        return firstName;
    }
 
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
 
    public String getLastName() {
        return lastName;
    }
 
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
 
    public Department getDepartment() {
        return department;
    }
 
    public void setDepartment(Department department) {
        this.department = department;
    }
 
    @Override
    public String toString() {
        return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
    }
}

public class ArraysTest 
{
    public static void main(String[] args) 
    {
        Employee[] empArray = new Employee[2];    //Original array
 
        empArray[0] = new Employee(100, "Lokesh", "Gupta", new Department(1, "HR"));
        empArray[1] = new Employee(200, "Pankaj", "Kumar", new Department(2, "Finance"));
         
        Employee[] clonedArray = empArray.clone();  //Shallow copied array, parent changes will be reflected
     //   Employee[] copiedArray = SerializationHandler.clone(empArray); //deep clone
        empArray[0].setFirstName("Unknown");
        empArray[0].getDepartment().setName("Unknown");
         
        //Verify the change in original array - "CHANGED"
        System.out.println(empArray[0].getFirstName());                     //Unknown
        System.out.println(empArray[0].getDepartment().getName());          //Unknown
         
        //Verify the change in cloned array - "CHANGED"
        System.out.println(clonedArray[0].getFirstName());                  //Unknown
        System.out.println(clonedArray[0].getDepartment().getName());       //Unknown
    }
}