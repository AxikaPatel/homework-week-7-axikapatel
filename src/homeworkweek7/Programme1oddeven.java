package homeworkweek7;

import java.util.Scanner;

/**Write a java program that tells us that Input number is odd or even?
         HINT: use ternary operator (? :)**/

public class Programme1oddeven
{
     public static void main(String[] args)
     {
          Scanner scanner = new Scanner(System.in); //caling scanner
          System.out.print("Enter the Number = ");
          int n1 = scanner.nextInt(); //store value

          //calling instance method and create object
          Programme1oddeven programme1oddeven = new Programme1oddeven();
          String result1 = programme1oddeven.oddeven(n1);
          System.out.print(n1 + " is " + result1+" number.");

          scanner.close();
     }

     //instance method with return with parameter
     public String oddeven(int num)
     {
         //odd even using ternary operator
         String  result;
         result = (num % 2 == 0) ?  "Even"  : "Odd";
         return result ;
     }
}
