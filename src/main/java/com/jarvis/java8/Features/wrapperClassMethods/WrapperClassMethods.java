package com.jarvis.java8.Features.wrapperClassMethods;

public class WrapperClassMethods {

    public static void main(String[] args) {

        int primitive = 10;
        Integer object = 22;
        String str = "101";

//        xxxValue() is use to convert wrapper object to primitive Integer to int

        int convertByIntValue = object.intValue();
        System.out.println(convertByIntValue);


//        parseXxx() is use to convert String to primitive
        int convertStringToInt = Integer.parseInt(str);
        System.out.println(convertStringToInt);

//        valueOf() is use to convert String and primitive into object
        Integer i = Integer.valueOf(primitive);
        System.out.println(i);

        Integer i2 = Integer.valueOf(str);
        System.out.println(i2);

//        toString is use to convert primitive and wrapper object to string
        String s1 = object.toString();
        System.out.println(s1);
        System.out.println(Integer.toString(primitive));
    }
}
