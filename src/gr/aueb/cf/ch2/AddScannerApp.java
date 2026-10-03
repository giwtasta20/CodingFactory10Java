package gr.aueb.cf.ch2;

import java.util.Scanner;   //ειναι το πλήρες όνομα του scanner

/**
 * Διαβάζει δυο ακεραίους από το stdin (keyboard)
 * και υπολογίζει το άθροισμα και το εκτυπώνει.
 */

public class AddScannerApp {
    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        //Data input - Διαβάζει και εχχωρεί σε μεταβλητές (data binding)
        System.out.println("Παρακαλώ εισάγετε δύο ακεραίους");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        //Λογική της εφαρμογής - Παραστάσεις
        sum = num1 + num2;

        //Εκτύπωση Αποτελεσμάτων
        System.out.printf("Το άθροισμα των %d και %d είναι %d\n", num1, num2, sum);


    }
}
