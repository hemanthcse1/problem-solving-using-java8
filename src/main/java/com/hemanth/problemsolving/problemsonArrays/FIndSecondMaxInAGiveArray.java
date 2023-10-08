package com.hemanth.problemsolving.problemsonArrays;

public class FIndSecondMaxInAGiveArray {


    public static void main(String[] args) {


        int[] arr = {2, 5, 8, 4, 6, 7, 9, 3};

        System.out.println("Second max -> " + secondMax(arr));
    }

    public static int secondMax(int[] arr) {

        int firstmax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {


            if (num > firstmax) {
                secondMax = firstmax;
                firstmax = num;
            } else if (num > secondMax && num != firstmax) {
                secondMax = num;
            }
        }

        return secondMax;
    }
}
