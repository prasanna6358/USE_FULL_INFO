package com.prasanna.billa;


import java.util.ArrayList;
import java.util.List;

public class Lambda {

    public static void main(String[] args) {
        Mylambda mylambda = (a, b) -> {
            System.out.println("Sum of the numbers "+(a+b));
            return a*b;
        };
        List<String> stringList = new ArrayList<String>();
        stringList.add("Employee1");
        stringList.add("Employee2");
        stringList.add("Employee3");
        stringList.add("Employee4");
        stringList.add("Employee5");
        List<String> stringList2 = new ArrayList<String>();
        stringList.forEach(n-> stringList2.add(n));
        stringList2.forEach(n-> System.out.println(n));
        System.out.println("product of the numbers "+mylambda.add(5,40));

        Mymessage mymessage = (message1,message2)-> {
            System.out.println(message1+" "+message2);
            System.out.println((message1+message2).length());
        };
        mymessage.add("Prasanna", "Kumar");

    }

}
@FunctionalInterface
interface Mylambda {
    int add(int i, int j);
}

@FunctionalInterface
interface Mymessage {
    void add(String i, String j);
}