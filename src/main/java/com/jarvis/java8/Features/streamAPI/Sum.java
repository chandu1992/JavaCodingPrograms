package com.jarvis.java8.Features.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sum {

    public static void main(String[] args) {

        List<Integer> needSum = Arrays.asList(10,20,30,40,50,33,23);
        long sum = needSum.stream().collect(Collectors.summingLong(a -> a));
        System.out.println(sum); // 206

        List<String> stringList = Arrays.asList("10","20","30","40");
        long add = stringList.stream().mapToInt(Integer::parseInt).sum();
        System.out.println(add); // 100
    }
}
