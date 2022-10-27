package kumari.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect1 {
	
	@Around("@annotation(kumari.aop.aspect.Loggable)")
	public Object myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
		Object returnValue = null;
		
		try {
			System.out.println("Before advice**");
			returnValue=proceedingJoinPoint.proceed();
			System.out.println("After returning");
		}catch(Throwable e) {
			System.out.println("After throwing**");
		}
		System.out.println("After finally***");
		return returnValue;
		
	}

}
