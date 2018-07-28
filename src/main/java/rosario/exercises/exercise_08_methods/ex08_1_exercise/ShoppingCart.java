
package rosario.exercises.exercise_08_methods.ex08_1_exercise;

public class ShoppingCart {
    public static void main(String[] args){
        Item item1 = new Item();
        if(/*item1.setColor(' ')*/item1.setColor('U')){
            System.out.println(item1.color);
        }else{
            System.out.println("Invalid color.");
        }
    }
}
