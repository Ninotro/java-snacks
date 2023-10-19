package org.java.snacks;

import java.util.Scanner;

public class Snack6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci un numero:");
        int seconds = scanner.nextInt();

        int minutes = seconds / 60;
        int hours = seconds / 3600;

        int minutesCalcolate = (minutes - (60*hours) );
        int secondsCalcolate = (seconds - (minutesCalcolate*60) - (hours*3600));

        if (seconds < 36000 &&  seconds >= 0  ) {
            System.out.println("0" + hours + "-hh-" + minutesCalcolate + "-mm-" + secondsCalcolate + "-ss");
        } else if (seconds >= 36000  ) {

            System.out.println( hours + "-hh-" + minutesCalcolate + "-mm-" + secondsCalcolate + "-ss");

        }


        scanner.close();
    }


}
