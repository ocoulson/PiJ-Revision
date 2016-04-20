package Shapes;

/**
 * Created by Oliver Coulson on 20/04/2016.
 */
public class Rectangle {
    private Point a;
    private Point b;

    public Rectangle(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public double getPerimeter() {
        double xLength = Math.abs(b.getX() - a.getX());
        double yLength = Math.abs(a.getY() - b.getY());

        return (2 * xLength) + (2 * yLength);
    }

    public double getArea() {
        double xLength = Math.abs(b.getX() - a.getX());
        double yLength = Math.abs(a.getY() - b.getY());

        return xLength * yLength;
    }

    public boolean isInside(Point c) {
        if (c.getX() > a.getX() && c.getX() < b.getX()) {
            return c.getY() > b.getY() && c.getY() < a.getY();
        } else return false;
    }
}
