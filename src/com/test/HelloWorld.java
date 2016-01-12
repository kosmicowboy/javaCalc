/***********************************************************
 // Assignment :  calculator
 // by: Kyle Gray
 // Date: 1/11/2016
 // Description: Simple, basic calculator with only 4 functions
 //  Notes: any special things you want me to consider.
 //***********************************************************
 //************************************************************
concerns:
 */

package com.test;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int number1; // first number to add
        int number2; // second number to add
        char operator;
        int ans = 0;

        System.out.print("Enter first integer: ");
        number1 = input.nextInt();

        System.out.print("Enter an operator: + - * / or c for clear, q for quit ");
        operator = input.next().charAt(0);

        if ( operator == 'c' ) {
            System.out.print("Enter first integer: ");
            number1 = input.nextInt();

            System.out.print("Enter an operator: + - * / or q for quit ");
            operator = input.next().charAt(0);
        }

        if ( operator == 'q' ) {
            System.exit(0);
        }

        System.out.print("Enter second integer: ");
        number2 = input.nextInt();

        if ( operator == '+' ) {
            ans = number1 + number2;
        }
        if ( operator == '-' ) {
            ans = number1 - number2;
        }

        if ( operator == '*' ) {
            ans = number1 * number2;
        }

        if ( operator == '-' ) {
            ans = number1 - number2;
        }

        System.out.printf("Ans is %d", ans);

    }
}

///////////////////////////////////////////////////////////////////
///   End Of File
///////////////////////////////////////////////////////////////////