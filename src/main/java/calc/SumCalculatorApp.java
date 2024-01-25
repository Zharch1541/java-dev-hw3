package calc;

import java.util.Scanner;

public class SumCalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SumCalculator sumCalculator = new SumCalculator();

        try {
            System.out.print("Enter a positive number: ");
            int input = scanner.nextInt();
            int result = sumCalculator.sum(input);
            System.out.println("Result = " + result);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
