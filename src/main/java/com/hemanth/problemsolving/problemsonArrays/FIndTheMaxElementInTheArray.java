package com.hemanth.problemsolving.problemsonArrays;

public class FIndTheMaxElementInTheArray {


    public static void main(String[] args) {

        int[] arr = {1, 5, 8, 354, 3, 6, 12, 94, 126};

        System.out.println("Max element is -> " + findMax(arr));

    }

    public static int findMax(int[] array) {
        int max = array[0];

        for (int i = 1; i < array.length; i++) {

            if (max < array[i]) {
                max = array[i];
            }
        }


        return max;
    }
}
