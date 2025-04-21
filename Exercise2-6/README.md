# Exercise 2-6 – Gratuity Calculator

## Description

This program prompts the user to enter a subtotal and a gratuity rate (as a percentage), calculates the gratuity, and outputs the total.

### Formulas:
gratuity = subtotal * (gratuityRate / 100) total = subtotal + gratuity

## How to Run

### Compile:
```bash
javac src/GratuityCalculator.java
javac -cp src:. test/GratuityCalculatorTest.java

Run Main Program:

java -cp src GratuityCalculator
Run Unit Tests:

java -cp src:. test.GratuityCalculatorTest
Unit Tests:

Subtotal	Rate	Expected Gratuity	Expected Total
50.0	10%	$5.00	$55.00
100.0	20%	$20.00	$120.00
25.0	15%	$3.75	$28.75
80.0	12.5%	$10.00	$90.00