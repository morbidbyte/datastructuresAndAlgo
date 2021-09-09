package com.morbidbyte.jdkLinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args){

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee jhonDoe = new Employee("Jhon", "Doe", 456);
        Employee marySmith = new Employee("Mary", "Smith", 123);
        Employee mikeWilson = new Employee("Mike", "Wilson", 123);
        Employee karlaRam = new Employee("Karla", "Ram", 657);



        LinkedList<Employee> list = new LinkedList<>();

        list.addFirst(janeJones);
        list.addFirst(jhonDoe);
        list.addFirst(marySmith);
        list.addFirst(mikeWilson);
        list.addLast(karlaRam);


        Iterator iter = list.iterator();

        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        System.out.println("&&&&&&");

        for(Employee employee: list){
            System.out.println(employee);
        }





    }

}
