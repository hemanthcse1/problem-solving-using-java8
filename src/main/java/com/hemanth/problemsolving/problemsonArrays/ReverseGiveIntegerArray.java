package com.hemanth.problemsolving.problemsonArrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseGiveIntegerArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Original array -> ");
        Arrays.stream(arr).forEach(i -> System.out.print(i + ","));
        reverseGivenArray(arr);
        System.out.println("\nReversed Array -> ");
        Arrays.stream(arr).forEach(i -> System.out.print(i + ","));

    }


    public static void reverseGivenArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
