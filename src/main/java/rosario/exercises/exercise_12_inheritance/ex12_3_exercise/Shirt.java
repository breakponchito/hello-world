package rosario.exercises.exercise_12_inheritance.ex12_3_exercise;

public class Shirt extends Item{
    private char size;
    private char colorCode;
    
    public Shirt(double price, char size, char colorCode){
        super ("Shirt", price);
        this.size = size;
        this.colorCode = colorCode;
    }
    
    public void display(){
        super.display();
        System.out.println("\tSize: "+size);
        System.out.println("\tColorCode: "+ colorCode);
    } 
    
    // Code a public getColor method that converts the colorCode to a the color name
       // Use a switch statement.  Return the color name.
    public String getColor(){
        String color;
        switch(colorCode){
            case 'R':
                color ="Rosa";
                break;
            case 'V':
                color="Vino";
                break;
            case 'A':
                color="Azul";
                break;
            case 'B':
                color="Blanco";
                break;
            default:
                color="No existe";
        }
        return color;
    }

}
