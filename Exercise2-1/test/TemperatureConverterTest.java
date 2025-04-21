public class TemperatureConverterTest {
    public static void main(String[] args) {
        runTest(0, 32);
        runTest(100, 212);
        runTest(-40, -40);
        runTest(37, 98.6);
    }

    public static void runTest(double input, double expected) {
        double actual = TemperatureConverter.celsiusToFahrenheit(input);
        if (Math.abs(actual - expected) < 0.0001) {
            System.out.println("PASS: " + input + "°C = " + expected + "°F");
        } else {
            System.out.println("FAIL: " + input + "°C. Expected " + expected + "°F but got " + actual + "°F");
        }
    }
}