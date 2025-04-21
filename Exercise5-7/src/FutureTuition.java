public class FutureTuition {
    public static void main(String[] args) {
        double tuition = 10000;
        double rate = 0.05;

        // Calculate tuition after 10 years
        for (int year = 1; year <= 10; year++) {
            tuition *= (1 + rate);
        }

        System.out.printf("Tuition in 10 years: $%.2f\n", tuition);

        // Calculate total cost for 4 years starting at year 11
        double totalCost = 0;
        for (int i = 0; i < 4; i++) {
            totalCost += tuition;
            tuition *= (1 + rate);
        }

        System.out.printf("Total cost for four years after the 10th year: $%.2f\n", totalCost);
    }
}