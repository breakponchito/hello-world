/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex05_2_exercise;

/**
 *
 * @author Hp
 */

public class ShoppingCart {

    public static void main(String[] args) {
        // local variables
        String custName = "Mary Smith";
        String message = custName + " wants to purchase a several items.";

        //Declare and initialize the items String array
        String items [] = new String[]{"Shirt","Jeans","Shoes",""};
         


        // Change message to show the number of items purchased.
        
        message = "The items in total are " + items.length;
        
        System.out.println(message);
        // Print an element from the items array.  
        System.out.print(items[0]+"\n");
        
    }

}