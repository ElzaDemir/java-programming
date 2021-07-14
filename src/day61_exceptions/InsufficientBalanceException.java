package day61_exceptions;

/**
 * custom
 */

public class InsufficientBalanceException extends RuntimeException{
    public InsufficientBalanceException() {
    }

    public InsufficientBalanceException(String message) {
        super(message);
    }
}
