package gr.aueb.cf.ch13.challenges;

/**
 * Βοηθητική κλάση (utility class) για λειτουργίες επεξεργασίας κειμένου (String manipulation),
 * όπως αντιστροφή, μετατροπή σε κεφαλαία και έλεγχο παλινδρομικότητας.
 */

public class StringUtils {

    private StringUtils() {};

    /**
     * Αντιστρέφει το δοσμένο string.
     * @param str το string προς αντιστροφή
     * @return το αντιστραμμένο string, ή κενό string αν η είσοδος είναι null ή κενή
     */
    public static String reverseString(String str){
        if (str == null || str.length() == 0) return "";
        return new StringBuilder(str).reverse().toString();
    }

    /**
     * Μετατρέπει το δοσμένο string σε κεφαλαία γράμματα.
     * @param str το string προς μετατροπή
     * @return το string σε κεφαλαία, ή κενό string αν η είσοδος είναι null ή κενή
     */
    public static String toUpperCaseString(String str){
        if (str == null || str.length() == 0 ) return "";
        return str.toUpperCase();
    }

    /**
     * Ελέγχει εάν το δοσμένο string είναι παλινδρομικό.
     * @param str το string προς έλεγχο
     * @return true αν είναι παλίνδρομο, false διαφορετικά
     */
    public static boolean isPalindrome(String str){
        if (str == null || str.isEmpty()) return false;

        //String reversed = new StringBuilder(str).reverse().toString();
        //return str.equals(reversed);

        return new StringBuilder(str)
                .reverse()
                .toString()
                .equals(str);
    }
}
