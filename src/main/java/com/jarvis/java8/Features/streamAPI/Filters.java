package com.jarvis.java8.Features.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Filters {

    public static void main(String[] args) {

//        remove the null, empty, black string
        List<String> strings = Arrays.asList("Java", null, " ", "", "Spring", "Boot");

       List<String> newStr = strings.stream()
               .filter(Objects::nonNull)
               .filter(str -> !str.isBlank())
               .collect(Collectors.toList());

        System.out.println(newStr);  // [Java, Spring, Boot]

//        get All odd

        List<Integer> data = Arrays.asList(10,23,22,34,44,45,54,55);
        List<Integer> filterData = data.stream()
                .filter(num -> (num%2)==0)
                .collect(Collectors.toList());
        System.out.println(filterData); // [10, 22, 34, 44, 54]

    }
}
