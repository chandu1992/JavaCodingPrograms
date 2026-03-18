package com.jarvis.java8.Features.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumCalculate {

    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(10,23,24,43,29);

        int sum = data.stream()
//                .mapToInt(value -> value.intValue())
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(sum);

        int sum1 = data.stream().collect(Collectors.summingInt(a->a));
        System.out.println(sum1);

        List<String> stringList = Arrays.asList("10","20","30","40");
        long add = stringList.stream().mapToInt(Integer::parseInt).sum();
        System.out.println(add); // 100

//        int array no need to convert
        int[] numbes = new int[]{10,20,30,40,50,60};
        int sumarray = Arrays.stream(numbes).sum();
        System.out.println(sumarray);
    }
}
