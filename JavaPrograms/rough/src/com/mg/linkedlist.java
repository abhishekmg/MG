package com.mg;



public class linkedlist<T> {

    Node<T> head;

    public class Node<T>{

        T data;
        Node next;

        public Node(T data){
            this.data = data;
            next = null;
        }

    }

    //to insert at front
    public void push(T newdata){

        Node n = new Node(newdata);
         n.next = head;
         head = n;
    }


    //to add after a node
    public void addAfter(Node prevNode , Integer newdata){
        if (prevNode==null){
            return;
        }

        Node n = new Node(newdata);
        n.next = prevNode.next;
        prevNode.next = n;

    }

    //to insert at the end
    public void insertEnd(T newdata){

        if (head == null){
            push(newdata);
            return;
        }

        Node n  = new Node(newdata);
        n.next = null;
        Node last = head;
        while (last.next!=null){
            last = last.next;
        }
        last.next = n;
    }

    //to delete node
    public void deletenode(T data){

        Node temp = head , prev = null;

        if (temp.next!=null && temp.data==data){
            head = temp.next;
            return;
        }

        while (temp.next!=null && temp.data!=data){
            prev = temp;
            temp = temp.next;
        }

        if (temp==null)
            return;

        prev.next = temp.next;



    }

    public void print(){
       for (Node n = head ; n != null ; n = n.next){
           System.out.print("-->" + n.data);

       }
        System.out.println("\n");

    }







}
