/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex07_3_exercise;

/**
 *
 * @author Hp
 */
public class ShoppingCart {
     public static void main(String[] args){
        int int1;
        
	//  Declare and initialize variables of type long, float, and char.
        long lLong = 10_000_000_000_000L;
        float fFloat = 5.9F;
        char cChar = 'A';
        // Print the long variable.
        System.out.println("The value Long is: "+ lLong);
	// Assign the long to the int and print the int variable.
        int1 = (int) lLong;
        System.out.println("The Value int: "+ int1);
    }
}
