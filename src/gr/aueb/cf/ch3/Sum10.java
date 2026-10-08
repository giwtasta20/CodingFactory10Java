package gr.aueb.cf.ch3;

/**
 * υπολογίζει το άθροισμα των 10 πρώτων αριθμών, 1 ως το 10
 */

public class Sum10 {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        int sum = 0;
        int mul = 1;

        while (i<=10) {
            sum +=i;     // sum = sum + i
            i++;
        }

        while (j<=10) {
            mul *=j;     //mul = mul *j
            j++;
        }
        System.out.println("sum=" +sum);
        System.out.println("mul=" + mul);
    }
}
