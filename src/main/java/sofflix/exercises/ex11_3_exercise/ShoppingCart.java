/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex11_3_exercise;

/**
 *
 * @author Omar
 */
public class ShoppingCart {
    Item[] items = {new Item("Shirt",25.60), 
                    new Item("WristBand",0), 
                    new Item("Pants",35.99)};
    
    public static void main(String[] args){
        ShoppingCart cart = new ShoppingCart();
        cart.displayTotal();
    }
    
    // Use a standard for loop to iterate through the items array, adding up the total price
    //    Skip any items that are back ordered.  Display the Shopping Cart total.
    public void displayTotal(){
        double total = 0.0;
        for (int i = 0; i < items.length; i++) {
            Item item = items[i];
            if(!item.isBackOrdered()){
                continue;
            }else{
                total += item.getPrice();
            }         
        }
        System.out.println("La suma total de los articulos es : "+ total);
    }
}
