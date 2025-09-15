package com.jarvis.java8.Features.streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaxNum {

    public static void main(String[] args) {

//        find max
        List<Integer> num = Arrays.asList(12,23,34,45,56,3,22,45,444);
        int maxnum = num.stream().max(Integer::compare).get();
        System.out.println(maxnum); // 444

//        find min
        int min = num.stream().min(Integer::compare).get();
        System.out.println(min); // 3

//        find second highest

        int secondMax = num.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondMax); // 56
    }
}
