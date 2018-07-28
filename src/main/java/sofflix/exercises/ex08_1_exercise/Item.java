/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sofflix.exercises.ex08_1_exercise;

/**
 *
 * @author Hp
 */
public class Item {
    char color;
    
    // declare and code the setColor method
    public boolean setColor(char colorCode){
        if(colorCode == ' '){
            return false;
        }else{
            color = colorCode;
            return true;
        }
    }
}
