package com.dark.mode.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class LoggingAspect {

    private final Logger logger = Logger.getLogger(getClass().getName());

    private void logMethodName(String adviceType, JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().toShortString();
        logger.info(String.format("@%s: calling method %s", adviceType, methodName));
    }

    @Before("com.dark.mode.demo.config.AspectConfig.appFlow()")
    private void beforeLogging(JoinPoint joinPoint) {
        logMethodName("Before", joinPoint);

        Object[] args = joinPoint.getArgs();

        for (Object arg : args) {
            logger.info(String.format("Arguments: %s", arg));
        }
    }

    @AfterReturning(value = "com.dark.mode.demo.config.AspectConfig.appFlow()",
            returning = "result")
    private void afterReturningLogging(JoinPoint joinPoint, Object result) {
        logMethodName("After", joinPoint);
        logger.info(result.toString());
    }
}
