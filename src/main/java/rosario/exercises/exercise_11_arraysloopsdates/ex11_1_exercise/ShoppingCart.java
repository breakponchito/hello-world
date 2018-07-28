package rosario.exercises.exercise_11_arraysloopsdates.ex11_1_exercise;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class ShoppingCart {
    public static void main(String[] args) {
        // Declare a LocalDateTime object, orderDate
        LocalDateTime orderDate;
        // Initialize the orderDate to the current date and time. Print it.
        orderDate = LocalDateTime.now();
        System.out.println(orderDate);
        // Format orderDate using ISO_LOCAL_DATE; Print it.
        System.out.print(orderDate.format(DateTimeFormatter.ISO_LOCAL_DATE));

    }
}