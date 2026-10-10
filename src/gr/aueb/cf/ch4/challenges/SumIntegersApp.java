package gr.aueb.cf.ch4.challenges;

/**
 * Το πρόγραμμα βρίσκει το άθροισμα των ακεραίων από 1 έως 50
 */
public class SumIntegersApp {

    public static void main(String[] args) {
        int result = 0;

        for (int i= 1; i <= 50; i++) {
            result += i;
        }
        System.out.printf("Το άθροισμα των ακεραίων από 1 έως 50 είναι %,d", result);
    }
}
