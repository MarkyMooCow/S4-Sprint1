package weekFour;

public class Instructor {
    private String firstName;
    private String lastName;
    private String officeNumber;

    public Instructor(String fn, String ln, String on){
        this.firstName = fn;
        this.lastName = ln;
        this.officeNumber = on;
    }
    public Instructor(Instructor Ins){
        this.firstName = Ins.firstName;
        this.lastName = Ins.lastName;
        this.officeNumber = Ins.officeNumber;
    }
    public void set(String fn, String ln, String on){
        this.firstName = fn;
        this.lastName = ln;
        this.officeNumber = on;
    }
    @Override
    public String toString() {
        return "Instructor firstName=" + firstName + ", lastName=" + lastName + ", officeNumber=" + officeNumber;
    }

    
}
