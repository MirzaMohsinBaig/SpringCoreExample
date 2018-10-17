package com.Snycon.Customer1;

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
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.config.xml");
        Object obj= context.getBean("cust");
        Customer cust= (Customer)obj;
        
        System.out.println("Customer ID: " +cust.getCid());
        System.out.println("Customer Name: " +cust.getCname());
        System.out.println("Customer Email: " +cust.getEmail());
        System.out.println("Customer Address: "+cust.getAddress());
        System.out.println("Customer Phone: "+cust.getPhone());
    }
}

