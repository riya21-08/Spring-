package com.score.score;



/**
 * Hello world!
 *
 */
public class App 
{
  
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context1 = new ClassPathXmlApplicationContext("config.xml");
        Student s1=(Student)context1.getBean("Student1");	
        System.out.println(s1);
        
    }
}

