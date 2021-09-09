package com.morbidbyte.linkedList;

public class Main {

    public static void main(String[] args){



        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee jhonDoe = new Employee("Jhon", "Doe", 456);
        Employee marySmith = new Employee("Mary", "Smith", 123);
        Employee mikeWilson = new Employee("Mike", "Wilson", 123);


        EmployeeLinkedList list = new EmployeeLinkedList();
        list.addToFront(janeJones);
        list.addToFront(jhonDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        list.printList();



    }

}
