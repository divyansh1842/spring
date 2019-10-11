package com.capgemini;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {
       ApplicationContext context= new ClassPathXmlApplicationContext("spring-config.xml");
       Student student= (Student) context.getBean("student2");
       Student student2=context.getBean("student",Student.class);
       
       System.out.println(student);
       System.out.println(student2);
       System.out.println(student2.getHomeAddress());
       
    }
}
