package com.apust.java8.stream.person;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by APUST on 10/29/2017.
 */
public class Person_App {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Alex", 25),
                new Person("Yan", 31),
                new Person("Jeff", 51),
                new Person("Nora", 44),
                new Person("Joan", 15),
                new Person("Noan", 65)

        );

//        persons.stream().filter(s -> s.age>30).forEach(System.out :: println);

//        List<Person> filtered = persons.stream()
//                .filter(s -> s.name.startsWith("N"))
//                .collect(Collectors.toList());
//
//        System.out.println(filtered);

//        persons.stream()
//               .collect(Collectors.groupingBy(p -> p.age))
//               .forEach((age, p) -> System.out.format("age %s: %s\n", age, p));

//        Double collect = persons.stream()
//                .collect(Collectors.averagingInt(p -> p.age));
//
//        System.out.println(collect);
//

        Map<Integer, String> collect = persons
                .stream()
                .collect(Collectors.toMap(
                        p -> p.age,
                        p -> p.name,
                        (s1, s2) -> s1 + " : " + s2));

        System.out.println(collect);

    }
}
