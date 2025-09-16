package com.jarvis.java8.Features.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Average {

    public static void main(String[] args) {

        List<Integer> data = Arrays.asList(10,20,30,40,50,33,23);
        Double average = data.stream().collect(Collectors.averagingInt(num -> num));
        System.out.println(average); // 29.428571428571427

        List<String> prices = Arrays.asList("100.5", "200.75", "50.25");
        double average1 = prices.stream()
                .mapToDouble(Double::parseDouble)
                .average().getAsDouble();
        System.out.println(average1); // 117.16666666666667
    }
}
