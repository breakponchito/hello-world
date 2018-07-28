
package sofflix.exercises.ex04_2_exercise;

public class ShoppingCart {
    
    public static void main(String[] args) {
        String custName = "Mary Smith";
        String itemDesc = "Shirt";
        String message = custName+" wants to purchase a "+itemDesc;
        
        // Declare and initialize numeric fields: price, tax, quantity, and total.   
        double price = 5.0;
        double tax = 1.16;
        int quantity = 1;
        double total;
        
        // Modify message to include quantity 
        message = custName+" wants to purchase a "+ quantity +" "+ itemDesc;
        
        System.out.println(message);
        
        // Calculate total and then print the total cost
        total = price * quantity * tax;
        
        System.out.println("Total cost with tax is:"+total);
        
    }    
}
