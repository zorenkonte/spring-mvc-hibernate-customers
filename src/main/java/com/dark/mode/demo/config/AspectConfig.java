package com.dark.mode.demo.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AspectConfig {

    @Pointcut("execution(* com.dark.mode.demo.controller.api.*.*(..))")
    public void apiControllerPackage() {
    }

    @Pointcut("execution(* com.dark.mode.demo.controller.web.*.*(..))")
    public void webControllerPackage() {
    }

    @Pointcut("execution(* com.dark.mode.demo.dao.*.*(..))")
    public void daoPackage() {
    }

    @Pointcut("execution(* com.dark.mode.demo.model.*.*(..))")
    public void modelPackage() {
    }

    @Pointcut("execution(* com.dark.mode.demo.repository.*.*(..))")
    public void repositoryPackage() {
    }

    @Pointcut("execution(* com.dark.mode.demo.service.*.*(..))")
    public void serviceIntPackage() {
    }

    @Pointcut("execution(* com.dark.mode.demo.service.impl.*.*(..))")
    public void serviceImplPackage() {
    }

    @Pointcut("apiControllerPackage() || webControllerPackage()")
    public void controllerPackage() {
    }

    @Pointcut("serviceImplPackage() || serviceIntPackage()")
    public void servicePackage() {
    }

    @Pointcut("controllerPackage() || servicePackage() || daoPackage() || repositoryPackage() || modelPackage()")
    public void appFlow() {
    }

}
