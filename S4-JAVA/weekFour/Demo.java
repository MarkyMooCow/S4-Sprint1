package weekFour;

public class Demo {
    public static void main(String[] args){

        // Textbook class demos

        // parameterized constructor fro Textbook class 
        TextBook T1 = new TextBook("Intro to Java", "George", "Penguin");
        System.out.println(T1.toString());

        // copy constructor for Textbook class 
        TextBook T2 = new TextBook(T1);
        System.out.println(T2.toString());

        // set constructor for Textbook class 
        T1.set("Intro to Java", "Ruby", "Penguin");
        System.out.println(T1.toString());

        // Instructor class Demos 

        // parameterized
        Instructor Ins1 = new Instructor("George", "Ruby", "121");
        System.out.println(Ins1.toString());

        // copy
        Instructor Ins2 = new Instructor(Ins1);
        System.out.println(Ins2.toString());
        
        // setting 
        Ins1.set("George", "Ruby", "123");
        System.out.println(Ins1.toString());

        // Course class Demos 
        Course AdvancedJava = new Course("Advanced java programming", Ins1, T1);
        System.out.println(AdvancedJava);





    
    
    }
    
}
