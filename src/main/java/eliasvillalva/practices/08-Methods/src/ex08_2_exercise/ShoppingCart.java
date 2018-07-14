package ex08_2_exercise;
/**
 *
 * @author evillalva
 */
public class ShoppingCart {
    public static void main(String[] args) {
        Item item1 = new Item();
    // Call the 3-arg setItemFields method and then call displayItem.
        item1.setItemFields("20", 99, 10.5);
        item1.displayItem();
    // Call the 4-arg setItemFields method, checking the return value.  
        if(item1.setItemFields("30", 88, 11.8, ' ') < 0){
            System.out.println("Invalid color code.");
        }else{
            item1.displayItem();
        }
    // Test your code for both valid and invalid values   
    }
}
