package gr.aueb.cf.ch5.challenges;

import java.util.Scanner;

/**
 * Το πρόγραμμα εμφανίζει την μετατροπή θερμοκρασίας από Κελσίου σε Φαρενάιτ.
 * μέσω μιας μεθόδου με όνομα celsiusToFahrenheit που δέχεται
 * μια θερμοκρασία σε βαθμούς Κελσίου (double) και την μετατρέπει
 * σε Φαρενάιτ (double) χρησιμοποιώντας τον τύπο: Κελσίου * 9/5 + 32
 */

public class TemperatureConverterApp {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        double tempCelsius = 0;
        double tempFahrenheit = 0;

        System.out.println("Καλωσήρθατε στο πρόγραμμα μετατροπής θερμοκρασίας!");
        tempCelsius = getTemperatureCelsius();

        tempFahrenheit = celsiusToFahrenheit(tempCelsius);

        System.out.printf("Η θερμοκρασία σε Φαρενάιτ είναι: %.2f°F\n ",tempFahrenheit);
    }

    public static double getTemperatureCelsius() {
        System.out.print("Παρακαλώ εισάγετε τη θερμοκρασία σε Κελσίου: ");
        return in.nextDouble();
    }

    public static double celsiusToFahrenheit(double tempCelsius) {
        return tempCelsius * 9 / 5 + 32;
    }
}



