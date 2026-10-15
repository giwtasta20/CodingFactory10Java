package gr.aueb.cf.ch7.challenges;

/**
 * Το πρόγραμμα παρέχει λειτουργίες κρυπτογράφησης και αποκρυπτογράφησης αλφαριθμητικών (Strings)
 * με τη χρήση μεθόδων κρυπτογράφησης και αποκρυπτογράφησης (κάθε χαρακτήρας του String αντικαθίσταται
 * με τον λεξικογραφικά επόμενο/προηγούμενο)
 */

public class CryptoStringApp {

    public static void main(String[] args) {

        String str = "Hello World From Coding Factory";

        String encrypted = encryptString(str);
        System.out.println("Encrypted: " + encrypted);

        String decrypted = decryptString(encrypted);
        System.out.println("Decrypted: " + decrypted);

    }

    public static String encryptString(String str) {
        StringBuilder encrypted = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'z') {
                encrypted.append('a');
            } else if (ch == 'Z') {
                encrypted.append('A');
            } else {
                encrypted.append((char)(ch + 1));
            }
        }

        return encrypted.toString();
    }

    public static String decryptString(String str) {
        StringBuilder decrypted = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a') {
                decrypted.append('z');
            } else if (ch == 'A') {
                decrypted.append('Z');
            } else {
                decrypted.append((char)(ch - 1));
            }
        }

        return decrypted.toString();
    }
}
