

public class StaticExample {

    static int num;
    static String mystery;

    static{
        num = 97;
        mystery = "Static keyword in Java";
    }
    public static void main( String[] args){
        System.out.println("Value of num:" + num);
        System.out.println("Value of mystery:" + mystery);
    }
    
}
