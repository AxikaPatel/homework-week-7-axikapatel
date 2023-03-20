package homeworkweek7;

/**
 *   Write a Java program to sum values of an array.
 */
public class Programme18SumArray
{
    public static void main(String[] args)
    {
         int n1 = 0;// store value
        //calling instance object
          Programme18SumArray programme18SumArray = new Programme18SumArray();
          programme18SumArray.sumarray(n1);
    }

    //instance method
    public void sumarray(int sum)
    {
        int num [] = {1,2,0,10,45,78,100};//single array
        for (int i : num)//sum logic using for loop
        {
            sum += i;
            System.out.println("Array                " + i);// value 1,2,0,10,45,78,100
        }

        System.out.println("---------------------------");
        System.out.println("Sum of array Values = " +sum);//total of sum 236
    }

}
