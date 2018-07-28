
package rosario.exercises.exercise_08_methods.ex08_2_exercise;


public class ShoppingCart {
    public static void main(String[] args) {
        Item item1 = new Item();
        item1.setItemFields("hola",2,50.0);
        item1.displayItem();

        // case valid
        if(item1.setItemFields("adios", 3, 100.0,'A') < 0){
            System.out.println("Invalid Color");
        }else{
            item1.displayItem();
        }

        // Case invalid
        //if(item1.setItemFields("adios", 3, 100.0,' ') < 0){
            //System.out.println("Invalid Color");
        //}else{
          //  item1.displayItem();
        //}

    }

}
