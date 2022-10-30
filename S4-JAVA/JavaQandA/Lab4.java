// LAB4 ADD NUMBERS NND GIVE THEIR AVERAGE 

// A program to read in numbers until the number -999 is n encountered, The sum 
// of all numbers read until this point should be printed out and then the average


package JavaQandA;

import java.util.*;

public class Lab4 {
    public static void main(String args[]){
        double average = 0, sum = 0, number = 0, count = -1;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers and -999 to exit");
        while(number !=-999)

        {
            sum = sum + number;
            count++;
            
            number = in.nextInt();

        }
        
        average = sum/count;
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
        in.close();

    }
    
}

// Enter numbers and -999 to exit
// 1 2 3 4 5 -999
// Sum = 15.0
// Average = 3.0
