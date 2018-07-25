package com.don.beti;

public class StackImpl {

    private int size;
    private int top;
    private int[] statckArray;

    public StackImpl(int size){
        this.size = size;
        this.statckArray = new int[size];
        this.top = -1;
    }

    private void push(int value) throws Exception{
        if(this.isStackfull()){
            throw new Exception("stack is already full "+size);
        }
        System.out.println("adding an entry "+value);
        this.statckArray[++top] = value;
    }

    private int pop() throws Exception{
        if(this.isEmpty()){
            throw new Exception("Stack is empty. Can not remove element.");
        }
        int entry = this.statckArray[top--];
        System.out.println("removing an entry "+ entry);
        return entry;
    }

    private int peek(){
        return statckArray[top];
    }

    private boolean isEmpty(){
        return (top == -1);
    }

    private boolean isStackfull(){
        return (top == size-1);
    }

    private void iterate(){
        for (int i=0;i<size;i++){
            System.out.println(statckArray[i]);
        }
    }

    public static void main(String[] args) throws Exception{
        StackImpl stack = new StackImpl(4);
        stack.push(4);
        stack.push(8);
        stack.push(2);
        //stack.push(6);
        //stack.push(0);
        stack.iterate();
        stack.pop();
        stack.pop();
        stack.iterate();
        //System.out.println(stack.size);
    }
}
