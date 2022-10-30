

public class Student {
    // Attributes
  
    // with every instance of the class "Student" these three attributes will be instantiated 
    private String Name;
    private int Age;
    private String RgNo;

    // Behaviour are Methods
    // Instance variables 

    public void SetRecord (String s, int a, String r) {
        this.Name = s;
        this.Age = a;
        this.RgNo = r;
    }

    public void Display() {
        System.out.println(this.Name + " is " + this.Age + " years and registrations number is " + this.RgNo);
    }

    public static void main(String[] args) {

        // with every inctance of "Student"  the memory locations are allocated for 
        // the attributes built into the class 
        Student S1 = new Student();
        Student S2 = new Student();
        // Student S3 = new Student();
        // Student S4 = new Student();

        S1.SetRecord("Mike", 19, "S123");
        S2.SetRecord("Cody", 19, "S234");

        

        S1.Display();
        S2.Display();
        // S3.Display();
        // S4.Display();
    }
    
}
