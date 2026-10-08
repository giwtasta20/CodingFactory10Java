package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το α^n. Ο χρήστης εισάγει τα α και n.
 *
 */

public class PowerApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 1;
        int i = 1; // το i ξεκιναει από το 1 θα αυξάνεται κατά 1 (i++). αν πω οτι θέλω το 6^5 τότε το i++ ως i<=power//

        System.out.println("Παρακαλώ εισάγετε τη βάση (α):");
        base = in.nextInt();
        System.out.println("Παρακαλώ εισάγετε τη δύναμη (n):");
        power = in.nextInt();

        while (i<=power) {
            result *= base; //result = result * base
            i++;
        }

        System.out.printf("%,d ^ %,d = %,d\n", base, power, result);
    }
}
