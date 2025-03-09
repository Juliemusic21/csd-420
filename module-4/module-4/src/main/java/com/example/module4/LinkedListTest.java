/*
Julie Sakai
CSD 420
Module 4 Assignment
1/20/25
 */

package com.example.module4;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {

    public static void main(String[] args) {
    //Test with 50,000 and 500,000 integers
    testLinkedListTraversal(50000);
    testLinkedListTraversal(500000);
}

public static void testLinkedListTraversal (int size) {
    LinkedList<Integer> linkedList = new LinkedList<>();
    for (int i = 0; i < size; i++) {
        linkedList.add(i);
    }

    System.out.println("Testing LinkedList traversal with " + size + " elements:");

    //Test the time it takes to traverse using an iterator
    long startTime = System.nanoTime();
    Iterator<Integer> iterator = linkedList.iterator();
    while (iterator.hasNext()) {
        iterator.next();
    }
    long endTime = System.nanoTime();
    long iteratorTime = endTime - startTime;
    System.out.println("Time using iterator: " + iteratorTime + " ns");

    //Test the time it takes to traverse using get(index) method
    startTime = System.nanoTime();
    for (int i = 0; i < linkedList.size(); i++) {
        linkedList.get(i);
    }
    endTime = System.nanoTime();
    long getTime = endTime - startTime;
    System.out.println("Time using get(index): " + getTime + " ns");

    //Display the results
    System.out.println("Testing LinkedList traversal " + size + " elements:");
    System.out.println("Traversal time using iterator: " + iteratorTime + " ns");
    System.out.println("Traversal time using get(index): " + getTime + " ns");
    System.out.println("Time difference (get(index) - iterator): " + (getTime - iteratorTime) + " ns\n");

    /*
    The result is using the iterator to traverse the LinkedList was more efficient than using get(index) method.
    Using the get(index) method in the LinkedList it requires to traverse from the beginning of the list to the specified index each time,
    which takes longer for a larger lists.
    The results for 50,000 integers the traversal time using iterator was lower compared to traversal time with get(index).
    The result for 500.000 integers the traversal time using iterator was more efficient than using get(index) method.
    Using iterator for LinkedList traversal is more efficient than using get(index) method even when the size of the list increases.
     */
    }
}
