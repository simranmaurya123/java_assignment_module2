import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Question 5: Lambda Expression String Sort Demo ===");

        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Cherry");
        fruits.add("Elderberry");

        System.out.println("Original List: " + fruits);

        // Sorting in descending order using Lambda Expression
        fruits.sort((s1, s2) -> s2.compareTo(s1));

        System.out.println("Sorted List (Descending): " + fruits);
    }
}
