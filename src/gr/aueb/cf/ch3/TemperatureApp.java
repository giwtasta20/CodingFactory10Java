package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει έναν ακέραιο που υπολογίζει θερμοκρασία και το πρόγραμμα υπολογιζει αν η θερμοκρασία είναι <0
 * μια μεταβλητή, έστω isTempBelowZero γίνεται true, αλλιώς false.
 *
 */

public class TemperatureApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temperature = 0;
        boolean isTempBelowZero = false;

        System.out.println("εισάγετε την θερμοκρασία");
        temperature = scanner.nextInt();

        isTempBelowZero = temperature < 0;

        System.out.println("Η θερμοκρασία είναι κάτω από το μηδεν:" + isTempBelowZero);
    }
}
