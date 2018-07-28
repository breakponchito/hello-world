/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sofflix.exercises.ex11_2_exercise;

/**
 *
 * @author Omar
 */
public class ShoppingCart {
     public static void main(String[] args) {
        String name;
        int age;
        
       
        if(args.length <2){
             // Print an error message if fewer than 2 args are passed in.
            System.out.println("Se requieren dos argumentos de entrada...");
        }else{
            // Parse the args array to populate name and age.  
            name = args[0];
            age = Integer.parseInt(args[1]);
            System.out.println("name: "+name);
            System.out.println("age: "+age);
        }
        
	
        
        
    }
}
