package util;

import java.util.Scanner;

public class UsrInput {
    static Scanner input = new Scanner(System.in);

    static public int getGender() {
        System.out.print("Enter a 1 is you are male or a 2 if you are female: ");
        try {
            return input.nextInt();
        }
        catch (Exception e){
            System.out.println("Please enter a valid input");
            return -1;
        }
    }

    static public int getOunces() {
        System.out.print("How many ounces of alcohol did you have? ");
        try {
            return input.nextInt();
        }
        catch (Exception e){
            System.out.println("Please enter a valid input");
            return -1;
        }
    }

    static public int getWeight() {
        System.out.print("What is your weight, in pounds? ");
        try {
            return input.nextInt();
        }
        catch (Exception e){
            System.out.println("Please enter a valid input");
            return -1;
        }
    }

    static public int getHourLastDrink() {
        System.out.print("How many hours has it been since your last drink? ");
        try {
            return input.nextInt();
        }
        catch (Exception e){
            System.out.println("Please enter a valid input");
            return -1;
        }
    }
}
