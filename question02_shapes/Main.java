import shapes.Shape;
import shapes.Circle;
import shapes.Rectangle;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Question 2: Shapes Interface & Package Demo ===");

        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);

        System.out.println("Circle (Radius = 5.0):");
        System.out.printf("  Area: %.2f%n", circle.area());
        System.out.printf("  Perimeter: %.2f%n", circle.perimeter());

        System.out.println("\nRectangle (Width = 4.0, Height = 6.0):");
        System.out.printf("  Area: %.2f%n", rectangle.area());
        System.out.printf("  Perimeter: %.2f%n", rectangle.perimeter());
    }
}
