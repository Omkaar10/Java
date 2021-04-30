import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args)
    {
        readingUserInput();

    }
    public static void readingUserInput()
    {
        Scanner scanner= new Scanner(System.in);
        int counter=1;
        int sum=0;

        while( true)
        {
            System.out.println("Enter number #"+counter+" :");
            boolean checknum=scanner.hasNextInt();
            if(checknum)
            {
                int number=scanner.nextInt();
                counter++;
                sum+=number;
                if (counter==11)
                {
                    break;
                }
            }
            else
            {
                System.out.println("Invalid number");
            }
            scanner.nextLine();
        }
        System.out.println("The sum is: "+sum );
        scanner.close();
    }
}
