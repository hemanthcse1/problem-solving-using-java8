package com.hemanth.problemsolving.problemsonArrays;

import java.util.Arrays;

public class RemoveDuplicateElements {

    public static void main(String[] args) {


        int[] arr = {2, 2, 5, 6, 7, 8, 8, 5, 9, 3, 4, 5};


        System.out.println("array items count  " + removeDuplicateElements(arr));

    }


    public static int removeDuplicateElements(int[] arr) {

        if (arr.length == 0) {
            return 0;
        }
        int duplicateCount = 1;
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] != arr[i - 1]) {
                arr[duplicateCount] = arr[i];
                duplicateCount++;
            }
        }

        return duplicateCount;
    }
}
