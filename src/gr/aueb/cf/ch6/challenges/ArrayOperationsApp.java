package gr.aueb.cf.ch6.challenges;

public class ArrayOperationsApp {

    public static void main(String[] args) {

        int[] arr = new int[] {2, 8, 6, 8, 8, 9};
        int count = 0;
        int element = 8;
        count = countElement(arr, element);
        System.out.printf("Το στοιχείο %d εμφανίστηκε %d φορές", element,
                count);
        System.out.println();

        printEvenNumbers(arr);
        System.out.println();

        int[] doubleArr = doubleArr(arr);
        for (int el : doubleArr) {
            System.out.print(el + " ");
        }
        System.out.println();

        System.out.println("Υπάρχει έστω ένας ζυγός αριθμός: " + anyEvenNumbers(arr));

        System.out.println("Όλα τα στοιχεία είναι θετικά: " + allPositive(arr));

        System.out.println("Υπάρχει έστω ένας θετικός αριθμός: " + anyPositiveNumbers(arr));

    }

    /**
     * Μέτρηση εμφανίσεων στοιχείου (count)
     * @param arr ο πίνακας ακεραίων
     * @param element το στοιχείο που αναζητείται
     * @return ο αριθμός των εμφάνισεων του στοιχείου
     */
    public static int countElement(int[] arr, int element) {
        int count = 0;

        for (int el : arr) {
            if (el == element) count++;
        }
        return count;
    }

    /**
     * Φιλτράρισμα των ζυγών (μόνο εκτύπωση των ζυγών)
     * @param arr ο πίνακας ακεραίων
     */

    public static void printEvenNumbers (int[] arr) {

        for (int el : arr) {
            if (el % 2 == 0) {
                System.out.print(el + " ");
            }
        }
    }

    /**
     *  Mapping κάθε στοιχείου του πίνακα με το διπλάσιο (η μέθοδος
     * επιστρέφει πίνακα)
     * @param arr ο πίνακας ακεραίων
     * @return ο πίνακας με τα διπλασιασμένα στοιχεία
     */
    public static int[] doubleArr(int[] arr) {
        int[] doubleArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++){
            doubleArr[i] = arr[i] * 2;
        }
        return doubleArr;
    }

    /**
     * Έλεγχος αν υπάρχει έστω ένας ζυγός αριθμός (η μέθοδος
     * πρέπει να επιστρέφει boolean)
     * @param arr ο πίνακας ακεραίων
     * @return true αν υπάρχει έστω ένας ζυγός, αλλιώς false
     */
    public static boolean anyEvenNumbers(int[] arr) {
        boolean anyEven = false;
        for (int el:arr) {
            if (el % 2 ==0) {
                anyEven = true;
                break;
            }
        }
        return anyEven;
    }

    /**
     *  Έλεγχος αν όλα τα στοιχεία του πίνακα είναι θετικοί (η
     * μέθοδος πρέπει να επιστρέφει boolean)
     * @param arr ο πίνακας ακεραίων
     * @return true αν όλα τα στοιχεία είναι θετικά, αλλιώς false
     */

    public static boolean allPositive(int[] arr) {
        boolean allPositive = true;
        for (int el:arr) {
            if (el <= 0) {
                allPositive = false;
                break;

            }
        }
        return allPositive;
    }

    /**
     * Ελέγχει αν υπάρχει τουλάχιστον ένας θετικός αριθμός στον πίνακα.
     * @param arr ο πίνακας προς έλεγχο
     * @return true αν υπάρχει έστω ένας θετικός, αλλιώς false
     */
    public static boolean anyPositiveNumbers(int[] arr) {
        boolean anyPositive = false;
        for (int el : arr) {
            if (el > 0) {
                anyPositive = true;
                break;
            }
        }
        return anyPositive;
    }
}
