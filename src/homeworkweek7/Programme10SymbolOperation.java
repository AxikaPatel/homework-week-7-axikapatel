package homeworkweek7;

/** .Write a java program to input any two number and ask user to enter their symbol (+, -,
 /, *) find addition, Subtraction, multiplication and division according to their symbol
 (using if else) **/

import java.util.Scanner;

public class Programme10SymbolOperation
{

    public static void main(String[] args)
    {
           //calling object
            Programme10SymbolOperation programme10SymbolOperation = new Programme10SymbolOperation();
            programme10SymbolOperation.symboloperation();
    }

    //instance method
    public void symboloperation()
    {
        //calling scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input No1 = ");
        double n1 = scanner.nextDouble(); //store value
        System.out.print("Input No2 = ");
        double n2 = scanner.nextDouble(); //store value
        System.out.print("Enter any of (+ , - , * , /) Operator =  ");
        char opration = scanner.next().charAt(0);
        double result;

        //nested if condition
        if( opration == '+' )
        {
            result = n1 + n2;
            System.out.println("Addition of " + n1 + " + " + n2 + " = " + result);
        }
        else if ( opration == '-')
        {
            result = n1 - n2;
            System.out.println("Subtraction of " + n1 + " - " + n2 + " = " + result);
        }
        else if (opration == '*')
        {
            result = n1 * n2;
            System.out.println("Multiplication of " + n1 + " * " + n2 + " = " + result);
        }
        else if (opration == '/')
        {
            result = n1 / n2;
            System.out.println("Divison of " + n1 + " / " + n2 + " = " + result);
        }
        else
        {
            System.out.println("Invalid Operator");
        }
        scanner.close();
    }

}
