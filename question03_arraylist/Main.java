import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Question 3: java.util.ArrayList Demo ===");

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(25);
        numbers.add(42);
        numbers.add(87);
        numbers.add(99);

        System.out.println("List of Integers: " + numbers);

        System.out.println("\nIterating through the ArrayList:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Element at index " + i + ": " + numbers.get(i));
        }
    }
}
