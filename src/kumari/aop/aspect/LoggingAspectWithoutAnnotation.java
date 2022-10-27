package kumari.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;

public class LoggingAspectWithoutAnnotation {
	
	public Object myAroundAdive(ProceedingJoinPoint proceedingJoinPoint) {
		
		Object returnValue =null;
		try {
			System.out.println("Before advice for AOP configuration");
			returnValue= proceedingJoinPoint.proceed();
			System.out.println("After advice for Aop configuration");
		}catch(Throwable e) {
			System.out.println("After throwing for AOP configuration ");
		} finally {
			System.out.println("After finally");
		}
		return returnValue;
	}

}
