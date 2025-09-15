package com.jarvis.java8.Features.wayToCreateList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class WayToCreateList {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("chandra");
        list.add("gauri");
        list.add("pande");
        System.out.println(list);   //[chandra, gauri, pande]
        System.out.println(list.remove("pande")); //    true
        System.out.println(list);   // [chandra, gauri]

        List<Integer> data = Arrays.asList(10,20,30);
        System.out.println(data); //    [10, 20, 30]
        System.out.println(data.set(2,60)); //  30 old value return
        System.out.println(data); //    [10, 20, 60]
//        System.out.println(data.remove(1)); //  UnsupportedOperationException

        List<String> data1 = List.of("A","B", "B");
//        data1.add("D");         // UnsupportedOperationException
//        data1.remove(1);    // UnsupportedOperationException
//        data1.set(1,"S");       // UnsupportedOperationException


        List<String> modifiable = new ArrayList<>(Arrays.asList("A", "B", "C"));
        List<String> unModifiable = Collections.unmodifiableList(modifiable);

        List<Integer> newList = IntStream.range(1,5).boxed().toList();
        System.out.println(newList);

    }
}
