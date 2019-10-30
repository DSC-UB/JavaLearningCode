package com.bryzz.dsc.arithmetic3;


import java.util.Scanner;
import  java.math.*;

class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter 10 numbers: ");
        int[] list = new int[10];
        int sum = 0;
        int pxt = 1;
        int average = 0;
        int smallest = 0, largest = 0;


        for(int i=0; i<list.length; i++) {
            list[i] = scanner.nextInt();
        }


        for(int item: list) {
            sum += item;
            pxt *= item;
        }

        largest = list[1];
        smallest = list[1];
        int temp = 0;
        for(int i=0; i<list.length; i++) {
            int num = list[i];

            if(num > largest) {
                largest = num;
            }

            if(num < smallest) {
                smallest = num;
            }

        }


        average = sum/list.length;


        System.out.printf("\n\nSum = %d\nAverage = %d\nProduct = %d\nSmallest = %d\nLargest = %d", sum, average, pxt, smallest, largest);


    }


}

/*

Write an application that inputs a given amount of integers from the user and
displays the sum, average, product, smallest and largest of the numbers.
[Note: The calculation of the average in this exercise should result in an integer representation of the average.
So, if the sum of the values of 3 integers is 7, the average should be 2, not 2.3333….].

The name of your program file should be arithmethic3.java


*/
