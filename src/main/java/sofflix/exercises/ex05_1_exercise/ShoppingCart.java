/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sofflix.exercises.ex05_1_exercise;

/**
 *
 * @author Hp
 */
public class ShoppingCart {
    public static void main(String[] args) {
        String custName = "Mary Smith";
        String itemDesc = "Shirt";

	// numeric fields
        double price = 21.99;
        int quantity = 2;
        double tax = 1.04;
	double total;
	String message = custName+" wants to purchase "+quantity+" "+itemDesc;

	// Calculating total cost
        total = (price*quantity)*tax;

        
        // Declare outOfStock variable and initialize it
        boolean outOfStock = true;
        
        // Test quantity and modify message if quantity > 1.  
         if(quantity > 1){
             message = message + "s";
         }
        
        // Test outOfStock and notify user in either case.  
        if(outOfStock){
            System.out.println("The article is no longer available");
        }else{
            System.out.println(message);
            System.out.println("The total cost with taxes is: "+total);
        }                
    }
}
