package org.example;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Mary Brashear
 */
import java.util.Scanner;

//bmi = (weight / (height × height)) * 703

class Main {
    public static void main(String[] args) {
        //declare variables
        int height, weight;
        double bmi;
        Scanner sc = new Scanner(System.in);

        //scan user input, making sure they enter integers
        System.out.println("Please enter your height in inches: ");
        while(!sc.hasNextInt()){
            sc.next();
            System.out.println("Please enter your height in inches: ");
        }
        height = sc.nextInt();
        System.out.println("Please enter your weight in pounds: ");
        while(!sc.hasNextInt()){
            sc.next();
            System.out.println("Please enter your weight in pounds: ");
        }
        weight = sc.nextInt();

        //calculate bmi
        bmi = (weight / (height * height)) * 703;
        System.out.println("Your BMI is " + bmi + ".");

        //print findings
        if(bmi <= 18.5)
            System.out.println("You are underweight. You should see your doctor.");
        else if(bmi >= 25)
            System.out.println("You are overweight. You should see your doctor.");
        else
            System.out.println("You are within the ideal weight range.");


        sc.close();
    }
}