package com.dongho.dev.thread;

class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": " + "test");
    }

}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": " + "test");
    }

}

public class ThreadSample {

    public static void main(String[] args) {
        Thread myThread = new MyThread();
        myThread.start();

        Runnable myRunnable = new MyRunnable();
        Thread myThread2 = new Thread(myRunnable);
        myThread2.start();

        System.out.println(Thread.currentThread().getName() + ": " + "finish");
    }

}
