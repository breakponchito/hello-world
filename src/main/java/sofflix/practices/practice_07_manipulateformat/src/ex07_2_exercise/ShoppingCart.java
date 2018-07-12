/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex07_2_exercise;

/**
 *
 * @author Hp
 */
public class ShoppingCart {
    public static void main (String[] args){
        String custName = "Steve Smith";
        String firstName;
        int spaceIdx;
        StringBuilder sb;
       
        spaceIdx = custName.indexOf(" ");
        firstName = custName.substring(0, spaceIdx);
        System.out.println(firstName);
          
	//Instantiate and initialize sb to firstName.
        sb = new StringBuilder(firstName);
	// Put the full name back together, using StringBuilder append method.
        String lastName = " Smith";
        sb.append(lastName);
        System.out.println("Complete Name: "+ sb);
	//   You can just enter the String literal for the last name.
        sb = new StringBuilder(firstName);
        sb.append(custName.substring(custName.indexOf(" ")));
	//   Print the full name.
        System.out.println("Complete Name: "+ sb);
    }
}
