package com.morbidbyte.array.SortWithJDK;

import java.util.Arrays;

public class SortWithJDK {

    public static void main(String[] args){
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        Arrays.sort(intArray);

        //It uses threads. It degrades less and better to be used on huge amount of data.
        Arrays.parallelSort(intArray);

        System.out.println(Arrays.toString(intArray));
    }
}
