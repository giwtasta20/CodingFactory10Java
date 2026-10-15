package gr.aueb.cf.ch7.challenges;

/**
 * Το προγραμμα παρέχει λειτουργίες κρυπτογράφησης και αποκρυπτογράφησης αλφαριθμητικών (Strings)
 * βάσει του Αλγορίθμου του Καίσαρα (Caesar Cipher)
 */

public class CryptoCaesarCipherApp {

    public static void main(String[] args) {

        String s = "PIZZA";

        String encrypted = encryptString(s);
        String decrypted = decryptString(encrypted);

        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypted);

    }

    /**
     * @param str Το αρχικό αλφαριθμητικό προς κρυπτογράφηση
     * @return Το κρυπτογραφημένο αλφαριθμητικό
     */

    public static String encryptString(String str) {
        StringBuilder encrypted = new StringBuilder();
        final int KEY = 3;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'Z') {
                encrypted.append('C');
            } else if (ch == 'Y') {
                encrypted.append('B');
            } else if (ch == 'X') {
                encrypted.append('A');
            } else if (ch == 'z') {
                encrypted.append('c');
            } else if (ch == 'y') {
                encrypted.append('b');
            } else if (ch == 'x') {
                encrypted.append('a');
            } else if ((ch >= 'A' && ch < 'X') || (ch >= 'a' && ch < 'x')) {
                encrypted.append((char) (ch + KEY));
            } else {
                encrypted.append((char) (ch));
            }
        } return encrypted.toString();
    }

    /**
     * @param str Το κρυπτογραφημένο αλφαριθμητικό
     * @return Το αποκρυπτογραφημένο αλφαριθμητικό
     */
    public static String decryptString(String str) {
        StringBuilder decrypted = new StringBuilder();
        final int KEY = 3;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'A') {
                decrypted.append('X');
            } else if (ch == 'B') {
                decrypted.append('Y');
            } else if (ch == 'C') {
                decrypted.append('Z');
            } else if (ch == 'a') {
                decrypted.append('x');
            } else if (ch == 'b') {
                decrypted.append('y');
            } else if (ch == 'c') {
                decrypted.append('z');
            }else if ((ch > 'C' && ch <= 'Z') || (ch > 'c' && ch <= 'z')) {
                decrypted.append((char) (ch - KEY));
            } else {
                decrypted.append((char) (ch));
            }
        }
        return decrypted.toString();
    }

}