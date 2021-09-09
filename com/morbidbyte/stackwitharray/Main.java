package com.morbidbyte.stackwitharray;

public class Main {

    public static void main(String[] args){

        ArrayStack employeeList = new ArrayStack(4);

        Employee pablo = new Employee("Pablo", "Ramirez", 123);
        Employee karla = new Employee("Karla", "Ramirez", 456);
        Employee dora = new Employee("Dora", "Ramirez", 789);
        Employee sparky = new Employee("Sparky", "Ramirez", 785);
        Employee golfo = new Employee("Golfo", "Ramirez", 689);
        Employee sky = new Employee("Sky", "Ramirez", 235);

        employeeList.push(pablo);
        employeeList.push(karla);
        employeeList.push(dora);
        employeeList.push(sparky);
        employeeList.push(golfo);
        employeeList.push(sky);


        //employeeList.pop();


        //employeeList.printStack();


        System.out.println(employeeList.peek());
        //employeeList.printStack();

    }

}
