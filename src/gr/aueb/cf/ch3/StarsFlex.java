package gr.aueb.cf.ch3;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * ο χρήστης εισάγει ένα θετικό ακέραιο, έστω n,
 * και εκτυπώνονται τόσα αστεράκια σε οριζόντια διάταξη,
 * όσα ο αριθμός n που εισήγαγε ο χρήστς
 */

public class StarsFlex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 1;
        int n = 0;

        System.out.println("Παρακαλώ εισάγετε ένα θετικο ακεραιο");
        n = in.nextInt();
        while (i <= n) {
            System.out.print("* ");
            i++;

        }
    }
}
