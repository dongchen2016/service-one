package com.mdd.springboot;

/**
 * Created by madongdong on 2017/8/25.
 */
public class ShareDataThread extends Thread {
    private  int count = 5;
    public ShareDataThread(){}
    public ShareDataThread(String name){
        super();
        this.setName(name);
    }
    @Override
    public void run(){
        /*super.run();*/
        while(count > 0){
            count--;
            System.out.println(this.currentThread().getName() + "输出：count= " + count);
        }
    }
}
