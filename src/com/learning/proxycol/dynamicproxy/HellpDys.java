package com.learning.proxycol.dynamicproxy;

import com.learning.proxycol.stasticpro.Hello;
import com.learning.proxycol.stasticpro.HelloImpl;

import java.lang.reflect.Proxy;

public class HellpDys {
        public static void main(String[] args) {

            /**
             * loader 指定代理对象的类加载器；
             * interfaces，代理对象需要实现的接口，可以同时指定多个接口；
             * handler，方法调用的实际处理者，代理对象的方法调用都会转发到这里（*注意1）。
             */
            Hello hello = (Hello) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),
                    new Class<?>[]{Hello.class},
                    new LogInvocationHandler(new HelloImpl()));

            System.out.println(hello.sayHello("I love you !"));
    }
}
