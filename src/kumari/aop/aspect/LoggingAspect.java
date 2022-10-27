package kumari.aop.aspect;
import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


//To change class as aspect class using @aspect
@Aspect
public class LoggingAspect {
	//@Before("execution(public String getName())");//It will execute for bot getName() of Circle and Triangle 
	//If we want to execute only for particulat shape only for circle we need to write using complete class
	
	//@Before("execution(public String kumari.aop.model.Circle.getName())")
	
	//@Before("execution(public String kumari.aop.model.*.get*())")
	
	// .. means it will work for getter method having zero or more than zero parameter
	//@Before("execution(public String kumari.aop.model.*.get*(..))")
	
	@Before("allGetters()")
	public void LoggingAdvice(/*Joinpoint joinpoint */) {
		
		System.out.println("Adviser run.Get method called");
	//	System.out.println("Which method called"+joinpoint.toString());
	//	System.out.println("Which class object is "+joinpoint.getThis());
		//System.out.println("Which class is "+joinpoint.getClass());
		//System.out.println("which static part"+joinpoint.getStaticPart());
		
	}
	
	
     @Before("allCircle()") 
	  public void secondAdvice() {
	  System.out.println("Logged in successfully"); }
	  
	
	// @Before("args(String)") //this we can use if we pass parameter in setter method of type string
     @Before("args(name)") 
	 public void stringArgumentMethods(String name){    //this expression will adive to ass method to take an argument 
		                                    ////so It will work for setter method becoz we pass argumenet in setter method

    	 System.out.println("A method that takes string argument has been called"+name);                                
	 }

     
/*
 * AfterReturning annotatation used to execute advicemethod after successfully
 * executed target method
 * If any exception raised in target method this advice will not be executed 
 */  
//   @AfterReturning("args(name)")      
     @AfterReturning(pointcut = "args(name)", returning="returnString")  
   public void adviceAfterReturning(String name,String returnString ) {
	    System.out.println("After returning advice method called after target method executed isput parameter"+name+" and output parameter is "+returnString);
   }
   @AfterThrowing("args(name)") //this is not working need to check
   public void adviceAfterExcepton(String name) {
	   
	   System.out.println("After exception thrown in target method advice executed ");
   }
   
   
     @Around("allGetters()")
     public void myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
    	 
     }
     
	  @Pointcut("execution(public String getName())")
	  public void  allGetters() {} //it hold pointcuts expression
	  
	  @Pointcut("within(kumari.aop.model.Circle)")
	  public void allCircle() {}
	  
	  
	

}
