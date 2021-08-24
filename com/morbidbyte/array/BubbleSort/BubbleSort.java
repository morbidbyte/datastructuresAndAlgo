package com.morbidbyte.array.BubbleSort;


import java.util.Arrays;
public class BubbleSort {

    public static void main(String[] args){


        int[] intArray = { 20, 35, -15, 7, 55, 1, -22};
        System.out.println("Unsorted Array:");
        System.out.println(Arrays.toString(intArray));
        System.out.println("*********************");

        //int totalSteps = 0;
        for(int lastUnsortedIndex = intArray.length -1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            for(int i =0; i < lastUnsortedIndex; i++){
                if (intArray[i] > intArray[i + 1]) {
                    swap(intArray, i, i + 1);
                }
            }
        }

        System.out.println("Sorted Array");
        System.out.println(Arrays.toString(intArray));


    }

    public static void swap(int[] array, int i, int j){

        if(i == j){
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }







}
