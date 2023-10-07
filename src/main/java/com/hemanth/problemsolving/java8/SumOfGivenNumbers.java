package com.hemanth.problemsolving.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SumOfGivenNumbers {

    public static void main(String[] args) {


        List<Integer> numbers = Arrays.asList(45, 3, 2, 63, 63, 23, 64);

        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(sum);

        int[] intNumbers = {1,2,3,4,5,6,7,8,9,10};


        System.out.println("-----------------------------------");

        int sum1 = Arrays.stream(intNumbers)
                .sum();

        System.out.println(sum1);


    }
}
