package gr.aueb.cf.ch2.challenges;

import java.util.Scanner;

/**
 * Το πρόγραμμα διαβάζει τις συνολικές ώρες εργασίας και τον αριθμό των εργαζομένων και υπολογίζει
 * πόσες ώρες αναλογούν σε κάθε εργαζόμενο και πόσες ώρες περισσεύουν (τις οποίες θα αναλάβει ο project manager).
 * Οι ωρες κατανέμονται ισομερώς
 */

public class ProjectHoursApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputHours = 0;
        int inputEmployees = 0;
        int hoursPerEmployee = 0;
        int managerHours = 0;

        System.out.println("Παρακαλώ εισάγετε τις ώρες εργασίας και τον αριθμό των εργαζομένων:");
        inputHours = in.nextInt();
        inputEmployees = in.nextInt();
        hoursPerEmployee = inputHours / inputEmployees;
        managerHours = inputHours % inputEmployees;

        System.out.printf("Κάθε εργαζόμενος: %d ώρες εργασίας. Ώρες που περισσεύουν: %d\n", hoursPerEmployee, managerHours);
    }
}
