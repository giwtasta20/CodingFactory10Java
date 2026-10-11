package gr.aueb.cf.ch5.challenges;

import java.util.Scanner;

/**
 * Το πρόγραμμα εμφανίζει το μέγιστο από τρεις ακέραιους αριθμούς
 * με τη χρήση μεθόδου με όνομα findMax που δέχεται τρεις ακέραιους
 * αριθμούς και επιστρέφει τον μεγαλύτερο από αυτούς
 */

public class MaxFinderApp {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int firstInput = 0;
        int secondInput = 0;
        int thirdInput = 0;
        int maxInteger = 0;

        System.out.println("Εισάγετε τρεις ακέραιους αριθμούς:");
        firstInput = getInputInts();
        secondInput = getInputInts();
        thirdInput = getInputInts();

        maxInteger = findMax(firstInput,secondInput,thirdInput);

        System.out.printf("Ο μεγαλύτερος αριθμός μεταξύ των %,d, %,d και " +
                "%,d είναι ο %,d\n", firstInput, secondInput, thirdInput, maxInteger);
    }

    public static int getInputInts(){
        return in.nextInt();
    }

    public static int findMax(int a, int b, int c){
        return Math.max(Math.max(a, b), c);
    }
}
