package com.jarvis.java8.Features.reverse;

import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseList {

    public static void main(String[] args) {

        List<Integer> listInput = Arrays.asList(10,23,43,2,45);

        List<Integer> listOutput = new ArrayList<>(listInput);

        Collections.reverse(listOutput);

        System.out.println("Input  :" + listInput);
        System.out.println("Output :"+listOutput);

        Collections.reverseOrder();
    }
}
