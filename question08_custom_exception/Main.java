public class Main {

    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Access Denied: Age must be at least 18. Provided age: " + age);
        }
        System.out.println("Access Granted: Age " + age + " is valid.");
    }

    public static void main(String[] args) {
        System.out.println("=== Question 8: Custom InvalidAgeException Demo ===");

        try {
            System.out.println("Testing age = 21:");
            validateAge(21);
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            System.out.println("\nTesting age = 15:");
            validateAge(15);
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
