package kumari.shweta;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Required;

public class CircleShape implements Shape {

	Point center;
	Point center1;

	public Point getCenter() {
		return center;
	}
	@Required //Exception raised while bean intialiation  if property not set in bean instance 
	public void setCenter(Point center) {
		this.center = center;
	}
	
	public Point getCenter1() {
		return center1;
	}
	@Resource(name="pointC")
	public void setCenter1(Point center1) {
		this.center1 = center1;
	}
	
/*	public void draw() {

		System.out.println("Circle Point("+center.getX()+","+center.getY()+")");
	}
*/
	public void draw() {
		System.out.println("Circle point ("+center1.getX()+","+center1.getY()+")");
	}
	
	//intialize bean annotation jsr-250
	
	@PostConstruct
	public void intializedBean() {
		System.out.println("Circle shape bean has intialized");
	}
	
	//destroy bean annotation
	@PreDestroy
	public void beanDestroy() {
		System.out.println("Bean has been destroyed");
	}
	
	
	
}
