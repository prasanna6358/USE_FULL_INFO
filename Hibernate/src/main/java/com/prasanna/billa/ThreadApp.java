package com.prasanna.billa;

public class ThreadApp {

    public static void main(String[] args) {
        callThreads();
    }

    public static void callThreads(){
        final Processor processor = new Processor(50);

        Thread t1;
        t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                processor.evenThread();
            }
        });
        t1.setName("eventest");

        Thread t2;
        t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                processor.oddThread();
            }
        });
        t2.setName("oddtest");
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
