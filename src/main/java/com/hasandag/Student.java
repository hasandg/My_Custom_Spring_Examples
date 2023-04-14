package com.hasandag;

public class Student {

    // Class data members
    private int rollNo;
    private String name;
    private int age;

    // Getters and setters

    public void setRollNo(int rollNo)
    {
        this.rollNo = rollNo;
    }

    public void setName(String name)
    {

        // This keyword refers to current instance itself
        this.name = name;
    }

    public void setAge(int age) { this.age = age; }

    // Method
    public void display()
    {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

}
