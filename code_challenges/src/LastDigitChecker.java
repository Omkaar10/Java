/*
* Write a method named hasSameLastDigit with three parameters of type int.
Each number should be within the range of 10 (inclusive) - 1000 (inclusive). If one of the numbers is not within the range, the method should return false.
The method should return true if at least two of the numbers share the same rightmost digit; otherwise, it should return false.

* */

public class LastDigitChecker {

    public static void main(String[] args)
    {
        boolean result=hasSameLastDigit(12,23,34);
        System.out.println(result);
    }
    public static boolean hasSameLastDigit(int number1,int number2,int number3)
    {
        int last_digit_num_1=number1%10;
        int last_digit_num_2=number2%10;
        int last_digit_num_3=number3%10;
    if((number1>=10 || number1<=1000)||(number2>=10 || number2<=1000)||(number3>=10 || number3<=1000))
    {
        if((last_digit_num_1==last_digit_num_2)||(last_digit_num_2==last_digit_num_3)||(last_digit_num_3==last_digit_num_1))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    else
    {

        return false;
    }

    }
}
