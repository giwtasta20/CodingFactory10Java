package gr.aueb.cf.ch2.challenges;

import java.util.Scanner;

/**
 * To πρόγραμμα διαβάζει την απόσταση σε ακέραια χιλιόμετρα και υπολογίζει το συνολικό κόστος.
 * Σταθερό κόστος εκκίνησης 3€ (300 λεπτά) και 0,74€ (74 λεπτά) ανά χιλιόμετρο
 * Το αποτέλεσμα εκτυπώνεται σε ευρώ και λεπτά ξεχωριστά.
 */

public class TaxiCostApp {
    public static void main(String[] args) {
        final int FIXED_COST = 300;
        final int COST_PER_KM = 74;
        int inputDistance = 0;
        int totalCost = 0;
        int costInEuros = 0;
        int costInCents = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Παρακαλώ εισάγετε την απόσταση σε χιλιόμετρα:");
        inputDistance = scanner.nextInt();

        totalCost = FIXED_COST + (COST_PER_KM * inputDistance);
        costInEuros = totalCost / 100;
        costInCents =totalCost % 100;

        System.out.printf("Το κόστος διαδρομής είναι : %d ευρώ και %d λεπτά", costInEuros, costInCents);
    }
}
