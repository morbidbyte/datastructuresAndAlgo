package com.morbidbyte.jdkStack;


public class Main {


    public static void main(String[] args){

        Employee pablo = new Employee("Pablo", "Ramirez", 123);
        Employee karla = new Employee("Karla", "Ramirez", 456);
        Employee dora = new Employee("Dora", "Ramirez", 789);
        Employee sparky = new Employee("Sparky", "Ramirez", 785);
        Employee golfo = new Employee("Golfo", "Ramirez", 689);
        Employee sky = new Employee("Sky", "Ramirez", 235);

        LinkedStack stack = new LinkedStack();
        stack.push(pablo);
        stack.push(karla);
        stack.push(dora);
        stack.push(sparky);
        stack.push(golfo);
        stack.push(sky);

        stack.printStack();

        stack.pop();

        System.out.println("&&&&&&&&");

        stack.printStack();






    }

}
