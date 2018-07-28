/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex12_3_exercise;

/**
 *
 * @author Omar
 */
public class ShoppingCart {
    public static void main(String[] args) {
         // declare and instantiate a Shirt object using an Item reference type
        Shirt shirtReference = new Shirt(200, 'S', 'B');
        
        // call the display method on the object, then the getColor method
        shirtReference.display();
        if(shirtReference instanceof Shirt){
            Shirt shirt = (Shirt) shirtReference;
            String color = shirt.getColor();
            System.out.println("The color shirt is: "+ color);
        }else{
            System.out.println("The object is not a Shirt");
        }
    }
}
