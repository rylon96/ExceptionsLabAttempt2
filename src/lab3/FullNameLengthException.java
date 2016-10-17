/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author L115student
 */
public class FullNameLengthException extends Exception{
    
    public FullNameLengthException(){
        
    }
    public FullNameLengthException(String message){
        super(message);
    }
    public FullNameLengthException(Throwable cause){
        super(cause);
    }
    public FullNameLengthException(String message, Throwable cause){
        super(message, cause);
        
    }
    
    public String getMessage()
    
}
