package gr.aueb.cf.ch20.challenges;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordFormatValidator {
    public static void main(String[] args) {
        String s = "Cod1ngF@";

        Pattern pattern = Pattern.compile("(?=.*?[a-z])(?=.*?[A-Z])(?=.*?[0-9])(?=.*?[!@#$%^?&*-])^.{8,}$");
        Matcher matcher = pattern.matcher(s);

        if (matcher.matches()) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }
    }
}
