package com.mg;

public class Main {

    public static void main(String[] args) {

        String a = "aaaabbbbccccdddddee";
        System.out.println(compress(a));
    }


    public static String compress(String input){

        String result = " ";

        int index = 0 ;

        while (index < input.length()){

            char c =  input.charAt(index);
            int count = count(input , index);

            if (count==1)
                result += "" + c;
            else
                result += "" + count + c;
            index += count;
        }

        return result;
    }

    public static int count(String text , int index){

        char c = text.charAt(index);
        int i = 1;
        while (index+i < text.length() && text.charAt(index+i)==c){
            i++;
        }
        return i;
    }
}
