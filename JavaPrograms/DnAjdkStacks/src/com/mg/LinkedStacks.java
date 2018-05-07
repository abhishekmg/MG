package com.mg;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedStacks {

    private LinkedList<employee> stack;

    public LinkedStacks() {
        stack = new LinkedList<employee>();
    }

    public void push(employee employee){
        stack.push(employee);

    }

    public employee pop (){
        return stack.pop();
    }

    public employee peek(){
        return stack.peek();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public void printList(){
        ListIterator<employee> iterator = stack.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }





}
