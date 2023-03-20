package homeworkweek7;

import java.util.Scanner;

/**
 *  Write a Java program which input any number between 1 to 7 and it print The Days
 * name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
 *  NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */

public class Programme13DayName {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); //calling scanner
        System.out.print("Input number between 1 to 7 : ");
        int day = scanner.nextInt();

        //calling object
        Programme13DayName programme13DayName = new Programme13DayName();
        programme13DayName.day1(day);

        scanner.close();
    }

    //calling method
    public void day1(int day)
    {
        String name = "";
        switch (day)
        {
            case 1 :
                name = "Monday";
                System.out.println(name);
                break;
            case 2 :
                name = "Tuseday";
                System.out.println(name);
                break;
            case 3 :
                name = "Wednesday";
                System.out.println(name);
                break;
            case 4 :
                name = "Thuseday";
                System.out.println(name);
                break;
            case 5 :
                name = "Friday";
                System.out.println(name);
                break;
            case 6 :
                name = "Saturday";
                System.out.println(name);
                break;
            case 7 :
                name = "Sunday";
                System.out.println(name);
                break;
            default:
                System.out.println("Week contains 1 to 7 days");
        }
    }
}
