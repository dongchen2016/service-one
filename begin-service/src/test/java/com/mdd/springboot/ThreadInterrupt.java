package com.mdd.springboot;

/**
 * Created by madongdong on 2017/8/26.
 */
public class ThreadInterrupt extends  Thread {

    @Override
    public void run(){
        super.run();
        for(int i = 0 ;i<5000;i++){
            System.out.println("============"+ i +"====================");
        }
        this.interrupt();
        /*System.out.println("当前线程：" + this.currentThread().getName());*/
    }

    public static void main(String[] args){
        try{
            ThreadInterrupt thread = new ThreadInterrupt();
            thread.setName("thread");
            thread.start();

            Thread.sleep(1000);
            /*Thread.currentThread().interrupt();*/
            /*thread.interrupt();*/
            System.out.println("当前线程：" + thread.getName() +" 线程是否终止：" + thread.interrupted());
            System.out.println("当前线程：" + thread.getName() +" 线程是否终止：" + thread.interrupted());
            System.out.println("当前线程：" + Thread.currentThread().getName() +" 线程是否终止：" + Thread.currentThread().interrupted());
            System.out.println("当前线程：" + Thread.currentThread().getName() +" 线程是否终止：" + Thread.currentThread().interrupted());
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
