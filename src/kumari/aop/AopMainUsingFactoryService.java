package kumari.aop;

import org.springframework.beans.factory.support.FactoryBeanRegistrySupport;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kumari.aop.service.FactoryService;
import kumari.aop.service.ShapeService;

public class AopMainUsingFactoryService {
	
	public static void main(String[] args) {
		//Here we will not use Application context to reat configuration file for getting bean 
		//ApplicationContext context=new  ClassPathXmlApplicationContext("SpringAop.xml");
		//ShapeService shapeService = context.getBean("shapeService", ShapeService.class);
		
		FactoryService factoryService = new FactoryService();
		ShapeService  shapeService = (ShapeService) factoryService.getBean("shapeService");
		
		shapeService.getCircle();//Output of getter method called 
		
	
	}

}
