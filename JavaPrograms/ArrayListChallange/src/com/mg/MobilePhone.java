package com.mg;

import java.util.ArrayList;
import java.util.concurrent.Callable;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContects;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContects = new ArrayList<Contact>();
    }

    public boolean addNewContect(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("contact is already in the file");
            return false;
        }

        myContects.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact , Contact newContact){
        int foundPosition = findContact(oldContact);
        if (foundPosition<0){
            System.out.println(oldContact.getName() + " was not found");
            return false;
        }
        this.myContects.set(foundPosition , newContact);
        return true;
    }


    public boolean removeContact(Contact contact){
        int foundPosition = findContact(contact);
        if (foundPosition<0){
            System.out.println(contact.getName() + " was not found");
            return false;
        }
        this.myContects.remove(foundPosition);
        System.out.println(contact.getName() + " was deleted");
        return true;
    }

    private int findContact(Contact contact) {
        return this.myContects.indexOf(contact);
    }

    private int findContact(String contactName) {
        for (int i = 0; i < myContects.size(); i++) {
            Contact contact = myContects.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
            return -1;
        }

    public String queryContact(Contact contact){
        if(findContact(contact)>=0){
            return contact.getName();
        }
        return null;
    }





    }







