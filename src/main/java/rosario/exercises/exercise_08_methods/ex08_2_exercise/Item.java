
package rosario.exercises.exercise_08_methods.ex08_2_exercise;


public class Item {
    String desc;
    int quantity;
    double price;
    char colorCode = 'U';   //'U' = Undetermined

    public void displayItem() {
        System.out.println("Item: " + desc + ", " + quantity + ", "
                + price + ", "+colorCode);
    }

    public void setItemFields(String desc, int quantity, double price) {
        this.desc = desc;
        this.quantity = quantity;
        this.price = price;
    }

    public int setItemFields(String desc, int quantity, double price, char colorCode) {
        if(colorCode == ' '){
            return -1;
        }else{
            this.setItemFields(desc, quantity, price);
            this.colorCode = colorCode;
            return 1;
        }
    }
    
}
