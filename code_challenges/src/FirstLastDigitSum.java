/*
* Write a method named sumFirstAndLastDigit with one parameter of type int called number.
The method needs to find the first and the last digit of the parameter number passed to the method, using a loop and return the sum of the first and the last digit of that number.
If the number is negative then the method needs to return -1 to indicate an invalid value.
* */

import java.util.Scanner;

public class FirstLastDigitSum {

    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=scanner.nextInt();
        if (number>0)
        {
            int result=sumFirstLastDigit(number);
            System.out.println("The sum of fist and last digit is:"+result);
        }
        else
        {
            System.out.println("Invalid number");
        }
        scanner.close();
    }

    public static int sumFirstLastDigit(int number)
    {
        int sum=0;
        int last_digit=number%10;
        while(number>0)
        {
            number=number/10;

            if (number>0&&number<=9)
            {
                sum=number+last_digit;
                System.out.println("first digit:"+number+", last digit:"+last_digit);
            }

        }
        return sum;
    }
}
