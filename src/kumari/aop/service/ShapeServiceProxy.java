package kumari.aop.service;

import kumari.aop.aspect.LoggingAspect;
import kumari.aop.aspect.LoggingAspect1;
import kumari.aop.model.Circle;

//Proxy class for getting object of  ShapeService
public class ShapeServiceProxy extends ShapeService{

	//here we can overrride getCircle and we can return super class getCircle
	//still same result
	
	@Override
	public Circle getCircle() {
	 new LoggingAspect().LoggingAdvice(); //once this proxy object callled logging advice would be executed
		return super.getCircle();
	}
}
