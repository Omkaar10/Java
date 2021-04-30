/**
 * Find 5 numbers divisble by 3 and 5, calculate sum of them.
 * break the loop once 5 number satifiying the condition are found.
 * Also record 5 even numbers which are divisble by 3 and 5, break the loop
 * once found.
 */

public class sum3And5 {

    public static void main(String[] args) {
        sumandeven();
    }

    public static void sumandeven() {
        int even_counter = 1;
        int divisible_counter = 1;
        String even_num = "";
        String divisible_num = "";
        while (true) {
            for (int i = 1; i < 100; i++) {
                if (i % 3 == 0 && i % 5 == 0) {

                    if (divisible_counter < 6) {
                        divisible_num += (int) i;
                        divisible_counter++;
                    }

                    if (i % 2 == 0 && even_counter < 6) {
                        even_num += (int) i;
                        even_counter++;
                    }
                    if (divisible_counter == 5 && even_counter == 5) {
                        break;
                    }
                }
            }
            if (divisible_counter == 5 && even_counter == 5) {
                System.out.println("5 divisible number by 3 & 5 are " + divisible_num);
                System.out.println("5 even divisible number by 3 & 5 are " + even_num);
                break;
            }

        }
    }

}
