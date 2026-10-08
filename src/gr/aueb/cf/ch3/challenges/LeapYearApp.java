package gr.aueb.cf.ch3.challenges;

import java.util.Scanner;

/**
 * To πρόγραμμα εμφανίζει στην οθόνη αν το έτος που εισάγει ο χρηστης
 * είναι δίσεκτο ή όχι. Ένα έτος είναι δίσεκτο αν διαιρείται ακριβώς με το
 * 400 ή αν διαιρείται ακριβώς με το 4 και όχι με το 100.
 */

public class LeapYearApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputYear = 0;
        boolean isLeapYear = false;

        System.out.println("Παρακαλώ εισάγετε το έτος: ");
        inputYear = in.nextInt();
        isLeapYear = (inputYear % 400 == 0) || (inputYear % 4 ==0 && inputYear % 100 != 0);

        if (!isLeapYear) {
            System.out.printf("Το έτος %d δεν είναι δίσεκτο.", inputYear);
        } else {
            System.out.printf("Το έτος %d είναι δίσεκτο.", inputYear);
        }
    }
}
