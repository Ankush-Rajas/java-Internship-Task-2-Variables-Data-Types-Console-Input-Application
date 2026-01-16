import java.util.Scanner;

public class VariablesAndInputDemo {

    static int staticCounter = 1;

    // Instance variable (unique for each object)
    int instanceValue = 100;

    public static void main(String[] args) {

        // Local variables (exist only inside this method)
        byte b = 10;          // 1 byte, memory efficient
        short s = 200;        // 2 bytes
        int i = 5000;         // 4 bytes, default integer
        long l = 9000000000L; // 8 bytes, large values

        float f = 12.5f;      // 4 bytes, decimal with f suffix
        double d = 45.6789;   // 8 bytes, high precision

        char c = 'A';         // 2 bytes, Unicode character
        boolean isJavaFun = true; // true/false condition

        // Creating Scanner object for console input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Handling invalid input using condition
        if (num2 == 0) {
            System.out.println("Division by zero is not allowed.");
        } else {

            // Arithmetic operations
            int sum = num1 + num2;
            int diff = num1 - num2;
            int product = num1 * num2;
            double division = (double) num1 / num2; // type casting

            // Formatted output
            System.out.printf("Sum = %d%n", sum);
            System.out.printf("Difference = %d%n", diff);
            System.out.printf("Product = %d%n", product);
            System.out.printf("Division = %.2f%n", division);
        }
    }
}


