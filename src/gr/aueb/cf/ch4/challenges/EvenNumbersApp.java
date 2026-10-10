package gr.aueb.cf.ch4.challenges;

/**
 * Το πρόγραμμα εκτυπώνει όλους τους ζυγούς αριθμούς από 1 έως 20
 */

public class EvenNumbersApp {

    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++ ) {
            if ( i % 2 == 0 ) {
                System.out.print(i + " ");
            }
        }

//        for (int i = 2; i <= 20; i += 2) {
//            System.out.print(i + " ");
//        }

    }
}
