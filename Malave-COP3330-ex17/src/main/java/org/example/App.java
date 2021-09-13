package org.example;
import java.util.Scanner;


/*
 *  UCF COP3330 Fall 2021 Assignment 17 Solution
 *  Copyright 2021 Jose Malave
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        final double alcohol_men = 0.73;
        final double alcohol_women = 0.66;
        final double legalAmount = 0.08;

        System.out.println( "Enter a 1 is you are male or a 2 if you are female:" );
        String genderIn= sc.nextLine();
        int gender = Integer.parseInt(genderIn);

        while (gender != 1 && gender != 2)
        {
            genderIn= sc.nextLine();
            gender = Integer.parseInt(genderIn);
        }


        System.out.println( "How many ounces of alcohol did you have?" );
        String ouncesIn= sc.nextLine();



        while (numericCheck(ouncesIn) != true)
        {
            ouncesIn= sc.nextLine();
        }

        int ounces = Integer.parseInt(ouncesIn);


        System.out.println( "What is your weight, in pounds?" );
        String weightIn= sc.nextLine();


        while (numericCheck(weightIn) != true)
        {
            weightIn= sc.nextLine();
        }

        int weight = Integer.parseInt(weightIn);



        System.out.println( "How many hours has it been since your last drink?" );
        String timeIn= sc.nextLine();


        while (numericCheck(timeIn) != true)
        {
            timeIn= sc.nextLine();
        }

        int time = Integer.parseInt(timeIn);


        double BAC;
        if(gender == 1)
        {
            System.out.println( ounces + " " + weight + " " + alcohol_men + " " + time );
             BAC = ounces * (5.14/weight) * alcohol_men - (0.015 * time);
        }
        else
        {
             BAC = ounces * (5.14/weight) * alcohol_women - (0.015 * time);
        }


        if (BAC < legalAmount)
        {
            System.out.println("Your BAC is " + BAC + "\n" +
                    "It is legal for you to drive.");
        }
        else
        {
            System.out.println("Your BAC is " + BAC + "\n" +
                    "It is not legal for you to drive.");
        }





    }






    public static boolean numericCheck(String string) {
        int intValue;

        if(string == null || string.equals("")) {
            return false;
        }

        try {
            intValue = Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e){ System.out.println("Try again.");}
        return false;
    }
}
