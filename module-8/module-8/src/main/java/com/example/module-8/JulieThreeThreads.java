/*
Julie Sakai
Module 8 Assignment
2/15/25
 */

package com.example.module8assignment;

import javax.swing.*;

public class JulieThreeThreads extends JFrame {
    private JTextArea textArea;

    public JulieThreeThreads() {
        setTitle("Three Threads Output");
        setSize(700, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        textArea = new JTextArea();
        add(new JScrollPane(textArea));

        //Create the three threads
        new Thread(new LetterThread()).start();
        new Thread(new NumberThread()).start();
        new Thread(new SymbolThread()).start();
    }

    private class LetterThread implements Runnable {
        public void run() {
            //Output 10,000 random letter characters to the text area
            for (int i = 0; i < 10000; i++) {
                textArea.append(String.valueOf(getRandomChar()));
            }
        }
    }

    private class NumberThread implements Runnable {
        public void run() {
            //Output 10,000 random number digits to the text area
            for (int i = 0; i < 10000; i++) {
                textArea.append(String.valueOf(getRandomDigit()));
            }
        }
    }

    private class SymbolThread implements Runnable {
        public void run() {
            //Output 10,000 random symbol to the text area
            for (int i = 0; i < 10000; i++) {
                textArea.append(String.valueOf(getRandomSymbol()));
            }
        }
    }

    //Select the random letter characters
    private static char getRandomChar() {
        String charArray = "abcdefghijklmnopqrstuvwxyz";
        int index = (int) (Math.random() * charArray.length());
        return charArray.charAt(index);
    }

    //Select the random numbers digits
    private static char getRandomDigit() {
        String digitArray = "0123456789";
        int index = (int) (Math.random() * digitArray.length());
        return digitArray.charAt(index);
    }

    //Select the random symbols characters
    private static char getRandomSymbol() {
        String symbolArray = "!@#$%&*";
        int index = (int) (Math.random() * symbolArray.length());
        return symbolArray.charAt(index);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new JulieThreeThreads().setVisible(true));
    }
}
