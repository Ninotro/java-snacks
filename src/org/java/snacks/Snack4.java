package org.java.snacks;

import java.util.Arrays;
import java.util.Scanner;

public class Snack4 {
    public static void main(String[] args) {
//        chiedo la parola

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita una parola per scoprire se è palindroma");
        String word = scanner.nextLine();
        // trasformo la stringa in un array di char
        char[] chars = word.toCharArray();


        char[] invertedChars = new char[word.length()];


        for (int i = word.length() - 1, j = 0; i >= 0 && j < word.length(); i--, j++) {

            invertedChars[j] = word.charAt(i);



        }

        if (word.equalsIgnoreCase(String.valueOf(invertedChars))) {
            System.out.println("La parola è palindroma");
        }

        else {
            System.out.println("la parola non è palindroma ");

        }



        scanner.close();
        }
    }

