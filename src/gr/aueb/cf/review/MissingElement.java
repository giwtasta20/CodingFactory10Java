package gr.aueb.cf.review;

/**
 * Ο τύπος του Gauss για το άθροισμα των πρώτων m φυσικών αριθμών είναι:
 * 1 + 2 + 3 + ... + m = m · (m + 1) / 2
 * Εδώ ο πίνακας έχει n στοιχεία από το 1 έως το n+1, με ένα να λείπει.
 * Άρα το πλήρες σύνολο είναι οι αριθμοί 1 έως n+1, οπότε στον τύπο βάζουμε m = n + 1
 */

public class
MissingElement {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int missing = 0;

        missing = findMissingElement(arr);
        System.out.println("Missing element: " + missing);
    }

    public static int findMissingElement(int[] arr) {
        int expectedSum = 0;
        int actualSum = 0;
        int n = 0;

        n = arr.length;
        expectedSum = (n + 1) * (n + 2) / 2;

        for (int el : arr) {
            actualSum += el;
        }

        return expectedSum - actualSum;
    }
}