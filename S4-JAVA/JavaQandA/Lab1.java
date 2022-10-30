// LAB1 PRINTS AN OUTPUT DETERMINED BY AN INPUT 


// Write a java program which inputs a one digit number from theuser(i.e. 0-9)
// The program should then print that number in words, e.g. "Zerp" for 0, "One" 
// for 1, "Teo" for 2, and so on. If the user does not enter a one digit number
// then the program should display an erro, "Invalid number!"

package JavaQandA;
import java.util.*;

public class Lab1 {
    public static void main(String args[])
    {
        int number;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number between zero and nine");
        number = in.nextInt();

        if(number == 0)
        System.out.println("Zero");
        else if(number==1)
        System.out.println("One");
        else if(number==2)
        System.out.println("Two");
        else if(number==3)
        System.out.println("Three");
        else if(number==4)
        System.out.println("Four");
        else if(number==5)
        System.out.println("Five");
        else if(number==6)
        System.out.println("Six");
        else if(number==7)
        System.out.println("Seven");
        else if(number==8)
        System.out.println("Eight");
        else if (number==9)
        System.out.println("Nine");
        else
        System.out.println("not a valid number");
in.close();
    }
    
}

// OUTPUT

// 7
// Seven

// 78
// not a valid number

