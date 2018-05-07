package com.mg;

public class Main {

    public static void main(String[] args) {
	// write your code here
        employee peterParker = new employee("peter" , "Parker",44);
        employee lioparker = new employee("lio","parker",45);
        employee ryanrenold = new employee("ryan","reynold",78);
        employee garynevil = new employee("gary","nevil",98);

        employeeDoublyLinkedList list = new employeeDoublyLinkedList();

        list.addToEnd(peterParker);
    }
}
