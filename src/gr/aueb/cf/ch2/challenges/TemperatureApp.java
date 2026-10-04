package gr.aueb.cf.ch2.challenges;

import java.util.Scanner;

/**
 * Το πρόγραμμα διαβάζει από το χρήστη την θερμοκρασία σε κλίμακα Φαρενάιτ
 * και την μετατρέπει σε κλίμακα Κελσίου (5 * (F-32) / 9) και την εμφανίζει στην οθόνη.
 */

public class TemperatureApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int inputFahrenheit = 0;
        int outputCelsius = 0;

        System.out.println("Παρακαλώ εισάγετε την θερμοκρασία σε κλίμακα Φαρενάιτ:");
        inputFahrenheit = scanner.nextInt();
        outputCelsius = 5 * (inputFahrenheit-32) / 9;

        System.out.println("Η θερμοκρασία σε κλίμακα Κελσίου είναι: " + outputCelsius);
    }
}
