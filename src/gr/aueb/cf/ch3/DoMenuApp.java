package gr.aueb.cf.ch3;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

/**
 * ΕΜΦΑΝΙΖΕΙ ΕΝΑ ΜΕΝΟΥ ΕΠΙΛΟΓΩΝ ΣΤΟΝ ΧΡΗΣΤΗ,
 * ΜΕΧΡΙ Ο ΧΡΗΣΤΗΣ ΝΑ ΕΠΙΛΕΞΕΙ ΤΗΝ ΕΠΙΛΟΓΗ 5 (ΕΞΟΔΟΣ)
 */

public class DoMenuApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Παρακαλω επιλέξτε μια από τις παρακάτω επιλογες:");
            System.out.println("1. Εισαγωγή προιόντος");
            System.out.println("2. Ενημέρωση προιόντος");
            System.out.println("3. Διαγραφή προιόντος");
            System.out.println("4. Αναζήτηση προιόντος");
            System.out.println("5. Έξοδος");
            choice = in.nextInt();
        }
        while (choice !=5);
        System.out.println("ΕΥΧΑΡΙΣΤΟΥΜΕ ΓΙΑ ΤΗΝ ΕΠΙΛΟΓΗ ΤΗΣ ΕΦΑΡΜΟΓΗΣ ΜΑΣ");
    }

}
