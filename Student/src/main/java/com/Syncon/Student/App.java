package com.Syncon.Student;

import java.util.concurrent.SynchronousQueue;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context= new ClassPathXmlApplicationContext("spring.config.xml");
        
        Object obj=context.getBean("stud");
        Student1 stud=(Student1)obj;
        
        System.out.println("Student Id:" +stud.getSid());
        System.out.println("Student name:"+stud.getName());
        System.out.println("Student Email:"+stud.getEmail());
        System.out.println("Student Address:"+stud.getAddress());
        System.out.println("Student City:"+stud.getCity());
        System.out.println("Student Phone:" +stud.getPhone());
    }
}

