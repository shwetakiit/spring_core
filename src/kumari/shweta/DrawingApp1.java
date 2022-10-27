package kumari.shweta;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class DrawingApp1 {
public static void main(String[] args) {	
  AbstractApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
  context.registerShutdownHook();
		
		Triangle triangle = (Triangle)context.getBean("triangle");
		triangle.draw();
  
  
  
  System.out.println("Singleton scope demo address of PointA PointB PoinC will be same in for both trinagle2 and trinagle3 ");
		
		Triangle1 triangle2 = (Triangle1)context.getBean("triangle2");
	    triangle2.draw();
	   
	
	   System.out.println("Both beans triangle2 and triangle 3 pointing tow same reference Points class and scope is singleton for each reference");
	   
	   Triangle triangle4 =(Triangle)context.getBean("triangle3");
	   
	   triangle4.printPoint();
	
		
		/*Collections */
		
 
 //ListPointTriangle listPointTriangle = (ListPointTriangle)context.getBean("listTriangle");
 // listPointTriangle.draw();

  //Autowire 
	
   
  TriangleAutowire triangleAutowire = (TriangleAutowire)context.getBean("autowireTringle");
  triangleAutowire.draw();
  TriangleAutowire triangleAutowire1 = (TriangleAutowire)context.getBean("autowireTringle");
    
   System.out.println("hascode of singleton object is "+triangleAutowire);
   System.out.println("hascode of singleton object is "+triangleAutowire1);
   
   TriangleAutowire triangleAutowire2 = (TriangleAutowire)context.getBean("autowireTringle1");
   TriangleAutowire triangleAutowire3 = (TriangleAutowire)context.getBean("autowireTringle1");
   System.out.println("with differenet bean id singelton scope will change");
   
   System.out.println("hascode of singleton object is "+triangleAutowire2);
   System.out.println("hascode of singleton object is "+triangleAutowire3);
    
RequiredAnnotationDemo  required = (RequiredAnnotationDemo)context.getBean("required");
System.out.println("Name is : "+required.getName());
System.out.println("Age is "+required.getAge());
   
    
//Bean defination inheritance concept  
    /*TriangleAutowire inheritTriangle =(TriangleAutowire)context.getBean("childTriangle");
    inheritTriangle.draw(); */
  
  //Annotation Required 
 /* Shape shape = (Shape) context.getBean("circle");
  shape.draw(); */
  
  //Autowired annotation
  
  /*Shape shape = (AutoWireWithCircleShape) context.getBean("autowire");
  shape.draw();
  */
  
  /*
  Shape shape1=(CircleShape)context.getBean("circleshape");
  shape1.draw();
  */
  
 //Shape shape2 = (ComponentAnnotationCircle)context.getBean("componentAnnotationCircle");
 ///shape2.draw();
 //We can get message of properties file by using getMessage 
 //System.out.println(context.getMessage("greeting", null, "Default message", null));
 //We can get message of property file by injecting bean so it will print from draw method
 
		//Circular dependency//
	//org.springframework.beans.factory.BeanCurrentlyInCreationException: Error creating bean with name 'circulardep1': Requested bean is currently in creation: Is there an unresolvable circular reference?
		//CircularDependency1 circularDependency1= (CircularDependency1) context.getBean("circulardep1");
		
		//
	//	AccountService accountService=(AccountService) context.getBean("accountService");
	//	accountService.draw();
		
		

   
   
		
		
		
		
		
		
	}

}
