package com.mg;

import java.util.ArrayList;

public class GroceryItems {

    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItems(String items){
        groceryList.add(items);
    }
    public void printGroceryList(){
        System.out.println("the list has " + groceryList.size() + " items ");
        for (int i = 0 ; i<groceryList.size() ; i++){
            System.out.println(i+1 + " . " + groceryList.get(i));
        }

    }

    public void modifyGroceryList(int position , String newitem){
        groceryList.set(position,newitem);
        System.out.println("item " + (position+1) + " has been modified");
    }

    public void removeGroceryItem(int position){
        String newItem = groceryList.get(position);
        groceryList.remove(position);
    }

    public String findItem(String item){
        int number = groceryList.indexOf(item);
        if(number <= 0)
            return groceryList.get(number);
         return null;
    }


}
