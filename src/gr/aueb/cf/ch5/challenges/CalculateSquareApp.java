package gr.aueb.cf.ch5.challenges;

import java.util.Scanner;

/**
 * Το πρόγραμμα εμφανίζει το τετράγωνο ενός ακέραιου αριθμού μέσω
 * μιας μεθόδου με όνομα square που δέχεται έναν ακέραιο
 * αριθμό ως παράμετρο και επιστρέφει το τετράγωνό του.
 */

public class CalculateSquareApp {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int inputInteger = 0;
        int squaredInteger = 0;

        System.out.println("Καλωσήρθατε στο πρόγραμμα υπολογισμού τετραγώνου!");
        inputInteger = getInputInteger();
        squaredInteger = square(inputInteger);
        System.out.println("Το τετράγωνο του " + inputInteger + " είναι: " + squaredInteger);
    }

    public static int getInputInteger() {

        System.out.print("Παρακαλώ εισάγετε έναν ακέραιο αριθμό: ");
        return in.nextInt();
    }

    public static int square(int inputInteger) {
        return inputInteger * inputInteger;
    }
}