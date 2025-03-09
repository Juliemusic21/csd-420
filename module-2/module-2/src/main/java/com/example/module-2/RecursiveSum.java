/*
Julie Sakai
CSD 420
Module 12 Programming Redo Assignment
Redo for Module 2 Programming Assignment
3/2/25
 */

package com.example.module2db;

public class RecursiveSum {
    //Recursive method to calculate the sum
    public static double sum(int i) {
        if (i == 1) {
            System.out.print("1/2");
            return 0.5;
        } else {
            double term = (double) i / (i + 1);
            System.out.print(" + " + i + "/" + (i +1));
            return term + sum(i -1);
        }
    }
    //Method to display results for each different input values
    public static void displayResults(int i) {
        System.out.println("\nCalculating for m(" + i + "): ");
        double result = sum(i);
        System.out.print("The result of the sum m(" + i + ") is: " + String.format("%.2f", result) + "\n");
        }
    //Test and display sum method with different inputs values
    public static void main (String[] args) {
        int[] testValues = {4, 9, 14};
        for (int value : testValues) {
            displayResults(value);
        }
    }
}

