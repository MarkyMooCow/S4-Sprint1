

import java.util.Scanner;

public class FirstLec {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1 = 10;
    int num2 = 20;

    System.out.println("Enter first number");
    num1 = sc.nextInt();

    int num3 = num1 + num2;
    System.out.println("Hello World");
    System.out.println(num1 + num3);

    sc.close();
  }
}



