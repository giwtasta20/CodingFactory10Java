package gr.aueb.cf.ch2;

/**
 * Typecast demo
 */

public class TypecastApp {
    public static void main(String[] args) {
        int num1 = Integer.MAX_VALUE;
        long num2 = 20;
        // long num2 = 20L; Τo L είναι type suffix , τα literals θεωρούνται int και θεωρούνται 32bit

        //num1 = (int) num2; Typecast is error prone , αν γράψω num1 = num2 θα βγάλει σφάλμα

        num1 = num1 + 10;

        System.out.println(num1);


    }
}
