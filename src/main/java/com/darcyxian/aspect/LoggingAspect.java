package com.darcyxian.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    @Pointcut("@annotation(Loggable)")
    public void executeLogging(){}

    @Around(value = "executeLogging()")
    public Object logMethodCall(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        Object returnValue = proceedingJoinPoint.proceed();
        StringBuilder message = new StringBuilder("Method: ");
        message.append(proceedingJoinPoint.getSignature().getName());
        logger.info(message.toString());
        return returnValue;
    }


}
