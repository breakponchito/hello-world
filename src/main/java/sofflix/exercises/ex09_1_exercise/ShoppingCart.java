/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sofflix.exercises.ex09_1_exercise;

/**
 *
 * @author Hp
 */
public class ShoppingCart {
    private String name;
    private String ssn;
   
    // Encapsulate this class.  Make ssn read only.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    private void setSsn(String ssn) {
        this.ssn = ssn;
    }
    
    
}
