package homeworkweek7;

import java.util.Arrays;

/**
 *  Write a Java program to sort a numeric array and a string array.
 */
public class Programme17SortNumericStringArray
{
    public static void main(String[] args)
    {
        //static object
        sort();
    }

    //static method
    public static void sort()
    {
        int[] num = {45,78,11,65,2,0,7,80};//store number to array
        String [] name = {"Java", "C", "C++", "Python", "VB", "VB.net"}; //store string to array

        //number  array sorting
        System.out.println("Original Number = " + Arrays.toString(num));
        Arrays.sort(num); //sort method to sort array
        System.out.println("Sorted Number   = " + Arrays.toString(num));

        System.out.println("=============================================");

        //String array sorting
        System.out.println("Original String = " + Arrays.toString(name));
        Arrays.sort(name);//sort method to sort array
        System.out.println("Sorted String   = " + Arrays.toString(name));
    }
}
