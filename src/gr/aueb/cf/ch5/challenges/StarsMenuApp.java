package gr.aueb.cf.ch5.challenges;

import java.util.Scanner;

/**
 * Το πρόγραμμα εμφανίζει ένα μενού με 6 επιλογές για την εκτύπωση αστερίσκων
 * σε patterns( 1) Οριζόντια, 2) Κάθετα, 3) ΝχΝ, 4) Αύξουσα σειρά, 5) Φθίνουσα σειρά
 * και 6) Έξοδος).
 * Ο χρήστης εισάγει την επιλογή και το πρόγραμμα εκτυπώνει το αντίστοιχο pattern.
 */

public class StarsMenuApp {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        int inputStars = 0;

        while (true) {
            displayMenu();
            choice = getChoice();

            if (choice == 6) {
                System.out.println("Έξοδος από το πρόγραμμα.");
                break;
            } else if ((choice < 1 || choice > 5)) {
                System.out.println("Μη έγκυρη επιλογή. Επιλέξτε ξανά.");
                continue;
            } else {
                System.out.println("Εισάγετε τον αριθμό των αστερίσκων:");
                inputStars = in.nextInt();
            }

            switch (choice) {
                case 1 -> printHorizontalStars(inputStars);
                case 2 -> printVerticalStars(inputStars);
                case 3 -> printMatrixStars(inputStars);
                case 4 -> printAscendingStars(inputStars);
                case 5 -> printDescendingStars(inputStars);
            }
        }
        System.out.println("Ευχαριστούμε που χρησιμοποιήσατε το πρόγραμμα.");
    }

    public static void displayMenu() {
        System.out.println("----------------------------------------------");
        System.out.println("Επιλέξτε έναν αριθμό:");
        System.out.println("1. Εμφάνισε n αστεράκια οριζόντια");
        System.out.println("2. Εμφάνισε n αστεράκια κάθετα");
        System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια");
        System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1 έως n");
        System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n έως 1");
        System.out.println("6. Έξοδος");
    }

    public static int getChoice() {
        return in.nextInt();
    }

    public static void printHorizontalStars(int inputStars) {
        for (int i = 1; i <= inputStars; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    public static void printVerticalStars(int inputStars) {
        for (int i = 1; i <= inputStars; i++) {
            System.out.println("*");
        }
    }

//    public static void printMatrixStars(int inputStars){
//        for (int i = 1; i <= inputStars; i++) {
//            for (int j = 1; j <= inputStars; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }

    public static void printMatrixStars(int inputStars) {
        for (int i = 1; i <= inputStars; i++) {
            printHorizontalStars(inputStars);
        }
    }

//    public static void printAscendingStars(int inputStars){
//        for (int i = 1; i <= inputStars; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }

    public static void printAscendingStars(int inputStars) {
        for (int i = 1; i <= inputStars; i++) {
            printHorizontalStars(i);
        }
    }

//    public static void printDescendingStars(int inputStars){
//        for (int i = inputStars; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }

    public static void printDescendingStars(int inputStars) {
        for (int i = inputStars; i >= 1; i--) {
            printHorizontalStars(i);
        }
    }
}