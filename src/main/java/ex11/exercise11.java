/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dave Edouard
 */

package ex11;

import java.util.Scanner;

public class exercise11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("How many euros are you exchanging? ");
        double euros = input.nextDouble();
        System.out.print("What is the exchange rate? ");
        double rate = input.nextDouble();

        double conversion = euros*rate;

        System.out.print(euros+" euros at an exchange rate of "+rate+" is "+String.format("%.2f",conversion)+" U.S. dollars");

    }
}
