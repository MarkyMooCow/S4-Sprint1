

public class Circle {
    //Instance Variables
    
    private double radius = 0;
    private String color = "red";
    
    //Methods
    
    //1. Contructors
    
    // THERE ARE THREE TYPES OF CONSTRUCTORS 

    // 1. defaults constructors
    // when you dont write any constructor and 
    // compiler adds it for you at the time of compilation

    //2. no argument constructor
    // they do not receive any arguments from the main 
    // constructors have same name as that of the class 
    // and no returntype not even void
    public Circle()
    {
        radius = 1.0;
        color = "red";
    }
    // parameterised constructors
    public Circle(double r)
    {
        this.radius = r;
    }
    // COPY CONSTRUCTOR 
    // a constructor that recives an object and creates its copy
    public Circle(Circle C)
    {
        this.radius = C.radius;
        this.color = C.color;
    
    }
    public Circle(double r, String c)
    {
        this.radius = r;
        this.color = c;
    }
    //2. Getter and setters
    
    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    //toString Method
    
    public String toString()
    {
        return(this.color + " and its radius is " + this.radius);
    }
    
    //other methods
    
    public void Display()
    {
        System.out.println(this.color + " " + this.radius);
    }
    
    public double getArea()
    {
        return(3.14*this.radius*this.radius);
    }
        
    }

    

