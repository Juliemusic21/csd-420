/*
Julie Sakai
CSD 420
Module 3 Programming Assignment
1/19/25
 */

package com.example.module3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class RemoveDuplicates {

    public static <E> ArrayList <E> removeDuplicates(ArrayList<E> list) {
        //Use HashSet to remove duplicates
        HashSet<E> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        //Create an ArrayList and fill it with 50 random values from 1 to 20
        ArrayList<Integer> originalList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 50; i++) {
            originalList.add(random.nextInt(20) + 1);
        }

        //Display original list
        System.out.println("Original List (including duplicates):");
        System.out.println(originalList);

        //Call generic removeDuplicates method
        ArrayList<Integer> seperateList = removeDuplicates(originalList);

        //Print new list without duplicates
        System.out.println("List after removing duplicates:");
        System.out.println(seperateList);

    }
}
