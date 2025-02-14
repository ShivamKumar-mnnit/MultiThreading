package com.example.MultiThreading;

public class ThreadStates extends Thread {
    @Override
    public  void run(){
        System.out.println("running state");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadStates t1 = new ThreadStates();
        System.out.println(t1.getState());   //new
        t1.start();
        System.out.println(t1.getState());  //runnable

        Thread.sleep(100);              //pausing main thread for 100ms so that t1 gets started and goes to running state
        System.out.println(t1.getState());  //timed waiting

        t1.join();  //main method will wait for t1 to terminate
        System.out.println(t1.getState());  //terminated

    }

}
