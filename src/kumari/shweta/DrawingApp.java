package kumari.shweta;

import javax.swing.table.TableStringConverter;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import kumari.shweta.SomeThing.OtherThing;

public class DrawingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Using xml bean factory
		
BeanFactory factory = new XmlBeanFactory(new FileSystemResource("Spring.xml"));
		
	//	Using Application context
		
	//	ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		ApplicationContext context= new FileSystemXmlApplicationContext("Spring.xml");
		/*
		System.out.println("Id is "+context.getId());
		System.out.println("Display name "+context.getDisplayName());
		System.out.println("time "+context.getStartupDate());
		//Triangle triangle = (Triangle)context.getBean("triangle");
	//	triangle.draw();
		
		Triangle triangle2 = (Triangle)context.getBean("print");
		triangle2.printPoint();
		*/
		
		   
		  // TriangleAutowire triangleAutowire = (TriangleAutowire)context.getBean("autowireTringle");
		 //   triangleAutowire.draw();
		    
		  //.out.println("hascode of singleton object is "+triangleAutowire);
		
		
		//Nested class bean instantiation
		
		/*OtherThing otherThing=(OtherThing) context.getBean("innerClassBean");
		otherThing.diplay();
		*/
		
		//Static Factory method for bean instantiation 
		
		/*FactoryMethodBeanInstantiation  beanInstantiation= (FactoryMethodBeanInstantiation) context.getBean("factoryMethod");
		beanInstantiation.display();
		*/
		
		//Instance Factory method for bean instantiation
		
		/*
		
		ClientService clientService=(ClientService) context.getBean("clientService");
		clientService.display();
		
		*/
		
		//Access bean by other bean prgramatically ---/ApplicationContextAware
		
		/*ApplicationContextAwareDemo applicationContextAwareDemo= (ApplicationContextAwareDemo) context.getBean("waredemo")  ;
		  applicationContextAwareDemo.accessReferenceBean();
		 */
		
		//Bean inheritance concept //
	//	BeanInheritancePOC beanInheritancePOC = (BeanInheritancePOC) context.getBean("beanInheritance");
	//	beanInheritancePOC.draw();
		
		BeanInheritancePOC beanInheritancePOC1 = (BeanInheritancePOC) context.getBean("beanInheritance");
		beanInheritancePOC1.draw();
		
		//abstract bean
		//Exception in thread "main" org.springframework.beans.factory.BeanIsAbstractException: Error creating bean with name 'triangle4': Bean definition is abstract
		Triangle3 triangle3 = (Triangle3)context.getBean("triangle4");
		System.out.println(triangle3);
	
		

	}

}
