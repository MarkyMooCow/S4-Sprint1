

public class testCircle {
    public static void main(String[] args){
      
        Circle C1 = new Circle(6, "green");
        Circle C2 = new Circle(9, "blue");
        Circle C3 = new Circle();
        Circle C4 = new Circle(2.0);
        Circle C5 = new Circle(5, "yellow");

        // The copy constructor takes the initial value not the set value 
        Circle C6 = new Circle(C1);

        // you can use the "set" methods to input new values to a pre constructed instance s
        C1.setRadius(10);
        C1.setColor("blue");

        System.out.println("The Circle has radius of " + C4.getRadius() + " and an area of " + C4.getArea());
        System.out.println("The Circle is:" + C1);
        System.out.println("The Circle has a radius:" + C3.getRadius() + " an area of " + C3.getArea() + " and of color of " + C3.getColor());
        System.out.println(C1.getColor());
        C1.Display();
        C2.Display();
        C5.Display();
        System.out.println(C1.toString());
        C6.Display();

        

    }
    
   
    
}

// public static void main(String[] args) {

//     // with every inctance of "Student"  the memory locations are allocated for 
//     // the attributes built into the class 
//     Student S1 = new Student();
//     Student S2 = new Student();
//     // Student S3 = new Student();
//     // Student S4 = new Student();

//     S1.SetRecord("Mike", 19, "S123");
//     S2.SetRecord("Cody", 19, "S234");

    

//     S1.Display();
//     S2.Display();
//     // S3.Display();
//     // S4.Display();
