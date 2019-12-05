//Compute the square and cubes
package classes;

/**
 *
 * @author Samuel Edward
 */
public class Square_and_Cubes {
    public static void main (String args []) {
  
    //Block for displaying the numbers itself
    System.out.print("The numbers are : ");
    for(int i =1; i<=10; i++){
        System.out.print( i);
        if (i < 10) {
        System.out.print(",");
        }else {
        System.out.println(".");
        }
        }
    //Block for displaying the square of those numbers
     System.out.print("The numbers for the square are : ");
    for(int i =1; i<=10; i++){
        System.out.print( i*i);
        if (i < 10) {
        System.out.print(",");
        }else {
        System.out.println(".");
        }
        }
    
    //Block for displaying the cube of those numbers
    System.out.print("The numbers for the cube are : ");
    for(int i =1; i<=10; i++){
        System.out.print( i*i*i);
        if (i < 10) {
        System.out.print(",");
        }else {
        System.out.print(".");
        }
        }
    
    
}
}
