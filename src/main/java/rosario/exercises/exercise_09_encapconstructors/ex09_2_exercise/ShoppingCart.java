package rosario.exercises.exercise_09_encapconstructors.ex09_2_exercise;

/**
 * Created by rosario
 */
public class ShoppingCart {
    public static void main(String args[]) {
        Customer customer = new Customer("Rosario", "CUER931007MTLRSS08");
        System.out.println(customer.getName());
        System.out.println(customer.getSSN());

    }
}
