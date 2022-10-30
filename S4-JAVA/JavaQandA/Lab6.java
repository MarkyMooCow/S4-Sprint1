// LAB6 TELLS YOU HOW MANY OF SOMETHING YOU HAVE IN YOUR INPUTS 

// A java class that inputs 100 integers (from 0 to 99) into an array and prints
// the frequency of each number in the following manner:
// Number      Frequency
//   0          5 times
//   1          10 times
//   2          10 times
//   3          10 times


package JavaQandA;

import java.util.*;



public class Lab6 {
    public static void main(String args[])
    {
        int[] number = new int[100];
        int[] count = new int[10];
        int times = 100;

        Scanner in = new Scanner(System.in);
        System.out.println("enter 100 numbers");
        for(int i =0; i<times; i++)
        {
            number[i] = in.nextInt();
            if(number[i]==0)
            count[0]++;
            else if(number[i]==1)
            count[1]++;
            else if(number[i]==2)
            count[2]++;
            else if(number[i]==3)
            count[3]++;
            else if(number[i]==4)
            count[4]++;
            else if(number[i]==5)
            count[5]++;
            else if(number[i]==6)
            count[6]++;
            else if(number[i]==7)
            count[7]++;
            else if(number[i]==8)
            count[8]++;
            else if(number[i]==9)
            count[9]++;
            else
            {
                System.out.println("Enter a single digit number");
                i--;
            
            }
        }   
            for(int i =0; i<times;i++)
            {
            System.out.println("number " + i + " is present " + count[i] + " times ");
            }
        in.close();
    }
    
}

// 1
// 1
// 1
// 1 x50
// 4
// 4
// 4
// 4 x50
// number 1 is present 50 times
// number 4 is present 50 times


