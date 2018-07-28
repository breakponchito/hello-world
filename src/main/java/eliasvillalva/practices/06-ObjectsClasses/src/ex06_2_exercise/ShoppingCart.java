package ex06_2_exercise;
/**
 *
 * @author evillalva
 */
public class ShoppingCart {
    public static void main(String args[]) {
        // Declare and initialize 2 Item objects
        Item item1 = new Item();
        Item item2 = new Item();
        item1.desc="descripcion 1";
        item2.desc="descripcion 2";
	// Print both item descriptions and run code.
        System.out.println("Descripcion 1: "+item1.desc);
        System.out.println("Descripcion 2: "+item2.desc);
	// Assign one item to another and run it again.
        item1 = item2;
        System.out.println("Descripcion 1: "+item1.desc);
        System.out.println("Descripcion 2: "+item2.desc);
     }
}
