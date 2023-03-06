package lv.acodemy.classroom;

public class IfElse {
    public static void main(String[] args) {
        // IF
        /*
        if(condition) {
        code to be executed
         */

        boolean x = 5 > 2;
        System.out.println(x);

        if (x) {
            System.out.println("Yes, 5 is more than 2");
        }

        int number = 20;
        if (number % 2 == 0) {
            System.out.println("Number:" + number + " is even");
        } else {
            System.out.println("Number: " + number + " is NOT even number");
        }


        boolean isSummer = false;
        if (isSummer) {
            System.out.println("Summer months: June, July, August");

        }

        // IF-ELSE-IF
        /*
        if(condition) {
        code to be executed
        } else if(condition)
        } else {
        code to be executed
        }
         */

        int age = 0;
        if (age <= 17) {
            System.out.println("You are not allowed here!");
        } else if (age < 0) {
            System.out.println("Who are you?");
        } else {
            System.out.println("Welcome to our shop!");
        }
        // IF John = Hello John!
        // IF Zina = You are not welcome!
        // All others = Text

        String name = "Max";
        switch (name) {
            case "John":
                System.out.println("Hello John!");
                break;
            case "Zina":
                System.out.println(" You are not welcome!");
                break;
            default:
                System.out.println("Very intereseting name!");
                break;
        }

        //switch case;
        int currentMonth = 1;
        if (currentMonth == 12 || currentMonth == 1 || currentMonth == 2) {
            System.out.println("This is winter");
        } else if (currentMonth == 3 || currentMonth == 4 || currentMonth == 5) {
            System.out.println("This is spring");
        } else if (currentMonth == 6 || currentMonth == 7 || currentMonth == 8) {
            System.out.println("This is summer");
        } else if (currentMonth == 9 || currentMonth == 10 || currentMonth == 11) {
            System.out.println("This is autumn");
        } else {
            throw new IllegalStateException("Unexpected value: " + currentMonth);
        }

        // IF student1 = "John" and student2 = "Max"
        // Print: they will work together
        // &&;

        String student1 = "John";
        String student2 = "Max";
        if(student1.equals("John") && student2.equals("Max")) {
            System.out.println("They will work together");
        }


    }}
