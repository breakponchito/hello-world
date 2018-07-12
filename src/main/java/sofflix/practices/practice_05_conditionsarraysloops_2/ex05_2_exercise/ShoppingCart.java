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
         String[] clothes = {"Shirt","Pants","T-Shirt","Socks"};
        


        // Change message to show the number of items purchased.
        message = custName + " wants to purchase "+ clothes.length +" items";

        System.out.println(message);
        // Print an element from the items array.  
        System.out.println(custName +" wants to purchase a "+clothes[0]);
        
        //Si se ejecuta con las posicion 4 se genera una excepcion java.lang.ArrayIndexOutOfBoundsException: 4
    }
}

