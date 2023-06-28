package functionalcalculator;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Select an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exponentiation");
        System.out.println("6. Square root");
        System.out.println("7. Modulus");
        System.out.println("8. Logarithm");
        System.out.println("9. Cube");
        System.out.println("10. Cube root");
        System.out.println("11. Speed");
        System.out.println("12. Time");
        System.out.println("13. Density");
        System.out.println("14. Temperature");
        System.out.print("Enter your choice (1-14): ");
        int choice = scanner.nextInt();

        double result = 0;

        switch (choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Cannot divide by zero!");
                    return;
                }
                break;
            case 5:
                result = Math.pow(num1, num2);
                break;
            case 6:
                result = Math.sqrt(num1);
                break;
            case 7:
                result = num1 % num2;
                break;
            case 8:
                result = Math.log(num1);
                break;
            case 9:
                result = Math.pow(num1, 3);
                break;
            case 10:
                result = Math.cbrt(num1);
                break;
            case 11:
                result = num1 / num2;
                break;
            case 12:
                result = num1 * num2;
                break;
            case 13:
                result = num1 / num2;
                break;
            case 14:
                result = (num1 - 32) * 5 / 9; // Fahrenheit to Celsius conversion
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        System.out.println("Result: " + result);
    }
}



