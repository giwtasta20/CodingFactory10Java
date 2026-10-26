package gr.aueb.cf.ch13.challenges;

/**
 * Κλάση εκτέλεσης και δοκιμής (Main) για τις λειτουργίες της {@link StringUtils}.
 */

public class StringUtilsMain {

    public static void main(String[] args) {

        String str ="Coding";

        String reversed = "";
        String toUpperCase = "";
        boolean isPalindrome = false;

        reversed = StringUtils.reverseString(str);
        toUpperCase = StringUtils.toUpperCaseString(str);
        isPalindrome = StringUtils.isPalindrome(str);

        System.out.printf("String \"%s\" reversed: %s", str, reversed);
        System.out.println();
        System.out.printf("String '%s' toUpperCase: %s", str, toUpperCase);
        System.out.println();
        System.out.printf("String '%s' isPalindrome: %b", str, isPalindrome);
        System.out.println();
    }
}
