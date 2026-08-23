import java.util.function.IntUnaryOperator;

public class Main {

    // Static method to calculate square of a number
    public static int calculateSquare(int number) {
        return number * number;
    }

    public static void main(String[] args) {
        System.out.println("=== Question 6: Method Reference Static Method Demo ===");

        // Method reference to static method calculateSquare
        IntUnaryOperator squareFunc = Main::calculateSquare;

        int input = 7;
        int result = squareFunc.applyAsInt(input);

        System.out.println("Input Number  : " + input);
        System.out.println("Square Result : " + result);
    }
}
