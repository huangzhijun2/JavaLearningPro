package com.learning.reflectcol;

public class Demo1 {
    
    
    /**
     * describe: TODO 通过getClass方法可以获得这个对象的对应的反射类
     * creat_date: 2018/1/14
     * creat_time: 0:32
     **/
    public static void main(String[] args) {
        String s = "http://www.ziwenxie.site";
        Class<? extends String> c = s.getClass();


        System.out.println(c);
    }
}
