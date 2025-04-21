import java.util.Scanner;

public class SortThreeNumbers {
    public static void displaySortedNumbers(double num1, double num2, double num3) {
        double temp;

        // Swap values if not in order
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.println("Sorted numbers: " + num1 + " " + num2 + " " + num3);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        displaySortedNumbers(a, b, c);

        input.close();
    }
}