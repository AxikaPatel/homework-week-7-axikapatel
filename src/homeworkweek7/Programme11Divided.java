package homeworkweek7;

/**
 * . Write a java program to print the numbers between 1 to 100 which can be divided by 3
 * and 5 separately
 */

public class Programme11Divided
{
    public static void main(String[] args)
    {

        //calling instance object
        Programme11Divided programme11Divided = new Programme11Divided();
        programme11Divided.divided();
    }

    //instance method and for loop
    public void divided()
    {
        //Divided by 3
        System.out.println("Divided by 3 ");
        for ( int i = 1; i <= 100; i++) //for loop method
        {
            if (i % 3 == 0) //if condition using for divided by 3
            {
                System.out.print(i +" ," );
            }
        }

        // Divided by 5
        System.out.println("Divided by 5 ");
        for (int i = 1; i <= 100; i++) ///for loop method
        {
            if (i % 5 == 0) //if condition using for divided by 3
            {
                System.out.print(i +" ,");
            }
        }
    }
}
