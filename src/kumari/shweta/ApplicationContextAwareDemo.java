package kumari.shweta;

import org.springframework.aop.PointcutAdvisor;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
public class ApplicationContextAwareDemo implements ApplicationContextAware,BeanNameAware {
	
	Point point;

	ApplicationContext applicationContext=null;
	
	@Override
	public void setBeanName(String name) {

		System.out.println("Bean name is ****"+name);
	}
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		
		this.applicationContext=applicationContext;
	}
	
	//Accesing Point without dependecy injection with seeting applicationcontext
	public void accessReferenceBean() {
		
		point=(Point) applicationContext.getBean("pointA");
		System.out.println("x :"+ point.getX()+" y:"+point.getY());
		
		
		
		
	}
	
	
	

}
