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

        System.out.println(company.toUpperCase()); // BIRLASOFT LIMITED

        String myname = "CHANDU";
        System.out.println(myname.toLowerCase()); // chandu

        Integer i = 10;
        System.out.println(String.valueOf(i)); // "10"

        String sts = null;
      //  System.out.println(sts.toString()); // NullPointerException
        System.out.println(String.valueOf(sts));  // "null"

        String country = "India is my contry.";
        char[] array = country.toCharArray();
        System.out.println(array); // India is my contry.
        System.out.println(array[0]); // I
        System.out.println(array.length); //19

//        E - Equality (equals, equalsIgnoreCase, compareTo, compareToIgnoreCase)

        String name1 = "chandra";
        System.out.println(name1.equals("chandra")); // true

        System.out.println(name1.equalsIgnoreCase("CHanDrA")); // true

        System.out.println(name1.compareTo("chandra")); // 0 (0 means equal -ve means str1 < str2 and +ve means str1 > str2)

        System.out.println(name1.compareToIgnoreCase("CHANDRA")); // 0

    }
}
