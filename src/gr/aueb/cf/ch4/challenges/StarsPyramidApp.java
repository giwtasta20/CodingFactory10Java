package gr.aueb.cf.ch4.challenges;

/**
 * Tο πρόγραμμα φτιάχνει μια πυραμίδα από * με 4 σειρές.
 * Σχέση για τα κενά (Spaces): 4 - i
 * Σχέση για τα αστεράκια (Stars): 2 * i - 1
 */

public class StarsPyramidApp {
    public static void main(String[] args) {

        final int ROWS = 4;

        for (int i = 1; i <= ROWS; i++ ){
            for (int j = 1; j <= ROWS - i; j++ ){
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
