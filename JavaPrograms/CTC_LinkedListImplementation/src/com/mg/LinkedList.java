package com.mg;

import java.util.NoSuchElementException;

public class LinkedList<T> {

    public static class Node<T>{
        public Node next;
        public T data;

        public Node (T data){

            this.data = data;
        }

    }
    Node<T> head;
    Node<T> tail;
    int size;

    public void addtoend(T input){
       Node<T> n = new Node<T>(input);


        if (head==null){
            head = n;
            tail = n;
        }
        else {
            tail.next = n ;
            tail = n ;
        }
        size++;
    }

    public void addto(T input , int index){
        if (head == null){
            throw new NoSuchElementException();
        }

        else if (index == size){
            addtoend(input);
        }

        else if (index == 0){
            Node n = new Node(input);
            head = n;
            tail = n;
        }

        else {
            Node n = new Node(input);
            Node ptr = head;
            int i = 0;
            while (i++ < index-1){
                ptr = ptr.next;
            }
            n.next = ptr.next;
            ptr.next = n ;

        }
        size++;

    }






    }




