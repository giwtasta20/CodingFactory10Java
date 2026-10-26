package gr.aueb.cf.ch12.challenges;

/**
 * Η κλάση δημιουργεί ένα σημείο PointXYZ με τον υπερφορτωμένο
 * Constructor, καλεί τις public μεθόδους της ΡointXYZ (Public API) και
 * επιβεβαιώνει τα αναμενόμενα αποτελέσματα.
 */

public class Main {

    public static void main(String[] args) {

        PointXYZ pointXYZ = new PointXYZ(5, 8, 15);

        double distanceXY = pointXYZ.getXYDistance();
        double distanceYZ = pointXYZ.getYZDistance();
        double distanceXZ = pointXYZ.getXZDistance();
        double distanceXYZ = pointXYZ.getXYZDistance();

        System.out.println("XY Distance: " + distanceXY);
        System.out.println("XZ Distance: " + distanceXZ);
        System.out.println("YZ Distance: " + distanceYZ);
        System.out.println("XYZ Distance: " + distanceXYZ);
    }
}
