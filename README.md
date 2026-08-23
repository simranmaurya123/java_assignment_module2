# Java Assignment - Module 2

This repository contains Java solutions for **Module 2: Packages, Interfaces, Exception Handling, Lambdas, and Method References**.

---

## 📁 Repository Structure

```text
java_assignment_module2/
├── question01_utilities/            # Section 1: Packages & Imports (Question 1)
│   ├── utilities/
│   │   └── MathUtils.java
│   └── Main.java
├── question02_shapes/               # Section 1: Packages & Interfaces (Question 2)
│   ├── shapes/
│   │   ├── Shape.java
│   │   ├── Circle.java
│   │   └── Rectangle.java
│   └── Main.java
├── question03_arraylist/            # Section 1: java.util ArrayList (Question 3)
│   └── Main.java
├── question04_calculator/           # Section 2: Functional Interface & Lambda (Question 4)
│   ├── Calculator.java
│   └── Main.java
├── question05_string_sort/           # Section 2: Lambda String Sorting (Question 5)
│   └── Main.java
├── question06_method_ref/           # Section 2: Method Reference (Question 6)
│   └── Main.java
├── question07_exception_handling/   # Section 3: try-catch vs try-catch-finally (Question 7)
│   └── Main.java
├── question08_custom_exception/     # Section 3: Custom InvalidAgeException (Question 8)
│   ├── InvalidAgeException.java
│   └── Main.java
├── question09_logging_exception/    # Section 3: Logging to File via java.util.logging (Question 9)
│   ├── InvalidAgeException.java
│   ├── Main.java
│   └── app_error.log
└── question10_factorial_throw_throws/ # Section 3: throw and throws Keywords (Question 10)
    └── Main.java
```

---

## 📝 Assignment Solutions Overview

### Section 1: Packages & Imports
- **Question 1: `utilities` Package**
  - Defines `utilities.MathUtils` with `add(int a, int b)`.
  - Directory: [`question01_utilities/`](./question01_utilities)
  - Run: `cd question01_utilities && javac utilities/*.java Main.java && java Main`

- **Question 2: `shapes` Package & Interface**
  - Defines `shapes.Shape` interface with `area()` and `perimeter()`, implemented in `Circle` and `Rectangle`.
  - Directory: [`question02_shapes/`](./question02_shapes)
  - Run: `cd question02_shapes && javac shapes/*.java Main.java && java Main`

- **Question 3: `java.util.ArrayList`**
  - Uses `java.util.ArrayList` to store and display integers.
  - Directory: [`question03_arraylist/`](./question03_arraylist)
  - Run: `cd question03_arraylist && javac Main.java && java Main`

### Section 2: Interfaces, Lambdas & Method References
- **Question 4: `Calculator` Functional Interface**
  - Implements addition, subtraction, and multiplication using lambda expressions.
  - Directory: [`question04_calculator/`](./question04_calculator)
  - Run: `cd question04_calculator && javac Calculator.java Main.java && java Main`

- **Question 5: String Sorting with Lambda**
  - Sorts a list of strings in descending order using lambda comparator.
  - Directory: [`question05_string_sort/`](./question05_string_sort)
  - Run: `cd question05_string_sort && javac Main.java && java Main`

- **Question 6: Method Reference**
  - Calculates square of a number using a static method reference (`Main::calculateSquare`).
  - Directory: [`question06_method_ref/`](./question06_method_ref)
  - Run: `cd question06_method_ref && javac Main.java && java Main`

### Section 3: Errors and Exceptions
- **Question 7: `try-catch` vs `try-catch-finally`**
  - Demonstrates `ArithmeticException` handling and guarantees execution of `finally` block.
  - Directory: [`question07_exception_handling/`](./question07_exception_handling)
  - Run: `cd question07_exception_handling && javac Main.java && java Main`

- **Question 8: Custom Exception (`InvalidAgeException`)**
  - Throws `InvalidAgeException` when user age < 18.
  - Directory: [`question08_custom_exception/`](./question08_custom_exception)
  - Run: `cd question08_custom_exception && javac InvalidAgeException.java Main.java && java Main`

- **Question 9: Exception Logging to File**
  - Logs `InvalidAgeException` stack trace to `app_error.log` using `java.util.logging.Logger`.
  - Directory: [`question09_logging_exception/`](./question09_logging_exception)
  - Run: `cd question09_logging_exception && javac InvalidAgeException.java Main.java && java Main`

- **Question 10: `throw` and `throws` Keywords**
  - Demonstrates method signature exception declaration (`throws`) and explicit throwing (`throw`) for negative inputs in factorial calculation.
  - Directory: [`question10_factorial_throw_throws/`](./question10_factorial_throw_throws)
  - Run: `cd question10_factorial_throw_throws && javac Main.java && java Main`

---

## ⚙️ Compilation & Execution

Each folder is self-contained. Navigate to any question directory and run:

```bash
javac *.java
java Main
```

*(For packages like `shapes` or `utilities`, compile subfolders with `javac package_name/*.java Main.java`)*
