package com.bryzz.dsc.arithmetic2;

import java.util.Scanner;
import  java.math.*;

class Arithmetic2 {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter two numbers: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int sum = x + y;
        int dif = x - y;
        if(dif<0) {
            dif = y - x;
        }
        int pxt = x*y;
        int div = x/y;
        if(x == 0 ) {
            div = 0;
        }
        if(y == 0 ) {
            div = 0;
        }
        if(div < 1 ) {
            div = y/x;
        }

        System.out.printf("\n\nSum = %d\nDifference = %d\nProduct = %d\nQuotient = %d", sum, dif, pxt, div);


    }
}

/*
(Arithmetic) Write an application that asks the user to enter two integers, obtains them
        from the user and prints their sum, product, difference and quotient (division).

        Note that you should request a PR to this repo an your code will be merge in a branch with your name.
        Also, the name of your file should be arithmetic2-15.java*/