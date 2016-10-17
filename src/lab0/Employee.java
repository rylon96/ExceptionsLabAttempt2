package lab0;

/**
 * In this challenge you need to address the probability that at some
 * point the arguments to method parameters may not be valid. 
 * <p>
 * For example, String arguments may be null or empty; other objects may be 
 * null; or primitive numbers may be out of acceptable range.
 * <p>
 * You need to validate ALL method parameters to make sure any and all 
 * arguments are valid. The only exception is when any argument is acceptable 
 * based on requirements. Fix the code below using if logic to validate
 * method arguments and throw IllegalArgumentException or a custom
 * exception if the validation fails.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Employee {
    public static final int MIN_VACATION_DAYS = 1;
    public static final int MAX_VACATION_DAYS = 28;
    public static final int MIN_NAME_LENGTH = 2;
    public static final int MAX_NAME_LENGTH = 50;
    private String firstName;
    private String lastName;
    private String ssn;
    private int daysVacation;

    public Employee() {
        // initialize a bunch of default values
        firstName = "Unknown";
        lastName = "Unknown";
        ssn = "Unknown";
        daysVacation = 0;
    }

    public Employee(String firstName, String lastName, String ssn, int daysVacation) throws IllegalArgumentException {
        setFirstName(firstName);
        setLastName(lastName);
        setSsn(ssn);
        setDaysVacation(daysVacation);
    }
    
    public int getDaysVacation() {
        return daysVacation;
    }

    //Cannot be less than 0 or greater than 28
    public final void setDaysVacation(int daysVacation) throws IllegalArgumentException {
        if(daysVacation < MIN_VACATION_DAYS || daysVacation > MAX_VACATION_DAYS){throw new IllegalArgumentException("Vacation days cannot be less than 0 or more than 14");
        }        
        this.daysVacation = daysVacation;
    }

    public String getFirstName() {
        return firstName;
    }
    //First name cannot be null or empty and cannot be less than 2 characters or more than 50 characters
    public final void setFirstName(String firstName) throws IllegalArgumentException {
       if(firstName == null || firstName.isEmpty() || firstName.length() < MIN_NAME_LENGTH || firstName.length() > MAX_NAME_LENGTH){
           throw new IllegalArgumentException("Name cannot be empty/null and cannot be less than 2 characters or more than 50 characters");
       }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    //Last name cannot be null or empty and cannot be less than 2 characters or more than 50 characters
    public final void setLastName(String lastName)throws IllegalArgumentException {
       if(lastName == null || lastName.isEmpty() || lastName.length() < MIN_NAME_LENGTH || lastName.length() > MAX_NAME_LENGTH){
           throw new IllegalArgumentException("Name cannot be empty/null and cannot be less than 2 characters or more than 50 characters");
       }
        
        this.lastName = lastName;
    }

    public final String getSsn() {
        return ssn;
    }

    public final void setSsn(String ssn) {
        
        this.ssn = ssn;
    }
    
    
    
}
