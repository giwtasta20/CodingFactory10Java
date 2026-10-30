package gr.aueb.cf.ch18ch19.bankapp_mysql.bankapp.core.exceptions;

public class AccountAlreadyExistsException extends Exception {

    public AccountAlreadyExistsException(String message) {
        super(message);
    }
}