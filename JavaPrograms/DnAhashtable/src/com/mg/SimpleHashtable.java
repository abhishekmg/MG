package com.mg;

public class SimpleHashtable {

    private employee[] hashtable;

    public SimpleHashtable(){
        hashtable = new employee[10];

    }


    private int hashkey (String key){
        return key.length() % hashtable.length;
    }

    public void put(String key , employee employee){
         int hashedkey = hashkey(key);
         if (hashtable[hashedkey] != null){
             System.out.println("collition will occur");
         }else {
             hashtable[hashedkey ] = employee;
         }
    }

    public employee get (String key) {
         int hashedkey = hashkey(key);
         return hashtable[hashedkey];
    }

    public void print () {
        for(int i = 0 ;i <hashtable.length ; i++){
            System.out.println(hashtable[i]);
        }
    }

}

