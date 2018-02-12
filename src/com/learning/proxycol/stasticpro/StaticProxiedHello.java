package com.learning.proxycol.stasticpro;


import java.util.logging.Logger;

/**
 * describe: TODO // 静态代理方式
 * @creat_user: c_huangzhijun
 * creat_date: 2018/1/13
 * creat_time: 19:02
 **/
public class StaticProxiedHello implements Hello {
    private Logger logger = Logger.getLogger(String.valueOf(StaticProxiedHello.class));
    private Hello hello = new HelloImpl();

    @Override
    public String sayHello(String str) {
        logger.info("You say :" + str);

        return hello.sayHello(str);
    }
}
