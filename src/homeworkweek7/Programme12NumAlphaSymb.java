package homeworkweek7;

/**
 *  Write a program that tells us input value is number or an alphabet or symbol.
 */

import java.util.Scanner;

public class Programme12NumAlphaSymb
{
    public static void main(String[] args)
    {
        //calling instance object
       Programme12NumAlphaSymb programme12NumAlphaSymb = new Programme12NumAlphaSymb();
       programme12NumAlphaSymb.numalphasymb();
    }

    //instance method
    public void numalphasymb()
    {
        Scanner scanner = new Scanner(System.in);// Calling scanner
        System.out.println("Enter any number or alphabet or symbol =  ");
        char ch = scanner.next().charAt(0); // store memory and using charAt() convert string to char

        //nested if
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'z')) //logic for alphabet
        {
            System.out.println(ch + " is a Alphabet.");
        }
        else if (ch >= '0' && ch <= '9') //logic for numeric
            {
                System.out.println(ch + " is a Numeric");
            }
            else
            {
                System.out.println(ch + " is a Symbol");
            }
            scanner.close();
    }
}
