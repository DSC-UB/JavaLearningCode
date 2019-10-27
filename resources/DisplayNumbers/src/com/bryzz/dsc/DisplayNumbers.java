package com.bryzz.dsc;

public class DisplayNumbers {

    public static void main(String[] args) {
        System.out.println("\n1 - 4 using one System.out.println()");
        onePrintln();

        System.out.println("\n\n1 - 4 using four System.out.print()");
        fourPrintln();

        System.out.println("\n\n1 - 4 using four System.out.printf()");
        printf();
    }

    public static void onePrintln() {
        System.out.println("1 2 3 4");
    }

    public static void fourPrintln() {
        int i = 1;
        for(i=1; i<=4; i++) {
            System.out.print(i + " ");
        }

    }

    public static void printf() {
        System.out.printf("%d %d %d %d",1, 2, 3, 4);
    }
}

