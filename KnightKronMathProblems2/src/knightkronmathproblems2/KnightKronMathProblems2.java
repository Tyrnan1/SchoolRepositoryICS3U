/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knightkronmathproblems2;

import java.util.Scanner;

/**
 *
 * @author School
 */
public class KnightKronMathProblems2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ConsoleRead = new Scanner(System.in);
        
        System.out.println("This program will determine the radius of a circle.\n");
        
        final double PI = 3.14;
        
            System.out.print("Enter a value for diameter: ");
            int diameter = ConsoleRead.nextInt();
        
        double radius = diameter * PI;
        System.out.println("The radius of the circle is: " + radius);
    }
    
}
