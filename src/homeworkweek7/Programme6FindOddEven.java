package homeworkweek7;

import java.util.Scanner;

/**. Write a java program to input any number and find out if it’s odd or even **/

public class Programme6FindOddEven
{
      public static void main(String[] args)
      {
          //calling scanner
          Scanner scanner = new Scanner(System.in);
          System.out.println("Enter the Number = ");
          int n1 = scanner.nextInt();//store value

          //static object
          Programme6FindOddEven.evenodd(n1);
          scanner.close();
      }

      //no return with parameter static method
      public static void evenodd(int num)
      {
          //even odd logic with if-else statement
          if (num % 2 == 0)
          {
              System.out.println("The given number  " + num  + " is Even");
          }
          else
          {
              System.out.println("The given number  " + num  + " is Odd");
          }
      }

}
