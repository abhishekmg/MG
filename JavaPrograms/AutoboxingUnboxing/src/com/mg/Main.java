package com.mg;

import java.util.ArrayList;

class intClass{

    private int intClass;

    public intClass(int intClass) {
        this.intClass = intClass;
    }

    public int getIntClass() {
        return intClass;
    }

    public void setIntClass(int intClass) {
        this.intClass = intClass;
    }
}

public class Main {

    public static void main(String[] args) {

        String[] myString = new String[10];
        int[] myInt = new int[10];

        ArrayList<String> StringList = new ArrayList<String>();
        StringList.add("mg");

        ArrayList<intClass> mynumb = new ArrayList<intClass>();
        mynumb.add(new intClass(22));



        ArrayList<Integer> myIntegers = new ArrayList<Integer>();

        for (int i = 0 ; i<=10 ; i++){
            myIntegers.add(Integer.valueOf(i));
        }

        for (int i = 0 ;i <=10 ; i++){
            System.out.println(i + "->" + myIntegers.get(i).intValue());
        }

        ArrayList<Double> myDouble = new ArrayList<Double>();

        for (double j = 0.0 ; j <=10.0 ; j+=0.5){
            myDouble.add(Double.valueOf(j));
        }

        for (int i = 0 ; i<=myDouble.size() ; i++){
            double value = myDouble.get(i).doubleValue();
            System.out.println(i + "-->" + value);
        }



    }
}
