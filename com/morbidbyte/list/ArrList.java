package com.morbidbyte.list;

import java.util.List;
import java.util.ArrayList;


/**
 * Common operations to be used on a list.
 */

public class ArrList {

    public static void main(String[] args){

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Janes", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 456));
        employeeList.add(new Employee("Mary", "Smith", 789));
        employeeList.add(new Employee("Mike", "Wilson", 213));


        employeeList.forEach(employee -> System.out.println(employee));


        System.out.println("***********");

        System.out.println(employeeList.get(1));
        System.out.println(employeeList.isEmpty());

        //Now let's set the list(1)
        employeeList.set(1, new Employee("Karla", "Ramirez", 987));

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        employeeList.forEach(employee -> System.out.println(employee));


        //I want to add a element on the third position. Some elements will be shifted then.
        employeeList.add(2, new Employee("Sparky", "Ramirez", 998));

        System.out.println("$$$$$$$$$$$$$$$$");
        //employeeList.forEach(employee -> System.out.println(employee));

        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        for(Employee employee: employeeArray){
            System.out.println(employee);
        }

        System.out.println(employeeList.contains(new Employee("Mary", "Smith", 789)));

        System.out.println(employeeList.indexOf(new Employee("Sparky", "Ramirez", 998)));

        employeeList.remove(3);

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@");
        employeeList.forEach(employee-> System.out.println(employee));



    }

}
