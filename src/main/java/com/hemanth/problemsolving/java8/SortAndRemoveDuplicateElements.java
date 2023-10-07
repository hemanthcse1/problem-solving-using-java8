package com.hemanth.problemsolving.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortAndRemoveDuplicateElements {

    public static void main(String[] args) {


        List<Integer> numbers = Arrays.asList(1, 2, 2, 8, 8, 6, 9, 4, 12, 11, 19, 16, 15, 16, 19, 5, 5, 7);


        List<Integer> sortedAndDistinct = numbers.stream()
                .sorted()
                .distinct()
                .collect(Collectors.toList());


        System.out.println(sortedAndDistinct);
    }
}
