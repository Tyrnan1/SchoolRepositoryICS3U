/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knightkronwaterandcomp;

import java.util.Scanner;

/**
 *
 * @author School
 */
public class KnightKronWaterAndComp {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ConsoleRead = new Scanner(System.in);
        
        System.out.println("This program will calculate how much water it takes to create a computer & monitor combo.\n");
        System.out.print("Did you know that it takes 1.5 tons of water to do exactly that? Let's calculate it!\nEnter the number of PC/Monitor combos: ");
        final double WATER_PER_COMBO = 1.5;
        
        int numCombo = ConsoleRead.nextInt();
        
        double waterUsed = numCombo * WATER_PER_COMBO;
        
        System.out.println("The total amount of water used for manufacturing is " + waterUsed + " tons!");
    }
    
}
