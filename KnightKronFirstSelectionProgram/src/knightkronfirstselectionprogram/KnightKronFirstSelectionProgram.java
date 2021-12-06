/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knightkronfirstselectionprogram;
import java.util.Scanner;

/**
 *
 * @author School
 */
public class KnightKronFirstSelectionProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan  = new Scanner(System.in);
        System.out.print("Please enter the amount spent: ");
        double moneySpent = scan.nextDouble();
        
        CalcInput(moneySpent);
        
        
    }
    
    static void CalcInput(double userInput)
    {
        System.out.println("\nYou spent: " + userInput);
        
        double discount  = 0;
        double discountSave = 0;
        
        if(userInput > 0 && userInput <= 40)
        {
            discount = .1;
            discountSave = userInput * discount;
        }
        else if(userInput > 40 && userInput <= 80)
        {
            discount = .2;
            discountSave = userInput * discount;
        }
        else if(userInput > 80 && userInput <= 120)
        {
            discount = .3;
            discountSave = userInput * discount;
        }
        else if(userInput > 120)
        {
            discount = .4;
            discountSave = userInput * discount;
        }
        
        System.out.println("You are saving: " + (discount * 100) + "%");
        System.out.println("You are saving: $" + discountSave);
        System.out.println("Your total is: $" + (userInput - discountSave) );
    }
    
}
