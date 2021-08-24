package com.morbidbyte.array.MergeSort;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        mergeSort(intArray, 0, intArray.length);

        System.out.println(Arrays.toString(intArray));


    }

    public static void mergeSort(int[] input, int start, int end ){
        if(end - start < 2){
            return;
        }

        int mid = (start + end) / 2;
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);

    }

    public static void merge(int[] input, int start, int mid, int end){

        if(input[mid - 1] <= input[mid]){
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;
        int[] temp = new int[end - start];

        while(i < mid && j < end){
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }


        //System.arraycopy
        //input => src: This is the source array
        //i => srcPos: This is the starting position in the source array
        //input => dest: This is the destination array
        //start + tempIndex => destPos: This is the starting position in the destination data
        //mid - i => length: This is the number of array elements to be copied.

        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);



    }


}
