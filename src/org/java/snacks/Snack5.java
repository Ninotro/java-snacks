package org.java.snacks;



public class Snack5 {
    public static void main(String[] args) {

        String newNumberString = "331392902321312312";
        long numeroFinale = 0;

        for (int i = 0; i < newNumberString.length() ; i++) {

            char singleNumber = newNumberString.charAt(i);



            int singleNumberInt = singleNumber - '0' ;

            numeroFinale = numeroFinale * 10 + singleNumberInt;



        }

        System.out.println(numeroFinale);
    }
}
