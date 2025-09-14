package com.jarvis.java8.Features.stringMethods;

import java.util.List;

public class StringAllMethods {

    public static void main(String[] args) {
        System.out.println("C-Terms F");

        String trick = """
                
                C - Check (isEmpty, isBlack, startWith, endWith, matches, contains)
                
                T - Transform (toUpperCase, toLowerCase, valueOf, toCharArray)
                E - Equality (equals, equalsIgnoreCase, compareTo, compareToIgnoreCase)
                R - Replace (replace, replaceAll, replaceFirst)
                M - Modify (Trim/Split/Join/repeat)
                S - Substring (substring)
                
                F - Find (indexOf,lastIndexOf,charAt,codePointAt)

                intern()
                
                """;

//      C - Check (isEmpty, isBlack, startWith, endWith, matches, contains)

        System.out.println("C - Check (isEmpty, isBlack, startWith, endWith, matches, contains)");

        String company = " Birlasoft limited ";
        System.out.println(company.concat("chutya company"));

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


//      T - Transform (toUpperCase, toLowerCase, valueOf, toCharArray)

        System.out.println("T - Transform (toUpperCase, toLowerCase, valueOf, toCharArray)");

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

//      E - Equality (equals, equalsIgnoreCase, compareTo, compareToIgnoreCase)

        System.out.println("Equality (equals, equalsIgnoreCase, compareTo, compareToIgnoreCase)");

        String name1 = "chandra";
        System.out.println(name1.equals("chandra")); // true

        System.out.println(name1.equalsIgnoreCase("CHanDrA")); // true

        System.out.println(name1.compareTo("chandra")); // 0 (0 means equal -ve means str1 < str2 and +ve means str1 > str2)

        System.out.println(name1.compareToIgnoreCase("CHANDRA")); // 0

//      R - Replace (replace, replaceAll, replaceFirst)

        System.out.println("Replace (replace, replaceAll, replaceFirst)");

        String rep = "java coder. java is open source";

        System.out.println(rep.replace("java","java programer")); // java programer

        String sout = "a1b2c3";  // use regex It replaces all substrings that match a regular expression.
        System.out.println(sout.replaceAll("[0-9]", "*"));  // a*b*c*

        System.out.println(rep.replaceFirst("java","Java")); // Java coder. java is open source

//      M - Modify (Trim/Split/Join/repeat)

        System.out.println("Modify (Trim/Split/Join/repeat)");

        String str = " chandu pande    ";
        System.out.println(str.trim()); // remove space from beginning and end

        String[] arr = str.split(" "); // break string to array " " by space
        System.out.println(arr[2]);

        List<String> list = List.of("Java", "Spring", "SQL");
        String result = String.join(" | ", list);
        System.out.println(result);  // Java | Spring | SQL

        String repe = "Hi ";
        System.out.println(repe.repeat(3));  // Hi Hi Hi

//      S - Substring (substring)

        System.out.println("Substring (substring)");

        String sub = "chandra don";
        System.out.println(sub.substring(1,4)); //han

//      F - Find (indexOf,lastIndexOf,charAt,codePointAt)

        System.out.println("Find (indexOf,lastIndexOf,charAt,codePointAt)");
        System.out.println(sub.indexOf("a")); // 2
        System.out.println(sub.lastIndexOf("a")); // 6
        System.out.println(sub.charAt(2)); // a
        System.out.println(sub.codePointAt(1)); // 104 unic code


//  ====================================================================================

//        intern()  -  It check identical string is present in string pool if yes it return that refrence if not then it will add that string into the pool.

        String interStr = new String("Birlasoft");
        String interStr2 = "Birlasoft";

/*        case 1
        interStr present in heap and interStr2 is form pool thats why false*/

        System.out.println(interStr==interStr2); // false

/*        case 2
        interStr.intern() returns the string from the pool.  both are have save object ref that why true*/

        System.out.println(interStr.intern()==interStr2); // true





    }
}
