package rosario.exercises.exercise_09_encapconstructors.ex09_2_exercise;

/**
 * Created by rosario
 */
public class Customer {
    private String name;
    private String ssn;

    public Customer(String name, String ssn){
        this.name = name;
        this.ssn = ssn;
    }

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }

    public String getSSN(){
        return ssn;
    }
}
