package com.jarvis.java8.Features.streamAPI;

import java.util.Arrays;
import java.util.List;

public class MapToXxxFindSumAvg {

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("10","20","30","40");
        long add = stringList.stream().mapToInt(Integer::parseInt).sum();
        System.out.println(add); // 100

        List<String> prices = Arrays.asList("100.5", "200.75", "50.25");
        double average = prices.stream()
                .mapToDouble(Double::parseDouble)
                .average().getAsDouble();
        System.out.println(average); // 117.16666666666667


    }
}
