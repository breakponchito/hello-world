package rosario.exercises.exercise_11_arraysloopsdates.ex11_4_exercise;

import java.util.ArrayList;

public class ShoppingCart {
    public static void main(String[] args){   
        // Declare, instantiate, and initialize an ArrayList of Strings.  Print and test your code.
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Rosario");
        arrayList.add("Cruz");
        arrayList.add("Espinoza");
        System.out.println(arrayList);
        // add (insert) another element at a specific index
        arrayList.add(0,"My name is: ");
        System.out.println(arrayList);

	// Check for the existence of a specific String element.  
        //   If it exists, remove it.
        if(arrayList.contains("Espinoza")){
            arrayList.remove("Espinoza");
        }
        System.out.println(arrayList);
    }
}
