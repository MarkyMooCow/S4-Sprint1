package weekThree;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    // static variable
    private static int empCount;
    // all the objects of employess class will be sharing this same empCount

    // static block
    static{
        empCount = 0;
    }
    // loads, runs, assigns, when the class is loaded/compiled for the first tiem for once 
    // is used to intialize static variables 

    public Employee(int id, String fn, String ln, int salary){
        this.id = id;
        this.firstName = fn;
        this.lastName = ln;
        this.salary = salary;
        empCount++;
    }
    public int getId(){
        return id;
    }
    public String getFirstName(){
        return firstName;
    }
    public String lastName(){
        return lastName;
    }
    public int salary(){
        return salary;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setfirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public int AnnualSalary(){
        return(12*this.salary);
    }
    public int raiseSalary(int percent){
        return(this.salary = this.salary + (percent/100*this.salary));
    }
    public static void DisplayCount(){// a class method, means you do not need an object reference to call this method 
        System.out.println("Total number of Employees are " + empCount);
    }
    public String toString(){
        return("Emp Id - " + this.id + " has Emp name " + this.firstName + this.lastName + " and a salary of: " + salary);
    }
}
