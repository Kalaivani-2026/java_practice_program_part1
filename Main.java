public class Main {  // Changed class name to Main
    public static void main(String[] args) {
        int[] numbers = {10, 5, 0, 20};
        int num1 = 10;
        int num2 = 0;

        try {
            // Attempt a division that could cause an exception
            int result = num1 / num2; // This will cause ArithmeticException
            System.out.println("Result of division: " + result);

            // Attempt to access an invalid array index
            System.out.println("Element at invalid index: " + numbers[10]);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage() + ". You cannot divide by zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage() + ". The array index is out of bounds.");
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage() + ". Failed to convert a string to a number.");
        } finally {
            // This block will always execute
            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            double average = (double) sum / numbers.length;
            System.out.println("The average of all array elements is: " + average);
        }
    }
}