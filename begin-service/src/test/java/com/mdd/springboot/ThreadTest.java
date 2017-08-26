package com.mdd.springboot;


/**
 * Created by madongdong on 2017/8/26.
 */
public class ThreadTest extends Thread {

    @Override
    public void run(){
        try{
            System.out.println("当前线程：" + this.currentThread().getName() + " begin" + "时间：" +System.currentTimeMillis());
            Thread.sleep(1000);
            System.out.println("当前线程：" + this.currentThread().getName() + " end" + "时间：" + System.currentTimeMillis());
        }catch (InterruptedException e){

        }
        System.out.println("run方法，当前线程：" + this.currentThread().getName() +"end : " + System.currentTimeMillis());
    }

    public static void main(String[] args){

            ThreadTest threadTest = new ThreadTest();
            System.out.println("主线程系统时间：" + System.currentTimeMillis());
            threadTest.setName("thread1");
            threadTest.run();
            /*Thread.sleep(1000);*/

            System.out.println("主线程系统时间：" + System.currentTimeMillis());



    }
}
