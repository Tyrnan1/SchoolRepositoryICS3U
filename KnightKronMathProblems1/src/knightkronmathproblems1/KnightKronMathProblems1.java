/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knightkronmathproblems1;

import java.util.Scanner;

/**
 *
 * @author School
 */
public class KnightKronMathProblems1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ConsoleRead = new Scanner(System.in);
        //I'm used to C#
        
        
        System.out.println("This program will determine the area of a rectangle.\n");
        
        
            System.out.print("Enter a value for length: ");
            int length = ConsoleRead.nextInt();

            System.out.print("Enter a value for width: ");
            int width = ConsoleRead.nextInt();
            
        int area = length * width;
        System.out.println("The area of the rectangle is: " + area);
    }
    
}
