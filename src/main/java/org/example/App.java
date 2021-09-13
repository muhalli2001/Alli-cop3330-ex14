package org.example;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Muhammad Alli
 */
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        double tax =0;
        double total=0;
        double taxonobj=0;
        //ORDER AMOUNT
        Scanner p = new Scanner(System.in);
        System.out.println("What is the order amount?");
        float order = p.nextFloat();
        float subtotal = order;
        total = subtotal;

        //STATE
        Scanner s = new Scanner(System.in);
        System.out.println("What is the state? Capitalize BOTH letters in abbreviation");
        String State = s.nextLine();


        //if statement
        if((State).equals("WI")){
            System.out.printf("The subtotal is: $%.2f\n",subtotal);
            tax = 0.055;
            total = (tax*subtotal)+(subtotal);
            taxonobj = tax * subtotal;
            System.out.printf("The tax is: $%.2f\n", taxonobj);

        }
        total = Math.round(total * 100.0) / 100.0;
        System.out.printf("The total is: $%.2f", total);


    }

}
