package ge.jibo.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggerAspect {

    @Around("execution(static * *(..))")
    public Object dontLogDuplicates(ProceedingJoinPoint thisJoinPoint) throws Throwable {
        System.out.println("Test Message from aspect");
        return thisJoinPoint.proceed();
    }
}
