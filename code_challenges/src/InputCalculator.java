/**
 * Write a method called inputThenPrintSumAndAverage that does not have any parameters.
 *
 * The method should not return anything (void) and it needs to keep reading int numbers from the keyboard.
 *
 * When the user enters something that is not an int then it needs to print a message in the format "SUM = XX AVG = YY".
 *
 * XX represents the sum of all entered numbers of type int.
 * YY represents the calculated average of all numbers of type long.
 *
 * */

import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args)
    {

        inputThenPrintSumAverage();

    }

    public static void inputThenPrintSumAverage()
    {
        Scanner scanner = new Scanner(System.in);

        int sum=0;
        int counter=0;

        while(true)
        {
            System.out.println("Enter the numbers");
            boolean checknum=scanner.hasNextInt();
            if (checknum)
            {
                int number= scanner.nextInt();
                sum+=number;
                counter++;

            }
            else
            {
                System.out.println("Invalid Entry");
                break;
            }
            scanner.nextLine();
            scanner.close();
        }

        System.out.println("Sum: "+sum+" Average: "+(long)(sum/counter));
    }
}
