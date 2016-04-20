package Shapes;

import java.util.Scanner;

/**
 * Created by Oliver Coulson on 20/04/2016.
 */
public class ShapesUtil {

    public static Point getPoint() {
        System.out.print("X coordinate: ");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        System.out.print("Y coordinate: ");
        double y = scanner.nextDouble();

        return new Point(x, y);
    }

    public static double calculateDistance(Point i, Point j) {
        double xDifference = i.getX() - j.getX();
        double yDifference = i.getY() - j.getY();

        double sumOfSquares = (xDifference * xDifference) + (yDifference * yDifference);

        return Math.sqrt(sumOfSquares);
    }

    public static Rectangle getRectangle() {
        System.out.println("Input the coordinates for the top left and bottom right points of a rectangle");
        System.out.println("Top Left");
        Point a = getPoint();
        System.out.println("Bottom Right");
        Point b = getPoint();

        return new Rectangle(a,b);
    }
}
