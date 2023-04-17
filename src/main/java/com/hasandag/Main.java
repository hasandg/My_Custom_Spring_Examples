package com.hasandag;

// Importing required classes
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Application class
public class Main {

    // Main driver method
    public static void main(String[] args)
    {
        // Implementing Spring IoC
        // using ApplicationContext
        ApplicationContext context
                = new ClassPathXmlApplicationContext(
                "beans.xml");

        // Getting the bean student
        Student student
                = context.getBean("student", Student.class);

        // Calling the methods
        // inside main() method
        student.display();
    }
}