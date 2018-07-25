package com.prasanna.billa;

public class Reference2 {
    public static void main(String[] args) {
        Thread thread = new Thread(Reference2::said);
        Thread thread2 = new Thread(Reference2::said);
        Thread thread3 = new Thread(Reference2::said);
        Thread thread4 = new Thread(Reference2::said);
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.start();
        thread3.start();
        thread4.start();
        }
    public static void said(){
        for (int i=0;i<5;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread is runnuing");
    }
}
