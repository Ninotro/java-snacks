package org.java.snacks;

import java.util.Random;

public class Snack2 {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        String [] nameArray = {"Michele","Ludovico","Nino", "Francesco", "Alessandro"};
        String [] surnameArray = {"Bianchi","Rossi","Alessandrini","Maldini","Ronaldo"};

        for (int i = 0; i < 10 ; i++) {

            int randomNumberName = randomGenerator.nextInt(0, nameArray.length);
            int randomNumberSurname = randomGenerator.nextInt(0, surnameArray.length);
            System.out.println(nameArray[randomNumberName] + "-" + surnameArray[randomNumberSurname] );


        }
    }

}
