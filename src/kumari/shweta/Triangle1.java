package kumari.shweta;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle1 implements ApplicationContextAware,BeanNameAware{
	
	Point pointA;
	Point pointB;
	Point pointC;
	ApplicationContext context=null;
	
	
	public Point getPointA() {
		return pointA;
	}


	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}


	public Point getPointB() {
		return pointB;
	}


	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}


	public Point getPointC() {
		return pointC;
	}


	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}


	public void draw() {
		
		System.out.println("Point A ("+getPointA().getX()+" "+getPointA().getY()+")" +getPointA());
		System.out.println("Point B"+getPointC().getX()+" "+getPointC().getY()+getPointB());
		System.out.println("Point C"+getPointC().getX()+" "+getPointC().getY()+getPointC());
		
	}


	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
	 
		this.context=applicationContext;
	}

/* In order to get bean name we need to implement BeanNameAware interface
 * Making this call to set bean name before code execute 
 * It will execute before code execetue
 *  
 *  
 *  */
	
	
	@Override
	public void setBeanName(String name) {

		System.out.println("Setting bean name is "+name);
		
	}

}
