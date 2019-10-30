package com.bryzz.dsc.numbers;

import java.util.Scanner;


class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

                System.out.println("Enter two numbers:\n");
                double x = scanner.nextDouble();
                double y = scanner.nextDouble();
                if(x > y) {
                    System.out.println(x + " Larger");
                }else if(y > x) {
                    System.out.println(y + " Larger");
                }else {
                    System.out.println("These numbers are equal");
                }

    }
}
