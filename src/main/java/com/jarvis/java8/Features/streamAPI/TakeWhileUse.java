package com.jarvis.java8.Features.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TakeWhileUse {

    public static void main(String[] args) {

        // It processes elements from the start of a stream as long as the condition is true.
        List<Integer> ages = Arrays.asList(10,20,30,40,50,21,12,22,35);

        List<Integer> data = ages.stream().takeWhile(num -> num<41).collect(Collectors.toList());
        System.out.println(data);  // [10, 20, 30, 40]

    }
}
