/*
* Read the numbers from the console entered by the user and print the minimum
* and maximum number user has entered
* if the user entered invalid number, break out of the loop and print the
* Maximum and Minimum number.
*
* */

import java.util.Scanner;

public class minMaxInputChallenge {

    public static void main(String[] args)
    {
        minmax();
    }
    public static void minmax()
    {
        Scanner scanner = new Scanner(System.in);
        int min=100;
        int max=0;
        while(true)
        {
            System.out.println("Enter the number");
            boolean checknum=scanner.hasNextInt();
            if(checknum)
            {
                int number=scanner.nextInt();
                if (number>max)
                {
                    max=number;
                }
                if(number<min)
                {
                    min=number;
                }
            }
            else
            {
                System.out.println("Invalid Entry, exiting the input prompt...");
             break;
            }
            scanner.nextLine();
        }
        System.out.println("Maximum number is :"+max);
        System.out.println("Minimum number is :"+min);
        scanner.close();
    }
}
