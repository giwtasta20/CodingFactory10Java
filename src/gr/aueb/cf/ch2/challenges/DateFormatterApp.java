package gr.aueb.cf.ch2.challenges;

import java.util.Scanner;

/**
 *  Γράψτε ένα πρόγραμμα που διαβάζει από τον χρήστη 3 ακέραιους αριθμούς
 * που αναπαριστούν ημέρα, μήνα, έτος και την εμφανίζει σε μορφή: ΗΗ/ΜΜ/ΕΕ
 * Π.χ. αν δώσουμε 5 12 2022 θα εμφανίσει 05/12/22.
 */

public class DateFormatterApp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int inputDay = 0;
        int inputMonth = 0;
        int inputYear = 0;

        System.out.println("Παρακαλώ εισάγετε την ημέρα, μήνα και έτος:");
        inputDay = in.nextInt();
        inputMonth = in.nextInt();
        inputYear = in.nextInt();

        System.out.printf("Η ημερομηνία που εισάγατε είναι: %02d/%02d/%02d\n", inputDay, inputMonth, inputYear%100);
    }
}
