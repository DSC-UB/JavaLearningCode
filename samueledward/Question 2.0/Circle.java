/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Samuel Edward
 */

import java.util.Scanner;

public class Circle {
    public static void main (String args[]) {
        // Declaration of varriable
        int radius, diameter;
        double circumfrence, area;
        double PI = 3.14159;
        
        // Getting varriable from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of a Circle: ");
        radius = sc.nextInt();
        
        //Output Assignment
        diameter = 2 * radius;
        circumfrence = PI * radius * 2;
        area = PI * radius * radius;
        
        //Printing all the requiered variable to the console
        System.out.println("The value for the diameter : " + diameter);
        System.out.println("The value for the circumfrence: " + circumfrence);
        System.out.println("The value for the area : " + area);
        
        
        
        
    
    }
    
}
