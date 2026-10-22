package gr.aueb.cf.review;

/**
 * Υπολογίζει τον n-οστό αριθμό Fibonacci.
 * Η ακολουθία ξεκινά με F(0) = 0, F(1) = 1 και κάθε επόμενος όρος
 * είναι το άθροισμα των δύο προηγούμενων: F(n) = F(n-1) + F(n-2).
 * Ακολουθία: 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
 */

public class Fibonacci {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(fibonacci(n));

    }
    public static int fibonacci(int n) {
        int a = 0;
        int b = 1;
        int fibo = 1;

        if (n == 0) return a;
        if (n ==1 ) return b;

        for (int i = 2; i <= n; i++) {
            fibo = a + b;
            a = b;
            b = fibo;
        }
        return fibo;
    }
}
