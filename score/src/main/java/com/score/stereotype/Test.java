package com.score.stereotype;

import com.score.context.ApplicationContext;

public class Test {
public static void main(String[] args) {
	
	
	
	
		ApplicationContext context=new ClassPathXmlApplicationContext("com/score/Stereotype/config.xml");
		Student s1=context.getBean("student",Student.class);
		System.out.println(s1);
	
		
		System.out.println(s1.hashCode());
		Student s2=context.getBean("student,Student.class");
		System.out.println(s2.hashCode());
}

}
