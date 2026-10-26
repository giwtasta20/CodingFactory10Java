package gr.aueb.cf.ch13.challenges;

/**
 * Μια βοηθητική κλάση (Utility Class) για βασικές
 * μαθηματικές πράξεις πάνω σε πίνακες ακεραίων.
 */

public class MathHelper {

    private MathHelper() {}

    /**
     * Βρίσκει και επιστρέφει τον μικρότερο αριθμό ενός πίνακα.
     * @param arr Ο πίνακας με τους ακεραίους αριθμούς
     * @return Ο ελάχιστος αριθμός του πίνακα
     */
    public static int findMin(int[] arr){
        int min = arr[0];

        for (int el:arr) {
            if (el < min) {
                min = el;
            }
        }
        return min;
    }

    /**
     * Βρίσκει και επιστρέφει τον μεγαλύτερο αριθμό ενός πίνακα.
     * @param arr Ο πίνακας με τους ακεραίους αριθμούς
     * @return Ο μέγιστος αριθμός του πίνακα
     */
    public static int findMax(int[] arr){
        int max = arr[0];

        for (int el:arr) {
            if (el > max) {
                max = el;
            }
        }
        return max;
    }

    /**
     * Υπολογίζει και επιστρέφει τον μέσο όρο των στοιχείων ενός πίνακα.
     * @param arr Ο πίνακας με τους ακεραίους αριθμούς
     * @return Ο μέσος όρος ως δεκαδικός αριθμός (double)
     */
    public static double findAvg(int[] arr){
        if (arr == null || arr.length == 0) {
            return 0.0;
        }
        int sum = 0;
        double avg = 0.0;

        for (int el:arr) {
            sum += el;
        }
        avg = (double) sum / arr.length;
        return avg;
    }

}
