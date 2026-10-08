package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Τριαδικός τελεστής για τον υπολογισμό
 * του μικρότερου μεταξύ δυο ακέραιων.
 */
public class TernaryApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int min = 0;

        System.out.println("Εισάγετε δυο ακέραιους αριθμούς");
        num1 = in.nextInt();
        num2 = in.nextInt();

        min = num1 < num2 ? num1 : num2;

        System.out.println("ο μικρότερος αριθμός μεταξύ" + num1 + " και " + num2 + "είναι" + min );

    }

}
