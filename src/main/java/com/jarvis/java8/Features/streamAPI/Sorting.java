package com.jarvis.java8.Features.streamAPI;

import com.jarvis.java8.Features.model.Employee;
import com.jarvis.java8.Features.model.EmployeeTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sorting {

    public static void main(String[] args) {

        Stream<Integer> str = Stream.of(10,21,1,23,43,2,3,13);

//        Assending order small to big
        List<Integer> sortAsc =  str.sorted().collect(Collectors.toList());
        System.out.println(sortAsc); // [1, 2, 3, 10, 13, 21, 23, 43]

//        decending order
        Stream<Integer> str1 = Stream.of(10,21,1,23,43,2,3,13);
        List<Integer> sortedDec = str1.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedDec); // [43, 23, 21, 13, 10, 3, 2, 1]

        List<String> str2 = List.of("a","d","c","h","f");
        List<String> sortStr =  str2.stream().sorted().collect(Collectors.toList());
        System.out.println(sortStr); // [a, c, d, f, h]

        List<String> str3 = List.of("a","d","c","h","f");
        List<String> sortStrDesc =  str2.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortStrDesc); // [h, f, d, c, a]

        List<EmployeeTest> emp = Arrays.asList(
                new EmployeeTest(1l,"chandu",33,450000),
                new EmployeeTest(2l,"Pooja",28,300000),
                new EmployeeTest(3l,"Gauri",27,500000),
                new EmployeeTest(4l,"Anuk",45,1000000)
        );

        //assending
        emp.stream().sorted(Comparator.comparing(EmployeeTest::getSalary))
                .forEach(System.out::println);

        //decending order
        emp.stream().sorted(Comparator.comparing(EmployeeTest::getSalary).reversed())
                .forEach(System.out::println);

        //or

        //age assending order using compareTO
        emp.stream().sorted((obj1,obj2) -> obj1.getAge().compareTo(obj2.getAge()))
                .forEach(System.out::println);


        List<Integer> str5 = Arrays.asList(10,21,1,23,43,2,3,13);

        // 1 2 3 10 13 21 23 43
        str5.stream().sorted((a,b)->a-b).forEach(i -> System.out.print(i+" "));
        //43 23 21 13 10 3 2 1
        str5.stream().sorted((a,b)->b-a).forEach(i -> System.out.print(i+" "));

        //for sorted we need comparator object so if we pass as premivitve it not accept

        int[] arr = new int[]{2,23,43,1,89,56,40};

        Arrays.stream(arr)
//                .boxed() // convert to Integer object we can use mapToObj() also
                .mapToObj(value -> Integer.valueOf(value))
                .sorted((a,b)->a-b).forEach(System.out::println);
    }
}
