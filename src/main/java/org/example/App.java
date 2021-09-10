package org.example;
import java.util.Date;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Andre Jara
 */
public class App 
{
    public static void main( String[] args )
    {
        int year;
        int currentAge;
        int retiringAge;
        int yearsLeft;

        String currentAgeIn;
        String retiringAgeIn;

        Date date = new Date();
        Scanner sc = new Scanner(System.in);
        year = date.getYear() + 1900;

        System.out.print("What is your current age? ");
        currentAgeIn = sc.nextLine();
        currentAge = Integer.valueOf(currentAgeIn);

        System.out.print("At what age would you like to retire? ");
        retiringAgeIn = sc.nextLine();
        retiringAge = Integer.valueOf(retiringAgeIn);

        yearsLeft = retiringAge - currentAge;

        if(yearsLeft > 0)
        {
            System.out.println("You have " + yearsLeft + " years left until you can retire.");
            System.out.println("It's " + year + ", so you can retire in " + (year + yearsLeft));
        }
        else
        {
            System.out.println("You already can retire.");
        }

        sc.close();
    }
}
