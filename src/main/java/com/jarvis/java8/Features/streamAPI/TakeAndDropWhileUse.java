package com.jarvis.java8.Features.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TakeAndDropWhileUse {

    public static void main(String[] args) {

        // It processes elements from the start of a stream as long as the condition is true.
        List<Integer> ages = Arrays.asList(10,20,30,40,50,21,12,22,35);

        List<Integer> takeWhileData = ages.stream().takeWhile(num -> num<41).collect(Collectors.toList());
        System.out.println(takeWhileData);  // [10, 20, 30, 40]

        // when condition goes fail onwords all values will print
        List<Integer> makrs = Arrays.asList(60,55,48,40,50,21,12,22,80);
        List<Integer> dropWhileData =  makrs.stream().dropWhile( num -> num>45).collect(Collectors.toList());
        System.out.println(dropWhileData); // [40, 50, 21, 12, 22, 80]

    }
}
