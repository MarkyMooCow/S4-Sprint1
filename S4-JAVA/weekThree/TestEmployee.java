package weekThree;

public class TestEmployee {
    public static void main(String[] args){
        Employee E1 = new Employee(1, "George", "Ruby", 50000);
        
        System.out.println(E1.toString());
        // DisplayCount is a static variable that belongs to the class and so can be called directly
        Employee.DisplayCount();
    }
    
}
