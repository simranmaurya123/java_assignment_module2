import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    static {
        try {
            FileHandler fileHandler = new FileHandler("app_error.log", true);
            fileHandler.setFormatter(new SimpleFormatter());
            LOGGER.addHandler(fileHandler);
            LOGGER.setUseParentHandlers(true);
        } catch (IOException e) {
            System.err.println("Failed to initialize logger: " + e.getMessage());
        }
    }

    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("User age " + age + " is under 18. Registration failed.");
        }
        System.out.println("User age " + age + " validated successfully.");
    }

    public static void main(String[] args) {
        System.out.println("=== Question 9: Custom Exception & java.util.logging File Logging Demo ===");

        int userAge = 16;
        try {
            System.out.println("Attempting to process user with age: " + userAge);
            checkAge(userAge);
        } catch (InvalidAgeException e) {
            System.out.println("Caught InvalidAgeException! Logging error to 'app_error.log'...");
            LOGGER.log(Level.SEVERE, "Exception occurred during age validation", e);
        }
    }
}
