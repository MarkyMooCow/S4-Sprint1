// LAB7 CONVERTING DECIMAL TO BINARY AND VISE VERSA


// write a menu java programj to convert decimal to binary and vise versa:
// code to convert an integer from decomal number system(base-10) to binary 
// number system(base-2) and vise versa
// DESIRED OUTPUT:
// DECIMAL TO BINARY
// 2 outputs 10
// 3 outpults 11

// BINARY TO DECIMAL
// 10 outputs 2
// 11 outputs 3


package JavaQandA;

import java.util.*;

public class Lab7 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int num, dec = 0, i =0, rem, bin =0;
        // Binary to decomal
        System.out.println("Enter a binary number:");
        num = in.nextInt();
        int temp = num;
        while(temp != 0) {
            rem = temp % 10;
            temp /= 10;
            dec += rem * Math.pow(2, i);
            ++i;
        }
        System.out.println("Decimal Equivalent of " + num + " is " + dec);

        // Decimal to binary
        System.out.println(" Enter a Decimal number now: ");
        num = in.nextInt();
        temp = num;
        i = 1;
        while(temp != 0) {
            rem = temp % 2;
            temp /= 2;
            bin += rem * i;
            i *= 10;
        }
        System.out.println("Binary Equivalant of " + num + " is " + bin);
        in.close();
    }
    
}
