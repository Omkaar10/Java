/**
 * Bob is a wall painter and he needs your help. You have to write a program that helps Bob calculate how many buckets of paint he needs to buy before going to work. Bob might also have some extra buckets at home. He also knows the area that he can cover with one bucket of paint.
 *
 * 1. Write a method named getBucketCount with 4 parameters. The first parameter should be named width of type double. This parameter represents the width of the wall.
 *
 * The second parameter should be named height of type double. This parameter represents the height of the wall.
 *
 * The third parameter should be named areaPerBucket. This parameter represents the area that can be covered with one bucket of paint.
 *
 * The fourth parameter should be named extraBuckets. This parameter represents the bucket count that Bob has at home.
 *
 * The method needs to return a value of type int that represents the number of buckets that Bob needs to buy before going to work. To calculate the bucket count, refer to the notes below.
 *
 * If one of the parameters width, height or areaPerBucket is less or equal to 0 or if extraBuckets is less than 0, the method needs to return -1 to indicate an invalid value.
 *
 * If all parameters are valid, the method needs to calculate the number of buckets and return it.
 *
 *
 * Examples of input/output:
 *
 * *getBucketCount(-3.4, 2.1, 1.5, 2); → should return -1 since the width parameter is invalid
 *
 * *getBucketCount(3.4, 2.1, 1.5, 2); → should return 3 since the wall area is 7.14, a single bucket can cover an area of 1.5 and Bob has 2 extra buckets home.
 *
 * *getBucketCount(2.75, 3.25, 2.5, 1); → should return 3 since the wall area is 8.9375, a single bucket can cover an area of 2.5 and Bob has 1 extra bucket at home.
 *
 *
 *
 * 2. Bob does not like to enter 0 for the extraBuckets parameter so he needs another method.
 *
 * Write another overloaded method named getBucketCount with 3 parameters namely width, height, and areaPerBucket (all of type double).
 *
 * This method needs to return a value of type int that represents the number of buckets that Bob needs to buy before going to work. To calculate the bucket count, refer to the notes below.
 *
 * If one of the parameters width, height or areaPerBucket is less or equal to 0, the method needs to return -1 to indicate an invalid value.
 *
 * If all parameters are valid, the method needs to calculate the number of buckets and return it.
 *
 *
 * Examples of input/output:
 *
 * *getBucketCount(-3.4, 2.1, 1.5); → should return -1 since the width parameter is invalid
 *
 * *getBucketCount(3.4, 2.1, 1.5); → should return 5 since the wall area is 7.14, and a single bucket can cover an area of 1.5.
 *
 * *getBucketCount(7.25, 4.3, 2.35); → should return 14 since the wall area is 31.175, and a single bucket can cover an area of 2.35.
 *
 *
 * 3. In some cases, Bob does not know the width and height of the wall but he knows the area of a wall. He needs you to write another method.
 *
 * Write another overloaded method named getBucketCount with 2 parameters namely, area and areaPerBucket (both of type double).
 *
 * The method needs to return a value of type int that represents the number of buckets that Bob needs to buy before going to work. To calculate the bucket count, refer to the notes below.
 *
 * If one of the parameters area or areaPerBucket is less or equal to 0, the method needs to return -1to indicate an invalid value.
 *
 * If all parameters are valid, the method needs to calculate the number of buckets and return it.
 *
 *
 * Examples of input/output:
 *
 * *getBucketCount(3.4, 1.5); → should return 3 since the area is 3.4 and a single bucket can cover an area of 1.5
 *
 * *getBucketCount(6.26, 2.2); → should return 3 since the wall area is 6.26 and a single bucket can cover an area of 2.2.
 *
 * *getBucketCount(3.26, 0.75); → should return 5 since the wall area is 3.26, and a single bucket can cover an area of 0.75 .
 *
 * Do your best to help Bob.
 *
 *
 *
 * */


import java.util.Scanner;

public class PaintJob {

    public static void main(String[] args)
    {
        int bucketcount;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the width of wall: ");
        double width=scanner.nextDouble();
        System.out.println("Enter the height of wall: ");
        double height=scanner.nextDouble();
        System.out.println("Enter the area covered per bucket: ");
        double areaPerBucket=scanner.nextDouble();
        System.out.println("Enter any Extra buckets left? ");
        int extraBuckets=scanner.nextInt();

        if(width==0 && height==0)
        {
            System.out.println("Enter Area to paint: ");
            double area=scanner.nextDouble();
            bucketcount=getBucketCount(area,areaPerBucket);
            if(bucketcount<0)
            {
                System.out.println("Invalid Entry");
            }
            else
            {
                System.out.println("You will need "+bucketcount+ " buckets");
            }
        }
        else if(extraBuckets==0)
        {
            bucketcount=getBucketCount(width,height,areaPerBucket);

            if(bucketcount<0)
            {
                System.out.println("Invalid Entry");
            }
            else
            {
                System.out.println("You will need "+bucketcount+ " buckets");
            }
        }
        else
        {
            bucketcount=getBucketCount(width,height,areaPerBucket,extraBuckets);
            if(bucketcount<0)
            {
                System.out.println("Invalid Entry");
            }
            else
            {
                System.out.println("You will need "+bucketcount+ " buckets");
            }
        }


    }

    public static int getBucketCount(double width,double height,double areaPerBucket,int extraBuckets)
    {
        double totalarea=width*height;
        double workachievable=areaPerBucket*extraBuckets;
        double numBuckets=0;
        if(width<=0||height<=0||areaPerBucket<=0||extraBuckets<=0)
        {
            return -1;
        }
        else
        {
            if(workachievable>=totalarea)
            {
                return 0;
            }
            else
            {
                double remaining_work=totalarea-workachievable;
                numBuckets=remaining_work/areaPerBucket;
                return (int)Math.ceil(numBuckets);
            }
        }


    }


    public static int getBucketCount(double width,double height,double areaPerBucket)
    {
        double totalarea=width*height;
        double numBuckets=0;
        if(width<=0||height<=0||areaPerBucket<=0)
        {
            return -1;
        }
        else
        {
            numBuckets=totalarea/areaPerBucket;
            return (int)Math.ceil(numBuckets);
        }


    }

    public static int getBucketCount(double area,double areaPerBucket)
    {

        double numBuckets=0;
        if(area<=0||areaPerBucket<=0)
        {
            return -1;
        }
        else
        {
            numBuckets=area/areaPerBucket;
            return (int)Math.ceil(numBuckets);
        }


    }
}
