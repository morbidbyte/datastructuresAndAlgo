package com.morbidbyte.hashtable;

public class Main {

    public static void main(String[] args){

        Employee emp1 = new Employee("Pablo", "Ramirez", 12);
        Employee emp2 = new Employee("Dora", "Romero", 23);
        Employee emp3 = new Employee("Karla", "Rambo", 56);
        Employee emp4 = new Employee("Sparky", "Atlas", 57);
        Employee emp5 = new Employee("Camila", "Sur", 58);
        Employee emp6 = new Employee("Katrina", "Bravo", 59);
        Employee emp7 = new Employee("Koral", "Billar", 60);
        Employee emp8 = new Employee("Monica", "Peralta", 61);;
        Employee emp9 = new Employee("Busca", "Stella", 62);
        Employee emp10 = new Employee("Maria", "Ramona", 63);

        SimpleHashTable table = new SimpleHashTable();
        table.put(emp1.getLastName(), emp1);
        table.put(emp2.getLastName(), emp2);
        table.put(emp3.getLastName(), emp3);
        table.put(emp4.getLastName(), emp4);
        table.put(emp5.getLastName(), emp5);
        table.put(emp6.getLastName(), emp6);
        table.put(emp7.getLastName(), emp7);
        table.put(emp8.getLastName(), emp8);
        table.put(emp9.getLastName(), emp9);
        table.put(emp10.getLastName(), emp10);


        Employee empReturned = table.get("Ramirez");
        System.out.println(empReturned.hashCode());
        System.out.println(empReturned.toString());

        table.printHashtable();

    }

}
