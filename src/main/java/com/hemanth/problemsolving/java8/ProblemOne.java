package com.hemanth.problemsolving.java8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ProblemOne {

    public static void main(String[] args) {

        /*
         * Write a Java program to cunt the occurrence of each character in a string
         * */

        String input = "ilovespringboot";

        String[] convertedResults = input.split("");

        // System.out.println(Arrays.toString(convertedResults));

       /* Map<String, List<String>> mappedResult = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(s -> s));*/


        Map<String, Long> mappedResult = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(mappedResult);

    }
}
