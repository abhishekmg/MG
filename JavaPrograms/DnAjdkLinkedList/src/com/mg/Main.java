package com.mg;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        employee peterParker = new employee("peter" , "Parker",44);
        employee lioparker = new employee("lio","parker",45);
        employee ryanrenold = new employee("ryan","reynold",78);
        employee garynevil = new employee("gary","nevil",98);


        LinkedList<employee> list = new LinkedList<>();

        list.add(peterParker);
        list.add(lioparker);
        list.add(ryanrenold);
        list.add(garynevil);

        Iterator iterator  = list.iterator();
        System.out.println(" HEAD ->");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            System.out.println(" <=> ");
        }



        //list.addFront()
//        list.addLast();
//        list.removeFirst();
//        list.removeLast();


    }
}
