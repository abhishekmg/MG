package com.mg;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here

        LinkedList list = new LinkedList();

         list.add(1);
         list.add(1);
         list.add(2);
         list.add(3);
         list.add(3);
         list.add(6);

         for (int i = 0 ; i <list.size() ; i++){

             for (int j = i+1 ; j <list.size() ; j++ ){

                 if (list.get(i) == list.get(j))
                    list.remove(list.get(i));
             }
         }

        System.out.println(list);

    }
}
