package gr.aueb.cf.ch18ch19.bankapp.core.exceptions;

public class NegativeAmountException extends Exception {

    public NegativeAmountException(String message) {
        super(message);
    }
}