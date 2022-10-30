// LAB5 CALCULATOR

// A java class for a simple calculator program using a switch statement, The program
// must input 2 operands and an operator and perform a specific operation using a 
// switc statement. 


package JavaQandA;

import java.util.*;

public class Lab5 {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        double Operand1 = 0, Operand2 = 0, result = 0;
        char Operator;
        System.out.println("enter Operand 1:");
        Operand1 = in.nextInt();
        System.out.println("Enter Operand2:");
        Operand2 = in.nextInt();
        System.out.println("Choose an operator: +, -, *, or /");
        Operator = in.next().charAt(0);
        switch(Operator) {
            // performs addittion between numbers 
            case '+':
            result = Operand1 + Operand2;
            System.out.println(Operand1 + " + " + Operand2 + " = " + result);
            break;
            // performs subtraction between numbers
            case '-':
            result = Operand1 - Operand2;
            System.out.println(Operand1 + " - " + Operand2 + " = " + result);
            break;
            // performs multiplication between numbers 
            case '*':
            result = Operand1 * Operand2;
            System.out.println(Operand1 + " * " + Operand2 + " = " + result);
            break;
            // performs division between numbers 
            case '/':
            result = Operand1 / Operand2;
            System.out.println(Operand1 + " / " + Operand2 + " = " + result);
            break;
            default:
            System.out.println("Invalid operator!");
            break;
                }
                in.close();
       

    }
    
}

// enter Operand 1:
// 100
// Enter Operand2:
// 100 
// Choose an operator: +, -, *, or /
// *
// 100.0 * 100.0 = 10000.0

// enter Operand 1:
// 7
// Enter Operand2:
// 6
// Choose an operator: +, -, *, or /
// u
// Invalid operator!
