package gr.aueb.cf.ch9.challenges;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * Μετατρέπει ένα αρχείο τοποθεσιών (CSV) σε γραμμές της μορφής
 * {@code { location: '...', latitude: ..., longitude: ... },}. Η πρώτη γραμμή (header) παραλείπεται.
 * Το αποτέλεσμα γράφεται σε νέο αρχείο και εμφανίζεται και στην κονσόλα.
 */

public class FileConverterApp {

    public static void main(String[] args) throws IOException {
        Path targetPath = Path.of("C:/tmp/newlocations.txt");
        Path sourcePath = Path.of("C:/tmp/locations.txt");


        try{
        List<String> lines = Files.readAllLines(sourcePath, StandardCharsets.UTF_8);

        try(PrintWriter pw = new PrintWriter(Files.newBufferedWriter(targetPath,StandardCharsets.UTF_8))) {
            String[] headerTokens = lines.get(0).split(",");
            String[] tokens;

            for (int i = 1; i < lines.size(); i++) {
                tokens = lines.get(i).split(",");
                pw.printf("{ location: '%s', latitude: %s, longitude: %s },%n", tokens[0], tokens[1], tokens[2]);
                System.out.printf("{ location: '%s', latitude: %s, longitude: %s },%n", tokens[0], tokens[1], tokens[2]);
            }

        }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}