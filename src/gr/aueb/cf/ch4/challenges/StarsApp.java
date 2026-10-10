package gr.aueb.cf.ch4.challenges;

import java.util.Scanner;

/**
 *Το πρόγραμμα διαβάζει από τον χρήστη το πλήθος n (αστεράκια)
 * και τα εκτυπώνει σε διαφορα patterns: 1) Οριζόντια, 2) Κάθετα,
 * 3) ΝχΝ, 4) Αύξουσα σειρά, 5) Φθίνουσα σειρά
 */

public class StarsApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputStars = 0;

        System.out.println("Εισάγετε το πλήθος αστεριών:");
        inputStars = scanner.nextInt();

        //1.1 n οριζόντια αστεράκια
        for (int i = 1; i <= inputStars; i++) {
            System.out.print("* ");
        }
        System.out.println();

        //1.2 n κάθετα αστεράκια
        for (int i = 1; i <= inputStars; i++) {
            System.out.println("*");
        }

        //1.3 nxn αστεράκια
        for (int i = 1; i <= inputStars; i++) {
            for (int j = 1; j <= inputStars; j ++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //1.4 από 1 έως n, αύξουσα σειρά
        for (int i =1; i <= inputStars; i++){
            for (int j =1; j <= i; j ++) {
                System.out.print("* ");
            }
            System.out.println();
        }

//        1.5 από n έως 1, φθίνουσα σειρά
        for (int i =1; i <= inputStars; i++ ) {
            for (int j =1; j <= inputStars - i + 1; j ++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}