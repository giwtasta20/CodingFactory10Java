package gr.aueb.cf.ch4.challenges;

import java.util.Scanner;

/**
 * To πρόγραμμα που δέχεται έναν ακέραιο (1-7) και επιστρέφει
 * το αντίστοιχο όνομα της ημέρας της εβδομάδας (π.χ., 1 → "Δευτέρα").
 */

public class DayFinderApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = 0;
        System.out.println("Παρακαλώ εισάγετε έναν αριθμό (1-7): ");
        input = in.nextInt();

        switch (input) {
            case 1 -> System.out.println("Δευτέρα");
            case 2 -> System.out.println("Τρίτη");
            case 3 -> System.out.println("Τετάρτη");
            case 4 -> System.out.println("Πέμπτη");
            case 5 -> System.out.println("Παρασκευή");
            case 6 -> System.out.println("Σάββατο");
            case 7 -> System.out.println("Κυριακή");
            default -> System.out.println("Μη έγκυρος αριθμός");
        }
        System.out.println("Ευχαριστούμε που χρησιμοποιήσατε την εφαρμογή!");
    }
}
