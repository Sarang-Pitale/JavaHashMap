package com.sample;

import java.util.HashMap;

public class Demo {
    public static void main(String[] args) {
        HashMap<Integer, String> empMap = new HashMap<>(); // Creation
        empMap.put(2, "Sarang"); // Add element
        empMap.put(7, "Ram");
        empMap.put(null, "abc"); // null elements allowed
        empMap.put(8, "Ram");
        empMap.put(1, "Anurag");
        empMap.put(3, "Ram");
        empMap.putIfAbsent(3, "Rama"); // add element if key not exist
        System.out.println(empMap); // print element
        HashMap<Integer, String> empMap1 = new HashMap<>(); // creation of other map
        empMap1.put(4, "Anurag");
        empMap1.put(6, "Ram");
        empMap1.put(5, "Sarang");
        empMap.putAll(empMap1); // add collections to map
        System.out.println(empMap);
        System.out.println(empMap.get(5)); // get Element with key 5
        System.out.println(empMap.keySet());// get all keys
        System.out.println(empMap.values()); // get all values
        empMap.replace(5, "Shyam"); // replace value of key 5 with Shyam value
        System.out.println(empMap);
        empMap.remove(6); // remove key value with key 6
        System.out.println(empMap);
        System.out.println("**************Traversing using Lambda");
        empMap.forEach((k, v) -> {
            System.out.println("Key " + k);
            System.out.println("Value " + v);
        });

    }
}
