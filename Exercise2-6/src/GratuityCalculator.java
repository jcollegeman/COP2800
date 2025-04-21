import java.util.Scanner;

public class GratuityCalculator {

    public static double calculateGratuity(double subtotal, double rate) {
        return subtotal * (rate / 100);
    }

    public static double calculateTotal(double subtotal, double gratuity) {
        return subtotal + gratuity;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the subtotal: ");
        double subtotal = input.nextDouble();

        System.out.print("Enter the gratuity rate (e.g., 15 for 15%): ");
        double rate = input.nextDouble();

        double gratuity = calculateGratuity(subtotal, rate);
        double total = calculateTotal(subtotal, gratuity);

        System.out.printf("Gratuity: $%.2f\n", gratuity);
        System.out.printf("Total: $%.2f\n", total);

        input.close();
    }
}
