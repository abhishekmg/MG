package com.mg;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static GroceryItems groceryItems = new GroceryItems();
    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.println("enter your choice : ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryItems.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    quit = true;
                    break;

            }
        }
    }

    public static void printInstructions(){
        System.out.println("\nPress");
        System.out.println("\t 0 - print instructions");
        System.out.println("\t 1 - print grocery list");
        System.out.println("\t 2 - add  an item");
        System.out.println("\t 3 - modify an item");
        System.out.println("\t 4 - remove an item");
        System.out.println("\t 5 - search for an item");
        System.out.println("\t 6 - quit this application");

            }


    public static void addItem(){
        System.out.println("Enter item name : ");
        groceryItems.addGroceryItems(scanner.nextLine());

    }

    public static void modifyItem(){
        System.out.println("Enter item number : ");
        int itemNO = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the item name : ");
        String newItem = scanner.nextLine();
        groceryItems.modifyGroceryList(itemNO-1 , newItem);
    }

    public static void removeItem(){
        System.out.println("Enter item no :  ");
        int item = scanner.nextInt();
        scanner.nextLine();
        groceryItems.removeGroceryItem(item-1);
    }

    public static void searchItem(){
        System.out.println("Enter the item you want : ");
        String item = scanner.nextLine();
        if (groceryItems.findItem(item)!=null){
            System.out.println("Found the item "  + item + " in your list ");
        }else {
            System.out.println("item not found .. sorry");
        }
    }


}
