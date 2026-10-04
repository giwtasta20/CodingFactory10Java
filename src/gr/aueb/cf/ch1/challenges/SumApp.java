package gr.aueb.cf.ch1.challenges;

/**
 * Γράψτε ένα πρόγραμμα που δηλώνει δύο μεταβλητές
 * ακεραίων num1 και num2 και αποθηκεύει το αποτέλεσμα
 * της πρόσθεσης num1 + num2 στην μεταβλητή sum. Στη
 * συνέχεια εκτυπώνει με println το εξής κείμενο: Το
 * αποτέλεσμα της πρόσθεσης είναι ίσο με [το αποτέλεσμα της
 * πρόσθεσης]
 */

public class SumApp {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 5;
        int sum = 0;

        sum = num1 + num2;

        System.out.println("Το αποτέλεσμα της πρόσθεσης είναι ίσο με " + sum);
    }
}
