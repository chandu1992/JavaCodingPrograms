package com.jarvis.java8.Features.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindDistinct {

    public static void main(String[] args) {
        List<Integer> ages = Arrays.asList(10,20,40,40,50,50,22,22,35);

        List<Integer> distAge = ages.stream().distinct().collect(Collectors.toList());
        System.out.println(distAge); // [10, 20, 40, 50, 22, 35]
    }
}
