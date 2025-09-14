package com.jarvis.java8.Features.springBufferAndSpringBuilder;

public class StringBuilderAndBuffer {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello "); // thread safe thats why it is slow
        StringBuilder sb1 = new StringBuilder("Good "); // faster then String buffer

        System.out.println(sb.append("world"));
        System.out.println(sb1.append("morning"));




    }
}
