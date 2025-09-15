package com.jarvis.java8.Features.streamAPI;

import java.util.Arrays;
import java.util.List;

public class Match {

    public static void main(String[] args) {

        List<String> sub = Arrays.asList("Java", "Spring","lambda");

        // anyMatch() return true if give string found
        boolean isMatch = sub.stream().anyMatch(s -> s.equals("Java"));
        System.out.println("Is array cantains Java : "+isMatch); // true


//      allMatch() it return true if all conditon matches
        List<Integer> num = Arrays.asList(2,4,6,8,10);

        boolean allEven = num.stream().allMatch(i -> (i%2==0));
        System.out.println("Is list contain all even numbers :  "+allEven); // true

//        if given string is not found in list then return true
        boolean nonmatch = sub.stream().noneMatch(s -> s.equals("Math"));
        System.out.println("given string match : " +nonmatch); // true

    }
}
