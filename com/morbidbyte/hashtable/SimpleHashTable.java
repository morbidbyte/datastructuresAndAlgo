package com.morbidbyte.hashtable;

public class SimpleHashTable {

    //1. We need the array that is going to backend the hashtable, it is going to be an array of Employee class.
    private Employee[] hashtable;

    //Constructor
    public SimpleHashTable(){
        //Initializes an array of ten elements(Employees)
        hashtable = new Employee[10];
    }

    //Method to put data in the hash table
    public void put(String key, Employee employee){
        int hashedKey = hashKey(key);

        if(hashtable[hashedKey] != null){
            System.out.println("Sorry, there's already an employee at position " + hashedKey);
        } else {
            hashtable[hashedKey] = employee;
        }

    }

    //Get: time complexity is constant time O(1)
    public Employee get(String key){
        int hashedKey = hashKey(key);
        return hashtable[hashedKey];
    }

    //This method create a hashkey using the last name of the employee
    private int hashKey(String key){
        return key.length() % hashtable.length;
    }

    public void printHashtable(){
        for(int i = 0; i < hashtable.length; i++){
            System.out.println(hashtable[i]);
        }
    }






}
