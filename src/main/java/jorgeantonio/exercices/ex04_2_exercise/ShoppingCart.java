/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex04_2_exercise;

/**
 *
 * @author Hp
 */
public class ShoppingCart {
     public static void main(String[] args) {
        String custName = "Jorge";
        String itemDesc = "Discs";
        String message = custName+" bought "+itemDesc;
        double price = 52.0 , tax = 5.2;
        int quantity = 2;
        double total;
        // Declare and initialize numeric fields: price, tax, quantity, and total.   
        
        
        // Modify message to include quantity 
        message = custName + " bought " + quantity + " " + itemDesc;
        
        System.out.println(message);
         
        total = price * quantity * tax;
        
        
        // Calculate total and then print the total cost
        
        System.out.println("and they cost " + total);
        
    } 
}
