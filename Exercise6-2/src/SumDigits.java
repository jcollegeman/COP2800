import java.util.Scanner;

public class SumDigits {
    public static int sumDigits(long n) {
        int sum = 0;

        while (n != 0) {
            sum += n % 10;   // Add last digit
            n /= 10;         // Remove last digit
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        long number = input.nextLong();

        int result = sumDigits(number);
        System.out.println("Sum of digits: " + result);

        input.close();
    }
}