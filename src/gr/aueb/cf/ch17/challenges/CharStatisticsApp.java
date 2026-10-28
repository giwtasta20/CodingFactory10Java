package gr.aueb.cf.ch17.challenges;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;
import java.nio.file.Files;

public class CharStatisticsApp {
    public static void main(String[] args) {

        // 1. Δημιουργία της LinkedList διπλής κατεύθυνσης για την αποθήκευση των χαρακτήρων
        LinkedList<Character> charList = new LinkedList<>();
        Path filePath = Path.of("C:/tmp/text.txt");


        // Διαβάζουμε χαρακτήρα-χαρακτήρα το αρχείο
        try (BufferedReader reader = Files.newBufferedReader(filePath)) {
            int c;
            while ((c = reader.read()) != -1) {
                charList.add((char) c);
            }
        } catch (IOException e) {
            System.err.println("Σφάλμα κατά την ανάγνωση του αρχείου: " + e.getMessage());
            return;
        }

        int totalChars = charList.size();
        if (totalChars == 0) {
            System.out.println("Το αρχείο είναι κενό.");
            return;
        }

        // 2. ΚΑΤΑΜΕΤΡΗΣΗ ΜΕ MAP
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char ch : charList) {
            if (frequencyMap.containsKey(ch)) {
                // Αν υπάρχει ήδη, παίρνουμε την παλιά τιμή και προσθέτουμε 1
                int currentCount = frequencyMap.get(ch);
                frequencyMap.put(ch, currentCount + 1);
            } else {
                // Αν είναι η πρώτη φορά, το βάζουμε με τιμή 1
                frequencyMap.put(ch, 1);
            }
        }

        System.out.println("Συνολικοί χαρακτήρες: " + totalChars);
        System.out.println("=========================================");


        // 3α. ΤΑΞΙΝΟΜΗΣΗ 1: Ανά χαρακτήρα Ascending (Αλφαβητικά)
        System.out.println("1) ΤΑΞΙΝΟΜΗΣΗ ΑΝΑ ΧΑΡΑΚΤΗΡΑ (ASC):");
        frequencyMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry -> {
                    char ch = entry.getKey();
                    int count = entry.getValue();
                    double percentage = (count * 100.0) / totalChars;
                    System.out.printf("Χαρακτήρας: '%c' | Εμφανίσεις: %d | Ποσοστό: %.2f%%\n", ch, count, percentage);
                });

        System.out.println("========================================");

        // 3β. ΤΑΞΙΝΟΜΗΣΗ 2: Ανά ποσοστό Descending (Από το μεγαλύτερο στο μικρότερο)
        System.out.println("2) ΤΑΞΙΝΟΜΗΣΗ ΑΝΑ ΠΟΣΟΣΤΟ (DESC):");
        frequencyMap.entrySet().stream()
                .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
                .forEach(entry -> {
                    char ch = entry.getKey();
                    int count = entry.getValue();
                    double percentage = (count * 100.0) / totalChars;
                    System.out.printf("Χαρακτήρας: '%c' | Εμφανίσεις: %d | Ποσοστό: %.2f%%\n", ch, count, percentage);
                });
    }
}