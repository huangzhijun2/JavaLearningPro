package com.learning.proxycol.stasticpro;

public class HelloImpl implements Hello{
    @Override
    public String sayHello(String str) {
        return "HelloImpl" + str;
    }
}
