package com.jarvis.java8.Features.concepts;


class Demo {
    Demo(int a, float b) {
        System.out.println("int-float constructor");
    }

    Demo(float a, int b) {
        System.out.println("float-int constructor");
    }
}

public class AmbiguousCall {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        // Ambiguous call
        new Demo(10, 20f);  // get int-flat constructor
//        new Demo(10, 20);  // ❌20 ERROR: which one to call?
    }
}
