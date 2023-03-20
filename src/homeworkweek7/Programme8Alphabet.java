package homeworkweek7;

import java.util.Scanner;

/** Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 any other alphabet should be invalid entry **/

public class Programme8Alphabet
{

    public static void main(String[] args)
    {
         //calling obj
        Programme8Alphabet programme8Alphabet = new Programme8Alphabet();
        programme8Alphabet.alphabet();
    }

    //calling method
    public void alphabet()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any letter = ");
        String city = scanner.nextLine();

       //nested if for checking letter
        if (city.equalsIgnoreCase("a"))
        {
            System.out.println("America");
        }
        else if(city.equalsIgnoreCase("b"))
        {
            System.out.println("Berlin");
        }
        else if (city.equalsIgnoreCase("c"))
        {
            System.out.println("Canada");
        }
        else if (city.equalsIgnoreCase("d"))
        {
            System.out.println("Denmark");
        }
        else if (city.equalsIgnoreCase("e"))
        {
            System.out.println("East-America");
        }
        else if (city.equalsIgnoreCase("f"))
        {
            System.out.println("France");
        }
        else
        {
            System.out.println("Invalid Entry");
        }

        scanner.close();



    }

}
