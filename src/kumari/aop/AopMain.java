package kumari.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kumari.aop.service.ShapeService;

public class AopMain {
	public static void main(String[] args) {

@SuppressWarnings("resource")
ApplicationContext context=new  ClassPathXmlApplicationContext("SpringAop.xml");
//get me this bean and this bean of this particular class
ShapeService shapeService = context.getBean("shapeService", ShapeService.class);
//System.out.println(shapeService.getCircle().getName());
//System.out.println(shapeService.getTriangle().getName());

System.out.println(shapeService.getCircle().getName());

//To check how many setter method has been called 

shapeService.getCircle().setName("Dummy circle");
//shapeService.getCircle().setReturned("Dummy circle");
	
	}

}
