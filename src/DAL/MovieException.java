/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

/**
 *
 * @author Admin
 */
public class MovieException extends Exception {
    
    public MovieException(){}
    
    public MovieException(String msg){
        super(msg);
    }
}
