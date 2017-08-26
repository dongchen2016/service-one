package com.mdd.springboot;

/**
 * Created by madongdong on 2017/8/24.
 */
public class Main {

    public static void main(String[] args){
        //继承thread类的线程
        /*MyThreadExtendsThread myThread = new MyThreadExtendsThread();
        myThread.setName("myThread");
        myThread.start();
        for(int i=0;i<10;i++){
            *//*int time = (int) (Math.random() *1000);
            Thread.sleep(time);*//*
            System.out.println("run=" + Thread.currentThread().getName());
        }*/

        //实现runnable接口的线程
        /*Runnable myRunnable = new MyThreadImplRunnable();
        Thread thread = new Thread(myRunnable);
        System.out.println("run=" + Thread.activeCount());
        thread.start();
        System.out.println("run=" + Thread.currentThread().getName());*/

        //测试不共享数据
        /*ShareDataThread thread1 = new ShareDataThread("A");
        ShareDataThread thread2 = new ShareDataThread("B");
        ShareDataThread thread3 = new ShareDataThread("C");
        thread1.start();
        thread2.start();
        thread3.start();*/

        //测试共享数据
        DontShareDataThread thread = new DontShareDataThread();
        Thread thread1 = new Thread(thread,"A");
        Thread thread2 = new Thread(thread,"B");
        Thread thread3 = new Thread(thread,"C");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
