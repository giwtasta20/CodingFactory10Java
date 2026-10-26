package gr.aueb.cf.ch13.challenges;

/**
 * Η κλάση Main για τη δοκιμή των λειτουργιών
 * της βοηθητικής κλάσης MathHelper.
 */

public class MathHelperMain {

    public static void main(String[] args) {

        int[] array = {2, 50, 65, 10, 20, 5, 30};
        int max = 0;
        int min = 0;
        double avg = 0.0;

        max =MathHelper.findMax(array);
        min =MathHelper.findMin(array);
        avg = MathHelper.findAvg(array);

        System.out.printf("Max: %d, Min: %d, Avg: %.2f", max, min, avg);
    }
}
