package lv.acodemy.homework;

public class VariablesDataTypes{
    public static void main(String[] args) {

        // byte data type
        byte a = 100;
        System.out.println(a);
        byte size = 38;
        System.out.println(size);

        // short data type
        short price = 152;
        System.out.println(price);
        short paymentPerYear = 1500;
        System.out.println(paymentPerYear);

        // char data type
        char firstName = 111;
        System.out.println(firstName);
        char symbol = 'a';
        System.out.println(symbol);

        // int data type
        int age = 35;
        System.out.println(age);
        int weight = 58;
        System.out.println(weight);

        // long data type
        long numberOfEmployees = 172500;
        System.out.println(numberOfEmployees);
        long distance = 1234556;
        System.out.println(distance);

        // float data type
        float valuePi = 3.14F;
        System.out.println(valuePi);
        float temperatureOfWater = 75.00F;
        System.out.println(temperatureOfWater);

        // double data type
        double lengthOfJump = 25.3;
        System.out.println(lengthOfJump);
        double priceOfBread = 1.49;
        System.out.println(priceOfBread);

        // boolean data type
        boolean isBeautiful = true;
        System.out.println(isBeautiful);
        boolean haveCoffee = false;
        System.out.println(haveCoffee);

        // String data Type
        String name = "Onna";
        String surName = "Ceslavska";
        byte myCurrentAge = (35) ;

        String fullName = name + " " + surName;
        System.out.println(fullName);


        String fullNameWithAge = fullName + " " + myCurrentAge;
        System.out.println(fullNameWithAge);

        System.out.printf("My name is: %s. I am %d years old.\n", fullName, myCurrentAge);

        int g = 100;
        int b = 10;
        int c = g * b;
        System.out.println(c);
        System.out.println(g * b);

        int d = 20;
        int e = 5;
        int k = d / e;
        System.out.println(k);


    }
}
