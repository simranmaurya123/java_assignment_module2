public class Main {

    public static void demonstrateTryCatch(int a, int b) {
        System.out.println("--- 1. Using Standard try-catch Block ---");
        try {
            System.out.println("Attempting division: " + a + " / " + b);
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
        System.out.println("Execution continues after try-catch block.\n");
    }

    public static void demonstrateTryCatchFinally(int a, int b) {
        System.out.println("--- 2. Using try-catch-finally Block ---");
        try {
            System.out.println("Attempting division: " + a + " / " + b);
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } finally {
            System.out.println("[FINALLY BLOCK] Cleanup code executed regardless of exception!");
        }
        System.out.println("Execution continues after try-catch-finally block.\n");
    }

    public static void main(String[] args) {
        System.out.println("=== Question 7: try-catch vs try-catch-finally Demo ===");

        demonstrateTryCatch(10, 0);
        demonstrateTryCatchFinally(10, 0);
        demonstrateTryCatchFinally(20, 4);
    }
}
