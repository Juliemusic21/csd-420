
/*
Julie Sakai
CSD 420
Module 1 Programming Assignment
1/12/25
*/

package com.example.demo;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
public class ReadData {
    public static void main (String[] args) {
        String filename = "JulieSakai.datafile.dat";
        try (DataInputStream in = new DataInputStream(new FileInputStream(filename))) {
            //Reading five random integers
            int intArrayLength = in.readInt();
            int[] intArray = new int[intArrayLength];
            System.out.println("5 Random Integers: ");
            for (int i = 0; i < intArrayLength; i++) {
                intArray[i] = in.readInt(); System.out.print(intArray[i] + " ");
            }
            System.out.println();

            //Reading current date
            long dateMilliseconds = in.readLong();
            Date currentDate = new Date (dateMilliseconds);
            System.out.print("Current Date: " + currentDate);

            //Reading five random double integers
            int doubleArrayLength = in.readInt();
            double[] doubleArray = new double [doubleArrayLength];
            System.out.println("5 Random Double Values: ");
            for (int i = 0; i < doubleArrayLength; i++) { doubleArray[i] = in.readDouble();
                System.out.print(doubleArray[i] + " ");
            }
            System.out.println();

            //Display error message if the program does not read successfully
            } catch (IOException e) {
            System.out.println("An error occurred check if the file exists: " + e.getMessage());
        }
    }
}
