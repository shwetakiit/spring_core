package kumari.shweta;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleApp {
	
	public static void main(String[] args) {
		AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext("Spring.xml");
		BeanLifeCycle beanLifeCycle = (BeanLifeCycle) abstractApplicationContext.getBean("beanlifecycle");
	   abstractApplicationContext.registerShutdownHook();//this method will called after main method complete
	    //execution that why destroy() method called in last
		//beanLifeCycle.printPoint();
	     
	  //   BeanLifeCycleWithAnnotation beanLifeCycle1 = (BeanLifeCycleWithAnnotation) abstractApplicationContext.getBean("beanlifecycle1");
	     
		
	}

}
