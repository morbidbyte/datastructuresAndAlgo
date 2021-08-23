package com.morbidbyte.BubbleSort;

import java.util.Arrays;

public class BubbleSortPractice {
    public static void main(String[] args){


        //Swapping with outer from right to left
        int[] intArray = {12, 45, 78, 1, -12, -23, 78, 56, 10, 8, 4};
        //Size of the array is 11.

        int[] array = {2,78,45,3,9,45,100};

        System.out.println("Original Array");
        System.out.println(Arrays.toString(intArray));
        for(int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex-- ){
            for(int arrayIndex = 0; arrayIndex < lastUnsortedIndex; arrayIndex++){
                if(intArray[arrayIndex] > intArray[arrayIndex + 1]){
                    swap(intArray, arrayIndex, arrayIndex + 1);
                }
            }
        }

        System.out.println("Sorted Array");
        System.out.println(Arrays.toString(intArray));


        /////////////////////////////////////////////////////////////
        System.out.println("Original Array");
        System.out.println(Arrays.toString(array));

        for(int index = 0; index < array.length - 1; index ++){
            for(int subIndex = array.length - 2; subIndex > index; subIndex--){
                if(array[subIndex] > array[subIndex + 1]){
                    swap(array, subIndex, subIndex + 1);
                }
            }
        }

        System.out.println("Sorted Array Result");
        System.out.println(Arrays.toString(array));

    }

    public static void swap(int[] array, int x, int y){

        //Here x is greater than y.
        int temp = array[y];
        array[y] = array[x];
        array[x] = temp;
    }
}
