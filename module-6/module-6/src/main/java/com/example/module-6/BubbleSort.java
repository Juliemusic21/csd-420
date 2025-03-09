/*
Julie Sakai
Module 6 Programming Assignment
2/8/25
 */

package com.example.module6programmingassignment;

import java.util.Comparator;

public class BubbleSort {
    //Bubble sort method using Comparable interface
    public static <E extends Comparable<E>> void bubbleSort(E[] list) {
        //Declare a boolean to keep track if needed to be swapped
        boolean swapped;
        do {
            swapped = false;

            //Loop through the list to compare elements
                for (int i = 0; i < list.length - 1; i++) {
                    //Compare current elements with the next
                    if (list[i].compareTo(list[i + 1]) > 0) {
                        //Swap elements if in wrong order
                        E temp = list[i];
                        list[i] = list[i + 1];
                        list[i + 1] = temp;
                        swapped = true;
                    }
                }
        //Continue until no more swaps needed
        } while (swapped);
    }

    //Bubble sort method using Comparator interface
    public static <E> void bubbleSort (E[] list, Comparator<? super E> comparator) {
        //Declare a boolean to keep track if needed to be swapped
        boolean needNextPass = true;

        //Loop through the list for multiple pass
        for (int j = 1; j < list.length && needNextPass; j++) {
            needNextPass = false;
            //Loop through the list to compare elements
            for (int i = 0; i < list.length - j; i++) {
                //Compare current elements with the next
                if (comparator.compare(list[i], list[i + 1]) > 0) {
                    //Swap elements if in wrong order
                    E temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    needNextPass = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Program sort the follow unordered lists: ");
        System.out.println("list = 1, 5, 10, 15, 20, 25, 30, 35");
        System.out.println("list1 = Sushi, Ramen, Soba, Tonkastu, Karaage, Okonomiyaki, Yakisoba");

        //Unsorted integer list
        Integer[] list = {1, 5, 10, 15, 20, 25, 30, 35};

        bubbleSort(list);

        //Print the sorted list
        System.out.println("Ordered list:");

        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();

        String[] list1 = {"Sushi", "Ramen", "Soba", "Tonkastu", "Karaage", "Okonomiyaki", "Yakisoba"};

        bubbleSort(list1);

        bubbleSort(list1, (s1, s2) -> s1.compareToIgnoreCase(s2));

        //Print the sorted list1
        for (int i = 0; i < list1.length; i++) {
            System.out.println(list1[i] + " ");
        }
    }
}
