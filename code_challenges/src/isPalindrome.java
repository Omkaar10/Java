/**
 * Write a method called isPalindrome with one int parameter called number.
 *The method needs to return a boolean.
 *It should return true if the number is a palindrome number otherwise it should return false.
 *
 * */

import java.util.Scanner;

public class isPalindrome {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int palin_number=scanner.nextInt();
        boolean result=checkPalindrome(palin_number);
        System.out.println("Whether "+palin_number+" is a palindrome: "+result);
        scanner.close();
    }

    public static boolean checkPalindrome(int number)
    {
        String new_num="";
        String original_number=String.valueOf(number);
        while(number>0)
        {
            int last_num=number%10;
            new_num+=last_num;
            number=number/10;

        }

        if(new_num.equals(original_number))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
