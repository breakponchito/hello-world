/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex08_1_exercise;

/**
 *
 * @author Hp
 */
public class ShoppingCart {

    public static void main(String[] args) {
        Item item1 = new Item();

        // Call the setColor method on item1. Print the new color value from
        //   item1 if the method returns true.  Otherwise print an "invalid color"
        //   message.
        if (item1.setColor(' ')) {
            System.out.println(item1.color);
        } else {
            System.out.println("Invalid color");
        }

        // Test the class, using both valid and invalid colors.
        if (item1.setColor('R')) {
            System.out.println(item1.color);
        } else {
            System.out.println("Invalid color");
        }

    }
}
