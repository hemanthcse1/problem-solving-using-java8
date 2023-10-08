package com.hemanth.problemsolving.problemsonArrays;

public class FindTheMinElementInTheArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5, 6, 12, 35, 24, 7, 0};


        System.out.println("Minimum element in the array -> " + findMin(arr));

    }


    public static int findMin(int[] arr) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        return min;
    }
}
