package kumari.shweta;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.ResolvableType;



public class DrawingApp2 {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanProviderExample.class);
		ObjectProvider<BeanExample> objectProvider= context.getBeanProvider(BeanExample.class);
		
		BeanExample  obj= objectProvider.getIfAvailable();
	  obj.doSomething();
	  
	  
	  ResolvableType resolvableType=ResolvableType.forClass(BeanExample.class);
	  
	  ObjectProvider<BeanExample> objectProvider1= context.getBeanProvider(resolvableType);
	  BeanExample obj2= objectProvider1.getIfAvailable();
	  obj2.doSomething();
	  
	  //If we create two bean it will throw 
	  ///Exception in thread "main" org.springframework.beans.factory.NoUniqueBeanDefinitionException
		/*
		 * Exception in thread "main"
		 * org.springframework.beans.factory.NoUniqueBeanDefinitionException: No
		 * qualifying bean of type 'kumari.shweta.BeanExample' available: expected
		 * single matching bean but found 2: exampleBean,exampleBean1
		 */
		
	  /*
	  
	  BeanExample obj3=objectProvider1.getIfUnique();
	  
	  System.out.println(obj3!=null);{
		 obj3.doSomething();
	  }
	  
	  */
	  
	  
	  
		
	}

}
