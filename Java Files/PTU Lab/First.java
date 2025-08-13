import java.util.Scanner;

// 1. Write a program to perform the following operations on two numbers input by the user:
//    - Addition
//    - Subtraction
//    - Multiplication
//    - Division

public class First {

    public static void main(String[] args)
    {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the 1st number: ");
    int a = input.nextInt();

    System.out.print("Enter the 2nd number: ");
    int b = input.nextInt();

    System.out.println("\n(i) Addition of "+a+" and "+b+" = "+(a+b));
    System.out.println("(ii) Substraction of "+a+" and "+b+" = "+(a-b));
    System.out.println("(iii) Multiplication of "+a+" and "+b+" = "+(a*b));
    System.out.println("(iv) Division of "+a+" and "+b+" = "+(a/b));

    input.close();
}
}