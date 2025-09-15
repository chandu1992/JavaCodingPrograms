package com.jarvis.java8.Features.javacoding;

public class FindFactorialRecursion {

    public static int getFactorial(int num){

        if(num ==0)
            return 1;

        return num*getFactorial(num-1);

    }
    public static void main(String[] args) {

        System.out.println(getFactorial(10));
    }
}
