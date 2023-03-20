package homeworkweek7;

import java.util.Scanner;

/**
 * umber of Days In Month
 * Write a method isLeapYear with a parameter of type int named year.
 * The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
 * If the parameter is not in that range return false.
 * Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,
 * otherwise return false.
 * A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400
 */
public class Programme4DayMonthLeap
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year = ");
        int l1 = scanner.nextInt();

        //calling static object
        isLeapYear(l1);

        System.out.println("Enter month = ");
        int m1 = scanner.nextInt();
        System.out.println("Enter year = ");
        int y1 = scanner.nextInt();

        System.out.println(getDaysInMonth(m1,y1));
    }

    //satic method
    public static boolean isLeapYear(int year) {
        boolean leap = false;

        //nested if condition
        if (year > 1 && year > 1000)
        {
            if (year % 4 == 0)
            {
                if (year % 100 == 0)
                {
                    if (year % 400 == 0)
                    {
                        leap = true;
                    }
                    else {
                        leap = false;
                    }
                }
                leap = true;
            }
            else
                leap = false;
            System.out.println(year +" is a leap year ? - "+ leap);
        }
        else
            System.out.println("Please enter valid year");
        return leap;
    }

    public static int getDaysInMonth(int month, int year)
    {
        if (month < 1 || month >12 || year < 1 || year > 9999)
        {
            return -1;
        }
        int days = 0;
        switch(month)
        {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31;
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            case 2:
                if(isLeapYear(year) == true)
                {
                    days = 29;
                }else
                {
                    days = 28;
                }
                break;
            default:
                days = -1;
                break;
        }
        return days;
    }
}

