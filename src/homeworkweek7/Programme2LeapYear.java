package homeworkweek7;
/**
 *  Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */

import java.util.Scanner;

public class Programme2LeapYear
{
    int y; //instance variable
    public static void main(String[] args)
    {
        // instance object
        Programme2LeapYear programme2LeapYear = new Programme2LeapYear();
         programme2LeapYear.leap();
    }

    //No return no parameter method with scanner
    public void leap()
    {
        Scanner scanner = new Scanner(System.in); //calling scanner
        System.out.println("Enter the Year : ");
        y= scanner.nextInt(); //store value

        // logic for leap year
        if (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0) )
        {
            System.out.print("The year is leap year.");
        }
        else
        {
            System.out.println("The year is not a leap year.");
        }
        scanner.close();
    }
}
