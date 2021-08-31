package com.morbidbyte.vector;

import java.util.List;
import java.util.Vector;

/**
 * Common operations to be used on a list.
 */

public class VectorList {

    public static void main(String[] args){

        List<Employee> employeeList = new Vector<>();
        employeeList.add(new Employee("Janes", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 456));
        employeeList.add(new Employee("Mary", "Smith", 789));
        employeeList.add(new Employee("Mike", "Wilson", 213));

        employeeList.forEach(employee -> System.out.println(employee));





    }

}
