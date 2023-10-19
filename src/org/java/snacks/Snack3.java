package org.java.snacks;

public class Snack3 {
    public static void main(String[] args) {
        int [] numbers = {1,3,4,5,6,32,43,54,43,2321,4,5,6,7,};
        int somma = 0 ;
        for (int i = 0; i < numbers.length; i++) {


            if (i % 2 == 1) {
                somma = somma + numbers[i];
            }




        }

        System.out.println(somma);
    }
}
