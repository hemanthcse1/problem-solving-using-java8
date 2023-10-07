package com.hemanth.problemsolving.java8.grouping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupGiveList {

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();

        personList.add(new Person(1, "Hemanth", "hemanth@gmail.com", "Bangalore", "male"));
        personList.add(new Person(2, "Sharad", "sharad@gmail.com", "Bangalore", "male"));
        personList.add(new Person(3, "rahul", "rahul@gmail.com", "Delhi", "male"));
        personList.add(new Person(4, "shushma", "sushma@gmail.com", "Bangalore", "female"));
        personList.add(new Person(5, "Minakshi", "minakshi@gmail.com", "mumbai", "female"));
        personList.add(new Person(6, "Pallavi", "pallavi@gmail.com", "mumbai", "female"));


        Map<String, List<Person>> groupByCity = personList.stream()
                .collect(Collectors.groupingBy(Person::getCity));

        System.out.println(groupByCity);

        System.out.println("------------------------------");

        Map<String, List<Person>> groupByGender = personList.stream()
                .collect(Collectors.groupingBy(Person::getGender));


        System.out.println(groupByGender);
    }
}
