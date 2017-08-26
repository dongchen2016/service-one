package com.mdd.springboot;

/**
 * Created by madongdong on 2017/8/24.
 */

/**
 * 继承thread
 */
public class MyThreadImplRunnable implements Runnable {

    public void run(){
        System.out.println("run=" + Thread.currentThread().getName());
    }
}
