

// Overloaded method declarations 

public class MethodOverload {
    // testing overloaded square methods\
    public static void main(String[] args){
        System.out.printf("Square of integer 8 is %d\n", square(8));
        System.out.printf("Square of double 9.5 is %f\n", square(9.5));
    }

    //  square method with int argument 
    public static int square(int intValue){
        System.out.printf("\nCalled square with int argument: %d\n", intValue);
        return intValue * intValue;
    }
    // square method with double argument
    public static double square(double doubleValue){
        System.out.printf("\nCalled square with double argument: %f\n", doubleValue);
        return doubleValue * doubleValue;
        // end of method 
    }
    
}
