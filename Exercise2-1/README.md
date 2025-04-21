# Exercise 2-1 – Celsius to Fahrenheit Converter

## Description

This program prompts the user to enter a Celsius temperature, converts it to Fahrenheit using the formula:

fahrenheit = (9.0 / 5) * celsius + 32


It also includes 4 unit tests to verify conversion accuracy.

## How to Run

### Compile:

```bash
javac src/TemperatureConverter.java
javac -cp src:. test/TemperatureConverterTest.java


Run main program:

java -cp src TemperatureConverter
Run unit tests:
java -cp src:. test.TemperatureConverterTest

Unit Tests:
0°C → 32°F
100°C → 212°F
-40°C → -40°F
37°C → 98.6°F