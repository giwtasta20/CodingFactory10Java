package gr.aueb.cf.ch4.challenges;

/**
 * Το πρόγραμμα εκτυπώνει από το 1 ως το 10 με αντίστροφη σειρά,
 * δηλαδή 10 9 8 ...321.
 */

public class ReversePrintApp {
    public static void main(String[] args) {
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
}
