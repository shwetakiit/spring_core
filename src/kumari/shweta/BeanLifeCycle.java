package kumari.shweta;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;



public class BeanLifeCycle implements InitializingBean,DisposableBean{
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
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

	
	
	public BeanLifeCycle() {
	
		
	}
	



	/* For setter injection
	 * public void setType(String type) { this.type = type; }
	 */

	
	public void printPoint() {
		
		System.out.println("Point A"+getPointA().getX()+" "+getPointA().getY());
		System.out.println("Point B"+getPointB().getX()+" "+getPointC().getY());
		System.out.println("Point C"+getPointC().getX()+" "+getPointC().getY());
		
		
	}
//This method is called once bean intialized then only next method printPoint will be called
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("IntializingBean method called for bena BeanLifeCycle");
		
	}
	


/* If we have called registerShutdownHook() -->indicate that after main method complete execution
 * Bean will get destroy and before bean get destroy if DisposableBean has implemented the destroy () 
 * will be called 
 *  
 *  
 *  
 */
	
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Bean has been destroyed!!!");
		
	}
	
	//My own  intialization method which we need to configure in spring configuration file
	public void myOwnBeanIntialization() {
		System.out.println("My own intializing bean method called");
	}
  //My own destroy method which i need to configure on spring configuration file
	
	public void myDestroy() {
		System.out.println("My own destroy method called");
	}
	
	/*If we can provide our own init and destroy method then no need to implement 
	 * InitializingBean,DisposableBean  Still if we are implementing these two method then first these two interface implameneted 
	 * has more priority than our customized init and destroy method
	 */
	
}

