/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sofflix.exercises.ex08_2_exercise;

/**
 *
 * @author Hp
 */
public class ShoppingCart {
    public static void main(String[] args) {
        Item item1 = new Item();

        // Call the 3-arg setItemFields method and then call displayItem.
        item1.setItemFields("Shirt", 2, 450.00);
        item1.displayItem();

        // Call the 4-arg setItemFields method, checking the return value.  
        int value = item1.setItemFields("Shirt", 2, 450, 'R');
        System.out.println("Value: "+ value);

	// Test your code for both valid and invalid values
        if(value<0){
            System.out.println("invalid color code message");
        }else{
            item1.displayItem();
        }               
        
        value = item1.setItemFields("Shirt", 2, 450, ' ');
        
         if(value<0){
            System.out.println("invalid color code message");
        }else{
            item1.displayItem();
        }  
        
    }
}