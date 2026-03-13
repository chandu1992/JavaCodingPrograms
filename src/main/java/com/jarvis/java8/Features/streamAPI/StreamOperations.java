package com.jarvis.java8.Features.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperations {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2,4,6,8,10);

        Stream<Integer> stream = numbers.stream()
                .filter(n -> n > 5)   // intermediate
                .map(n -> n * 2);     // intermediate

        stream.forEach(System.out::print);
    }
}
