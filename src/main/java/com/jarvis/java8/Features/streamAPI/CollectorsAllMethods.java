package com.jarvis.java8.Features.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsAllMethods {

    public static void main(String[] args) {

        // convert to list after modified
        List<Integer> data = Arrays.asList(10,20,30,40,50,33,23);
        List<Integer> listData = data.stream().map(num -> num*10).collect(Collectors.toList());
        System.out.println(listData); // [100, 200, 300, 400, 500, 330, 230]

        // convert to set
        Set<Integer> setData = data.stream().map(num -> num*2).collect(Collectors.toSet());
        System.out.println(setData); // [80, 66, 20, 100, 40, 60, 46]

        // calculate average of list
        Double sum = data.stream().collect(Collectors.averagingInt(num -> num));
        System.out.println(sum); // 29.428571428571427

        List<String> names = Arrays.asList("A", "B", "C", "D");
        Long count = names.stream().collect(Collectors.counting());
        System.out.println(count); // 4
    }
}
