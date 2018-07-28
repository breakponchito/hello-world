
package rosario.exercises.exercise_11_arraysloopsdates.ex11_2_exercise;

public class ShoppingCart {
    public static void main(String[] args) {
        String name;
        int age;
        if(args.length <2){
            System.out.println("2 arguments are required.");
        }else{
            name = args[0];
            age = Integer.parseInt(args[1]);
            System.out.println("name: "+name);
            System.out.println("age: "+age);
        }
    }
}
