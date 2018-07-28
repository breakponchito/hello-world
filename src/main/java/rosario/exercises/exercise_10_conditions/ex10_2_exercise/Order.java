
package rosario.exercises.exercise_10_conditions.ex10_2_exercise;

public class Order {

    static final char CORP = 'C';
    static final char PRIVATE = 'P';
    static final char NONPROFIT = 'N';
    String name;
    double total;
    String stateCode;
    double discount;
    char custType;

    public Order(String name, double total, String state, char custType) {
        this.name = name;
        this.total = total;
        this.stateCode = state;
        this.custType = custType;
        calcDiscount();
    }

    public String getDiscount() {
        return Double.toString(discount) + "%";
    }

    // Code the calcDiscount method.
    public void calcDiscount() {
        if (total > 900) {
            if (NONPROFIT == custType) {
                discount = 10.0;
            } else if (PRIVATE == custType) {
                discount = 7.0;
            }
        } else if (CORP == custType && total < 500) {
            discount = 8.0;
        } else if (total < 900) {
            if (NONPROFIT == custType) {
                discount = 5.0;
            } else if (PRIVATE == custType) {
                discount = 0.0;
            } else if (CORP == custType && total > 500) {
                discount = 5.0;
            }
        }
    }
}
