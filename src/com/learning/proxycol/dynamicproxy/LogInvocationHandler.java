package com.learning.proxycol.dynamicproxy;


import com.learning.proxycol.stasticpro.Hello;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.logging.Logger;

/**
 * 首先实现一个InvocationHandler，方法调用会被转发到该类的invoke()方法。
 * 然后在需要使用Hello的时候，通过JDK动态代理获取Hello的代理对象
 */



public class LogInvocationHandler implements InvocationHandler{
    private Logger logger = Logger.getLogger(String.valueOf(LogInvocationHandler.class));
    private Hello hello;
    public LogInvocationHandler(Hello hello){
        this.hello = hello;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if("sayHello".equals(method.getName())){
            logger.info("You say : " + Arrays.asList(args));
        }
        return method.invoke(hello,args);
    }



}
