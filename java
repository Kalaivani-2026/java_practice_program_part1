// Custom exception for invalid age
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Custom exception for salary limits
class SalaryLimitException extends Exception {
    public SalaryLimitException(String message) {
        super(message);
    }
}

// Custom exception for array size
class ArraySizeException extends Exception {
    public ArraySizeException(String message) {
        super(message);
    }
}

public class Main {  // Changed class name to Main
    public static void main(String[] args) {
        try {
            int age = 15;
            if (age < 18 || age > 60) {
                throw new InvalidAgeException("Age is invalid. Must be between 18 and 60.");
            }

            double salary = 2500;
            if (salary < 3000 || salary > 50000) {
                throw new SalaryLimitException("Salary is outside the allowed range.");
            }

            int[] arr = new int[3];
            if (arr.length < 5) {
                throw new ArraySizeException("Array size must be at least 5.");
            }
        } catch (InvalidAgeException | SalaryLimitException | ArraySizeException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        } finally {
            System.out.println("Program execution completed.");
        }
    }
}
