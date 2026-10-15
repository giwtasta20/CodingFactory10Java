package gr.aueb.cf.ch6.challenges;

/**
 * Αναπτύξτε μία μέθοδο εύρεσης του μέγιστου ενός πίνακα getMaxPosition (int[] arr, int low, int high)
 * που επιστρέφει τη θέση στον πίνακα arr του μέγιστου στοιχείου του πίνακα μεταξύ των στοιχείων low και high
 */

public class FindMaxApp {

    public static void main(String[] args) {

        int[] arr = new int[] {2, 8, 50, 1 ,93, 40, 10};
        int maxPos = 0;
        maxPos = getMaxPosition(arr, 2, 5);
        System.out.println("The position of the maximum element is: " + maxPos);
    }

    /**
     *
     * @param arr o πίνακας ακεραίων
     * @param low η αρχική θέση
     * @param high η τελική θέση
     * @return η θέση του μέγιστου στοιχείου
     */
    public static int getMaxPosition(int[] arr, int low, int high) {
        if (arr == null || arr.length == 0) return -1;
        if (low < 0 || high >= arr.length || low > high) return -1;
        int maxPos = low;
        for (int i = low + 1; i <= high; i++) {
            if (arr[i] > arr[maxPos]) {
                maxPos = i;
            }
        }
        return maxPos;
    }
}
