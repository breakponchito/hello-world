/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sofflix.exercises.ex06_2_exercise;

import sofflix.exercises.ex06_1_exercise.Item;

/**
 *
 * @author Hp
 */
public class ShoppingCart {
     public static void main(String args[]) {
        // Declare and initialize 2 Item objects
        Item item1 = new Item("Shirt");
	Item item2 = new Item("Pants");

	// Print both item descriptions and run code.
        System.out.println("item1: "+ item1.descr);
        System.out.println("item2: "+ item2.descr);

	// Assign one item to another and run it again.
        item1 = item2;
        System.out.println("item1: "+ item1.descr);
        System.out.println("item2: "+ item2.descr);
     }
}
