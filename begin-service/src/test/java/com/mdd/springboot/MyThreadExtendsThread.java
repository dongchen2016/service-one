package com.mdd.springboot;

/**
 * Created by madongdong on 2017/8/24.
 */

/**
 * 继承thread
 */
public class MyThreadExtendsThread extends Thread {
    @Override
    public void run(){
        super.run();

            for(int i=0;i<10;i++){
                /*int time = (int) (Math.random() *1000);
                Thread.sleep(time);*/
                System.out.println("run=" + Thread.currentThread().getName());
            }

    }
}
