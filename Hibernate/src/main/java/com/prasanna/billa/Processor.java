package com.prasanna.billa;

public class Processor {
    private int number = 1;
    private final int no;

    public Processor(int no){
        this.no=no;
    }
    public void evenThread(){
        synchronized (this) {
            while (no > number) {
                testEven(this.number);
                this.number++;
            }
        }
    }

    public void oddThread(){
        synchronized (this) {
            while (no > number) {
                oddTest(this.number);
                this.number++;
            }
        }
    }

    public void testEven(int val){
        if(val%2==0) {
            System.out.println("even number " + val);
            notify();
        }
        else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void oddTest(int val){
        if(val%2==1) {
            System.out.println("odd number " + val);
            notify();
        }
        else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
