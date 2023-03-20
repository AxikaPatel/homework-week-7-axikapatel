package homeworkweek7;

import java.util.Scanner;

/** . Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 any other alphabet should be invalid entry
 9. Same as above program-8 using switch statement. **/

public class Programme9SwitchAlpha
{

    public static void main(String[] args)
    {
       //static object
        switchalpha();
    }

    //static method
    public static void switchalpha()
    {
    //calling scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any letter = ");
        char ch = scanner.next().charAt(0); // store memory and using charAt() convert string to char

        String alpha;
        switch (Character.toUpperCase(ch)) {
            case 'A':
                alpha = "America";
                System.out.println(alpha);
                break;
            case 'B':
                alpha = "Berlin";
                System.out.println(alpha);
                break;
            case 'C':
                alpha = "Canada";
                System.out.println(alpha);
                break;
            case 'D':
                alpha = "Denmark";
                System.out.println(alpha);
                break;
            case 'E':
                alpha = "East-Africa";
                System.out.println(alpha);
                break;
            case 'F':
                alpha = "France";
                System.out.println(alpha);
                break;
            default:
                System.out.println("Invalid City");
                scanner.close();
        }
    }



    }



