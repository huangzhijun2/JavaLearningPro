package com.learning.cnblogs.concurrent.author_ogwhz;

public class BUSSA extends Thread {
    LockMethod lockMethod;
    void deal(LockMethod lockMethod){
        this.lockMethod = lockMethod;
    }

    @Override
    public void run() {
        super.run();
        lockMethod.busiA();
    }

}
