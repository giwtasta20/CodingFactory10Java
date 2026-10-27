package gr.aueb.cf.ch15.challenges;

public class Circle extends AbstractShape implements ITwoDimensional{

   private double radius;
   private final double PI = 3.14;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.pow(radius,2)*PI;
    }
}
