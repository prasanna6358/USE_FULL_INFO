package com.prasanna.billa;

public class MethodReferences {
    public static void saySomething(){
        System.out.println("Hello, this is static method.");
    }
    public static void main(String[] args) {
        // Referring static method
        Sayable sayable = MethodReferences::saySomething;
        // Calling interface method
        sayable.say();
    }
}
interface Sayable{
    void say();
}