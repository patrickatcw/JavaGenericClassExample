package com.me;
/*The idea is to allow type (Integer, String, … etc and
user defined types) to be a parameter to methods, classes
and interfaces. For example, classes like HashSet, ArrayList,
HashMap, etc use generics very well. We can use them for any type.

https://www.geeksforgeeks.org/generics-in-java/

https://docs.oracle.com/javase/tutorial/java/generics/why.html
 */
public class Main {

    public static void main(String[] args) {

        // instance of Integer type
        Test <Integer> test = new Test<Integer>(01);
        System.out.println("integer type");
        System.out.println(test.getObject());

        System.out.println("----------------------------------");

        // instance of String type
        Test <String> test2 = new Test<String>("GenericClass");
        System.out.println("string type");
        System.out.println(test2.getObject());

        /*result;
        integer type
        1
        ----------------------------------
        string type
        GenericClass
         */

    }

}
