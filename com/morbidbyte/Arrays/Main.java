package com.morbidbyte.Arrays;

/**
 * Arrays:
 * Contiguous block in memory
 * Every element occupies the same amount of space in memory.
 * All elements should be integer or char, or float, so on.
 * An Integer is 4 bytes.
 *
 * If an array starts at memory address X, and the size of each element in the
 * array is Y, we can calculate the memory address of the ith element by using the following
 * expression: X + i * Y
 *
 *
 * If we know the index of an element, the time to retrieve the element will be the same,
 * not matter where it is in the array
 *
 *
 */

public class Main {
    public static void main(String[] args){
        int[] intArray = new int[7];

        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;

        int index = -1;
        for(int i = 0; i < intArray.length; i++){
            if(intArray[i] == 7){
                index = i;
                break;
            }
        }

        System.out.println("index = " + index);

    }


}
