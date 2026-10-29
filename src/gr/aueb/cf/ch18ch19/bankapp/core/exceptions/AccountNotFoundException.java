package gr.aueb.cf.ch18ch19.bankapp.core.exceptions;

public class AccountNotFoundException extends Exception {

    public AccountNotFoundException(String message) {
        super(message);
    }
}