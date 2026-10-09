package gr.aueb.cf.ch4;

/**
 * Εκτυπώνει οριζόντια, κάθετα,
 * από 1 .. 10, από 10..1,
 * 10 χ 10 αστεράκια
 */
public class Stars {
    public static void main(String[] args) {
        //δεκα οριζόντια stars
        for (int i = 1; i <= 5; i++) {
            System.out.print("*");
        }
        //δεκα κάθετα stars
        for (int i = 1; i <= 15; i++) {
            System.out.println("*");
        }
        // 10 γραμμές * 10 stars
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
        //1 γραμμη 1, 2η γραμμη 2, 3η γραμμη 3, ...., 10η 10 stars
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //1 γραμμη 10, 2η γραμμη 9 κλπ
        for (int i = 1; i <= 10; i++) {
            for (int j = i; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}