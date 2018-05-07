package com.mg;

public class employeeDoublyLinkedList {

    private employeeNode head;
    private int size;
    private employeeNode tail;

    public void addToFront(employee employee){

        employeeNode node = new employeeNode(employee);
        node.setNext(head);

        if (head==null){
            tail = node;
        }

        else {
            head.setPrevious(node);
        }




        head = node;
        size++;
    }

    public void addToEnd(employee employee){
        employeeNode node = new employeeNode(employee);

        if (tail == null){
            head = node;
        }

        else {
            tail.setPrevious(node);
            node.setNext(tail);
        }
        tail=node;
        size++;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public employeeNode removeFromFront(){
        if (isEmpty()){
            return null;
        }

        employeeNode removeNode = head;

        if (head.getNext() == null){
            tail = null;
        }

        else {
            head.getNext().setPrevious(null);
        }

        head = head.getNext();
        removeNode.setNext(null);
        size--;
        return removeNode;
    }



    public void printList(){
        employeeNode current = head;
        System.out.println("HEAD ->");
        while (current!=null){
            System.out.println(current);
            System.out.println(" <-> ");
            current = current.getNext();
        }
        System.out.println("end");
    }


}
