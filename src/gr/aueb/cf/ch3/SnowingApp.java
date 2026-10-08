package gr.aueb.cf.ch3;

import java.util.Scanner;

/**Ο χρήστης εισάγει αν βρέχει και την θερμοκρασία
 * και το πρόγραμμα υπολογίζει αν χιονίζει. Χιονίζει σημαίνει οτι βρεχει και η θερμοκρασία ειναι
 * κάτω από το μηδεν
 */

public class SnowingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRaining = false;
        int temperature = 0;
        boolean isSnowing = false;

        System.out.println("βρεχει;(true/false)");
        isRaining = scanner.nextBoolean();

        System.out.println("εισάγετε την θερμοκρασια");
        temperature =  scanner.nextInt();

        isSnowing = isRaining && (temperature <0 );

        System.out.println("χιονίζει: " + isSnowing);
    }
}
