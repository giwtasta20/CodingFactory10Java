package gr.aueb.cf.ch1.challenges;

import java.util.Scanner;

/**
 * Γράψτε ένα πρόγραμμα, νέα κλάση με όνομα MenuApp μέσα
 * στο package gr.aueb.cf.ch1, που να εκτυπώνει το παρακάτω
 * Μενού :
 * Επιλέξτε μία από τις παρακάτω επιλογές:
 * 1. Εισαγωγή
 * 2. Διαγραφή
 * 3. Αναζήτηση
 * 4. Ενημέρωση
 * 5. Έξοδος
 * Δώστε αριθμό επιλογής:
 */

public class MenuApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        System.out.println("Επιλέξτε μία από τις παρακάτω επιλογές:");
        System.out.println("1. Εισαγωγή");
        System.out.println("2. Διαγραφή");
        System.out.println("3. Αναζήτηση");
        System.out.println("4. Ενημέρωση");
        System.out.println("5. Έξοδος");
        System.out.print("Δώστε αριθμό επιλογής: ");

        choice = in.nextInt();

    }
}
