

public class StaticExample2 {
    static int num;
    static String mystery;

    static{
        System.out.println("Static Block 1");
        num = 68;
        mystery = "Block 1";
    }
    static{
       System.out.println("Static Block 2");
       num = 98;
       mystery = "Block 2";
    }
    // The Static Blocks execute in the given order which means the first static block
    // executes before the second, that is why the first is overwritten by the second 
        public static void main(String[] args){
            System.out.println("Value of num:" + num);
            System.out.println("Value of mystery:" + mystery);
        }
    
    
}

// OUTPUT

// Static Block 1
// Static Block 2
// Value of num:98
// Value of mystery:Block 2
