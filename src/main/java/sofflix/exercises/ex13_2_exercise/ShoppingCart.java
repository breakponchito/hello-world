/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sofflix.exercises.ex13_2_exercise;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 *
 * @author Hp
 */
public class ShoppingCart {
     ArrayList<Item> items = new ArrayList();
    
    public static void main(String[] args){
        ShoppingCart cart = new ShoppingCart();
        cart.fillCart();
        cart.removeItemFromCart("Trousers");
        
    }
    
    public void fillCart(){
        items.add(new Shirt(40.95,'M','R'));
        items.add(new Shirt(32.99,'M','Y'));
        items.add(new Trousers(59.99,34,'B',"Relaxed",'M'));
        items.add(new Trousers(75.50,8,'G',"Skinny",'F'));
    }
    
    public void removeItemFromCart(String desc){
        // remove all Trousers from the items list, then print out the list
        items.removeIf(new Predicate<Item>(){           
            public boolean test(Item item){
                if(item.getDesc().equals("Trousers")){
                    return true;
                }else{
                    return false;
                }
            }
        });
        
        System.out.println(items);
    }
}
