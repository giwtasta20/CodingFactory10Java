package gr.aueb.cf.ch9.challenges;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.UUID;

/**
 * Αντιγράφει ένα binary αρχείο του {@code C:/tmp/} με νέο όνομα (UUID + αρχικό όνομα)
 * και εμφανίζει τα paths των δύο αρχείων και την επέκταση.
 */

public class BinaryFileCopyApp {


    private static final Path BASE_DIR = Path.of("C:/tmp/");

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Δώσε το όνομα του αρχείου: ");
        String userInputFile = in.nextLine();

        Path source = BASE_DIR.resolve(userInputFile);
        String newName = UUID.randomUUID().toString().replace(":", "_") +
                userInputFile;
        Path target = BASE_DIR.resolve(newName);

        try (InputStream is = Files.newInputStream(source);
             OutputStream os = Files.newOutputStream(target)) {

            is.transferTo(os);

            String extension = "";
            int dotIndex = userInputFile.lastIndexOf('.');
            if (dotIndex != -1) {
                extension = userInputFile.substring(dotIndex + 1);
            }

            System.out.println("Αρχικό αρχείο: " + source.toAbsolutePath());
            System.out.println("Νέο αρχείο: " + target.toAbsolutePath());
            System.out.println("Επέκταση: " + extension);

        } catch (IOException e) {
            System.err.println("Σφάλμα: " + e.getMessage());
        }
    }
}
