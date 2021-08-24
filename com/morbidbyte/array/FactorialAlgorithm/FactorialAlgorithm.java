package com.morbidbyte.array.FactorialAlgorithm;

public class FactorialAlgorithm {

    public static void main(String[] args){

       int factorial = iterativeFactorial(3);
       System.out.println(factorial);

       //Using recursiveFactorial
        int recursiveFactorial = recursiveFactorial(3);
        System.out.println(recursiveFactorial);


    }


    // 1! = 0! * 1 = 1
    // 2! = 2 * 1 = @ * 1!
    // 3! = 3 * 2 * 1 = 3 * 2!
    //Factorial above can be represented by n! = n * (n-1)!
    public static int recursiveFactorial(int num){
        if(num == 0){
            return 1;
        }

        return num * recursiveFactorial(num -1);
    }


    public static int iterativeFactorial(int num){
        if(num == 0){
            return 1;
        }

        int factorial = 1;
        for(int i = num; i > 0  ; i--){
            factorial *= i;
        }

        return factorial;

    }

}
