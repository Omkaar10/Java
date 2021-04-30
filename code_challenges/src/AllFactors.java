/**
 * Write a method named printFactors with one parameter of type int named number.
 * If number is < 1, the method should print "Invalid Value".
 *The method should print all factors of the number.
 * A factor of a number is an integer which divides that number wholly (i.e. without leaving a remainder).
 *
 * */
public class AllFactors {
    public static void main(String[] args)
    {
        String result=printFactors(-32);
        System.out.println("The Factors are: "+result);
    }
    public static String printFactors(int number)
    {
        String factors="";

        if(number>1)
        {
            for (int i = 1; i <= number; ++i)
            {
                if (number % i == 0)
                {
                    factors=factors+i+" ";
                }
            }
        }
        else
        {
            return"Invalid number";
        }

    return factors;
    }
}
