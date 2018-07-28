/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sofflix.exercises.ex11_4_exercise;

import java.util.ArrayList;

/**
 *
 * @author Omar
 */
public class ShoppingCart {
    public static void main(String[] args){   
        // Declare, instantiate, and initialize an ArrayList of Strings.  Print and test your code.
        ArrayList<String> items = new ArrayList();
        items.add("Shirt");
        items.add("Jeans");
        items.add("Socks");
        for(String item: items){
            System.out.println("item: "+ item);
        }
        // add (insert) another element at a specific index
        System.out.println("=================================");
        items.add(2, "Shorts");
        for(String item: items){
            System.out.println("item: "+ item);
        }
	// Check for the existence of a specific String element.  
        //   If it exists, remove it.
        if(items.contains("Jeans")){
            items.remove("Jeans");
        }
        System.out.println("=================================");
         for(String item: items){
            System.out.println("item: "+ item);
        }
    }
}
