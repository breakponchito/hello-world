/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sofflix.practices.practice_14_exceptions_1.utility;

/**
 *
 * @author Omar
 */
public class PlayerDatabaseException extends Exception{
    
    public PlayerDatabaseException(){}
    public PlayerDatabaseException(String message){
        super(message);
    }
}
