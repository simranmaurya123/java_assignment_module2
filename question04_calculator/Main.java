public class Main {
    public static void main(String[] args) {
        System.out.println("=== Question 4: Functional Interface & Lambda Expressions Demo ===");

        int num1 = 20;
        int num2 = 5;

        Calculator addition = (a, b) -> a + b;
        Calculator subtraction = (a, b) -> a - b;
        Calculator multiplication = (a, b) -> a * b;

        System.out.println("Numbers: a = " + num1 + ", b = " + num2);
        System.out.println("Addition (a + b)       : " + addition.compute(num1, num2));
        System.out.println("Subtraction (a - b)    : " + subtraction.compute(num1, num2));
        System.out.println("Multiplication (a * b) : " + multiplication.compute(num1, num2));
    }
}
