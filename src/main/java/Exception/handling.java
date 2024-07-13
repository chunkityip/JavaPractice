package Exception;

public class handling {
    /**
     * Basic Exception Handling:
     * Write a program that reads two integers from the user and divides the first integer by the second.
     * Use a try-catch block to handle ArithmeticException if the user tries to divide by zero.
     */
    public int divide(int a, int b) {
        // Implement the method here
        return 0; // Placeholder return value
    }

    /**
     * Multiple Catch Blocks:
     * Write a program that reads a number from the user and converts it to an integer.
     * Use multiple catch blocks to handle NumberFormatException and NullPointerException.
     */
    public void convertStringToNumber(String input) {
        // Implement the method here
    }

    /**
     * Finally Block:
     * Write a program that reads a file and prints its content to the console.
     * Use a try-catch-finally block to ensure the file is closed properly, even if an exception occurs.
     */
    public void readFile(String filePath) {
        // Implement the method here
    }


    /**
     * Custom Exception:
     * Create a custom exception `NegativeNumberException` that is thrown when a negative number is passed to a method.
     * Write a program that reads a number from the user and throws this exception if the number is negative.
     */
    public void checkPositiveNumber(int number) throws NegativeNumberException{
            if (number  < 0) {
                throw new NegativeNumberException("Negative number: " + number);
            } else {
                System.out.println("Number is positive: " + number);
        }
    }


    public static void main(String[] args) {


        // Test Basic Exception Handling
        // Replace with appropriate values and method calls for testing


        // Test Multiple Catch Blocks
        // Replace with appropriate values and method calls for testing


        // Test Finally Block
        // Replace "example.txt" with the path to your file

    }
}

