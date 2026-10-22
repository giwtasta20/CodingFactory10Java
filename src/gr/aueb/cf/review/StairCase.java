package gr.aueb.cf.review;

/**
 * Τυπώνει μια σκάλα (staircase) ύψους n, στοιχισμένη δεξιά.
 * Η γραμμή i (από 1 έως n) αποτελείται από n - i κενά
 * ακολουθούμενα από i χαρακτήρες '#'.
 * Παράδειγμα για n = 4:
 *    #
 *   ##
 *  ###
 * ####
 */

public class StairCase {

    public static void main(String[] args) {
        printStair(20);
    }

    public static void printStair(int n) {
        for (int i = 1; i <= n; i++) {

            // Κενά πριν τα '#': όσο προχωράμε προς τα κάτω, τόσο λιγότερα (n - i)
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Χαρακτήρες '#': όσο προχωράμε προς τα κάτω, τόσο περισσότεροι (i)
            for (int k = 1; k <= i; k++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}