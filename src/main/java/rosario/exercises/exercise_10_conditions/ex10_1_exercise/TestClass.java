
package rosario.exercises.exercise_10_conditions.ex10_1_exercise;


public class TestClass {

    public static void main(String args[]) {
        int x = 4, y = 9;
        if (y / x < 3) {
            x += y;
        } else {
            x *= y;
        }
        System.out.println("After if stmt, x = " + x);
        
        //Operator ternary
        x = y/x<3?(x += y):(x *= y);
        System.out.println("Operator ternary, x = " + x);

    }
}
