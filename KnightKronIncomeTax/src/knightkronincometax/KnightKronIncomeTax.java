/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knightkronincometax;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.math.RoundingMode;

/**
 *
 * @author School
 */
public class KnightKronIncomeTax {

    /**
     * @param args the command line arguments
     */
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        final double TAX_RATE1 = .15;
        final double TAX_RATE2 = .205;
        final double TAX_RATE3 = .26;
        final double TAX_RATE4 = .29;
        final double TAX_RATE5 = .33;
        
        Scanner ConsoleRead = new Scanner(System.in);
        DecimalFormat RoundTwo = new DecimalFormat("#.##");
        RoundTwo.setRoundingMode(RoundingMode.CEILING);
        
        System.out.println("This program will calculate the income tax you owe by your salary.");
        
        System.out.print("Enter your salary: ");
        
        int salary = ConsoleRead.nextInt();
        double taxOwed;
       
        if(salary <= 49020)
        {
            taxOwed = salary * TAX_RATE1;
            System.out.println("The income tax that you owe is " + (RoundTwo.format(taxOwed)));
        }
        else if(salary > 40920 && salary <= 98040)
        {
            taxOwed = ((salary - 49020) * TAX_RATE2) + 7353;
            System.out.println("The income tax that you owe is " + (RoundTwo.format(taxOwed)));
        }
        else if(salary > 98040 && salary <= 151978)
        {
            taxOwed = ((salary - 98040) * TAX_RATE3) + 17402.10;
            System.out.println("The income tax that you owe is " + (RoundTwo.format(taxOwed)));
        }
        else if(salary > 151978 && salary <= 216511)
        {
            taxOwed = ((salary - 151978) * TAX_RATE4) + 31425.18;
            System.out.println("The income tax that you owe is " + (RoundTwo.format(taxOwed)));
        }
        else
        {
            taxOwed = ((salary - 216511) * TAX_RATE5) + 50140.55;
            System.out.println("The income tax that you owe is " + (RoundTwo.format(taxOwed)));
        }
        
    }
    
}
