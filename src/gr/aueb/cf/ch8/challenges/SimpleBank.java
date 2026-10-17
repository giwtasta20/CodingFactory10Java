package gr.aueb.cf.ch8.challenges;

import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Η {@link SimpleBank} παρέχει υπηρεσίες κατάθεσης, ανάληψης
 * και ενημέρωσης υπολοίπου.
 */
public class SimpleBank {

    private static double balance = 500;
    private static final Scanner in = new Scanner(System.in);

    private static final int DEPOSIT = 1;
    private static final int WITHDRAW = 2;
    private static final int BALANCE = 3;
    private static final int EXIT = 4;

    /**
     * Εμφανίζει το μενού και εκτελεί την υπηρεσία που επιλέγει ο χρήστης,
     * μέχρι να επιλεγεί η έξοδος. Πιάνει τις εξαιρέσεις και ενημερώνει
     * τον χρήστη με κατάλληλο μήνυμα.
     *
     * @param args δεν χρησιμοποιούνται
     */
    public static void main(String[] args) {
        int choice = 0;

        do {
            System.out.println("---------------------------------------------------");
            System.out.println("Παρακαλώ επιλέξτε μια από τις παρακάτω υπηρεσίες");
            System.out.println("1. Κατάθεση ποσού");
            System.out.println("2. Ανάληψη ποσού");
            System.out.println("3. Ενημέρωση υπολοίπου");
            System.out.println("4. Έξοδος");
            System.out.println();

            try {
                choice = in.nextInt();

                switch (choice) {
                    case DEPOSIT -> {
                        System.out.println("Παρακαλώ εισάγετε το ποσό κατάθεσης:");
                        deposit(in.nextDouble());
                        System.out.println("Η κατάθεση ολοκληρώθηκε με επιτυχία!");
                    }
                    case WITHDRAW -> {
                        System.out.println("Παρακαλώ εισάγετε το ποσό ανάληψης:");
                        withdraw(in.nextDouble());
                        System.out.println("Η ανάληψη ολοκληρώθηκε με επιτυχία!");
                    }
                    case BALANCE -> System.out.printf("Το υπόλοιπό σας είναι %.2f ευρώ%n", getBalance());
                    case EXIT -> System.out.println("Έξοδος από το πρόγραμμα.");
                    default -> System.out.println("Μη έγκυρη επιλογή. Παρακαλώ προσπαθήστε ξανά.");
                }
            } catch (InputMismatchException e) {
                in.next();      // πετάει το άκυρο token από το buffer
                choice = 0;     // ώστε ο βρόχος να μην εξαρτάται από παλιά τιμή
                System.out.println("Η πράξη απέτυχε: πρέπει να εισάγετε αριθμό.");
            } catch (Exception e) {
                System.out.println("Η πράξη απέτυχε: " + e.getMessage());
            }
        } while (choice != EXIT);
    }

    /**
     * Κάνει κατάθεση ποσού, αυξάνοντας το balance.
     *
     * @param amount το ποσό της κατάθεσης (πρέπει να είναι θετικό)
     * @throws Exception αν το ποσό δεν είναι θετικό
     */
    public static void deposit(double amount) throws Exception {
        try {
            if (amount <= 0) {
                throw new Exception("Το ποσό κατάθεσης πρέπει να είναι θετικό!");
            }
            balance += amount;
        } catch (Exception e) {
            System.err.println(LocalDateTime.now() + " " + e.getMessage());
            throw e;
        }
    }

    /**
     * Κάνει ανάληψη ποσού, μειώνοντας το balance.
     *
     * @param amount το ποσό της ανάληψης (θετικό και όχι μεγαλύτερο από το υπόλοιπο)
     * @throws Exception αν το ποσό δεν είναι θετικό ή υπερβαίνει το υπόλοιπο
     */
    public static void withdraw(double amount) throws Exception {
        try {
            if (amount <= 0) {
                throw new Exception("Το ποσό ανάληψης πρέπει να είναι θετικό!");
            }
            if (amount > balance) {
                throw new Exception("Ανεπαρκές υπόλοιπο!");
            }
            balance -= amount;
        } catch (Exception e) {
            System.err.println(LocalDateTime.now() + " " + e.getMessage());
            throw e;
        }
    }

    /**
     * Επιστρέφει το τρέχον υπόλοιπο του λογαριασμού.
     *
     * @return το τρέχον υπόλοιπο
     */
    public static double getBalance() {
        return balance;
    }
}