/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knightkronshopping;


import java.util.Scanner;
import java.text.DecimalFormat;
import java.math.RoundingMode;

/**
 *
 * @author School
 */
public class KnightKronShopping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ConsoleRead = new Scanner(System.in);
        DecimalFormat RoundTwo = new DecimalFormat("#.##");
        RoundTwo.setRoundingMode(RoundingMode.CEILING);
                
        
        final double USB = 19.99;
        final double KEYBOARD = 49.99;
        final double COMPUTER_MOUSE = 25.99;
        final double TAX_CAN = 0.13;
        
        
        System.out.print("Enter the number of USBs you would like to purchase: ");
        int numUSBs = ConsoleRead.nextInt();

        System.out.print("Enter the number of Keyboards you would like to purchase: ");
        int numKeyboards = ConsoleRead.nextInt();

        System.out.print("Enter the number of Computer mice you would like to purchase: ");
        int numMice = ConsoleRead.nextInt();
        
        double subtotal = (USB * numUSBs) + (KEYBOARD * numKeyboards) + (COMPUTER_MOUSE * numMice);
        System.out.println("Subtotal: " + (RoundTwo.format(subtotal)));
        
        double tax = subtotal * TAX_CAN;
        System.out.println("Tax: " + (RoundTwo.format(tax)));
        
        double grandTotal = subtotal + tax;
        System.out.println("Grand Total: " + (RoundTwo.format(grandTotal)));
        
        

        
    }
    
}
