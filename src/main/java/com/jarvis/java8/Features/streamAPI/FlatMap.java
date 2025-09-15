package com.jarvis.java8.Features.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

    public static void main(String[] args) {

        List<List<String>> charList = Arrays.asList(
                Arrays.asList("a","b","c"),
                Arrays.asList("a","b","c"),
                Arrays.asList("a","b","c")
        );

//        use flatmap to flatten this list of list map

        List<String> alpth = charList.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println(alpth); // [a, b, c, a, b, c, a, b, c]


        List<String> dataList = Arrays.asList("chandra is good","and bad also ");

        List<String> flaternDataList = dataList.stream().flatMap(s -> Arrays.stream(s.split(" "))).collect(Collectors.toList());
        System.out.println(flaternDataList); // [chandra, is, good, and, bad, also]

    }
}
