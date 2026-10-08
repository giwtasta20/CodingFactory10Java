package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Επιτρέπει στον χρήστη να εισάγει αριθμητή και παρανομαστή
 * και να εκτελεί την διαίρεση
 */

public class DivisionApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        while (true) {
            System.out.println("Εισάγετε τον αριθμητή: (Έξοδος 0)");
            numerator = scanner.nextInt();

            if (numerator==0) {
                System.out.println("Εξοδος από το πρόγραμμα");
                break;
            }
            System.out.println("Εισάγετε τον παρανομαστή");
            denominator = scanner.nextInt();

            if (denominator == 0) {
                System.out.println("Ο παρανομαστής δεν μπορεί να είναι 0. Προσπάθησε ξανά");
                continue;
            }
            result = numerator / denominator;
            System.out.println("Το αποτέλεσμα της διαίρεσης" + numerator + " / " + denominator + " είναι " + result);
        }
        System.out.println("Ευχαριστουμε που χρησιμοποιήσατε το πρόγραμμα μας");
    }
}
