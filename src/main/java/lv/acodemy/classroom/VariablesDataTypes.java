package lv.acodemy.classroom;

import java.util.Arrays;

public class VariablesDataTypes {
    public static void main(String[] args) {

        //byte data type
        byte myCurrentAge = 35;
        System.out.println(myCurrentAge);

        //short data type
        short salaryPerMonth = 1500;
        System.out.println(salaryPerMonth);

        //char short data type
       char firstNameLetter = 111; // "O"
       System.out.println(firstNameLetter);

       //int data type
        int dateOfBirth = 290787;
        System.out.println(dateOfBirth);

        //long data type
        long populationOfLatvia = 180000;
        System.out.println(populationOfLatvia);

        //float data type
        float LapTime = 32.30F;
        System.out.println(LapTime);

        //boolean is; has;
        boolean isWinter = false;
        boolean isSpring = true;
§
        // String
        String name = "Onna";
        String surName = "Ceslavska";

        // Concatenation
        String fullName = name + " " + surName;
        System.out.println(fullName);

        String fullNameWithAge = fullName + myCurrentAge;

        System.out.printf("My full name is: %s. I am %d years old", fullName, myCurrentAge);

        // *
        int a =100;
        int b = 20;
        int c = a * b;
        System.out.println(c);
        System.out.println(10 * 20);
        System.out.println(a * b);

        // / division
        c = a / b;
        System.out.println(c);

        // %
        int number = 10 % 4;
        System.out.println(number);

        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 77, 8, 9, 10};
        System.out.println(Arrays.toString(numbers));










    }
}
