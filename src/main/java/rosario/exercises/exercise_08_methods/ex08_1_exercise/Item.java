
package rosario.exercises.exercise_08_methods.ex08_1_exercise;

public class Item {
    char color;
    public boolean setColor(char colorCode){
        if(colorCode == ' '){
            return false;
        }else{
            this.color = colorCode;
            return true;
        }
    }
    
}
