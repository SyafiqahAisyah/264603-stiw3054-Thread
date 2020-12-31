package com.STIW3054;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        MyRunnable myRunnnable = new MyRunnable();
        Thread t1 = new Thread(myRunnnable);
        Thread t2 = new Thread(myRunnnable);
        Thread t3 = new Thread(myRunnnable);
        t1.start();
        t2.start();
        t3.start();
    }
}
