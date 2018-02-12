package com.learning.proxycol.stasticpro.salaryproxy;

public class TimeAdvice implements Advice {
    long startTime;
    long endTime;
    @Override
    public void before() {
        startTime = System.currentTimeMillis();//获取开始时间

    }

    @Override
    public void after() {
        endTime = System.nanoTime();//获取结束时间

    }
}
