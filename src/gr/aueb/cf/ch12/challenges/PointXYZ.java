package gr.aueb.cf.ch12.challenges;

/**
 * Το πρόγραμμα ορίζει ένα σημείο στον χώρο με συντεταγμένες (x, y, z) και υλοποιεί public μεθόδους
 * getXYDistance(), getYZDistance() και getXZDistance() και getXYZDistance()
 * που επιστρέφουν τις αποστάσεις μεταξύ των αντίστοιχων σημείων.
 */

public class PointXYZ {

    private int x;
    private int y;
    private int z;

    public PointXYZ(){}

    public PointXYZ(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public double getXYDistance() {
        return Math.sqrt( x * x + y * y);
    }

    public double getYZDistance() {
        return Math.sqrt( z * z + y * y);
    }

    public double getXZDistance() {
        return Math.sqrt( x * x + z * z);
    }

    public double getXYZDistance() {
        return Math.sqrt( x * x + y * y + z * z);
    }
}
