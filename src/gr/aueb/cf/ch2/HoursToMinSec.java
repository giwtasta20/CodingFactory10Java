package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Λαμβάνει από τον χρήστη εναν ακέραιο που αντιστοιχεί σε ώρες, μετατρέπει σε λεπτά και σε
 * δευτερόλεπτα και τα εκτυπώνει.
 */
public class HoursToMinSec {
    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση
        Scanner scanner = new Scanner(System.in);
        int inputHours = 0;
        int minutes = 0;
        int seconds = 0;
        final int HOURS_TO_MINUTES = 60;
        final int HOURS_TO_SECONDS = 3600;

        //input - data binding
        System.out.println("παρακαλώ εισάγετε τον αριθμό των ωρών");
        inputHours = scanner.nextInt();

        //εντολές επεξεργασίας
        minutes = inputHours * HOURS_TO_MINUTES;
        seconds = inputHours * HOURS_TO_SECONDS;

        //Εκτύπωση αποτελέσματος
        System.out.printf("Ωρες: %d, Λεπτά: %d, Δευτερόλεπτα: %d\n", inputHours, minutes, seconds);


    }


}
