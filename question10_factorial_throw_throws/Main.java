public class Main {

    public static long calculateFactorial(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException("Cannot calculate factorial of a negative number: " + n);
        }

        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        System.out.println("=== Question 10: throw and throws Keywords Demo ===");

        int validNum = 5;
        try {
            long result = calculateFactorial(validNum);
            System.out.println("Factorial of " + validNum + " = " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        int zeroNum = 0;
        try {
            long result = calculateFactorial(zeroNum);
            System.out.println("Factorial of " + zeroNum + " = " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        int negativeNum = -4;
        try {
            System.out.println("\nCalculating factorial of " + negativeNum + "...");
            long result = calculateFactorial(negativeNum);
            System.out.println("Factorial of " + negativeNum + " = " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Expected Exception: " + e.getMessage());
        }
    }
}
