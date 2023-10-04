package com.hemanth.problemsolving.java8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindSumOfSalaryWhosGradeIsA {

    public static List<Emp> getEmployees() {
        return Stream.of(new Emp(101, "hemanth", "A", 2100000),
                        new Emp(102, "Sharad", "A", 2200000),
                        new Emp(103, "rahul", "B", 1800000),
                        new Emp(104, "kiran", "C", 500000))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {


        double sumSalary = getEmployees().stream()
                .filter(emp -> emp.getGrade().equalsIgnoreCase("A"))
                .map(emp -> emp.getSalary())
                .mapToDouble(i -> i)
                .sum();


        System.out.println(sumSalary);

    }
}
