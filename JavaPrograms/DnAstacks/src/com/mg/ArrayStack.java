package com.mg;

import java.util.EmptyStackException;

public class ArrayStack {

    private employee[] stack;
    private int top;


    public ArrayStack(int capacity){
        this.stack = new employee[capacity];
    }

    public void push(employee employee){

        if (top==stack.length){

            //resize the array

            employee[] newArray = new employee[2 *stack.length];
            System.arraycopy(stack,0,newArray,0,stack.length);
            stack = newArray;
        }

        stack[top++] = employee;
    }

    public employee pop (){
        if (isEmpty()){
            throw new EmptyStackException();
        }

        employee employee = stack[--top];
        stack[top] = null;
        return employee;
    }

    public employee peek() {
        if (isEmpty()) {
            throw  new EmptyStackException();
        }

        return stack[top - 1];


    }

    public int size(){
        return top;
    }

    public void printStack(){
        for (int i = top-1 ; i>=0 ; i--){
            System.out.println(stack[i]);
        }
    }


    public boolean isEmpty(){
        return top == 0;
    }

}
