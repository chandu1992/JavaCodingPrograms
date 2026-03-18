package com.jarvis.java8.Features.streamAPI;

import java.util.stream.IntStream;

public class Range {
    public static void main(String[] args) {

        // 0,2,4,6,8
        IntStream.range(0,10).filter(num -> num%2==0)
                .forEach(System.out::println);
    }
}
