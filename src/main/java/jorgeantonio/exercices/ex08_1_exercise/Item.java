
package ex08_1_exercise;

public class Item {
    char color;
    
    public boolean SetColor(char colorCode){
        if(colorCode == ' '){
            return false;
        }else{
            this.color = colorCode;
            return true;
        }
        
    }
    
    
}
