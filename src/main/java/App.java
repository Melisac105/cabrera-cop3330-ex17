/*
UCF COP3330 Summer 2021 Assignment 1 Solution
Copyright 2021 first_name last_name

Exercise 17 - Blood Alcohol Calculator
Sometimes you have to perform a more complex calculation based on some provided inputs and then use that result to make a determination.

Create a program that prompts for your weight, gender, total alcohol consumed (in ounces), and the amount of time since your last drink. Calculate your blood alcohol content (BAC) using this formula

BAC = (A × 5.14 / W × r) − .015 × H

Example Output

Enter a 1 is you are male or a 2 if you are female: 1
How many ounces of alcohol did you have? 3
What is your weight, in pounds? 175
How many hours has it been since your last drink? 1

Your BAC is 0.049323
It is legal for you to drive.


Enter a 1 is you are male or a 2 if you are female: 1
How many ounces of alcohol did you have? 5
What is your weight, in pounds? 175
How many hours has it been since your last drink? 1

Your BAC is 0.092206
It is not legal for you to drive.

Constraint
Prevent the user from entering non-numeric values.
 */

import util.Calculations;
import util.Output;
import util.UsrInput;

public class App {

    public static void main(String[] args) {
        int gender = UsrInput.getGender();
        int ounces = UsrInput.getOunces();
        int weight = UsrInput.getWeight();
        int hoursLastDrink = UsrInput.getHourLastDrink();
        double bac = Calculations.getBAC(ounces, weight, hoursLastDrink, gender);
        Output.printOutput(bac);
    }
}
