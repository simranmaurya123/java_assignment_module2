import utilities.MathUtils;

/**
 * Question 1 Demo: Demonstrates the usage of MathUtils from the utilities package.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Question 1: Utilities Package & MathUtils Demo ===");
        int num1 = 15;
        int num2 = 27;

        int sum = MathUtils.add(num1, num2);

        System.out.println("First Number  : " + num1);
        System.out.println("Second Number : " + num2);
        System.out.println("Sum (add)     : " + sum);
    }
}
