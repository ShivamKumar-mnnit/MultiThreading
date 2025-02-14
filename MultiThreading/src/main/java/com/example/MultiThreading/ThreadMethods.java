package com.example.MultiThreading;

public class ThreadMethods  extends  Thread{

    //renaming thread
    public ThreadMethods(String name){
        super(name);
    }

    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName() + " -priority: " + Thread.currentThread().getPriority() + " loop: "+ i);
            Thread.yield();
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }


    public static void main(String[] args) throws InterruptedException {
        ThreadMethods t1 = new ThreadMethods("Shivam");
//        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t1.join();
        System.out.println("hello");


        ThreadMethods low = new ThreadMethods("low priority Thread");
        ThreadMethods med = new ThreadMethods("medium priority Thread");
        ThreadMethods high = new ThreadMethods("high priority Thread");

        low.setPriority(Thread.MIN_PRIORITY);
        med.setPriority(Thread.NORM_PRIORITY);
        high.setPriority(Thread.MAX_PRIORITY);


        //due to multicore parallel execution is happening so much variation now visible here.
        high.start();
        med.start();
        low.start();


        




    }


}
