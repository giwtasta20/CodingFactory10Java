package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Επαναληπτικά ο χρήστης προσπαθεί να μαντέψει τον μυστικό ακέραιο.
 */

public class SecretIterativeApp {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        final int SECRET = 12;
        int guess = 0;

        while (true) {
            System.out.println("Προσπάθησε να μαντέψεις τον μυστικό ακέραιο.");
            guess = scanner.nextInt();

            if (guess == SECRET) {
                System.out.println("Συγχαρητήρια. Μαντεψες σωστα!");
                break;
            } else {
                System.out.println("Λυπάμαι, η εικασία σου είναι λάθος.Προσπαθησε ξανά");
            }
        }
    }
}
