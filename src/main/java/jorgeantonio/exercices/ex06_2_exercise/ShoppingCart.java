/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex06_2_exercise;

public class ShoppingCart {

     public static void main(String args[]) {
        // Declare and initialize 2 Item objects
        Item item1 = new Item();
        Item item2 = new Item();
	
        item1.itemId = 1;
        item1.descr = "Playera de Brasil";
        item1.price = 500.00;
        item1.quantity = 5;
        
        item2.itemId = 1;
        item2.descr = "Playera de Mexico";
        item2.price = 1150.00;
        item2.quantity = 5;

	// Print both item descriptions and run code.
        System.out.println("The first description is " + item1.descr + "\n"
                           + "The second description is " + item2.descr);
        
	item1 = item2;
        
        System.out.println("The new description is " + item1.descr);

     }
 
} 