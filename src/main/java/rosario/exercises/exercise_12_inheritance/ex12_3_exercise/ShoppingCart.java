package rosario.exercises.exercise_12_inheritance.ex12_3_exercise;

public class ShoppingCart {
    public static void main(String[] args) {
         // declare and instantiate a Shirt object using an Item reference type
        Shirt shirt = new Shirt(500.0, 'M', ' ');
        
        // call the display method on the object, then the getColor method
        shirt.display();
        if(shirt instanceof Shirt){
            Shirt shirt1 = shirt;
            String color = shirt1.getColor();
            System.out.println("\tColor the shirt: "+ color);
        }else{
            System.out.println("\tThe object is not a Shirt");
        }
    }
}
