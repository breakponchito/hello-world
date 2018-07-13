
package ex08_1_exercise;

public class ShoppingCart {
    public static void main(String[] args){
        Item item1 = new Item();
        if(true == item1.SetColor('e')){
            System.out.println("THE NEW COLOR IS " + item1.color);
        }else{
            System.out.println("INVALID COLOR");
        }
        
        // Call the setColor method on item1. Print the new color value from
        //   item1 if the method returns true.  Otherwise print an "invalid color"
	//   message.


       // Test the class, using both valid and invalid colors.
       
        
    }
}
