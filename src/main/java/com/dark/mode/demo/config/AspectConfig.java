package com.dark.mode.demo.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AspectConfig {

    @Pointcut("execution(* com.dark.mode.demo.controller.api.*.*(..))")
    private void apiControllerPackage() {
    }

    @Pointcut("execution(* com.dark.mode.demo.controller.web.*.*(..))")
    private void webControllerPackage() {
    }

    @Pointcut("execution(* com.dark.mode.demo.dao.*.*(..))")
    private void daoPackage() {
    }

    @Pointcut("execution(* com.dark.mode.demo.model.*.*(..))")
    private void modelPackage() {
    }

    @Pointcut("execution(* com.dark.mode.demo.repository.*.*(..))")
    private void repositoryPackage() {
    }

    @Pointcut("execution(* com.dark.mode.demo.service.*.*(..))")
    private void serviceIntPackage() {
    }

    @Pointcut("execution(* com.dark.mode.demo.service.impl.*.*(..))")
    private void serviceImplPackage() {
    }

    @Pointcut("apiControllerPackage() || webControllerPackage()")
    private void controllerPackage() {
    }

    @Pointcut("serviceImplPackage() || serviceIntPackage()")
    private void servicePackage() {
    }

    @Pointcut("controllerPackage() || servicePackage() || daoPackage() || repositoryPackage() || modelPackage()")
    private void appFlow() {
    }

}
