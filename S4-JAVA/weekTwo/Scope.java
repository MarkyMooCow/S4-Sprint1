

// Scope class demonstrates the field and local variable scopes  

public class Scope {
    // field that is accesible to all methods of this class 
    private static int x = 1;

    // main method creates and initializws local variable x
    // and calls methods useLocalVariable and useField 

    public static void main(String[] args) {
        int x = 5; // method's local variable x shadows field x 

        System.out.printf( "local x in main is %d\n", x);

        useLocalVariable();
        useField();
        useLocalVariable();
        useField();

        System.out.printf("\nlocal x in main is %d\n", x);
        }

        public static void useLocalVariable(){
            int x = 25;
            System.out.printf("\nlocal x on entering method useLocalVariavle is %d\nl", x);

        }
        public static void useField() {
            System.out.printf("\nfield x on entering method useField is %d\n", x);
        }

    
}
