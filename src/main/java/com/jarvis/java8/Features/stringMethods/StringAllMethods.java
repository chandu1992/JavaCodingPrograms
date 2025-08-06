package com.jarvis.java8.Features.stringMethods;

public class StringAllMethods {

    public static void main(String[] args) {
        System.out.println("C-Terms F");

        String trick = """
                C - Check
                
                T - Transform
                E - Equality
                R - Replace
                M - Modify (Trim/Split/Join)
                S - Substring
                
                F - Find
                """;

        System.out.println(trick);

//        C - Check (isEmpty, isBlack, startWith, endWith, matches, contains)

        String company = " Birlasoft limited ";

        System.out.println(company.isEmpty()); // false
        System.out.println(company.isBlank()); // false

        String name = "";
        System.out.println(name.isBlank()); // true
        System.out.println(name.isEmpty()); // true

        String s = " ";
        System.out.println(s.isBlank()); // true
        System.out.println(s.isEmpty()); // false because space is present

        System.out.println(company.contains("li")); //true

        System.out.println(company.startsWith(" Bi")); // true
        System.out.println(company.endsWith("ed ")); // true

        String email = "Jarvis@gmail.com";
        System.out.println(email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$")); // true

        String email2 = "Jarvis{@gmail.com";
        System.out.println(email2.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$")); // false because of curly


        // T - Transform (toUpperCase, toLowerCase, valueOf, toCharArray)


    }
}
