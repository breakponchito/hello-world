/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sofflix.exercises.ex11_1_exercise;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Omar
 */
public class ShoppingCart {
    public static void main(String[] args){
	// Declare a LocalDateTime object, orderDate
        LocalDateTime orderDate; 
        
	// Initialize the orderDate to the current date and time. Print it.
        orderDate = LocalDateTime.now();
        System.out.println(orderDate);
	// Format orderDate using ISO_LOCAL_DATE; Print it.
        String orderDateFormat = orderDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(orderDateFormat);
    }
}
