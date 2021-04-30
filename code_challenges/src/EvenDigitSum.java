/*
* Write a method named getEvenDigitSum with one parameter of type int called number.
* The method should return the sum of the even digits within the number.
* If the number is negative, the method should return -1 to indicate an invalid value.
* */

import java.util.Scanner;

public class EvenDigitSum {

    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=scanner.nextInt();
        if(number>0)
        {
            int result=sumEvenDigit(number);
            System.out.println("Sum of even digits is: "+result);
        }
        else
        {
            System.out.println("Invalid number");
        }

        scanner.close();

    }
    public static int sumEvenDigit(int number)
    {   int sum=0;
        int counter=0;
        while(number>0)
        {
            int last_digit=number%10;
            number=number/10;
            counter++;

            if (counter%2==0)
            {
                sum+=last_digit;
            }

        }
        return sum;
    }
}
