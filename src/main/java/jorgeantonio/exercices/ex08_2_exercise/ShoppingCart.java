
package ex08_2_exercise;


public class ShoppingCart {
    public static void main(String[] args) {
        Item item1 = new Item();

        // Call the 3-arg setItemFields method and then call displayItem.
        item1.setItemFields("Saco Negro", 5, 250.00);
        item1.displayItem();

        // Call the 4-arg setItemFields method, checking the return value.  

         if(item1.setItemFields("Playera Gris", 50, 100.00, 'B') > 0){
             item1.displayItem();
         }else{
             System.out.println("Invalid Color");
         }
	// Test your code for both valid and invalid values
 
        
        
    }
}
