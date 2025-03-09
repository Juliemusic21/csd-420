package com.example.demo;

/*
Julie Sakai
CSD 420
Module 1 Programming Assignment
1/12/25
*/

 import java.io.DataOutputStream;
 import java.io.FileOutputStream;
 import java.io.IOException;
 import java.util.Date;
 import java.util.Random;

 public class WriteData {
     public static void main(String[] args) {
         String filename = "JulieSakai.datafile.dat";
         try (DataOutputStream out = new DataOutputStream(new FileOutputStream(filename))) {
             Random random = new Random();

             //Writing five random integers
             out.writeInt(5);
             for (int i = 0; i < 5; i++) {
                 out.writeInt(random.nextInt(100));
             }

             //Writing current date
             Date currentDate = new Date();
             out.writeLong(currentDate.getTime());

             //Writing five random double values out.writeInt(5);
             for (int i = 0; i < 5; i++) { out.writeDouble(random.nextDouble() * 100);
             }
             System.out.println("Data written to file successfully.");

         } catch (IOException e) { System.out.println("An error occurred: " + e.getMessage());
     }
 }
}
