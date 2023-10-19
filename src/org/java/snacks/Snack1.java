package org.java.snacks;

import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.println("Inserisci un numero");
             number = scanner.nextInt();

            if (number % 2 == 0  ) {

                System.out.println(number);

            } else if (number % 2 == 1) {


                System.out.println(number + 1);

            }
        }
        while ( number > 0 ) ;








    }
}
