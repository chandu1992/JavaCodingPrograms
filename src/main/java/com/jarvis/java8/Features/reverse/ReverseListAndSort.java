package com.jarvis.java8.Features.reverse;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseListAndSort {

    public static void main(String[] args) {
        List<Integer> listInput = Arrays.asList(10,23,43,2,45);
        Collections.sort(listInput, Collections.reverseOrder());
        System.out.println(listInput);

    }
}
