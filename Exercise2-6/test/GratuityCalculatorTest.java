public class GratuityCalculatorTest {
    public static void main(String[] args) {
        runTest(50.0, 10.0, 5.0, 55.0);
        runTest(100.0, 20.0, 20.0, 120.0);
        runTest(25.0, 15.0, 3.75, 28.75);
        runTest(80.0, 12.5, 10.0, 90.0);
    }

    public static void runTest(double subtotal, double rate, double expectedGratuity, double expectedTotal) {
        double actualGratuity = GratuityCalculator.calculateGratuity(subtotal, rate);
        double actualTotal = GratuityCalculator.calculateTotal(subtotal, actualGratuity);

        boolean gratuityPass = Math.abs(actualGratuity - expectedGratuity) < 0.0001;
        boolean totalPass = Math.abs(actualTotal - expectedTotal) < 0.0001;

        if (gratuityPass && totalPass) {
            System.out.printf("PASS: subtotal=%.2f rate=%.2f%% → gratuity=$%.2f total=$%.2f\n",
                    subtotal, rate, expectedGratuity, expectedTotal);
        } else {
            System.out.printf("FAIL: subtotal=%.2f rate=%.2f%%\n", subtotal, rate);
            System.out.printf("   Expected: gratuity=$%.2f total=$%.2f\n", expectedGratuity, expectedTotal);
            System.out.printf("   Actual:   gratuity=$%.2f total=$%.2f\n", actualGratuity, actualTotal);
        }
    }
}