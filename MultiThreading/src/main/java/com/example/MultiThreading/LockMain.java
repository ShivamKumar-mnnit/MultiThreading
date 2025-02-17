package com.example.MultiThreading;

public class LockMain {
    public static void main(String[] args){
        BankAccount sbi = new BankAccount();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                sbi.withdraw(50);
            }
        };

        Thread t1 = new Thread(task,"thread 1");
        Thread t2 = new Thread (task,"thread 2");
        t1.start();
        t2.start();
    }
}
