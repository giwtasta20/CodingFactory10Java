package gr.aueb.cf.ch18ch19.bankapp.core.exceptions;

public class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String message) {
        super(message);
    }
}