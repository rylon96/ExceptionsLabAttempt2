package lab2;

/**
 * This class provides various services relating to name manipulation.
 * No output should be performed here.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class NameService {
    
    /**
     * Finds and returns the last name from within a full name. Caution: 
     * No validation is performed.
     * 
     * @param fullName - a name containing a first name and a last name
     * @return the last name
     * @throws IllegalArgumentException if fullName is null or empty or has 
     * fewer than two parts
     */
    public String extractLastName(String fullName) throws IllegalArgumentException{        
        
        String tokens[] = fullName.split(" ");
        
        if(fullName == null || fullName.isEmpty())
        { 
            throw new IllegalArgumentException("Cannot be empty");
        }    
        
        String lastName = tokens[tokens.length - 1];
        
        if(tokens.length < 2)
        {
            throw new IllegalArgumentException("Last Name Required");    
        }
        
        

        
        
        
        return lastName;
    }
    

    
    
}
