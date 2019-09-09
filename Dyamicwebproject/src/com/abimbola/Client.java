package com.abimbola;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Employee eRef = new Employee();
eRef.setEid(100);
eRef.setEname("Abimbola Adeyemi");
eRef.setEaddress("Kansas city");

System.out.println("Employee Details: "+eRef);

Resource resource = new ClassPathResource("Employee.xml");
BeanFactory factory =new XmlBeanFactory(resource);

Employee e1 = (Employee)factory.getBean("emp1");
Employee e2 = factory.getBean("emp2",Employee.class);
Employee e3 = (Employee)factory.getBean("emp3");
Employee e4 = (Employee)factory.getBean("emp4");

System.out.println("Employee1 Details: "+e1);
System.out.println("Employee1 Details: "+e2);
System.out.println("Employee1 Details: "+e3);
System.out.println("Employee1 Details: "+e4);

	}

}
