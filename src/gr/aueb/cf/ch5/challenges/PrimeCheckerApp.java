package gr.aueb.cf.ch5.challenges;

import java.util.Scanner;

/**
 * Το πρόγραμμα εμφανίζει αν ένας αριθμός είναι πρώτος μέσω μιας μεθόδου
 * με όνομα isPrime που δέχεται έναν ακέραιο αριθμό και επιστρέφει true
 * αν ο αριθμός είναι πρώτος και false αν δεν είναι.
 */

public class PrimeCheckerApp {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int inputInteger = 0;
        boolean isPrime =  false;

        System.out.println("Καλωσήρθατε στο πρόγραμμα ελέγχου πρώτων αριθμών!");
        inputInteger = inputInteger();
        isPrime = isPrime(inputInteger);
        System.out.println("Ο αριθμός " + inputInteger + " είναι πρώτος: " + isPrime);
    }

    public static int inputInteger() {
        System.out.println("Εισάγετε έναν ακέραιο αριθμό: ");
        return in.nextInt();
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true; //
    }
}
