package kumari.aop.service;



import kumari.aop.model.Circle;
import kumari.aop.model.Triangle;

public class FactoryService {
	
	public Object getBean(String beanType) {
		if(beanType.equals("shapeService"))
			return new ShapeServiceProxy();
		else if(beanType.equals("triangle"))
			return new Triangle();
		else if(beanType.equals("circle"))
			return new Circle();
		else return null;
		
	}

}
