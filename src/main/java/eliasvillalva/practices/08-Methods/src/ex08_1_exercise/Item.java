package ex08_1_exercise;
/**
 *
 * @author evillalva
 */
public class Item {
    char color;
    boolean setColor(char color) {
        if(color == ' '){
            return false;
        }else{
            this.color = color;
            return true;
        }
    }
}
