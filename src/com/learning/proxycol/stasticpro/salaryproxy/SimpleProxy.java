package com.learning.proxycol.stasticpro.salaryproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SimpleProxy implements InvocationHandler {
    private  Object obj;
    private Object advice;

    /**绑定代理对象**/
    public Object bind(Object obj,Advice advice){
        this.obj = obj;
        this.advice = advice;

        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),this);
    }

    /**实现代理**/
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result =null;

        /**
         * TODO 这个怎么执行出来？
         */
//        advice.before

        result = method.invoke(obj,args);

//        advice.af
        return null;
    }
}
