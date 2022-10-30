// LAB3 INVESTMENT CALCULATOR

// A person invests $1000 (or replace $X in code for desired value) in a business
// yielding 5% profits every year. Assuming that all the profit is left on deposit 
// in the account, calculate and print the amount of money in the account at the
// end of the year for 10  years 


package JavaQandA;

// import java.util.*;

public class Lab3 {
    public static void main(String args[])
    {
        double investment = 5000.0;
        System.out.println("year   Amount on deposit");
        for(int i = 0;i<10;i++)
        {
            System.out.println(" " + i + "            " + Math.round(investment));
            investment = investment + (0.05*investment);
        }
    }
    
}

// OUTPUT FOR $5000

// year   Amount on deposit
//  0            5000
//  1            5250
//  2            5513
//  3            5788
//  4            6078
//  5            6381
//  6            6700
//  7            7036
//  8            7387
//  9            7757


