package homeworkweek7;

import java.util.Scanner;

/**
 * . Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */
public class Programme16PositNegZero
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);// Calling scanner
        System.out.print("Input any number = ");
        int n1 = scanner.nextInt(); // store value

        //calling instance object
       Programme16PositNegZero programme16PositNegZero = new Programme16PositNegZero();
       programme16PositNegZero.positnegzero(n1);
       scanner.close();
    }

    //calling instance method
    public void positnegzero(int num)
    {
        //nested if condition
        if (num > 0) //logic for positive
        {
            System.out.println(num + " number is positive.");
        }
        else if (num < 0 ) //logic for negative
            {
                System.out.println(num  + " number is a negative.");
            }
            else
            {
                System.out.println(" Number is zero");
            }
    }
}
