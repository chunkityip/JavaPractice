package Exception;

/**
 * one class, one responsibility
 */

public class NegativeNumberException extends Exception {
    public NegativeNumberException(String errorMessage) {
        super(errorMessage);
    }
}


