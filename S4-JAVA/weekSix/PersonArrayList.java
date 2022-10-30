package weekSix;

public class PersonArrayList {

    // persons first and last name 
    private String lastName;
    private String firstName;

    // Constructor creates a person from a last and first name
    public  PersonArrayList(String first, String last){ // void was added and not in the original code 
        lastName = last;
        firstName = first;
    }

    // toString method returns information about the person
    public String toString(){
        return(firstName + " " + lastName);
        }
}
    

