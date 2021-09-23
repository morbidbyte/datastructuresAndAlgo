package com.morbidbyte.queuesWithArray;

public class Main {

    public static void main(String[] args){

        Employee pablo = new Employee("Pablo", "Ramirez", 123);
        Employee dora = new Employee("Dora", "Ramirez", 345);
        Employee karla = new Employee("Karla", "Ramirez", 678);
        Employee sparky = new Employee("Sparky", "Ramirez", 987);



        ArrayQueue queue = new ArrayQueue(4);
        queue.add(pablo);
        queue.add(dora);
        queue.add(karla);
        queue.add(sparky);



        queue.printQueue();


        queue.remove();

        System.out.println("*******************");

        queue.printQueue();



    }
}
