package homeworkweek7;

/**
 * Write a Java program to calculate the average value of array elements.
 */
public class Programme19AverageValElem
{
    public static void main(String[] args)
    {
        int n1=0; //store value
        double total = 0;

        //instance object
         Programme19AverageValElem programme19AverageValElem = new Programme19AverageValElem();
         programme19AverageValElem.average(n1,total);
    }

    //calling instance method
    public void average(int sum, double ave)
    {
        int num [] = new int [] {2,3,5,7,-7};//multidimention array
        for (int i=0; i < num.length; i++) // for loop
        {
            sum = sum + num[i]; //sum of 5 number 10
            ave = sum/num.length; //average of 5 number
            System.out.println("Array values         "+num[i]);// array number 2,3,5,7,-7
        }
        System.out.println("---------------------------");
        System.out.println("Average of array Values = " +ave);//Average of array value = 2.0
    }
}
