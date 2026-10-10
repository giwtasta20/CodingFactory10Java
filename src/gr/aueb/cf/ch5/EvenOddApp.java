package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Ορίζει δύο μεθόδους, τις isEven και
 * isOdd για τον έλεγχο ενός ακεραίου αν
 * είναι άρτιος ή περιττός αντίστοιχα.
 */
public class EvenOddApp {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση
        Scanner in = new Scanner(System.in);
        int num = 0;

        // Input & Data Binding
        System.out.println("Δώστε έναν ακέραιο");
        num = in.nextInt();

        // Calls the service - delegation & Εκτύπωση Αποτελέσματος
        if (isEven(num)) {
            System.out.printf("Ο αριθμός %d είναι άρτιος\n", num);
        }

        if (isOdd(num)) {
            System.out.printf("Ο αριθμός %d είναι περιττός\n", num);
        }

    }

    public static boolean isEven(int num) {

        return num % 2 == 0;
    }

    public static boolean isOdd(int num) {
//        return num % 2 != 0;
        return !isEven(num);
    }
}