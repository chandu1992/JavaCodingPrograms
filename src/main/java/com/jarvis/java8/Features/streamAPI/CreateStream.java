package com.jarvis.java8.Features.streamAPI;

import java.util.*;
import java.util.stream.Stream;

public class CreateStream {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("A", "B", "C");
        Stream<String> stream = list.stream();
        System.out.println(stream);

        String[] arr = {"A", "B", "C"};
        List<String> list1 = Arrays.asList(arr);
        Stream<String> stream1 = list1.stream();
        System.out.println(stream1);

        String[] arr1 = {"A", "B", "C"};
        Stream<String> stream2 = Arrays.stream(arr1);
        Stream<String> stream3 = Stream.of(arr);
        System.out.println(stream2);
        System.out.println(stream3);

        Stream<String> stream4 = Stream.of("A", "B", "C");



    }
}
