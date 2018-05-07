package com.mg;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<employee> employees = new ArrayList<>();

        employees.add(new employee("peter","parker",44));
        employees.add(new employee("lio","parker",45));
        employees.add(new employee("ryan","renold",78));
        employees.add(new employee("gary","nevil",98));

        employees.forEach(employee -> System.out.println(employee));

        System.out.println("=================================");

        employees.set(1,new employee("mg","abhi",77));
        employees.forEach(employee -> System.out.println(employee));

        System.out.println("======================");

        employees.add(new employee("adam","levine",89));
        employees.forEach(employee -> System.out.println(employee));

        System.out.println("======================");

        System.out.println(employees.contains(new employee("peter","parker",44)));
        System.out.println(employees.indexOf(new employee("lio","parker",45)));

        employees.remove(2);
        employees.forEach(employee -> System.out.println(employee));





    }
}

