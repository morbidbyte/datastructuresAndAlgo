package com.morbidbyte.linkedList;

public class EmployeeLinkedList {

    private EmployeeNode head;


    public void addToFront(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
    }


    public void printList(){
        EmployeeNode current = head;

        System.out.println("HEAD -> ");
        while(current != null){
            System.out.println(current);
            System.out.println(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }


}
