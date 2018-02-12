package com.learning.cnblogs.concurrent.author_ogwhz;

/**
 * describe: TODO http://www.cnblogs.com/QG-whz/p/8351298.html
 * @creat_user: c_huangzhijun
 * creat_date: 2018/2/10
 * creat_time: 18:03
 **/
public class LockMethod {
    public synchronized void busiA(){
        for(int i=0;i<1000;i++){
            System.out.println(Thread.currentThread().getName() + "deal with bussiness A :" + i);

        }
    }
    public synchronized void busiB(){
        for (int i = 0;i<10000;i++){
            System.out.println(Thread.currentThread().getName() + "deal with bussiness B:"+i);
        }
    }

}
